
/**
 * @param {string} customers
 * @return {number}
 */
var bestClosingTime = function (customers) {
    const CUSTOMER_VISITS = 'Y';
    const NO_CUSTOMER_VISITS = 'N';
    const PROFIT = 1;
    const PENALTY = -1;

    let currentProfit = 0;
    let maxProfit = 0;
    let earliestClosingHourWithMinLoss = 0;

    for (let hour = 0; hour < customers.length; ++hour) {
        currentProfit += (customers.charAt(hour) === CUSTOMER_VISITS) ? PROFIT : PENALTY;
        if (currentProfit > maxProfit) {
            maxProfit = currentProfit;
            earliestClosingHourWithMinLoss = hour + 1;
        }
    }

    return earliestClosingHourWithMinLoss;
};
