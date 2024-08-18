package com.example.notes_app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.notes_app.MainActivity;
import com.example.notes_app.R;
import com.example.notes_app.notes;
import com.example.notes_app.notes_adapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class notes_fragment extends Fragment {

    private RecyclerView notesRecyclerView;
    private notes_adapter notesAdapter;
    private List<notes> notesList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_for_notes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        notesRecyclerView = view.findViewById(R.id.notes_recyclerview);
        FloatingActionButton addNoteFab = view.findViewById(R.id.add_note_button);

        notesList = new ArrayList<>(); // Fetch notes from SQLite database

        notesAdapter = new notes_adapter(notesList);
        notesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        notesRecyclerView.setAdapter(notesAdapter);

        addNoteFab.setOnClickListener(v -> {
            // Navigate to Add/Edit Note Fragment
            ((MainActivity) requireActivity()).navigateToAddEditNoteFragment(null);
        });
    }

    public void updateNotesList(List<notes> newNotesList) {
        notesList.clear();
        notesList.addAll(newNotesList);
        notesAdapter.notifyDataSetChanged();
    }
}
