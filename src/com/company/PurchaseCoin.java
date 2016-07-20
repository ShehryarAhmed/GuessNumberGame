package com.company;

/**
 * Created by MT-2016 on 7/17/2016.
 */
public class PurchaseCoin{
    private void delay(){
    for(int i = 0 ; i <100000; i++){
    for(int j = 0 ;  j < 10000; j++){
    for(int k = 0 ;  k < 10000; k++){;}}}
    }
    public int purchaseCoin(){
    int coin;
    do{
    coin = (int) (5 * Math.random());
    }
    while(coin < 1 && coin < 5 );
    System.out.println("Please Wait Coin Will Be Purchase.. ");
    delay();
    System.out.println("You have "+ coin+" Coins");
    return coin;
    }
}
