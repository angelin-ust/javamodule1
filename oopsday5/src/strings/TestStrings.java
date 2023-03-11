package strings;

public class TestStrings {

	public static void main(String[] args) {
byte bytes[]= {65,66,67,68,69};
		String str=new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		str="welcome to ust ";
		bytes=str.getBytes();
		
		for(byte b:bytes) {
			System.out.println(b);
		}
		
		char chars[]= {'u','s','t',' ','g'};
		 str=new String(chars);
		 System.out.println(str);
		 
		 str.getChars(0, chars.length-1, chars, 0);
		 for(char c:chars) {
			 System.out.print(c);
		 }
		 int c=0;
		 
		 str=new String("She Sells sea shells in sea shore");
//		 char let=str.getChars(0, str.length()-1, chars, c);
		 for(int i=0;i<str.length()-1;i++) {
			 if(str.charAt(i)=='s' || str.charAt(i)=='S' ) {
				 c++;
			 }
			 
		 }
		 System.out.println("");
		 System.out.println(c);
		
		String str1=new String("She Sells sea . shells in sea Shore");
		String words[]=str1.split("");//split 
		for(String word:words) {
			System.out.println(word);
		}
		System.out.println(words.length);
		
		
		
		String string = new String("cartoon");
		System.out.println(string.startsWith("car"));
		System.out.println(string.endsWith("toon"));
		
		
		int apps=string.indexOf('a');
		System.out.println(apps);
		int appsi=string.indexOf('t');
		String string2=string.substring(apps,appsi+1);
		String string3=string.substring(appsi);
		System.out.println(string2);
		System.out.println(string3);
		
		
	string=new String("madamdam");
	
	int dpos=string.lastIndexOf('d');
	System.out.println(dpos);
	string2=string.substring(dpos,string.length());
	System.out.println(string2);
	
	String email=new String("angelinammu.alex@ust.com");
	int dpos1=email.lastIndexOf('.');
	System.out.println(dpos1);
	string2=email.substring(dpos1+1,email.length());
	System.out.println(string2);
	
	
	String str9=new String("weLcome");
	String str7=new String("welcome");
	
	boolean result=str9.equals(str7);
	System.out.println(result);
	
	int val=str7.compareTo(str9);
	System.out.println(val);
	
	System.out.println(str9.toLowerCase());
	System.out.println(str9.toUpperCase());
	System.out.println(str9);
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count9=0;
		String string12=new String("16-11-477/6/A/3 Hyderabad 500036");
		for(int i=0;i<=string12.length()-1;i++) {
			char c1=string12.charAt(i);
			if(Character.isDigit(c1)) {
				count1++;
			}
//		 else if (Character.isLetter(c1)||Character.isLowerCase(c1)||Character.isUpperCase(c1) ) {
//				count2++;
//			}
		 else if(Character.isLowerCase(c1)&& Character.isAlphabetic(c1)) {
				count3++;
				count9++;
			}
			
		 else if(Character.isUpperCase(c1) && Character.isAlphabetic(c1)) {
				count4++;
				count9++;
		}
		 else if(Character.isWhitespace(c1)) {
				count5++;
			}
		 else
		 {count6++;
		}
		
		
		}	
		System.out.println("Digit " + count1);
		System.out.println("Alphabetic " + count9);
         System.out.println("lowercase "+ count3);
	System.out.println("Uppercase"+count4);
     System.out.println("WhiteSpace "+count5);
	System.out.println("Symbols "+count6);
		
	}

}
