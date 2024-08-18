# Andriod_Note_App

Overview
This Notes Android app, developed using Java and Firebase, is designed to provide users with a seamless experience for managing their notes. It allows users to sign in via Google, and perform CRUD (Create, Read, Update, Delete) operations on their notes. The app utilizes fragments to handle different screens within a single activity.

Features
Google Sign-In:

Users can authenticate using their Google accounts. This feature is implemented using Firebase Authentication to ensure a secure sign-in process.
View Notes:

After signing in, users are presented with a list of their notes. This view uses a RecyclerView to display notes in a scrollable list format.
Add Notes:

Users can add new notes through a dedicated interface. This feature is accessible via a FloatingActionButton that leads to a form where users can input note details.
Edit Notes:

Existing notes can be updated. Users can access this feature by selecting a note from the list, which opens an edit form pre-filled with the note's current content.
Delete Notes:

Users have the option to remove notes from the list, providing a way to manage and organize their notes effectively.
Screenshots
Login Screen:

Shows the Google Sign-In button for user authentication.
Notes List:

Displays a list of notes in a RecyclerView, showing each note’s title and content.
Add/Edit Note:

Provides input fields for entering or updating a note's title and content, along with a save button to submit changes.
Project Structure
MainActivity.java

Description: Serves as the central entry point of the app, handling fragment transitions based on user authentication status.
Key Methods:
onCreate(): Initializes the activity and checks whether the user is logged in to load the appropriate fragment.
navigateToLoginFragment(): Switches to the LoginFragment if the user is not authenticated.
navigateToNotesFragment(): Switches to the NotesFragment to display the list of notes.
navigateToAddEditNoteFragment(): Opens the AddEditNoteFragment for adding or editing notes.
LoginFragment.java

Description: Manages user login using Google Sign-In.
Key Components:
Google Sign-In Button: Facilitates Google account authentication.
onActivityResult(): Processes the result of the Google Sign-In attempt to handle success or failure.
NotesFragment.java

Description: Displays the list of notes for the signed-in user.
Key Components:
RecyclerView: Lists all notes using a scrollable format.
FloatingActionButton: Opens the AddEditNoteFragment for creating a new note.
AddEditNoteFragment.java

Description: Provides a user interface for adding or modifying notes.
Key Components:
Input Fields: For entering the note's title and content.
Save Button: Saves the new or updated note.
Note.java

Description: A data model representing a note with attributes such as title and content.
Firebase Integration

google-services.json: A configuration file that enables Firebase services for authentication and other backend functionalities. This file must be placed in the app directory to integrate Firebase with the app.
