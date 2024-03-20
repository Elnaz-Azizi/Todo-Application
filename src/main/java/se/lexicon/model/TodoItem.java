package se.lexicon.model;

import java.time.LocalDate;

public class TodoItem {

    // Field

    private int id1;
    private String title1;
    private String taskDescription1;
    private LocalDate deadLine1;
    private boolean done1;
    private Person creator;

    //constructor

    //methods

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTaskDescription1() {
        return taskDescription1;
    }

    public void setTaskDescription1(String taskDescription1) {
        this.taskDescription1 = taskDescription1;
    }

    public LocalDate getDeadLine1() {
        return deadLine1;
    }

    public void setDeadLine1(LocalDate deadLine1) {
        this.deadLine1 = deadLine1;
    }

    public boolean isDone1() {
        return done1;
    }

    public void setDone1(boolean done1) {
        this.done1 = done1;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
    public String getSummary(){
       return "Description of the Todo Item-> id: " + id1 + "Title: " + title1 + "Task description: " + taskDescription1 + "Dead line: " + deadLine1 + "Done: " + done1 +"Creator: " + creator + "\n";
    }
    public boolean isOverdue(){
        LocalDate  currentDate= LocalDate.now();
        return currentDate.isAfter(deadLine1);
    }

}
