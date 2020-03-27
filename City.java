import java.util.Arrays;
class city{
	public static void main(String args[])
	{
		String city_name[]=new String[6];
		for(int i=0;i<6;i++)
		{
			city_name[i]=args[i];
		}
		Arrays.sort(city_name);
		for( int i=0;i<6;i++)
		{
			
			System.out.println(city_name[i]);
		}
	}
}