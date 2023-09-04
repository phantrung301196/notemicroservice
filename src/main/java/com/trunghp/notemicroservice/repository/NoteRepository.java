package com.trunghp.notemicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trunghp.notemicroservice.domain.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, String> {

}
