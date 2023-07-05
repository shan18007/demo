package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.NoteService;
import com.service.NoteServiceImpl;
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

		response.setContentType("text/html");
		int nid= Integer.parseInt(request.getParameter("id"));
		NoteService nService =new  NoteServiceImpl();
		String s = nService.deleteNote(nid);
		HttpSession session = request.getSession();
		session.setAttribute("msg", s);
		response.sendRedirect("view-notes.jsp");
	}

}
