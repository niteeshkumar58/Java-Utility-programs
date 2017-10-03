package expeirments;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculateNthPrime {
	public void calcPrime(int inp) {
	    ArrayList<Integer> arr = new ArrayList<Integer>(); // stores prime numbers 
	                                                      // calculated so far
	    // add prime numbers 2 and 3 to prime array 'arr'
	    arr.add(2); 
	    arr.add(3);

	    // check if number is prime starting from 4
	    int counter = 4;
	     // check if arr's size has reached inp which is 'n', if so terminate while loop
	    while(arr.size() <= inp) {
	        // dont check for prime if number is divisible by 2
	        if(counter % 2 != 0) {
	            // check if current number 'counter' is perfectly divisible from 
	           // counter/2 to 3
	            int temp = counter/2;
	            while(temp >=3) {
	                if(counter % temp == 0)
	                    break;
	                temp --;
	            }
	            if(temp <= 3) {
	                arr.add(counter);
	            }
	        }
	        counter++;
	    }
	    System.out.println(arr.get(inp));
	    }
	
	public static void main(String[] args){
		CalculateNthPrime cnp = new CalculateNthPrime();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n = sc.nextInt();
		System.out.print(n+"th Prime is: ");
		long t1 = System.nanoTime();
		cnp.calcPrime(n);
		long t2 = System.nanoTime();
		System.out.println("Time Taken: "+(t2-t1)/1000000+" ms");
		sc.close();
	}
}
