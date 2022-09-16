class SwitchCase2{

public static void main(String args[]){
	
	 
	String day= 3;
	String DayName;
	switch(day){
		case 99:
			System.out.println("Today is Monday.");
			//break;
		case 99:
			System.out.println("Today is Tuesday.");
			//break;
		case 'W':
			System.out.println("Today is Wednesday.");
			//break;
		case 't':
			DayName="Today is Thurday.";
			break;
		case 5:
			DayName="Today is Friday.";
			//break;
		case 6:
			DayName="Today is Saturday.";
			//break;
		case 7:
			DayName="Today is Sunday.";
			//break;
		default:
			DayName="Invalid Day";
	
			
	}
	System.out.println("Day is "+DayName);

	
}
}


