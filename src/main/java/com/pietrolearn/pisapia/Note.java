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
    
    // Costruttori
    
    public Note() {
    }
    
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }
    
    
    public Note(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    //Getters and setters

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
 

    //  toString

    @Override
    public String toString() {
        return "Note [id=" + id + ", title=" + title + ", content=" + content + "]";
    }


    
}

