package OOP_HomeworkSix.Model.NoteOperation;

import OOP_HomeworkSix.Model.Note.Note;

import java.util.List;

public interface Operations {
    void createNote(Note note);

    Note viewNote(int id) throws Exception;
    List<Note> viewAllNotes();

    Note editNote(Note note) throws Exception;

    void deleteNote(int id) throws Exception;


}
