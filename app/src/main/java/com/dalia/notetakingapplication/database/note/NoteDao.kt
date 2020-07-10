package com.dalia.notetakingapplication.database.note

import androidx.room.*
import com.dalia.notetakingapplication.database.Constants

@Dao
interface NoteDao {

    @Query("SELECT * FROM ${Constants.NOTE_TABLE_NAME} ORDER BY ${Constants.NOTE_ID_COLUMN} DESC")
    fun getAll(): List<Note>

    @Query("SELECT * from ${Constants.NOTE_TABLE_NAME} WHERE ${Constants.NOTE_ID_COLUMN} = :key")
    fun get(key: Long): Note?

    @Insert
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)

}