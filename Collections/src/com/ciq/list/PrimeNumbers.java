package com.ciq.list;

public class PrimeNumbers {
	public static void main(String[] args) {

		
			int i = 0;
			int j = 0;
			int count = 0;
	 
			int a[] = {3, 12, 21, 11, 71, 96, 19, 41, 83, 10};
	 
			for (i = 0; i < a.length; i++)
			{
				count = 0;
				for (j = 2; j < a[i] / 2; j++)
				{
					if (a[i] % j == 0)
					{
						count = 1;
						break;
					}
				}
				System.out.println(a[i]+" - "+(count== 0 ? "Prime" : "Not Prime"));
			}
			System.out.println();
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	int []a= {1,2,3,4,5,6,7,8,9};
//     int i;
//     int count=0;
//	for(i=0;i<a.length;i++) {
////		count=0;
//		for(int j=1;j<=i;j++) {
//			
//			if(a[i]%j==0) {
//				count++;
//			}
//		}
//	}if(count==2) {
//		System.out.println(a[i]);
//	}
//	else {
//		System.out.println("asdfghj");
//	}
//}
//}
