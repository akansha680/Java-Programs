class Runner{
	String runner[][]=new String[15][1];
	runner[0][1]={"Elena",341};
    runner[1][1]={"Thomas",273};
    runner[2][1]={"Hamilton",278};
    runner[3][1]={"Suzei",329};	
	runner[4][1]={"Phil",445};
	runner[5][1]={"Matt",402};
	runner[6][1]={"Alex",388};
	runner[7][1]={"Emma",275};
	runner[8][1]={"John",243};
	runner[9][1]={"James",334};
	runner[10][1]={"Jane",412};
	runner[11][1]={"Emily",393};
	runner[12][1]={"Daniel",299};
	runner[13][1]={"Neda",343};
	runner[14][1]={"Aaron",317};
	runner[15][1]={"Kate",265};
	max=runner[0][1];
	for(int i=0;i<=15;i++)
	{
		for(int j=0;j<1;j++)
		{
			if(runner[][j]<runner[][j++])
				max[0][1]=runner[][j++];
			System.out.println("Fastest Runner is"+ max[0][1]);
		}
	}

}