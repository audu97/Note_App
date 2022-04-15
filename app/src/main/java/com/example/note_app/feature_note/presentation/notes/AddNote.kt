package com.example.note_app.feature_note.presentation.notes

import com.example.note_app.feature_note.domain.model.InvalidNoteException
import com.example.note_app.feature_note.domain.model.Note
import com.example.note_app.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("the title of the note can't be empty. ")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("the content of the note can't be empty. ")
        }
        repository.insertNote(note)
    }

}