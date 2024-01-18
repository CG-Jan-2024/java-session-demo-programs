
public class StringDemo {

	public static void main(String[] args) {
		String str = "abc"; // recomended
		String str1 = new String("abc");
		
		// String is immutable
		// StringBuffer, StringBuilder are mutable
		// StringBuffer is thread safe
		// StringBuilder is not thread safe
		
		String str2 = "";
		for(int i=97;i<=122;i++) {
			str2 = str2 + (char)i;
		}
		System.out.println(str2);
		
		StringBuffer sb1 = new StringBuffer();
		for(int i=97;i<=122;i++) {
			sb1.append((char)i);
		}
		System.out.println(sb1);
		
		
		String str4 = "welcome";
		char ch = str4.charAt(3);
		System.out.println(ch);
		
		
		String str5 = "welcome";
		String str6 = "well";
		System.out.println(str5.compareTo(str6));
		
		System.out.println(str5 + str6);
		System.out.println(str5.concat(str6));
		
		String str7 = "welcome";
		String str8 = "come";
		boolean result = str7.endsWith(str8);
		System.out.println(result);;
		
		
		String str9 = "hello";
		String str10 = "hello";
		System.out.println(str9.equals(str10));
		
		String str11 = "12hghjg";
		int sum = 0;
		try {
			int str11Number = Integer.parseInt(str11);
			for(int i=0;i<str11.length();i++) {
				sum += Integer.parseInt(str11.charAt(i)+"");
			}
		} catch (NumberFormatException nfe) {
			sum = 0;
		}
		System.out.println(sum);
		
		String str12 = "This is a sentence";
		String[] strArray = str12.split(" ");
		System.out.println(strArray.length);
		
		String str13 = "hello";
		StringBuffer sb = new StringBuffer(str13);
		sb = sb.reverse();
		String str14 = new String(sb);
		System.out.println(str14);
		String str15 = "";
		for(int i=str13.length()-1;i>=0; i--) {
			str15 += str13.charAt(i);
		}
		System.out.println(str15);
	}

}
