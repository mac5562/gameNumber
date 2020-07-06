package com.game;

import java.util.Random;

public class gameItself {
    public static String numberGenerator(){
        String generated="";
        int number;
        Random rndLength=new Random();
        Random rndNumber=new Random();
        int length=rndLength.nextInt((20-10)+1)+10;

        for (int i=0; i<length;i++)
        {
            number=rndNumber.nextInt(10);
            if (number*2%6==0)
            {
                int zero=0;
                generated=generated+String.valueOf(zero);
            }
            else
            {
                generated=generated+String.valueOf(number);
            }
        }
            return generated;
        }

       public static  boolean checkerOne(String generated, int number ) {
        boolean result=false;

           for (int i = 0; i < generated.length(); i++) {
               if (number <= generated.length()+1 && i== number-1 && Character.getNumericValue(generated.indexOf(i)) !=0 ){
                    result=true;
                    break;
               }
               else {
                   result=false;
               }
           }
           return result;
       }

       public static boolean chekerTwo(String generated,int position){
        boolean result=false;
           for (int i = generated.length()-1; i >=generated.length()-position ; i--) {
                if (position<= generated.length()&& Character.getNumericValue(generated.indexOf(generated.length()-position))==0&&i==generated.length()-position) {
                   result=true;
                   break;
                }
                else {
                    result=false;
                }
           }
           return result;
    }








}





