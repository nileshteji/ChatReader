package com.osos.blushed;

import com.osos.blushed.Model.Message;

import java.util.ArrayList;
import java.util.Arrays;

public class Data {
ArrayList<Message> data=new ArrayList<>(Arrays.asList(new Message("Me","Hi"),new Message("They","Hi Bitch")));



public int getSize(){
    return data.size();
}


    public Message getData(int index) {
      return data.get(index);
}



public ArrayList<Message> getList(){
    return data;
}
}
