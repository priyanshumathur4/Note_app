# Andriod_Note_App

# Notes Android App

## Overview

This is a simple Notes Android app built using Java and Firebase. The app allows users to sign in using Google, view, add, edit, and delete notes. It uses fragments to navigate between different screens within a single activity.

## Features

- **Google Sign-In**: Allows users to sign in using their Google account.
- **View Notes**: Displays a list of notes for the signed-in user.
- **Add Notes**: Allows users to add new notes.
- **Edit Notes**: Allows users to update existing notes.
- **Delete Notes**: Allows users to remove notes.

## Screenshots

- **Login Screen**:
  ![Login Screen](path/to/login_screen_screenshot.png)

- **Notes List**:
  ![Notes List](path/to/notes_list_screenshot.png)

- **Add/Edit Note**:
  ![Add/Edit Note](path/to/add_edit_note_screenshot.png)

## Project Structure

### 1. `MainActivity.java`
- **Description**: The main entry point of the app. Manages navigation between different fragments based on user login status.
- **Key Methods**:
  - **`onCreate()`**: Initializes the activity and loads the appropriate fragment based on login status.
  - **`navigateToLoginFragment()`**: Replaces the current fragment with `login_fragment`.
  - **`navigateToNotesFragment()`**: Replaces the current fragment with `notes_fragment`.
  - **`navigateToAddEditNoteFragment()`**: Replaces the current fragment with `AddEditNoteFragment` for adding or editing a note.

### 2. `login_fragment.java`
- **Description**: Handles user login via Google Sign-In.
- **Key Components**:
  - **Google Sign-In Button**: Allows users to sign in with their Google account.
  - **`onActivityResult()`**: Handles the result of the Google Sign-In intent and manages login success or failure.

### 3. `notes_fragment.java`
- **Description**: Displays a list of notes for the logged-in user.
- **Key Components**:
  - **RecyclerView**: Shows the list of notes.
  - **FloatingActionButton**: Opens the `AddEditNoteFragment` to add a new note.

### 4. `AddEditNoteFragment.java`
- **Description**: Provides a form for adding or editing notes.
- **Key Components**:
  - **Input fields**: For note title and content.
  - **Save button**: To save the note (add or update).

### 5. `note.java`
- **Description**: A model class representing a note with properties like title and content.

### 6. Firebase Integration
- **`google-services.json`**: Configuration file for Firebase, enabling Firebase services like authentication and database access. Place this file in the `app` directory.
