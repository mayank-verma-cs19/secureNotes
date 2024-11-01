package com.example.notes.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "note")

public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob // Large object specify
    private String content;

    private String ownerUsername;
}
