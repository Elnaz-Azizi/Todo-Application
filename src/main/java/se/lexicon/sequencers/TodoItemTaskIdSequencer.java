package se.lexicon.sequencers;

public class TodoItemTaskIdSequencer {
    private static int currentId = 3000;
    public static int nextId(){
        return ++currentId;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int id) {
        currentId=id;

    }
}
