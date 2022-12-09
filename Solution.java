
public class Solution {

    public int bestClosingTime(String customers) {
        int currentProfit = 0;
        int maxProfit = 0;
        int earliestClosingHourWithMinLoss = 0;

        for (int hour = 0; hour < customers.length(); ++hour) {
            currentProfit += customers.charAt(hour) == 'Y' ? 1 : -1;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                earliestClosingHourWithMinLoss = hour + 1;
            }
        }

        return earliestClosingHourWithMinLoss;
    }
}
