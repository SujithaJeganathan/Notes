<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Note</title>
</head>
<body>
    <h1>Add Note</h1>
    <form action="note?action=insert" method="post">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" required><br>
        <label for="content">Content:</label>
        <textarea id="content" name="content" required></textarea><br>
        <button type="submit">Add Note</button>
    </form>
</body>
</html>
