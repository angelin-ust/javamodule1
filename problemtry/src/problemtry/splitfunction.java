package problemtry;

import java.util.Scanner;

public class splitfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("give number");
int no=sc.nextInt();
int sum=0;
int d;
System.out.println("No of person");
int per=sc.nextInt();	


for(int i=1;i<=per;i++)	{
	System.out.println("Person"+ i);
	int p=sc.nextInt();
	sum=sum+p;
}

if(sum==no) {
	System.out.println("successful");
}
else if(sum>no) {
	d=sum-no;
	System.out.println("amt is excess"+ d);
}

else if(sum<no) {
	d=no-sum;
	System.out.println("amt is left"+ d);
	
}



	}

}
