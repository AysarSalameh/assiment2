package com.example.project2;

public class mathmul {

        private String name;
        private int imageID;
        public static final mathmul[] arry = {
                new mathmul("Multiply One", R.drawable.one_mul),
                new mathmul("Multiply Two", R.drawable.two_mul),
                new mathmul("Multiply threre", R.drawable.there_mul),
                new mathmul("Multiply Four", R.drawable.fourmul),
                new mathmul("Multiply Five", R.drawable.fivemul),
                new mathmul("Multiply Six", R.drawable.sixmul),
                new mathmul("Multiply Seven", R.drawable.img_2),
                new mathmul("Multiply Eight", R.drawable.mul8),
                new mathmul("Multiply Nine", R.drawable.img),
                new mathmul("Multiply Ten", R.drawable.mul10),

        };


        private mathmul(String name, int imageID){
            this.name = name;
            this.imageID = imageID;
        }
        public String getName(){return name;}
        public int getImageID(){return imageID;}
    }


