package com.techlabs.model;

public class Q {
    private int n;
    private boolean valueSet = false;

    public synchronized int get() {
        while (!valueSet) {
            try {
                wait(); // Wait until value is set by producer
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        System.out.println("Got: " + n);
        valueSet = false; // Reset valueSet after consuming
        notify(); // Notify producer that consumer has consumed
        return n;
    }

    public synchronized void put(int n) {
        while (valueSet) {
            try {
                wait(); // Wait until consumer consumes the value
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        this.n = n; // Set the value
        valueSet = true; // Indicate that value is set
        System.out.println("Put: " + n);
        notify(); // Notify consumer that value is ready
    }
}
