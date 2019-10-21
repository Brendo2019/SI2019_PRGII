package br.edu.unisep;

import br.edu.unisep.professor.HourlyProfessor;
import br.edu.unisep.professor.Professor;

import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(System.in);
    private Professor prof;

    public void execute() {
        showMenu();

        handleInput();

        var income = prof.getIncome();
        System.out.println("The professor's income will be R$ " + income);
    }

    private void handleInput() {
        System.out.println("Enter the professor's name: ");
        prof.setName(scanner.nextLine());

        System.out.println("Enter the professor's id: ");
        prof.setId(scanner.nextInt());

        System.out.println("Enter the professor's workload (weekly): ");
        prof.setWorkload(scanner.nextInt());

        System.out.println("Enter the professor's salary: ");
        prof.setSalary(scanner.nextDouble());
    }

    private void showMenu() {
        System.out.println("-- Options Menu --");
        System.out.println("1 - Full time professor");
        System.out.println("2 - Hourly professor");

        var option = scanner.nextInt();

        if (option == 1) {
            prof = new Professor();
        } else {
            prof = new HourlyProfessor();
        }

        scanner.nextLine();
    }

    public static void main(String[] args) {
        var app = new Main();
        app.execute();
    }
}
