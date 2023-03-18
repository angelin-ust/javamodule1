package javaenum;

public enum DayofWeek {
Monday("Monday"),
Tuesday("Tuesday"),
Wednesday("Wednesday"),
Thursday("Thrusday"),
Friday("Friday"),
Saturday("Saturday"),
Sunday("Sunday");

	
	
	
	private final String name;
DayofWeek(String name) {
	// TODO Auto-generated constructor stub
	this.name=name;
}
	public String getName() {
		return name;
	}
}
