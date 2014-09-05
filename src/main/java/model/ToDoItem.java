package model;


public class ToDoItem implements Comparable<ToDoItem> {



    private Long id;
    private String name;
    private boolean completed;


    @Override
    public int compareTo(ToDoItem o) {
        return 0;
    }

    // Getter Setter ----------------------------------------------------------------------------------------------
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Long getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }
}
