package com.pietrolearn.pisapia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Note {
    private @Id @GeneratedValue Long id;
    private String title;
    private String content;
    
    // Costruttore
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }


    
}

