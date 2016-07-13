package Spoj;

import java.util.ArrayList;
import java.util.Scanner;

public class primenNumberGenerator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		long n = 0 ,m = 0;
		int k = 0;
		ArrayList<Long> arr = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		for(int p = 1;p<230;p++){
			int q = 2;
			while(q<=p/2){
				if(p%q==0){
					break;
				}
				else{
					q++;
				}
			}
			if(q>p/2){
				arr2.add(p);
			}
		}
		while(k<testCases){
			n = s.nextLong();
			arr.add(n);
			m = s.nextLong();
			arr.add(m);
			k++;
		}
		int l = 0;

		while(l<arr.size()){
			for(long i=arr.get(l);i<=arr.get(l+1);i++){
				int p =0;
				if(i == 1){
					continue;
				}

				else{
					while(p<arr2.size()&&arr2.get(p)<i){
						if(i%arr.get(p)==0){
							break;
						}
						else{
							p++;
							if(arr2.get(p)>i/2)
							System.out.println(i);
						}
						
					}
						System.out.println(i);
//					if(p>arr2.size()){
//						long j = 2;
//						while(j<i-1){
//							if(i%j==0){
//								break;
//							}
//							else{
//								j++;
//							}
//						}
//						if(j>=i-1)
//							System.out.println(i);
//					}

				}
				//				else if(i == 2||i ==3||i==5||i==7){
				//					System.out.println(i);
				//				}
				//else{
				//					if(i%2 == 0){
				//						continue;
				//					}
				//					else if(i%3 == 0){
				//						continue;
				//					}
				//					else if(i%5 == 0){
				//						continue;
				//					}
				//					else if(i%7 == 0){
				//						continue;
				//					}
				//					else{
				//
				//						long j = 2;
				//						while(j<=i/2){
				//							if(i%j==0){
				//								break;
				//							}
				//							else{
				//								j++;
				//							}
				//						}
				//						if(j>i/2)
				//							System.out.println(i);
				//					
				//				}
			}

			System.out.println();
			l = l+2;

		}
	}


}


