package com.example.notes.repos;

import com.example.notes.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotesRepo extends JpaRepository<Note, Long> {

    List<Note> findAllByOwnerUsername(String ownerUsername);

}
