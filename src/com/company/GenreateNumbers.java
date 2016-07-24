package com.company;

import java.util.Random;

/**
 * Created by MT-2016 on 7/17/2016.
 */
public class GenreateNumbers {

        private int GenreateNumber(){
        int genreateNum;
        do {
        genreateNum = (int) (10 * Math.random());
        }
        while(genreateNum < 1 && genreateNum < 9 );
        return  genreateNum;
    }
    int num = GenreateNumber();
    public boolean check(int getval){
        if(num==getval){
            num = GenreateNumber();
        return true;
        }
        else{
        return false;
        }
   }
   }
