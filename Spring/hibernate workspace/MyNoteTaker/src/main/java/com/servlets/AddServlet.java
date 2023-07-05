package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Note;
import com.service.NoteService;
import com.service.NoteServiceImpl;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddServlet() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String title = request.getParameter("title");
		String content = (request.getParameter("content"));
		Note note = new Note(title, content, new Date());

		NoteService ns = new NoteServiceImpl();
		String res = ns.addNote(note);

		if (res.equals("success")) {
			pw.println("<h2>" + "Note added Successfully" + "</h2>");
			response.sendRedirect("add-note.jsp");
		} else if (res.equals("fail")) {
			pw.println("<h2>" + "Something went wrong..!" + "</h2>");
		} else {
			pw.println(res);
		}

	}

}
