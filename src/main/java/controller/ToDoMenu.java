package controller;

import java.util.Scanner;

public class ToDoMenu {
    Scanner scanner = new Scanner(System.in);
    ToDoController toDoController = new ToDoController();
    public void start() {
        this.showOptions();
        this.handUserChoice();

    }
    private void handUserChoice() {
        System.out.println("Choose an option: ");
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case"1":
                toDoController.addTodo();
                break;
            case"2":
                //view all item
                break;
            case"3":
                //view single item
                break;
            case"4":
                //remove item
                break;
            case"5":
                //update item
                break;
            case"6":
                System.exit(0);
        }

        System.out.println();
        start();

    }
    private void showOptions() {
        System.out.println(
                "Welcome to Todo App" +
                "\n 1. Add todo item" +
                "\n 2. View todo List" +
                "\n 3. View todo Item" +
                "\n 4. Remove Item" +
                "\n 5. Update Item" +
                "\n 6. Exit"
        );
    }
}
