//Write a program to sum all the values of a given Array in Java.
//What is the output?
//          double[ ] exampleArray = {1,5,6,5,4,1};
//
//          double maximum = examplesArray[0];
//
//          int index = 0;
//
//          for (int i = 1; i<exampleArray.length>; i++){
//
//               if (exampleArray[ i ] > maximum) {
//
//                    maximum = exampleArray[ i ];
//
//                    index = i;
//
//               }
//
//          }
//
//          System.out.println(index);
//
//Write a public static method called "toPower" that takes in 
//as parameters two integers called size and power.
//The method should return an array of size "size"
//with each array index raised to the value of "power."
//So, for example, if we passed in "size = 4" and "power = 2" 
//to the "toPower," the method should return the following result: [0,1,4,9].
import java.io.Console;
import java.util.*;
import java.util.List;


public class Arrays {

public static int[] toPower (int size, int power){
	int [] array= new int[size];
	for(int i=0;i<size;i++)
		array[i]=(int)(Math.pow(i,power));
	return array;
};
public static int sumAll(int[] values) {
	 int sum = 0;
	for(int i=0; i < values.length; i++) {
		 sum+=values[i];		
	}
	return sum;
}
	public static void main(String[] args) {
	
		double[ ] exampleArray = {1,5,6,5,4,1};

	    double maximum = exampleArray[0];

	    int index = 0;

	    for (int i = 1; i<exampleArray.length; i++){

	         if (exampleArray[ i ] > maximum) {

	              maximum = exampleArray[ i ];

	              index = i;
	              int[] testArray= {1,5,4}; 
	      		int result= sumAll(testArray);
	      		System.out.println(result);
	      		
	      		int[] myVariable=toPower(4,2);
	      		for(int j=0;j< myVariable.length;j++) {
	      			System.out.println(myVariable[j]);
	      		}

	         }

	    }

	    System.out.println(index);
	}

	}
		
	
	