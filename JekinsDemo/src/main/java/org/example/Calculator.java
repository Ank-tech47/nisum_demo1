package org.example;
public  class Calculator {


    public int sum(int...x){
        int s=0;
        for(int i:x)
            s=s+i;
        return s;
    }

    public int square(int x)
    {
        return x*x;

    }

}