package com.game;

import java.util.Random;

public class GameItself {
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
               if (number <= generated.length()+1 && i== number-1 && Character.getNumericValue(generated.charAt(i)) !=0 ){
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
                if (position<= generated.length()&& Character.getNumericValue(generated.charAt(generated.length()-position))==0&&i==generated.length()-position) {
                   result=true;
                   break;
                }
                else {
                    result=false;
                }
           }
           return result;
    }

   public static  String decrease(String generated,int position){
    String newone=generated;
    char [] ch=newone.toCharArray();
    int number=(Character.getNumericValue(newone.charAt(position-1))-1)+'0';
    char replaceble=(char)number;
    ch[position-1]=replaceble;

    return newone=new String(ch);
   }

   public static String removeing(String generated, int position){
        String newone=generated.substring(0,generated.length()-position);

        return newone;
   }

   public static void gameOver(int id){
        if(id==1){
            System.out.println("játék vége!!! a játékos vesztett");
        }
        else {
            System.out.println("Játék vége !!! az Ai vesztett");
        }
   }

   static public int aiMoveChoice(String generated){
        int choice=0;
       for (int i = 0; i < generated.length(); i++) {
           if (generated.charAt(i) == '0') {
               choice=0;
               break;
           }
           else if(generated.charAt(i)=='1'){
               choice=1;
               break;
           }
       }
       return choice;
}

static  public int aiPositionChoice(String generated,int aiChoice){
        int choice=0;
    if (aiChoice == 0) {
        for (int i = generated.length()-1; i >=0 ; i--) {
            if (generated.charAt(i) == '0') {
                choice=generated.length()-i;
                break;
            }
        }
    }
    else if(aiChoice==1){
        for (int i = 0; i <generated.length() ; i++) {
            if (generated.charAt(i)=='1'||generated.charAt(i)=='2') {
                choice=i+1;
                break;
            }
        }
    }
    return choice;
}


}





