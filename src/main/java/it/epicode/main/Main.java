package it.epicode.main;

import it.epicode.entitites.Customer;
import it.epicode.entitites.Helper;
import it.epicode.entitites.Order;
import it.epicode.entitites.Product;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = Helper.orders();
        System.out.println("Esercizio 1");
        Map<Customer, List<Order>> map = orders.stream().collect(Collectors.groupingBy(Order::getCustomer));
        System.out.println(map);
        System.out.println("-------------------------");

        System.out.println("Esercizio 2");
        Map<Customer, Double> map2 = orders.stream().collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(Order::getTotal)));
        System.out.println(map2);
        System.out.println("-------------------------");

        System.out.println("Esercizio 3");
        List<Product> products = Helper.products;
        System.out.println("il prodotto col prezzo più alto costa " + products.stream().mapToDouble(Product::getPrice).max().getAsDouble() + " soldi");


        System.out.println("Esercizio 4");
        OptionalDouble avg = orders.stream().mapToDouble(Order::getTotal).average();
        System.out.println(avg.getAsDouble());
        System.out.println("-------------------------");

        System.out.println("Esercizio 5");
        Map<String, Double> map3 = products.stream().collect(Collectors.groupingBy(Product::getName, Collectors.summingDouble(Product::getPrice)));
    }
}
