class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        long N_long = n;

      
        if (N_long < 0) {
            x = 1 / x;
            N_long = -N_long;
        }

       
        double result = 1.0;
        double base = x; 

        while (N_long > 0) {
           
            if (N_long % 2 == 1) { 
                result = result * base;
            }

            base = base * base;

            N_long = N_long / 2; 
        }

        return result;
    }
}