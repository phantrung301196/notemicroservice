package com.trunghp.notemicroservice.service.impl;

import com.trunghp.notemicroservice.domain.Note;
import com.trunghp.notemicroservice.repository.NoteRepository;
import com.trunghp.notemicroservice.service.DTO.NoteDTO;
import com.trunghp.notemicroservice.service.DTO.request.NoteSearchRquest;
import com.trunghp.notemicroservice.service.NoteService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {
	private final NoteRepository noteRepository;
//	private final NoteRepositorySearch noteRepositorySearch;

	@EventListener(ApplicationReadyEvent.class)
	public void initNoteDocumemnt() {
//		noteRepositorySearch.deleteAll();
//		noteRepositorySearch
//				.saveAll(noteRepository.findAll().stream().map(NoteDocument::new).collect(Collectors.toList()));
//		noteRepository.findAll().stream().map(NoteDocument::new).collect(Collectors.toList());
		noteRepository.deleteAll();
	}

	@Override
	public NoteDTO save(Note noteRequest) {
		Note note = noteRepository.save(noteRequest);
//		noteRepositorySearch.save(new NoteDocument(note));
		return new NoteDTO(note);
	}

	@Override
	public NoteDTO getNoteById(String id) throws Exception {
		// TODO Auto-generated method stub
		return new NoteDTO(
				noteRepository.findById(id).orElseThrow(() -> new Exception("Note not found with id: " + id)));
	}

	@Override
	public List<NoteDTO> findAll() {
		return noteRepository.findAll().stream().map(NoteDTO::new).toList();
	}

	@Override
	public List<NoteDTO> searchNote(NoteSearchRquest noteSearchRquest) {
		// TODO Auto-generated method stub
		return null;
	}
}
