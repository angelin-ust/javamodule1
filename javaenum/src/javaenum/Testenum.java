package javaenum;

public class Testenum {

	public static void main(String[] args) {
		DayofWeek d1=  DayofWeek.Monday;
		System.out.println("Today is"+" "+ d1.getName());
		

//		Scanner sc=new Scanner(System.in);
//		enum
//		
		
		switch(d1) {
		case Monday:   System.out.println("Work hard");
			            break;
		case Tuesday:   System.out.println("Work little more");
                        break;
		case Wednesday:   System.out.println("You can do it");
                          break;
        case Thursday:   System.out.println("Come on try harder");
                          break;
        case Friday:      System.out.println("Good work, try little more");
                         break;
        case Saturday:   System.out.println("Great, one more day to go");
                         break;
        case Sunday:   System.out.println("Success, have sweet dream snoooozzzzzzzzzzz");
                        break;
                       
     	         
		}
		
		
	}

}
