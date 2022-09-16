class SwitchCase1{

public static void main(String args[]){
	
	 
	int day=100;
	String DayName;
	switch(day){
		case 1:
			DayName="Today is Monday.";
			break;
		case 2:
			DayName="Today is Tuesday.";
			break;
		case 3:
			DayName="Today is Wednesday.";
			break;
		case 4:
			DayName="Today is Thurday.";
			break;
		case 5:
			DayName="Today is Friday.";
			break;
		case 6:
			DayName="Today is Saturday.";
			break;
		case 7:
			DayName="Today is Sunday.";
			break;
		default:
			DayName="Invalid Day";
			break;
			
	}
	System.out.println("Day is "+DayName);

	
}
}


