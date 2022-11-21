package com.datastructure.factorial;

public class Solution {


    private static int fac( int jumlah ){
        if ( jumlah == 0){
            return  1;
        }
            return jumlah + fac( jumlah -1 );


    }

    public static void main(String[] args) {
        int x = fac( 5 );
        System.out.println( x  );
    }

}
