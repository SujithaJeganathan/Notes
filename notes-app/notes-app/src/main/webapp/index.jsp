<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Notes Application</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h1>Notes</h1>
    <a href="note?action=new">Add Note</a>
    <ul>
        <c:forEach var="note" items="${notes}">
            <li>
                <h3>${note.title}</h3>
                <p>${note.content}</p>
                <a href="note?action=edit&id=${note.id}">Edit</a>
                <form action="note?action=delete" method="post" style="display:inline;">
                    <input type="hidden" name="id" value="${note.id}">
                    <button type="submit">Delete</button>
                </form>
            </li>
        </c:forEach>
    </ul>
</body>
</html>
