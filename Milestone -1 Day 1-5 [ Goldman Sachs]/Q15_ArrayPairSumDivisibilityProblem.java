class Q15_ArrayPairSumDivisibilityProblem{
	public boolean canPair(int ar[], int k) {
        if (ar.length % 2 == 1) return false;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            int rem = ((ar[i] % k) + k) % k;
            if (!hm.containsKey(rem)) {
                hm.put(rem, 0);
            }
            hm.put(rem, hm.get(rem) + 1);
        }
        for (int i = 0; i < ar.length; i++) {

            int rem = ((ar[i] % k) + k) % k;
            if (2 * rem == k) {
                if (hm.get(rem) % 2 == 1) return false;
            }else if (rem == 0) {
                if (hm.get(rem) % 2 == 1) return false;
            }else {
                if (hm.get(k - rem) != hm.get(rem)) return false;
            }
        }
        return true;
    }
}