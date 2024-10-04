package com.example.note_collector.customStatusCodes;

import com.example.note_collector.dto.NoteStatus;
import com.example.note_collector.dto.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedUserAndNoteErrorStatus implements UserStatus, NoteStatus {
    private int statusCode;
    private String statusMessage;
}
