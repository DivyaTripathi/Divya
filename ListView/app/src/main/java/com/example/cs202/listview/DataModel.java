package com.example.cs202.listview;

/**
 * Created by CS202 on 23-01-2018.
 */

public class DataModel {

        String name;
        int image;

        public  DataModel(String name ,int image){
            this.name= name;
            this.image=image;
        }

        public String getName(){
            return name;
        }

        public int getImage(){
            return image;
        }
    }


