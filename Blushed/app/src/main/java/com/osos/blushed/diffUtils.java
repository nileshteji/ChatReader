package com.osos.blushed;

import androidx.recyclerview.widget.DiffUtil;

import com.osos.blushed.Model.Message;

import java.util.ArrayList;

public class diffUtils extends DiffUtil.Callback {
    ArrayList<Message> oldList;
    ArrayList<Message> newList;

    diffUtils(ArrayList<Message> oldList ,ArrayList<Message> newList)
    {
        this.oldList=oldList;
        this.newList=newList;
    }


    @Override
    public int getOldListSize() {
        return oldList.size();
    }

    @Override
    public int getNewListSize() {
        return newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
}
