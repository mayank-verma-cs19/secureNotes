package com.secure.notes.services;

import com.secure.notes.models.Note;

import java.util.List;

public interface NoteService {
    Note createNoteForUser(String username, String content);

    Note updateNoteForUSer(Long noteid, String content, String username);

    void deleteNoteForUser(Long noteid, String username);

    List<Note> getAllNotesForUser(String username);
}
