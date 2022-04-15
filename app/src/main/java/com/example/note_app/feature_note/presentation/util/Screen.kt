package com.example.note_app.feature_note.presentation.util

sealed class Screen(val route: String){
    object NoteScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("Add_Edit_Note_Screen")
}
