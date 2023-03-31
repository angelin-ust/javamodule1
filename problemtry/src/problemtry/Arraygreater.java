package problemtry;

import java.util.Scanner;

public class Arraygreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the len");
		int l=sc.nextInt();
		int a[] = new int[l];
		for(int i=0;i<l;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<l;i++) {
			System.out.println(a[i]);
		}
		//int[] max = new int[2];
		int c=0;
      int  max= 0;
        for(int j=0;j<l;j++) {
        	if(a[j]>max) {
        		max=a[j];
        		c++;
        		//System.out.println(max);
        	}
        	else
        		continue;
        }
        System.out.println(c);
	}

}
