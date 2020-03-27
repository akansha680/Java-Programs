class TwoDArray
{
	public static void main(String [] args)
	{
		int mark[][]={{35,45,67,53,45},
		                {81,64,54,76,55},
					    {56,65,78,87,90},
					    {55,65,33,43,12},
				    	{43,56,64,76,33},
						{76,54,88,77,66},
						{19,43,56,76,49},
						{55,65,33,43,12},
						{68,45,42,56,76},
						{54,65,78,65,66}};
		String name[]={"John","Abhi","Karry","Avin","Akshay","Negi","Pranjal","Amit","Rakesh","Bhanu"};
		float avg[]=new float[10];
		int sum;
		for(int i=0;i<mark.length;i++)
		{
			sum=0;
			for(int j=0;j<mark[i].length;j++)
			{
				sum+=mark[i][j];
			}
			avg[i]=sum/5;
		}
		int large=0;
		for(int i=0;i<avg.length;i++)
		{
			if(avg[i]>avg[large])
				large=i;
		}
		System.out.println("Student with maximum average:");
		System.out.println("Name:"+name[large] + " average:"+avg[large]);
		System.out.print("Marks:"+mark[large][0]+" "+mark[large][1]+" "+mark[large][2]+" "+mark[large][3]+" "+mark[large][4]);
	}
}