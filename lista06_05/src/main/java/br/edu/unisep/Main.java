package br.edu.unisep;

import br.edu.unisep.rentalservice.CarRentalService;

import java.util.Scanner;

public class Main {

    public static final String YES = "Y";
    public static final int RENT_BY_KM = 1;
    public static final int RENT_BY_DAYS = 2;

    private Scanner scanner = new Scanner(System.in);
    private CarRentalService service = new CarRentalService();

    private void execute() {
        handleInput();

        handleOutput();
    }

    private void handleInput() {
        System.out.println("Enter the customer's name: ");
        service.setCustomer(scanner.nextLine());

        System.out.println("Enter the rate by km: ");
        service.setRateByKm(scanner.nextDouble());

        System.out.println("Enter the rate by day: ");
        service.setRateByDay(scanner.nextDouble());

        scanner.nextLine();

        System.out.println("Do you want insurance? (Y/N) ");
        service.setInsurance(scanner.nextLine().equalsIgnoreCase(YES));
    }

    private void handleOutput() {
        System.out.println("Select an option: ");
        System.out.println("1 - Rent by km");
        System.out.println("2 - Rent by day");

        var option = scanner.nextInt();
        var total = 0d;

        if (option == RENT_BY_KM) {
            System.out.println("Enter the hired km: ");
            var hiredKm = scanner.nextDouble();

            System.out.println("Enter the km you actually used: ");
            var actualKm = scanner.nextDouble();

            total = service.calculateRentalCost(hiredKm, actualKm);
        } else if (option == RENT_BY_DAYS) {
            System.out.println("Enter the number of days you used: ");
            var numberOfDays = scanner.nextInt();

            total = service.calculateRentalCost(numberOfDays);
        }

        System.out.println("Total - R$ " + total);
    }

    public static void main(String[] args) {
        var app = new Main();
        app.execute();
    }
}
