package com.datastructure.tlv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    private static List<HashMap<String, String>> res = new ArrayList<>();
    private static List<HashMap<String, String>> parsing(String value, int startIdx ){

        String tag = value.substring( startIdx, startIdx+2 );
        String length = value.substring( startIdx+2,startIdx+4 );
        String val = "";
        for (int i = startIdx; i < value.length(); i++) {
            HashMap<String, String> tmp = new HashMap<>();
            int valStsIdx = startIdx + 4;
            int valEndIdx = valStsIdx + Integer.parseInt(length);
            val =  value.substring( valStsIdx, valEndIdx );
            tmp.put( tag, val );
            res.add( tmp );
            //System.out.println( "valEndIdx:" + valEndIdx + " value.length:" + value.length() );
            if ( valEndIdx == value.length()  ){
                return res;
            }else{
                return parsing( value, valEndIdx );
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<HashMap<String, String>> data = parsing("TT0245FA0588531GB0288", 0 );
        for (int i = 0; i < data.size(); i++) {
            System.out.println( data.get(i).entrySet() );
        }
    }

}
