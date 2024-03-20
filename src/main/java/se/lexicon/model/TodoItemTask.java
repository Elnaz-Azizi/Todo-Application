package se.lexicon.model;

public class TodoItemTask {
    //Field:
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    //Methods:


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        this.assigned = true;
    }

    public String getSummary() {
        return "Description of the task-> id: " + id + "Assigned: " + assigned + "Todo item: " + todoItem.getTitle() + "Assignee: " + assignee.getFirstName() + "\n";
    }
}
