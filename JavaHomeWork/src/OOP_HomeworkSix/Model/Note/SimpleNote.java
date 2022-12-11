package OOP_HomeworkSix.Model.Note;

public class SimpleNote extends Note {
    public SimpleNote() {
        super();
    }


    public SimpleNote(int id, String hading, String textBody) {
        this.id = id;
        this.heading = hading;
        this.text = textBody;
    }
}
