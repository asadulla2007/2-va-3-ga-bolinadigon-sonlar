package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 6, b=16;
        int count = 0;

        for(int i=a; i<b; i++){
            if( i % 2 == 0 && i % 3 == 0){
                count ++;
            }
        }

        System.out.println(count);

    }



















    }
}
