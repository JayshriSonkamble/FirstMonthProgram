package com.bridgelabz.Algorihm;

public class WindChill
{
		public static void main(String[] args)
		{
		// TODO Auto-generated method stub
		
		         
				double temperature = Double.parseDouble(args[0]);
				double windspeed = Double.parseDouble(args[1]);
				 
				for(int i=0; i<args.length; i++)
				{
					System.out.println(args[i]);
				}
			
				if(temperature<=50 && windspeed>3 || windspeed<120)
				{
					
				
					double windchill =  35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75)* Math.pow(windspeed, 0.16);
			
					System.out.println("Windchill of given temperature and windspeed:"+windchill);
				}
	

	}

}
