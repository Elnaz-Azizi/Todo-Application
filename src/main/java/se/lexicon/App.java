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

        Person elnaz = new Person(1,"Elnaz", "Azizi","elnaz.azizi@test.se");
        /*elnaz.setId(1);
        elnaz.setFirstName("Elnaz");
        elnaz.setLastName("Azizi");
        elnaz.setEmail("azizi.elnaz@example.com");*/

        System.out.println(elnaz.getSummary());

        Person test = new Person(2,"test", "test");
        System.out.println(test.getSummary());


        TodoItem task1 = new TodoItem();
        task1.setId(10);
        task1.setTitle("Complete Todo IT Assignment");
        task1.setTaskDescription("Finish the Person part");
        task1.setDeadLine(LocalDate.of(2024, 3, 25));
        task1.setCreator(elnaz);
        System.out.println(task1.getSummary());
        System.out.println(task1.isOverdue());

        TodoItemTask todoItemTask = new TodoItemTask();
        todoItemTask.setTodoItem(task1);
        todoItemTask.setAssignee(test);

        System.out.println(todoItemTask.getSummary());





    }
}

