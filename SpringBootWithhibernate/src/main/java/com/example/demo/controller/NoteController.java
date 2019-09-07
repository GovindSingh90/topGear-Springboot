package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.NoteRepository;
import com.example.demo.entity.Note;

@RestController
@RequestMapping("/api")
public class NoteController {
	
	@Autowired
	NoteRepository note;
	
	@GetMapping("/notes")
	public List<Note> getAllNotes(){
		
		return note.findAll();
	}
	
	@PostMapping("/notes")
	public Note createNote(@Valid @RequestBody Note n) {
	    return note.save(n);
	}
	
	

}
