class Q5_UglyNumbers{
	long getNthUglyNo(int n) {
        long ugly[] = new long[n]; // To store ugly numbers
        int i2 = 0, i3 = 0, i5 = 0;
        long next_multiple_of_2 = 2;
        long next_multiple_of_3 = 3;
        long next_multiple_of_5 = 5;
        long next_ugly_no = 1;

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            next_ugly_no =
                Math.min(next_multiple_of_2,Math.min(next_multiple_of_3, next_multiple_of_5));

            ugly[i] = next_ugly_no;
            if (next_ugly_no == next_multiple_of_2) {
                i2 = i2 + 1;
                next_multiple_of_2 = ugly[i2] * 2;
            }
            if (next_ugly_no == next_multiple_of_3) {
                i3 = i3 + 1;
                next_multiple_of_3 = ugly[i3] * 3;
            }
            if (next_ugly_no == next_multiple_of_5) {
                i5 = i5 + 1;
                next_multiple_of_5 = ugly[i5] * 5;
            }
        } /*End of for loop (i=1; i<n; i++) */
        return next_ugly_no;
    }
}