package com.example.notes;

import android.view.View;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by SUDA on 08-09-2017.
 */

public class NoteViewHolder extends RecyclerView.ViewHolder {

    View mView;

    TextView textTitle, textTime;
    CardView noteCard;

    public NoteViewHolder(View itemView) {
        super(itemView);

        mView = itemView;

        textTitle = mView.findViewById(R.id.note_title);
        noteCard = mView.findViewById(R.id.note_card);

    }

    public void setNoteTitle(String title) {
        textTitle.setText(title);
    }


}
