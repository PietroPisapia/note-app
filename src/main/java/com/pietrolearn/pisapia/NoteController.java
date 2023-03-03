package com.pietrolearn.pisapia;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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

}
