class Solution {
    public int dayOfYear(String date) {
        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        int days = 0;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            daysOfMonth[1] = 29;
        }
        for (int i = 0; i < month - 1; i++) {
            days += daysOfMonth[i];
        }
        
        return days + day;
    }
}