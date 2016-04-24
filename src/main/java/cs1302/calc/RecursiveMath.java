package cs1302.calc;

/* Implement the Math interface using recursion here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * This class implements the interface called Math. 
 * The methods outlined in the Math interface are given recursive implementations within this class.
 *	
 * @author Michael Jurado and Jarrad Thomas
 */
public class RecursiveMath implements Math {
	
	/**
	 *  This function takes a integer value and increments it by one and returns that incremented value.
	 *  @param int n
	 *  @return int
	 */
    public int inc(int n) {
      return n+1;
    } // inc
	
    /**
     * This funtion subtracts 1 from the value given as a parameter and returns the decremented value.
     * @param int n
     * @return int
     */
    public int dec(int n) {
       return n-1;
    } // dec
    
    /**
     * 
     * The addition function takes the int value lhs and increments it by 1 by a number of times equal to the int value rhs.
     * The function has a base case to handle situations where the value rhs is set equal to zero. If rhs is equal to zero the lhs is returned.
     * If rhs is greater than zero, the add method is called again but with the value lhs incremented by 1 ( using the default method succ() ),
     * and the value rhs decremented by one ( using the pred() method ).
     * 
     * Each call of the add() method checks if the value rhs is equal to 0 or larger. The method will continue to be called until rhs is equal to zero.
     * The method then falls back on itself adding up and returning control to the original iteration of the add() method.
     * 
     * This function cannot produce sums over the int containing value limit of 2,200,000,000.
     * 
     * @param int lhs
     * @param int rhs
     * @return int 
     */
    public int add(int lhs, int rhs) { // lhs or rhs cannot sum up to something more than 2200000000. Why?
    	if(rhs ==0){return lhs;}
    	return add(succ(lhs),pred(rhs));
        
    } // add
    
    /**
     * This function decrements the int value lhs by a number of times equal to the int value rhs. 
     * There are two base cases that are checked, whether the int lhs or int rhs is equal to 0.
     * If base cases are not found true the subtraction method is called inside of itself. 
     * The lhs and rhs are both deincremented by 1 until the rhs is found to be equal to zero at this point the 
     * recursive calls fall in on themselves leading to a result.
     * 
     * @param int lhs
     * @param
     */
    public int sub(int lhs, int rhs) {
        if(rhs ==0){return lhs;}
        if(lhs ==0){return 0;}
        else{return sub(pred(lhs),pred(rhs));}
    } // sub

    public int mul(int lhs, int rhs) {
    	return mul_acc(lhs,lhs,rhs);
    } // mul

    public int mul_acc(int sum,int lhs,int rhs){
    	if(rhs==0){return 0;}
    	if(rhs==1){return sum;}
    	else{return mul_acc(add(sum,lhs),lhs,pred(rhs));}
    }
    
    public int div(int lhs, int rhs) {
        if(lhs < rhs){return 0;}
        if(lhs == rhs) {return 1;}
        else{return succ(div(sub(lhs,rhs),rhs));}
    } // div

    public int fac(int n) {
        return fac_acc(1,n);
    } // fac
    
    public int fac_acc(int acc, int n){
    	if(n==1 || n == 0)return acc; // modified the base case to handle 1! and 0!.
    	return fac_acc(mul(acc,n),pred(n));
    }
    
    public int pow(int lhs, int rhs){
    	return pow_acc(lhs,lhs,rhs);
    }
    
    public int pow_acc(int acc, int n, int m) { //idk how i did it, but I did. [Analyze This]
        if( m==1) return acc;
        return pow_acc(mul(acc,n),n,pred(m));
    } // pow
    
@Override
    public int lshift(int lhs, int rhs) {
        return mul(lhs, pow(2, rhs));
    } // lshift

@Override     
    public int rshift(int lhs, int rhs) {
        return div(lhs, pow(2, rhs));
    } // rshift
} // RecursiveMath
