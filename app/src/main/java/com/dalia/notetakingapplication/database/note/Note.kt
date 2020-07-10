package com.dalia.notetakingapplication.database.note

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dalia.notetakingapplication.database.Constants

@Entity(tableName = Constants.NOTE_TABLE_NAME)
data class Note(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constants.NOTE_ID_COLUMN)
    var id: Long = 0L,

    @ColumnInfo(name = Constants.NOTE_TITLE_COLUMN)
    var title: String,

    @ColumnInfo(name = Constants.NOTE_CONTENT_COLUMN)
    var content: String) {

    override fun equals(other: Any?): Boolean {
        if(this === other) return true

        if(other !is Note) return false

        val note: Note = other

        if(id != note.id) return false

        return title == note.title
    }

    override fun hashCode(): Int {
        var result: Long = id
        result = 31 * result + if (title != null) title.hashCode() else 0
        return result.toInt()
    }

    override fun toString(): String {
        return "Note{" +
                "note_id=" + id +
                ", content='" + content + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}