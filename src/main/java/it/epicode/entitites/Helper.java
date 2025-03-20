package it.epicode.entitites;

import java.util.List;

public class Helper {
    public static List<Customer> customers = List.of(
            new Customer("pippo", 1),
            new Customer("pluto", 2),
            new Customer("paperino", 3),
            new Customer("topolino", 2),
            new Customer("paperone", 1));
    public static List<Product> products = List.of(
            new Product("guida galattica per autostoppisti", "libro", 13),
            new Product("la storia infinita", "libro", 35),
            new Product("Ibanez AZ242PBG-CKB", "strumento", 1200),
            new Product("Korg Nt2", "strumento", 2500),
            new Product("Visions-Stratovarius", "CD", 25),
            new Product("Led Zeppelin IV", "CD", 20),
            new Product("Elden Ring", "videogame", 70),
            new Product("Red Dead Redemption 2", "videogame", 60),
            new Product("Grand Theft Auto V", "videogame", 50),
            new Product("Gabbia per uccelli", "accessori per animali", 70),
            new Product("lettiera per gatti", "accessori per animali", 10)
    );

    public static List<Order> orders () {
        Order order = new Order(customers.get(0));
        Order order1 = new Order(customers.get(1));
        Order order2 = new Order(customers.get(2));
        Order order3 = new Order(customers.get(3));
        Order order4 = new Order(customers.get(4));
        Order order5 = new Order(customers.get(1));
        Order order6 = new Order(customers.get(3));

        order.addProduct(products.get(0));
        order.addProduct(products.get(5));
        order1.addProduct(products.get(10));
        order1.addProduct(products.get(7));
        order2.addProduct(products.get(1));
        order2.addProduct(products.get(2));
        order2.addProduct(products.get(3));
        order3.addProduct(products.get(4));
        order3.addProduct(products.get(5));
        order4.addProduct(products.get(6));
        order4.addProduct(products.get(7));
        order5.addProduct(products.get(8));
        order6.addProduct(products.get(9));

        return List.of(order, order2, order3, order4, order5, order6);

    }
}
