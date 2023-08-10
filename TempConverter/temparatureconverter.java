
public class temparatureconverter {
	public static void main(String[] args) {
		
		TemparatureConverter t1=new TemparatureConverter();
		double converted=t1.celciusToFahrenheit(68.0);
		System.out.println(converted);
		
	
	

}
class temparatureConverterApp{
	public double celciusToFahrenheit(double fahrenheit) {
		
			double celcius=(fahrenheit-32) * 9/5;
			return celcius;
		
			
		}
	
	
	
}
