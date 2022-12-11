package OOP_HomeworkSix.Model.Notebook;

import OOP_HomeworkSix.Model.Note.Note;

import java.util.ArrayList;
import java.util.List;

public abstract class Notebook {
    List<Note> notes;

    public Notebook() {
        this.notes = new ArrayList<>();
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
    public void addNote(Note note){
        notes.add(note);
    }



}
