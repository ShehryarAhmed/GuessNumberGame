package com.company;

import java.util.Scanner;

/**
 * Created by android on 7/20/2016.
 */
public class Game {
        Score score = new Score();
        PurchaseCoin purchaseCoin  = new PurchaseCoin();
        GenreateNumbers genreateNumbers =  new GenreateNumbers();
        Scanner getvals = new Scanner(System.in);

    public void StartGame(int num){
        String get = null;
        do{
        System.out.println("GUE$$ NUMBER 1 To 9");
        int getval = getvals.nextInt();
        if(genreateNumbers.check(getval)){
        System.out.println("You Win \nPress Y To More");
        get = getvals.next();
        score.scores += 10;
        }
        else{
        System.out.println("YOU LOST \nPress Y To Again");
        get = getvals.next();
        }
        --num;
        if(num==0 && 0==get.compareToIgnoreCase("y")){
        System.out.println("You have Zero Coin Please Purchase Coin To More Play \nPress Y To Get Coin");
        get=getvals.next();
        if(0==get.compareToIgnoreCase("y")){
        num = purchaseCoin.purchaseCoin();
        }}
        }
        while (0==get.compareToIgnoreCase("y")&& num > 0);
        score.ShowScore();
    }
}
