package OOP_HomeworkSix.Model.Note;

public class SimpleNote extends Note {

    public SimpleNote(int id, String hading, String textBody) {
        this.id = id;
        this.heading = hading;
        this.text = textBody;
    }
    public SimpleNote(String hading, String textBody) {
        this.heading = hading;
        this.text = textBody;
    }

}
