package dataStructures;

public class dataStructures 
{

	public static void main(String[] args) 
	{
		   double[ ] exampleArray = {1,5,6,5,4,1};

	          double maximum = exampleArray[0];

	          int index = 0;

	          for (int i = 1; i<exampleArray.length; i++)
	          {

	               if (exampleArray[ i ] > maximum) 
	               {

	                    maximum = exampleArray[ i ];

	                    index = i;

	               }

	          }
	      	int sum = 0;
			for(double i: exampleArray)
			{
				sum += i;
			}
			System.out.println(sum);

	
	}

}
