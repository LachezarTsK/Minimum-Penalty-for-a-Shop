
public class Solution {

    private static final char CUSTOMER_VISITS = 'Y';
    private static final char NO_CUSTOMER_VISITS = 'N';
    private static final int PROFIT = 1;
    private static final int PENALTY = -1;

    public int bestClosingTime(String customers) {
        int currentProfit = 0;
        int maxProfit = 0;
        int earliestClosingHourWithMinLoss = 0;

        for (int hour = 0; hour < customers.length(); ++hour) {
            currentProfit += (customers.charAt(hour) == CUSTOMER_VISITS) ? PROFIT : PENALTY;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                earliestClosingHourWithMinLoss = hour + 1;
            }
        }

        return earliestClosingHourWithMinLoss;
    }
}
