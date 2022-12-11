package OOP_HomeworkSix.Model.Note;

public abstract class Note {
    protected int id;
    protected String heading;
    protected String text;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getHeading() {
        return heading;
    }

    public String getText() {
        return text;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("*   *   *\nNote id: %d\nNote hading: %s\nNote body: %s\n", id, heading, text);
    }
}
