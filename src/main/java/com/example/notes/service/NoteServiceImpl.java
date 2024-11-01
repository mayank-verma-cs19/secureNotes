package com.example.notes.service;

import com.example.notes.models.Note;
import com.example.notes.repos.NotesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NotesRepo notesRepo;

    @Override
    public Note createNoteForUser(String username, String content) {
        Note note = new Note();
        note.setContent(content);
        note.setOwnerUsername(username);
        return notesRepo.save(note);
    }

    @Override
    public Note updateNoteForUSer(Long noteid, String content, String username){
        Note note = notesRepo.findById(noteid).orElseThrow(() -> new RuntimeException("Note not found"));
        note.setContent(content);
        return notesRepo.save(note);
    }

    @Override
    public void deleteNoteForUser(Long noteid, String username){
        notesRepo.deleteById(noteid);
    }

    @Override
    public List<Note> getAllNotesForUser(String username) {
        List<Note> notes = notesRepo.findAllByOwnerUsername(username);
        return notes;
    }

}
