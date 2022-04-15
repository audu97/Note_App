package com.example.note_app.feature_note.domain.use_case

import com.example.note_app.feature_note.presentation.notes.AddNote

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)