/* Factorial code using package process */
package com.cal;

public class Java_Package_05 {
    public int Fact(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*Fact(n-1);
    }
}
