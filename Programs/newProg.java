package Spoj;

import java.util.ArrayList;
import java.util.Scanner;

public class newProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int num = s.nextInt();
		while(num!=42){
			arr.add(num);
			num= s.nextInt();
		}
		arr.add(num);
		num = s.nextInt();
		arr.add(num);
		for(int i = 0;i<arr.size();i++){
			if(arr.get(i)==42){
				break;
			}
			System.out.println(arr.get(i));
		
		}
	}

}
