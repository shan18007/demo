package com.dao;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entity.Note;
import com.factory.DB;

public class NoteDaoImpl implements NoteDao {
	DB db = new DB();
	SessionFactory factory = db.getFactory();
	Note note = null;
	int res = 0;

	@Override
	public String addNote(Note n) {
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(n);
				System.out.println(n);
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e);
			return e.toString();
		}
			return "success";
	}

	@Override
	public String deleteNote(int id) {
		try {

			Session session = factory.openSession();
			session.beginTransaction();
			session.delete(session.get(Note.class, id));
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e);
			return e.toString();
		}
		return "success";
	}

	@Override
	public String updateNote(Note n) {
		try {

			Session session = factory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(note);
			session.getTransaction().commit();
			session.close();

		} catch (Exception e) {
			System.out.println(e);
			return e.toString();
		}
		return "success";
	}

	@Override
	public List<Note> getAllNotes() {
//		Note note;
		List<Note> list = null;
		try {
			Session session = factory.openSession();
			Query q = session.createQuery("from Note");
			list = q.getResultList();

		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	@Override
	public Note getNote(int id) {
		Note n=null;
		try {
			Session session = factory.openSession();
			 n=session.get(Note.class, id);
			session.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return n;	
	}
}
