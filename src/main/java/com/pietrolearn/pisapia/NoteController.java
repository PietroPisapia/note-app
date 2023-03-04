package com.pietrolearn.pisapia;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {
    
    private final NoteRepository noteRepository;

    NoteController(NoteRepository repository){
        noteRepository = repository;
    }

    @GetMapping("/notes")
    Iterable<Note> getNotes(){
        return noteRepository.findAll();
    }
    
    @GetMapping("/notes/{noteId}")
    Note getNote(@PathVariable Long noteId){
        return noteRepository.findById(noteId).orElseThrow();  
    }


    @PostMapping("/notes")
    Note createNote(@RequestBody Note newNote){
        return noteRepository.save(newNote);
    }

    @PutMapping("/notes/{noteId}")
    Note updateNote(@PathVariable Long noteId, @RequestBody Note notaDto){
        Note noteUpdate = noteRepository.findById(noteId).orElseThrow();
        noteUpdate.setTitle(notaDto.getTitle());
        noteUpdate.setContent(notaDto.getContent());
        
        return noteRepository.save(noteUpdate);

    }

    @DeleteMapping("/notes/{noteId}")
    void deleteNote(@PathVariable Long noteId){
        noteRepository.delete(noteRepository.findById(noteId).orElseThrow());
    }

}
