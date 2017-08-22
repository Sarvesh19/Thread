import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {
	private  interface intf{
		interface i {
			interface io {
				
			}
			
		}
		
	}
	private static void main(String[] args) throws ParseException {
		for(int i=0;i<5;i=+2){
			System.out.println(i);
		}
		//System.out.println(i);
		//convertStringToDate(,,de);
		//2017-03-15T23:00:00.000Zs.substring(6,7)
		// 2017-03-15T23:00:00.000Z 01:00
//		String s = "2017-03-15T23:00:00.000Z";
//		String s1 =s.substring(6,7)	 +"/"+s.substring(8, 10)+"/"+s.substring(0,4);
//		System.out.println(s1);
//		s.substring(0, endIndex)
//		System.out.println();
		Long value = 1489532400000L;
		SimpleDateFormat originalFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = originalFormat.parse(value.toString());
		System.out.println(date);
//		System.out.println(" 8. " + DateFormat.getDateTimeInstance(
//	            DateFormat.SHORT, DateFormat.SHORT).format("017-03-21T23:00:00.000Z"));
//		Date dt = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).parse(String.valueOf(1489532400000L));
//		System.out.println(dt);
		 final int i = 10;
		switch(i){
		
		}
		testTryCatch(10);
	}
	private static String testTryCatch(int i){
		try {
			System.out.println(25);
			return oop();

		} finally {
			System.out.println("hello");
		}
		
	}
	static String oop(){
		return "hello wooo";
	}
	private static Date convertStringToDate(String date, String dateFormat, Locale locale) throws ParseException {
		SimpleDateFormat simpleDateFormat = null;
		if (locale.getLanguage().equalsIgnoreCase("de")) {
			simpleDateFormat = new SimpleDateFormat("MM.dd.yyyy HH:mm", locale);
			return simpleDateFormat.parse(date);
		}
		return new SimpleDateFormat(dateFormat).parse(date);

	}
}
