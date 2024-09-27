package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import seats.Seats;
import train.Train;

public class Main {
    public static Train inputTrain(Scanner scanner){
        System.out.println("Enter train's destination: ");
        String trainDestination = scanner.nextLine();

        System.out.println("Enter train number: ");
        int trainNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter time of departure: ");
        String departureTime = scanner.nextLine();

        System.out.println("Enter count of general seats: ");
        int generalSeats = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter count of coupe seats: ");
        int coupeSeats = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter count of platzkart seats: ");
        int platzkartSeats = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter count of lux seats: ");
        int luxSeats = scanner.nextInt();
        scanner.nextLine();

        Seats seats = new Seats(generalSeats, coupeSeats, platzkartSeats, luxSeats);
        return new Train(trainDestination, trainNumber, departureTime, seats);
    }

    public static void findTrainsByDestination(List<Train> trains, String destination) {
        System.out.println("Trains going to " + destination + ":");
        boolean found = false;

        for (Train train : trains) {
            if (train.getDestination().equalsIgnoreCase(destination)) {
                System.out.println(train);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No trains found for destination: " + destination);
        }
    }

    public static void findTrainsByDestinationAndTime(List<Train> trains, String destination, String time) {
        System.out.println("Trains going to " + destination + " and departing after " + time + ":");
        boolean found = false;

        for (Train train : trains) {
            if (train.getDestination().equalsIgnoreCase(destination)) {
                if (train.getDepartureTime().compareTo(time) > 0) {
                    System.out.println(train);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No trains found for destination: " + destination);
        }
    }

    public static void findTrainsWithGeneralSeats(List<Train> trains, String destination) {
        System.out.println("Trains going to " + destination + " with general seats:");
        boolean found = false;

        for (Train train : trains) {
            if (train.getDestination().equalsIgnoreCase(destination) &&
                    train.getSeats().getGeneralSeats() > 0) {
                System.out.println(train);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No trains found for destination: " + destination + " with general seats.");
        }
    }

    public static void main(String[] args){
        List<Train> trains = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of trains: ");
        int train_count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < train_count; i++) {
            System.out.println("Information about train " + (i + 1) + ": ");
            Train train = inputTrain(scanner);
            trains.add(train);
        }

        System.out.println("Enter destination for first search: ");
        String destination = scanner.nextLine();
        findTrainsByDestination(trains, destination);

        System.out.println("Enter destination for second search: ");
        String destination2 = scanner.nextLine();
        System.out.println("Enter minimum departure time (HH:MM): ");
        String time = scanner.nextLine();
        findTrainsByDestinationAndTime(trains, destination2, time);

        System.out.println("Enter destination for general seats search: ");
        String destination3 = scanner.nextLine();
        findTrainsWithGeneralSeats(trains, destination3);
        }

}