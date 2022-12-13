package OOP_HomeworkSix.Controllers;

import OOP_HomeworkSix.Model.FileOperation.FileOperationImp;
import OOP_HomeworkSix.Model.Note.Note;
import OOP_HomeworkSix.Model.NoteOperation.NoteOperations;

import java.util.List;

public class NoteController {
    NoteOperations noteOperations;

    public NoteController(NoteOperations noteOperations) {
        this.noteOperations = noteOperations;
    }

    public void createNote(Note note) throws Exception {
        validateNote(note);
        noteOperations.createNote(note);
    }
    public Note viewNote(int id) throws Exception {
        return noteOperations.viewNote(id);
    }
    public List<Note> viewAllNotes(){
        return noteOperations.viewAllNotes();
    }
    public Note editNote(Note note) throws Exception {
        validateNote(note);
        return noteOperations.editNote(note);
    }

    public void deleteNote(int id) throws Exception {
        noteOperations.deleteNote(id);
    }
    private void validateNote(Note note) throws Exception {
        if (note.getHeading().isEmpty()) {
            throw new Exception("No hading");
        }
        if (note.getText().isEmpty()) {
            throw new Exception("No text");
        }
    }


}
