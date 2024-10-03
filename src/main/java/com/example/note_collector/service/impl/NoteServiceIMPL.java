package com.example.note_collector.service.impl;

import com.example.note_collector.dto.impl.NoteDTO;
import com.example.note_collector.service.NoteService;
import com.example.note_collector.util.AppUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceIMPL implements NoteService {


    @Override
    public NoteDTO saveNote(NoteDTO noteDTO) {
        noteDTO.setNoteId(AppUtil.generateNoteId());
//        noteDTOList.add(noteDTO);
        return noteDTO;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        return null;
    }

    @Override
    public NoteDTO getNote(String noteId) {
        return null;
    }

    @Override
    public boolean deleteNote(String noteId) {
        return false;
    }

    @Override
    public boolean updateNote(String noteId, NoteDTO noteDTO) {
        return false;
    }
}
