package OOP_HomeworkSix.Model.NoteOperation;

import OOP_HomeworkSix.Model.*;
import OOP_HomeworkSix.Model.FileOperation.FileOperation;
import OOP_HomeworkSix.Model.FileOperation.FileOperationImp;
import OOP_HomeworkSix.Model.Note.Note;
import OOP_HomeworkSix.Model.Note.SimpleNote;
import OOP_HomeworkSix.Model.Notebook.Notebook;
import OOP_HomeworkSix.Model.Notebook.SimpleNotebook;

import java.util.ArrayList;
import java.util.List;

public class NoteOperations implements Operations {
    private Note note;
    private final Notebook notebook;
    private FileOperation fileOperation = new FileOperationImp("C:\\Users\\drozd\\Documents" +
            "\\GB\\Java\\JavaHomeWork\\src\\OOP_HomeworkSix\\Notebook.txt");
    private NoteMapper noteMapper = new NoteMapper();

    public NoteOperations() {
        this.notebook = new SimpleNotebook();
    }

    @Override
    public void createNote(String hading, String textBody) {
        List<Note> notes = viewAllNotes();
        int max = 0;
        for (Note note : notes) {
            int id = note.getId();
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        Note note = new SimpleNote(newId,hading, textBody);
        notebook.addNote(note);
        saveNote(notebook.getNotes());
    }
    private void saveNote(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note note: notes) {
            lines.add(noteMapper.map(note));
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public void viewNote(int id) {
        List<Note> notes = viewAllNotes();
        for (Note note: notes) {
            if (note.getId() == id){
                System.out.println(note);
            }
        }
    }

    @Override
    public List<Note> viewAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(noteMapper.map(line));
        }
        return notes;
    }


    @Override
    public Note editNote() {
        return null;
    }

    @Override
    public Note deleteNote() {
        return null;
    }

    @Override
    public Note deleteAllNotes() {
        return null;
    }

}
