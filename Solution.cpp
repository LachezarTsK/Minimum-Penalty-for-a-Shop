
#include <string>
using namespace std;

class Solution {
    
    inline static const char CUSTOMER_VISITS = 'Y';
    inline static const char NO_CUSTOMER_VISITS = 'N';
    inline static const int PROFIT = 1;
    inline static const int PENALTY = -1;

public:
    //C++20 alternative: int bestClosingTime(string_view customers) const
    int bestClosingTime(const string& customers) const {
        int currentProfit = 0;
        int maxProfit = 0;
        int earliestClosingHourWithMinLoss = 0;

        for (int hour = 0; hour < customers.length(); ++hour) {
            currentProfit += (customers[hour] == CUSTOMER_VISITS) ? PROFIT : PENALTY;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                earliestClosingHourWithMinLoss = hour + 1;
            }
        }

        return earliestClosingHourWithMinLoss;
    }
};
