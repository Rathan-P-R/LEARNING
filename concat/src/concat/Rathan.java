package concat;

public class Rathan {
	
	String a="hello";
	String b="world";
	String fullname=joinStrings("Hello","world");
    System.out.println(a+ " " +b);

	}

}

public static String joinStrings(String str1, String str2)
{
	return str1+str2;
}
}

