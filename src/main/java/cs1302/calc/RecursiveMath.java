package cs1302.calc;

/* Implement the Math interface using recursion here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * REPLACE ME WITH ACTUAL JAVADOC FOR THIS CLASS.
 *
 * @author AUTHOR
 */
public class RecursiveMath implements Math {
	
    public int inc(int n) {
      return n+1;
    } // inc
	
    public int dec(int n) {
       return n-1;
    } // dec

    public int add(int lhs, int rhs) { // lhs or rhs cannot sum up to something more than 2200000000. Why?
    	if(rhs ==0){return lhs;}
    	return add(succ(lhs),pred(rhs));
        
    } // add
    

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
