package OOP_HomeworkSix.Model.NoteOperation;

import OOP_HomeworkSix.Model.Note.Note;

import java.util.List;

public interface Operations {
    void createNote(String hading, String textBody);

    void viewNote(int id);
    List<Note> viewAllNotes();
    Note editNote();
    Note deleteNote();
    Note deleteAllNotes();

}
