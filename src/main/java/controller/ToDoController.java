package controller;

import entity.Status;
import entity.Todo;

import java.sql.Date;
import java.sql.Time;
import java.util.Scanner;

public class ToDoController {
    Scanner scanner = new Scanner(System.in);

    public ToDoController() {
    }

    public void addTodo() {

        try {
        Todo todo = this.collectTodoInfo();
            System.out.println(todo);
        }catch (Exception exception) {
            System.out.println("Error occurred while creating todo" + exception.getMessage());
            //show msg about error
        }

    }
    private Todo collectTodoInfo() throws Exception {
        Todo todo = new Todo();
        todo.setDescription(this.getUserInput("Enter description"));
        todo.setDueDate(Date.valueOf(this.getUserInput("Enter due date, Example 2022-07-18")));
        todo.setDueTime(Time.valueOf(getUserInput("Enter due time, Example (19:35)") + ":00"));
        todo.setStatus(Status.PENDING);

        return todo;
    }

    private String getUserInput(String message) {
        System.out.println(message);
        String value = scanner.nextLine();
        return value;
    }
}
