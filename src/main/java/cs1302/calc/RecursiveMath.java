package cs1302.calc;


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

    /**
     * The Multiplication function takes the int value lhs and adds to it the same value repeatedly. The addition of lhs to lhs itself is equal to the value rhs.
     * The multiplicaiton method calls on the pure tail cursive form of itself where sum is equal initially to the lhs, but goes on to store various additions of lhs
     * As recursion continues. 
     * 
     *@param int lhs
     *@param int rhs
     *@return int
     */
    public int mul(int lhs, int rhs) {
    	return mul_acc(lhs,lhs,rhs);
    } // mul

    /**
     * This methos is called by mul(int lhs, intrhs). The number of recursive calls is controlled by the subtraction of rhs using the pred() method.
     * Once rhs reaches the value of 1, the method calls collapse in on themselves and sum continues to increase in value till control reaches the first
     * iteration of the method. The first iteration returns the final value of sum.
     * 
     * @param sum
     * @param lhs
     * @param rhs
     * @return
     */
    public int mul_acc(int sum,int lhs,int rhs){
    	if(rhs==0){return 0;}
    	if(rhs==1){return sum;}
    	else{return mul_acc(add(sum,lhs),lhs,pred(rhs));}
    }
    
    /**
     * This method returns the integer quotient of dividing the int value lhs by int value rhs. 
     * The recursive call within the function returns the number of times the rhs can be subtracted from the lhs
     * 
     * @param int lhs
     * @param int rhs
     * @return int
     */
    public int div(int lhs, int rhs) {
        if(lhs < rhs){return 0;}
        if(lhs == rhs) {return 1;}
        else{return succ(div(sub(lhs,rhs),rhs));}
    } // div

    /**
     * Calls the pure tail recusive method fac_acc.
     * @param int n
     * @return int
     */ 
    public int fac(int n) {
        return fac_acc(1,n);
    } // fac
    
    /**
     *  The recursive call of this method calls itself with two new parameters each time its called.
     *  The first parameter being the multiplication of acc and n together. The second parameter being n decremented by 1.
     *  The method's number of recursive calls is regulated by the value of n. When n finally reaches 1 or 0, it's checked with the base of the method.
     *  After the base case has been confirmed the methods collapse in on eachother each time increasing the value of the int acc until control reaches
     *  the first iteration of the fac_acc method. The value is returned by the method.
     *  
     * @param acc
     * @param n
     * @return
     */
    public int fac_acc(int acc, int n){
    	if(n==1 || n == 0)return acc; // modified the base case to handle 1! and 0!.
    	return fac_acc(mul(acc,n),pred(n));
    }
    
    
    /**
     * Calls the method Pure Tail Recursive method pow_acc. The int value lhs and int value rhs are fed into the method. 
     * These values are then plugged into pow_acc.
     * 
     * @param int lhs
     * @param int rhs
     * @return int
     */
    public int pow(int lhs, int rhs){
    	return pow_acc(lhs,lhs,rhs);
    }
    
    /**
     *  This power method takes the int value acc and multiplies acc a number of times equal to n. 
     *  The value m is present to control the base case and is the same value as n. When m finally reaches zero the base case
     *  is activated. Control goes through the various cases and reaches the first iteration of the method which the returns the sum.
     *  
     * @param acc
     * @param n
     * @param m
     * @return
     */
    public int pow_acc(int acc, int n, int m) {
        if( m==1) return acc;
        return pow_acc(mul(acc,n),n,pred(m));
    } // pow
    
} // RecursiveMath
