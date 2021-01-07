//ARYAN KUMAR 
//19BCE10254

import java.util.*; 

import java.util.Arrays;

class  JavaStream{ 

 
    public static void main(String[] args) 
    { 

        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5); 

        System.out.println("The distinct elements are :"); 

  
        list.stream().distinct().forEach(System.out::println); 

        long Count = list.stream().distinct().count(); 

		// Displaying the count of distinct elements 
		System.out.println("The count of distinct elements is : " + Count);
    } 
}