package com.service;

import java.util.List;

import com.dao.NoteDao;
import com.dao.NoteDaoImpl;
import com.entity.Note;

public class NoteServiceImpl implements NoteService {
	
	NoteDao nd=new NoteDaoImpl();

	@Override
	public String addNote(Note n) {
		return nd.addNote(n);
	}

	@Override
	public String deleteNote(int id) {
		return nd.deleteNote(id);
	}

	@Override
	public String updateNote(Note n) {
		return nd.updateNote(n);
	}

	@Override
	public List<Note> getAllNotes() {
		return nd.getAllNotes();
	}

	@Override
	public Note getNote(int id) {
		return nd.getNote(id);
	}

}
