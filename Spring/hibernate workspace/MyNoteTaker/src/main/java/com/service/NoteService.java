package com.service;

import java.util.ArrayList;
import java.util.List;

import com.entity.Note;

public interface NoteService {

	public String addNote(Note n);
	public String deleteNote(int id);
	public String updateNote(Note n);
	public List<Note> getAllNotes();
	public Note getNote(int id);
	
}
