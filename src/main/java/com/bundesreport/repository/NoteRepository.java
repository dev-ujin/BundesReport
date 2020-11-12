package com.bundesreport.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import com.bundesreport.domain.Note;
import com.bundesreport.domain.Post;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class NoteRepository {

	private final EntityManager em;
	
	public Note findOne(Long id) {
		return em.find(Note.class, id);
	}
	
	public List<Note> findAll() {
		TypedQuery<Note> query = em.createQuery("SELECT n FROM Note As n", Note.class);
		List<Note> notes = query.getResultList();
		notes.forEach(System.out::println); // 출력해보는 법
		
		return notes;
	}
}
