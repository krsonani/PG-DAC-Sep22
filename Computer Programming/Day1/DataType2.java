class DataType2{

public static void main(String args[]){
	
	double i;
	float dl = 100.9845656f;
	i= dl;//upcasting
	System.out.println(dl);
	System.out.println(i);
	
	float i1;
	double dl1 = 100.9845656;
	i1= (float)dl1;//downcasting
	System.out.println(dl1);
	System.out.println(i1);
	
	int i2;
	double dl2 = 100.9845656;
	i2= (int)dl2;//downcasting
	System.out.println(dl2);
	System.out.println(i2);
	
	byte i3;// size 1
	double dl3 = 1565.9845656;// size=8
	i3= (byte)dl3;//downcasting
	System.out.println(dl3);
	System.out.println(i3);
	
	byte b=12;// size 1
	int  i4 = b;//upcasting
	
	System.out.println(b);
	System.out.println(i4);
	
	
	//byte b=12;// size 1
	int  i5 = 126;//downcasting
	
	byte b1 = (byte)i5;
	System.out.println(b1);
	
	float b=12.0f;// size 1
	int  i6;//downcasting
	
	i6=b;
	System.out.println(b);
	System.out.println(i6);
	
}
}