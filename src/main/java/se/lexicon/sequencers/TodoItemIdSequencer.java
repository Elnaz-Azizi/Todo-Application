package se.lexicon.sequencers;

public class TodoItemIdSequencer {
    private static int currentId = 2000;
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
