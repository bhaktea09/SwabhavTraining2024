package com.techlabs.listtest;

import java.util.ArrayList;
import java.util.Scanner;
import com.techlabs.list.model.Car;

public class CarTest {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cars:");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Car ID: ");
            int carId = scanner.nextInt();

            System.out.print("Company Name: ");
            String companyName = scanner.nextLine();

            System.out.print("Price: ");
            int price = scanner.nextInt();

            System.out.print("Mileage: ");
            int mileage = scanner.nextInt();

            cars.add(new Car(carId,companyName,price,mileage));
        }


        displayCars(cars);
        displayCarWithMaxMileage(cars);
    }

    public static void displayCars(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static void displayCarWithMaxMileage(ArrayList<Car> cars) {
       
        Car maxMileageCar = cars.get(0);
        for (Car car : cars) {
            if (car.getMileage() > maxMileageCar.getMileage()) {
                maxMileageCar = car;
            }
        }

        System.out.println("Car with maximum mileage:");
        System.out.println(maxMileageCar);
    }
}
