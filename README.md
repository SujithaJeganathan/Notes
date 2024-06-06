# Notes Application

A simple notes application built using JSP (JavaServer Pages) that allows users to add, delete, and edit notes. The application includes basic styling and optional features like local storage persistence, categorization/tagging, and responsive design.

## Features

### Notes Display
- Displays a list of notes with each note showing its title and content.

### Add Note
- Allows users to add new notes to the list.
- Provides a form with input fields for the note title and content.
- Validates that both the title and content are not empty before adding a note.

### Delete Note
- Allows users to delete a note.
- Includes a button next to each note that allows the user to delete that specific note.

### Edit Note
- Allows users to edit the title and content of a note.
- Users can click on a note to edit its title and content.

### Styling
- Basic styling applied to make the app visually appealing.
- Uses CSS for styling.

### Bonus Features (Optional)
- **LocalStorage Persistence:** Notes are persisted in local storage even when the page is refreshed.
- **Category/Tagging:** Users can categorize or tag notes for better organization.
- **Responsive Design:** The application is responsive and adapts to different screen sizes.

## Getting Started

### Prerequisites
- JDK 8 or higher
- Apache Tomcat or any other servlet container
- Maven (optional, for dependency management)

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/notes-app.git
    cd notes-app
    ```

2. **Build the project using Maven:**
    ```bash
    mvn clean install
    ```

3. **Deploy the application to your servlet container:**
    - Copy the generated WAR file (`target/notes-app.war`) to the `webapps` directory of your Tomcat server.
    - Alternatively, you can deploy the project from your IDE (e.g., IntelliJ IDEA, Eclipse).

4. **Access the application:**
    - Start your Tomcat server.
    - Open your web browser and navigate to `http://localhost:8080/notes-app`.

## Usage

- **Add Note:** Click on "Add Note" to create a new note by providing a title and content.
- **Edit Note:** Click on the "Edit" link next to a note to modify its title and content.
- **Delete Note:** Click on the "Delete" button next to a note to remove it.

## Screenshots

![Notes Display](screenshots/notes_display.png)
![Add Note](screenshots/add_note.png)
![Edit Note](screenshots/edit_note.png)

## Technologies Used

- Java
- JSP (JavaServer Pages)
- HTML/CSS
- JavaScript (for optional features)
- Bootstrap (for responsive design)

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any changes or improvements.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries or feedback, please contact Sujitha at sujitha.jegan27@gmail.com.

