package OOP_HomeworkSix.Model;


import OOP_HomeworkSix.Model.Note.Note;
import OOP_HomeworkSix.Model.Note.SimpleNote;

public class NoteMapper {
    public String map(Note note) {
        return String.format("%d,%s,%s",note.getId(), note.getHeading(), note.getText());
    }

    public Note map(String line) {
        String[] lines = line.split(",");
        return new SimpleNote(Integer.parseInt(lines[0]), lines[1], lines[2]);
    }
}
