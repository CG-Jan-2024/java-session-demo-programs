
public class SwitchCaseDemo {
	
	enum Days {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY };
	
//	static String formatterPatternSwitch(Object o) {
//	    return switch (o) {
//	        case Integer i -> String.format("int %d", i);
//	        case Long l    -> String.format("long %d", l);
//	        case Double d  -> String.format("double %f", d);
//	        case String s  -> String.format("String %s", s);
//	        default        -> o.toString();
//	    };
//	}
	
	public static void main(String[] args) {
		// local type inference
		var mark = 50;
		
		// records
		Employee emp1 = new Employee(101, "test", 4000);
		Employee emp2 = new Employee(102, "trial", 7000);
		Employee emp3 = new Employee(101, "test", 4000);
		System.out.println(emp1.equals(emp3));
		System.out.println(emp1.compute());
		
		// switch expressions
		Days myDay = Days.THURSDAY;
		String result = switch(myDay) {
			case SUNDAY, SATURDAY -> "Weekend";
			case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekday";
			default -> "None";
		};
		System.out.println(myDay + " : " + result);
		
		// text blocks
		String textBlock = """
				{
					"studId: 202,
					"studName: "test" 
				}
				""";
		
		String str = "Hello";
		Integer inte = 5;
		
		String val = "";
//		switch(str) {
//			case Integer i -> val = "It is an integer" ;
//			case String st -> val = "It is a String";
//			default -> val = "Neither";
//		};
	}

}
