package com.moarti.StreamOhae;

import java.util.HashMap;

public class IntToRoman {

    public static void
    numToConvert(HashMap<Integer, String> map){
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(6,"VI");
        map.put(7,"VII");
        map.put(8,"VIII");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(20,"XX");
        map.put(30,"XXX");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(60,"LX");
        map.put(70,"LXX");
        map.put(80,"LXXX");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(200,"CC");
        map.put(300,"CCC");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(600,"DC");
        map.put(700,"DCC");
        map.put(800,"DCCC");
        map.put(900,"CM");
        map.put(1000,"M");
        map.put(2000,"MM");
        map.put(3000,"MMM");
    }

    public static String IntToRomanFunc(int num){

        HashMap<Integer,String> intStrMap = new HashMap<>();
        numToConvert(intStrMap);

        StringBuilder res = new StringBuilder();
        int temp = 1000; //самый большой разряд

        do{
            int n = num/temp; //ищем 1 разряд

            if(intStrMap.get(n * temp) != null){ //ищу знач в мэп

                res.append(intStrMap.get(n * temp));
            }
            num %= temp;
            temp /= 10;

        }while(num > 0);

        return res.toString();
    }

}
