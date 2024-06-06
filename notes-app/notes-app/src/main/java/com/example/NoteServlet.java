package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/notes")
public class NoteServlet extends HttpServlet {
    private List<Note> notes = new ArrayList<>();
    private int noteIdCounter = 1;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "new":
                showNewForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                deleteNote(request, response);
                break;
            default:
                listNotes(request, response);
                break;
        }
    }

    private void listNotes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("notes", notes);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/addNote.jsp").forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Note existingNote = notes.stream().filter(n -> n.getId() == id).findFirst().orElse(null);
        request.setAttribute("note", existingNote);
        request.getRequestDispatcher("/editNote.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("insert".equals(action)) {
            insertNote(request, response);
        } else if ("update".equals(action)) {
            updateNote(request, response);
        }
    }

    private void insertNote(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        if (title != null && !title.trim().isEmpty() && content != null && !content.trim().isEmpty()) {
            Note newNote = new Note(noteIdCounter++, title, content);
            notes.add(newNote);
        }
        response.sendRedirect("notes");
    }

    private void updateNote(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        Note note = notes.stream().filter(n -> n.getId() == id).findFirst().orElse(null);
        if (note != null && title != null && !title.trim().isEmpty() && content != null && !content.trim().isEmpty()) {
            note.setTitle(title);
            note.setContent(content);
        }
        response.sendRedirect("notes");
    }

    private void deleteNote(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        notes.removeIf(n -> n.getId() == id);
        response.sendRedirect("notes");
    }
}
