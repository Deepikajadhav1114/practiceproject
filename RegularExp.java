package Demo;

import java.util.regex.Pattern;

public class RegularExp
{
	public static void main(String[] args) {
		System.out.println ("shubham@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.[a-z]+","shubham@gmail.com"));
		System.out.println ("pranali@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.[a-z]+","pranali@gmail.com"));
		System.out.println ("test123prepare@co.edu.com : "+Pattern.matches("[a-z]+\\d{3}+[a-z]+[@][a-z]+.[a-z]+.[a-z]+","test123prepare@co.edu.com"));
		System.out.println ("9876543210 : "+Pattern.matches("\\d{10}","9876543210"));
		System.out.println ("Deepika11jadhav14 : "+Pattern.matches("[SWA][a-z]+\\d{3}+[a-z0-9]+","Deepika11jadhav14"));

}
}