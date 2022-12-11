package OOP_HomeworkSix.Controllers;

import OOP_HomeworkSix.Model.FileOperation.FileOperationImp;
import OOP_HomeworkSix.Model.Note.Note;
import OOP_HomeworkSix.Model.NoteOperation.NoteOperations;

import java.util.List;

public class NoteController {
    NoteOperations noteOperations = new NoteOperations();

    public NoteController(NoteOperations noteOperations) {
        this.noteOperations = noteOperations;
    }

    public void createNote(String hading, String textBody){
        noteOperations.createNote(hading,textBody);
    }
    public void viewNote(int id){
        noteOperations.viewNote(id);
    }
    public List<Note> viewAllNotes(){
        return noteOperations.viewAllNotes();
    }

}
