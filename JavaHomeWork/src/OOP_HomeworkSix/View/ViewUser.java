package OOP_HomeworkSix.View;

import OOP_HomeworkSix.Controllers.NoteController;
import OOP_HomeworkSix.Model.Note.Note;
import OOP_HomeworkSix.Model.Note.SimpleNote;

import java.util.List;
import java.util.Scanner;

public class ViewUser {
    private final NoteController noteController;

    public ViewUser(NoteController noteController) {
        this.noteController = noteController;
    }

    public void run() {
        Commands com;

        while (true) {
            String command = prompt("Input command: ");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("I don't now this command");
                continue;
            }
            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {
                    case CREATE -> {
                        Note createNote = setNote(false);
                        noteController.createNote(createNote);
                    }
                    case READ -> {
                        int idRead = promptInt();
                        System.out.println(noteController.viewNote(idRead));
                    }
                    case LIST -> {
                        List<Note> notes = noteController.viewAllNotes();
                        for (Note note:notes) {
                            System.out.println(note);
                        }
                    }
                    case UPDATE -> {
                        Note updateNote = setNote(true);
                        noteController.editNote(updateNote);
                    }
                    case DELETE -> {
                        int idDelete = promptInt();
                        noteController.deleteNote(idDelete);
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    private String prompt(String message) {
        Scanner in = scanner(message);
        return in.nextLine();
    }
    private int promptInt() {
        Scanner in = scanner("Input number of Note: ");
        return in.nextInt();
    }
    private Scanner scanner(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in;
    }

    private Note setNote(boolean forUpdate) {
        int idUpdate = 0;
        if (forUpdate) {
            idUpdate = promptInt();

        }
        String hading = prompt("Input hading: ");
        String textBody = prompt("Input note text : ");
        if (forUpdate) {
            return new SimpleNote(idUpdate, hading, textBody);
        }
        return new SimpleNote(hading, textBody);

    }

}
