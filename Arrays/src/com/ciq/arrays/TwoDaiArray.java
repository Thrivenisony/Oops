package com.ciq.arrays;

public class TwoDaiArray {
public static void main(String[] args) {
	int[][] array2D= new int[3][3];
	array2D[0][0]=10;
	array2D[0][1]=20;
	array2D[0][2]=30;
	array2D[1][0]=40;
	array2D[1][1]=50;
	array2D[1][2]=60;
	array2D[2][0]=70;
	array2D[2][1]=80;
	array2D[2][2]=90;
	for(int i=0;i<array2D.length;i++) {
		for(int j=0;j<array2D[i].length;j++) {
			System.out.print(array2D[i][j]+" ");
		}
	System.out.println();
	}
	
}
}
