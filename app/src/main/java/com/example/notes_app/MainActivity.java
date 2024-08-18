package com.example.notes_app;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getSharedPreferences("NotesApp", 0);
        boolean loggedIn = preferences.getBoolean("logged_in", false);

        if (loggedIn) {
            navigateToNotesFragment();
        } else {
            navigateToLoginFragment();
        }
    }

    public void navigateToLoginFragment() {
        replaceFragment(new login_fragment());
    }

    public void navigateToNotesFragment() {
        replaceFragment(new notes_fragment());
    }

    public void navigateToAddEditNoteFragment(notes note) {
        AddEditNoteFragment fragment = new AddEditNoteFragment();
        fragment.setNote(note);
        replaceFragment(fragment);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}