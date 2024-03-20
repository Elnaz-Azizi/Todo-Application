package se.lexicon;

import se.lexicon.model.Person;
import se.lexicon.model.TodoItem;
import se.lexicon.model.TodoItemTask;

import java.time.LocalDate;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        Person person = new Person();
        person.setId1(19);
        person.setFirstName1("Elnaz");
        person.setLastName1("Azizi");
        person.setEmail1("azizi.elnaz@example.com");
        System.out.println(person.getSummary());

        TodoItem todoItem = new TodoItem();
        todoItem.setId1(12345);
        todoItem.setTitle1("Complete Todo IT Assignment");
        todoItem.setTaskDescription1("Finish the Person part");
        todoItem.setDeadLine1(LocalDate.of(2024, 03, 25));
        todoItem.setDone1(false);

        System.out.println(todoItem.getSummary());

        if (todoItem.isOverdue()) {
            System.out.println("Deadline is overdue.");
        } else {
            System.out.println("Deadline is not yet overdue.");
        }

        TodoItemTask todoItemTask = new TodoItemTask();
        todoItemTask.setId1(345);
        todoItemTask.setAssigned(true);
       todoItemTask.setTodoItemTask(todoItemTask);
       todoItemTask.setAssignee(person);
        System.out.println(todoItemTask.getSummary());

    }
}

