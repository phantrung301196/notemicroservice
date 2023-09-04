package com.trunghp.notemicroservice.service;

import java.util.List;

import com.trunghp.notemicroservice.domain.Note;
import com.trunghp.notemicroservice.service.DTO.NoteDTO;
import com.trunghp.notemicroservice.service.DTO.request.NoteSearchRquest;

public interface NoteService {
	NoteDTO save(Note note);

	NoteDTO getNoteById(String id) throws Exception;

	List<NoteDTO> findAll();
	
	List<NoteDTO> searchNote(NoteSearchRquest noteSearchRquest);
}
