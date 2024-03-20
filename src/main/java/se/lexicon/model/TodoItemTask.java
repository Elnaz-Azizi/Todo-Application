package se.lexicon.model;

public class TodoItemTask {
    //Field:
    private int id1;
    private boolean assigned;
    private TodoItemTask todoItemTask;
    private Person assignee;

    //Methods:


    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItemTask getTodoItemTask() {
        return todoItemTask;
    }

    public void setTodoItemTask(TodoItemTask todoItemTask) {
        this.todoItemTask = todoItemTask;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
    public String getSummary() {
        return "Description of the task-> id: " + id1 + "Assigned: " + assigned + "Todo item: " + todoItemTask + "Assignee: " + assignee + "\n";
    }
}
