package com.bundesreport.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bundesreport.service.NoteService;
import com.bundesreport.type.CategoryType;
import com.bundesreport.domain.User;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class NoteController extends PageController{

	private final NoteService noteService;
	
	@GetMapping(value = "/message/list")
	public String list(Model model, Authentication authentication) {
		if (authentication != null) {
			// ToDo: Data get with User
			//model = createLayout(model, (User) authentication.getPrincipal());
			return "notes/noteList";
		}
		//model = createLayout(model, null);
		return "notes/noteList";
	}
	
}
