package com.trunghp.notemicroservice.service.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trunghp.notemicroservice.domain.Note;
import com.trunghp.notemicroservice.service.NoteService;
import com.trunghp.notemicroservice.service.DTO.NoteDTO;
import com.trunghp.notemicroservice.service.DTO.request.NoteSearchRquest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional
@RestController
@RequiredArgsConstructor
@RequestMapping("api/notes")
public class NoteResource {

	private final NoteService noteService;

	@PostMapping
	public ResponseEntity<NoteDTO> saveNote(@RequestBody NoteDTO noteDTORequest) throws URISyntaxException {
		log.info("Request for create note");
		NoteDTO noteDTO = noteService.save(new Note(noteDTORequest));
		return ResponseEntity.created(new URI("/api/note")).body(noteDTO);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<NoteDTO> getNote(@PathVariable String id) throws Exception {
		log.info("Request for get note with id {}", id);
		NoteDTO noteDTO = noteService.getNoteById(id);
		return ResponseEntity.created(new URI("/api/note/".concat(id))).body(noteDTO);
	}

	@GetMapping()
	public ResponseEntity<List<NoteDTO>> findAll() throws URISyntaxException {
		log.info("Request for get all note");
		return ResponseEntity.created(new URI("/api/note")).body(noteService.findAll());
	}
	
	@PostMapping("/search")
	public ResponseEntity<List<NoteDTO>> searchNotes(@RequestBody NoteSearchRquest noteSearchRquest) throws URISyntaxException{
		return ResponseEntity.created(new URI("/api/note")).body(noteService.findAll());
	}
}
