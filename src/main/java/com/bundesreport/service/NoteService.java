package com.bundesreport.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bundesreport.domain.Note;
import com.bundesreport.domain.Post;
import com.bundesreport.repository.NoteRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor

public class NoteService{

	private final NoteRepository noteRepository;
	
	/** 우편 조회 */
	public Note findNost(Long noteId) {
		return noteRepository.findOne(noteId);
	}

	public List<Note> findPosts() {
		return noteRepository.findAll();
	}

}
