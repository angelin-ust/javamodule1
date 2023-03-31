//Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
//Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.
//
//(*>#): positive integer
//(#>*): negative integer
//(#=*): 0
//Example 1:
//Input 1:
//
//###***   -> Value of S
//Output :
//
//0   → number of * and # are equal

package problemtry;

import java.util.Scanner;

public class Stringhashandstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("String must contain # and *");
String s=sc.nextLine();
int l=s.length();
int hc=0;
int sco=0;
char chararr[]=s.toCharArray();
for(char v: chararr) {
	if(v=='#') {
		hc++;
	}
	else
	{
		sco++;
	}
}
if(hc==sco) {
	System.out.println(0);
}
else if(hc>sco) {
	System.out.println(-1);
	
}
else
	System.out.println(1);
	}

}
