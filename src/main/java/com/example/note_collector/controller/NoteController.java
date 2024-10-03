package com.example.note_collector.controller;

import com.example.note_collector.dto.impl.NoteDTO;
import com.example.note_collector.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteDTO saveNote(@RequestBody NoteDTO noteDTO) {
        return noteService.saveNote(noteDTO);
    }
    public NoteDTO getSelectedNote(){
        return null;
    }
    //    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<NoteDTO> getALlNotes(){
//       return noteService.getAllNotes();
//    }
    public void deleteNote(String noteId){

    }
    public void updateNote(String noteId,NoteDTO noteDTO){

    }
}
