package OOP_HomeworkSix.Model.NoteOperation;

import OOP_HomeworkSix.Model.*;
import OOP_HomeworkSix.Model.FileOperation.FileOperation;
import OOP_HomeworkSix.Model.FileOperation.FileOperationImp;
import OOP_HomeworkSix.Model.Note.Note;
import OOP_HomeworkSix.Model.Note.SimpleNote;

import java.util.ArrayList;
import java.util.List;

public class NoteOperations implements Operations {


    private final FileOperation fileOperation;
    private final NoteMapper noteMapper = new NoteMapper();

    public NoteOperations(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public void createNote(Note createNote) {
        List<Note> notes = viewAllNotes();
        int max = 0;
        for (Note note : notes) {
            int id = note.getId();
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        Note note = new SimpleNote(newId, createNote.getHeading(), createNote.getText());
        notes.add(note);
        saveNote(notes);
    }
    private void saveNote(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note note: notes) {
            lines.add(noteMapper.map(note));
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public Note viewNote(int id) throws Exception {
        List<Note> notes = viewAllNotes();
        return findNote(notes, id);
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
    public Note editNote(Note note) throws Exception {
        List<Note> notes = viewAllNotes();
        Note foundNote = findNote(notes, note.getId());
        foundNote.setHeading(note.getHeading());
        foundNote.setText(note.getText());
        saveNote(notes);
        return foundNote;
    }

    @Override
    public void deleteNote(int id) throws Exception {
        List<Note> notes = viewAllNotes();
        Note foundNote = findNote(notes, id);
        notes.remove(foundNote);
        saveNote(notes);
    }
    public Note findNote(List<Note> notes, int id) throws Exception{
        for (Note note:notes) {
            if (note.getId() == id){
                return note;
            }
        }
        throw new Exception("Note didn't found");
    }


}
