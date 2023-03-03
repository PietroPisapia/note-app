package com.pietrolearn.pisapia;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {
    
    private final NoteRepository noteRepository;

    NoteController(NoteRepository repository){
        noteRepository = repository;
    }

    @GetMapping("/notes")
    Iterable getNotes(){
        return noteRepository.findAll();
    }

    @PostMapping("/notes")
    Note createNote(@RequestBody Note newNote){
        return noteRepository.save(newNote);
    }

}
