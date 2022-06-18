package com.syntax.class18;

public class reple117 {

       void sumEvenToX(int x){
               int sum=0;
            for (int i=1; i<=x; i++){
                if(i%2==0){
                   sum =sum+i;
                }

            }
            System.out.println(sum);
        }

        public static void main(String[] args){
            reple117 sum =new reple117();
            sum.sumEvenToX(7);
        }
    }

