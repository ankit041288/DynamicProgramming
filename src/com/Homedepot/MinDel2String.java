package com.Homedepot;

import java.util.Scanner;

public class MinDel2String {

    //Minimum number of deletions and insertions to transform one string into another

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2=scan.nextLine();
        int l1 = str1.length();
        int l2 = str2.length();

        // Create a matrix for recording difference in substring

        int[][] L = new int[l1+1][l2+1];
        L[0][0]=0;
        for(int i =1; i<=l1;i++ ){
            for(int j=1; j<=l2;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    L[i][j]=L[i-1][j-1]+1;

                }
                else L[i][j]= Math.max(L[i-1][j],L[i][j-1]);
            }
        }

        System.out.println("Minimum number of deletion and addition to change "+ str1+" to "+str2 +" is :"+(l1-L[l1][l2])+" , "+(l2-L[l1][l2]));

    }
}
