
public class DateTest {
	public static void main(String[] args) {
		Date date = new Date(32,12,2002);
		Date date2 = new Date(31,12,2002);
		Date date3 = new Date(31,06,2004);
		Date date4 = new Date(18,12,2002);
		
		System.out.println(date.displayDate());
		System.out.println(date2.displayDate());
		System.out.println(date3.displayDate());
		System.out.println(date4.displayDate());
		System.out.println(date.nextDay());
		System.out.println(date2.nextDay());
		System.out.println(date3.nextDay());
		System.out.println(date4.nextDay());
	}

}
