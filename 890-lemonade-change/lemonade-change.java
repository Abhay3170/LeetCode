class Solution {
    public boolean lemonadeChange(int[] bills) {
        short bill5 = 0;
        short bill10 = 0;
        for (int currentBill : bills) {
            if (currentBill == 5) {
                bill5++;
            } else if (currentBill == 10) {
                if (bill5 > 0) {
                    bill5--;
                } else
                    return false;
                bill10++;
            } else if (currentBill == 20) {
                if (bill10 > 0 && bill5 > 0) {
                    bill5--;
                    bill10--;
                } else if (bill5 > 2) {
                    bill5 -= 3;
                } else
                    return false;
            }
        }
        return true;
    }
}