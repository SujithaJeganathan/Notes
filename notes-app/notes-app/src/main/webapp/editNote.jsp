<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Note</title>
</head>
<body>
    <h1>Edit Note</h1>
    <form action="note?action=update" method="post">
        <input type="hidden" name="id" value="${note.id}">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" value="${note.title}" required><br>
        <label for="content">Content:</label>
        <textarea id="content" name="content" required>${note.content}</textarea><br>
        <button type="submit">Save Changes</button>
    </form>
</body>
</html>
