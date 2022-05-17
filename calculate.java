package exponentiation;

public class calculate {

		
		    public static float expBySquaring(float x, float n) {
		        
		    	if (n < 0) {
		    		return expBySquaring(1/x, -n);
		    	
		        }
		        
		        else if (n == 0) { // if n = 0
		        	return 1;
		        } 
		        
		        else if (n == 1) { // if n is equal to 0
		        	return x;
		        }
		        
		        else if (n%2==0) { // if n is even
		        	return expBySquaring(x*x, n/2);
		        }
		        
		        else { // if n is odd
		        	return (x*expBySquaring(x*x, (n-1)/2));
		        }
		        
		        
		    }

		    public static void main(String args[]) {
		        int x=8;
		        int n=-2;

		        System.out.println("The result of multiplying " +x+ " by itself " +n+ " times is " + expBySquaring(x, n));
		    }

	}
