package org.example;

import org.example.model.Order;
import org.example.model.Product;
import org.example.repo.OrderRepo;
import org.example.repo.ProductRepo;
import org.example.service.ShopService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ShopService shopService1 = new ShopService(new ProductRepo());
        boolean again = true;

        while (again) {

            printMainMenu();

            Scanner INPUT = new Scanner(System.in);
            String initialInput = INPUT.next().toLowerCase();

            if ("p".equals(initialInput)) {
                productsToConsole(shopService1);
                again = mainMenuAgain();

            } else if ("n".equals(initialInput)) {
                boolean orderAgain = true;
                ArrayList<Order> orders = new ArrayList<Order>();
                while(orderAgain) {
                    newOrderByCustomer(shopService1);
                    orderAgain= orderAgain();
                }
                again = mainMenuAgain();

            } else if ("b".equals(initialInput)) {
                ordersToConsole(shopService1);
                again = mainMenuAgain();

            } else if ("e".equals(initialInput)) {
                again = false;

            } else {
                System.out.println("Deine Eingabe ist ungültig. Bitte versuche es erneut.");
                again = true;
            }
        }

    }






    private static void printMainMenu(){
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Hi! Wilkommen im Shop Service. Was möchtest du tun?");
        System.out.println("p für Einzelnes Produkt oder alle Produkte auf der Konsole ausgeben lassen");
        System.out.println("n für Neue Bestellung aufgeben");
        System.out.println("b für Einzelne Bestellung oder alle Bestellungen auf der Konsole ausgeben lassen");
        System.out.println("e für Programm beenden");
        System.out.println(">>> ");
    }

    private static boolean mainMenuAgain() {
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Möchtest du zurück zum Hauptmenü?");
        System.out.println("y für Ja, alles Andere für Beenden des Programms");
        System.out.println(">>> ");
        String mainMenu = new Scanner(System.in).next().toLowerCase();
        return "y".equals(mainMenu);
    }

    private static void productsToConsole (ShopService shopService) {
        System.out.println("Bitte eine ID eingeben oder 0 für die Liste aller Produkte");
        System.out.println(">>> ");
        int id = new Scanner(System.in).nextInt();
        if(id == 0){
            System.out.println(shopService.listProducts());
        } else {
            System.out.println(shopService.getProductById(id));
        }
    }

    private static void newOrderByCustomer (ShopService shopService) {

        System.out.println("ID der Bestellung festlegen (bitte keine 0 vergeben): >>> ");
        int orderId = new Scanner(System.in).nextInt();

        ArrayList<Product> products= new ArrayList<>();
        boolean addAnotherProduct = true;

        while (addAnotherProduct){
            System.out.println("Welches Produkt möchten Sie der Bestellung hinzufügen?");
            for (Product p: shopService.productRepo.getProducts()){
                System.out.print(p.getId()+ ":" + p.getName() + "  ");
            }
            System.out.println(" ");
            System.out.println("Bitte ID angeben: >>> ");
            int productId = new Scanner(System.in).nextInt();
            Product addedProduct = shopService.getProductById(productId);
            products.add(addedProduct);
            System.out.println("Möchten Sie ein weiteres Produkt hinzufügen?");
            System.out.println("y für Ja, alles Andere für Nein");
            System.out.println(">>> ");
            String yesOrNo = new Scanner(System.in).next().toLowerCase();
            addAnotherProduct = "y".equals(yesOrNo);
        }

        Order order = new Order(orderId, products);
        shopService.addNewOrder(order);

    }

    public static boolean orderAgain(){
        System.out.println("Vielen Dank für die Bestellung. Möchtest du erneut eine Bestellung aufgeben?");
        System.out.println("y für Ja, alles Andere für Nein");
        System.out.println(">>> ");
        String yesOrNo = new Scanner(System.in).next().toLowerCase();
        return "y".equals(yesOrNo);

    }

    private static void ordersToConsole (ShopService shopService) {
        System.out.println("Bitte eine ID eingeben oder 0 für die Liste aller Bestellungen");
        System.out.println(">>> ");
        int id = new Scanner(System.in).nextInt();
        if(id == 0){
            System.out.println(shopService.listOrders());
        } else {
            System.out.println(shopService.getOrderById(id));
        }

    }


}
