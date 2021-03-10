package com.bibash;

import java.util.LinkedList;

public class QueueWithLinkedList {
    public static class Customer {
        private Boolean hasBeenServed;
        private String name;

        public Customer(String name) {
            hasBeenServed = false;
            this.name = name;
        }

        public void serve() {
            hasBeenServed = true;
            System.out.println(name + " has been served");
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        LinkedList<Customer> customerQueue = new LinkedList<>();
        customerQueue.add(new Customer("bibash1"));
        customerQueue.add(new Customer("bibash2"));
        customerQueue.add(new Customer("bibash3"));
        customerQueue.add(new Customer("bibash4"));
        customerQueue.add(new Customer("bibash5"));
        System.out.println(customerQueue);
        serveCustomer(customerQueue);
        System.out.println(customerQueue);
    }

    static void serveCustomer(LinkedList<Customer> queue) {
        Customer customer = queue.poll();
        customer.serve();
    }
}
