package cs1302.calc;



/**
 * 
 *
 * @author Michael Jurado and Jarrad Thomas
 */
public class IterativeMath implements Math {

	/**
	 * 
	 * Takes in the int n and increments it by one. This incremented value is returned.
	 * @param int n
	 * @return int
	 */
    public int inc(int n) {
     return n+1;
    } // inc

	/**
	 * 
	 * Takes in the int n and decrements it by one. This decremented value is returned.
	 * @param int n
	 * @return int
	 */
    public int dec(int n) {
        return n-1;
    } // dec
    
    /**
     * 
     * This method uses the inc() and dec() methods. The method takes the int value lhs and increments it by 1 for the 
     * number of times indicated by the int value rhs. A secondary int called sum is declared. The variable sum is used in a while loop to store
     * each incrementation of lhs. Each time sum is incremented the value of rhs is decresed by 1 until rhs reaches 0. When rhs = 0 the loop
     * is broken and sum is returned.
     * 
     * @param int lhs
     * @param int rhs
     * @return int
     */
    public int add(int lhs, int rhs) {
    	int sum = lhs;
    	if(rhs == 0) return sum;
    	while(rhs >=1){
    		sum = inc(sum);
    		rhs = dec(rhs);
    	}
    	return sum;		
    } // add

    /**
     * 
     * This method takes the int value lhs and decreases it by 1 a number of times equal to the int value rhs.
     * The function stores the value of lhs in a secondary variable called dif. if rhs is equal to zero dif is returned by the method
     * If rhs is greater than zero diff and rhs are decremented by 1 repeatedly in a while loop till rhs is equal to 1.
     * When rhs is equal to 1 the loop breaks and dif is returned.
     * 
     * @param int lhs
     * @param int hs
     * @return int
     */
    public int sub(int lhs, int rhs) {
        int dif = lhs;
        if(rhs ==0) return dif;
        while(rhs>=1){
        	dif = dec(dif);
        	rhs = dec(rhs);
        }
        return dif;
    } // sub
    
    /**
     * 
     * This method takes the the int value lhs  and repeatedly adds sets of 1's to lhs. 
     * The length of each set of 1's is equal to the int value rhs. the initial value of lhs is saved to
     * another variable called product. Product is then used for the rest of the method. Using a while loop the 
     * value of product is incremented by some set of 1's with length equal to rhs. Each change to product also leads
     * to a substraction in the value of rhs by one. Eventually rhs will equal less than one. Once this happens the while-loop
     * breaks and the int product is returned by the method.
     * 
     * @param int lhs
     * @param int rhs
     * @return int
     */
    public int mul(int lhs, int rhs) {
        int product =lhs;
        if( (rhs ==0) || (lhs == 0) ) return 0;
        while(rhs >1){
        	product = add(product,lhs); //rhs is subtracted by one by the end of this method and control returns here.
        	
          rhs = sub(rhs,1); // rhs = 0 after subtracting the final one. Thus zero is returned by the subtraction 
        						// method and the loop ends after rhs is checked and found to be under 1.
        }
        return product;
    } // mul
    
    /**
     * 
     * The div function takes a int lhs and finds out how many times the value rhs can be subtracted from lhs.
     * If rhs is equal to 0 the function returns a int equal to 0. If rhs is greater than 0 the method will subtract
     * rhs from lhs and incremented quotient by 1. When lhs reaches a value of one the loop breaks and the int quotient is returned.
     * 
     * @param int lhs
     * @param int rhs
     * @return int
     */
    public int div(int lhs, int rhs) {
        int quotient = 0;
        if(rhs ==0) return 0;
        while(lhs >= 1){
        	lhs = sub(lhs,rhs);
        	quotient = add(quotient,1);
        }
        return quotient;
    } // div
    
    /**
     * 
     * This function takes a int n and returns the factorial product of this number. If n is equal to 0 or 1 the 
     * method will return a value of 1. As long as n is greater than the previously mentioned whole numbers a while-loop
     * will be initiated. Within this loop product is contanstly multiplied by n. Each iteration of the loop n is subtracted by 1 using the
     * subtration method. When the while-loop finally ends product will be equal to n*(n-1)*(n-2)*(n-3)... and so on.
     * This product is returned by the method.
     * 
     * @param int lhs
     * @param int rhs
     * @return int
     */
    public int fac(int n) {
    	  int product =1;
        if( n == 0 || n ==1) return product;
        while(n >=1){
        product = mul(product,n);
        n= sub(n,1);
        }
        return product;
    } // fac
    
    /**
     * 
     * This method takes the value lhs and multiplies itself by its own value a number of times equal to the value rhs.
     * The method initiates a int called sum, set's it equal to 1. Sum is used to store each iteration of lhs times itself.
     * If rhs is equal to 0 the method returns a value of 1, because anything to the power of zero is 1. As long as rhs 
     * is greater than 0, the method will activate a while loop. That loop subtracts rhs by 1 and then multiplies lhs times itself.
     * The loop of the while-loop stores the result of lhs*1 which is equal to lhs. Every other iteration of the loop has sum multiplying lhs times lhs.
     * The loop breaks when rhs finally decrements to 1 and the int sum is returned.
     * 
     * @param int lhs
     * @param int rhs
     * @return int
     */
    public int pow(int lhs, int rhs) {
        int sum = 1;
        if (rhs == 0) { return 1; }
        while (rhs >= 1) {
          rhs = sub(rhs, 1);
        	sum= mul(lhs,sum);
        }
        return sum;
    } // pow

} // IterativeMath
