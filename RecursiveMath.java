package cs1302.calc;

/* Implement the Math interface using recursion here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 *Contains Recursive methods for add, subtract, divide, multiply
 * factorial, power, left shift and right shift.
 * @author Samantha Carlile and Brian Weber
 */
public class RecursiveMath implements Math {

    public int inc(int n) {
        return n + 1;
    } // inc

    public int dec(int n) {
        return n - 1;
    } // dec

    public int add(int lhs, int rhs) {
        if (rhs == 0) {
            return lhs;
        }
        return add(inc(lhs), dec(rhs));
    } // add

    public int sub(int lhs, int rhs) {
        if (rhs == 0) {
            return lhs;
        }
        return sub(dec(lhs), dec(rhs));
    } // sub

    public int mul(int lhs, int rhs) {
        if (rhs == 0) {
            return 0;
        }
        if (rhs == 1) {
            return lhs;
        }
        return add(lhs, mul(lhs, dec(rhs)));
    } // mul

    public int div(int lhs, int rhs) {
        if (lhs < rhs) {
            return 0;
        }
        if (lhs == rhs) {
            return 1;
        }
        return succ(div(sub(lhs, rhs), rhs));
    } // div

    public int fac(int n) {
        if (n == 0) {
            return 1;
        }
        return mul(n, fac(dec(n)));
    } // fac

    public int pow(int lhs, int rhs) {
        if (rhs == 0) {
            return 1;
        }
        return mul(lhs, pow(lhs, dec(rhs)));
    } // pow

    public int lshift(int lhs, int rhs) {
        if (rhs == 0) {
            return lhs;
        }
        return mul(2, lshift(lhs, dec(rhs)));
    } // lshift

    public int rshift(int lhs, int rhs) {
        if (rhs == 0) {
            return lhs;
        }
        return div(rshift(lhs, dec(rhs)), 2);
    } // rshift

} // RecursiveMath


