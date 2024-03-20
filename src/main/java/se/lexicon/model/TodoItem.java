package se.lexicon.model;

import java.time.LocalDate;

public class TodoItem {

    // Field

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    //constructor

    //methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
    public String getSummary(){
       return "Description of the Todo Item-> id: " + id + ", Title: " + title + ", Task description: " + taskDescription + ", Dead line: " + deadLine + ", Done: " + done +", Creator: " + creator.getFirstName() + "\n";
    }
    public boolean isOverdue(){
        LocalDate  currentDate= LocalDate.now();
        return currentDate.isAfter(deadLine);
    }

}
