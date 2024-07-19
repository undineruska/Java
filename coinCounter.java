import java.util.HashMap;
import java.util.Map;

public class Main { // Class name matches the filename

  /**
   * This is the main method where the program execution begins.
   * 
   * @param args (unused command-line arguments)
   */
  public static void main(String[] args) { 
    int amountInCents = 499; // Amount to be converted into coins

    /**
     * Calls the countCoins method to calculate the coin breakdown
     * and stores the result (coin denominations and counts) in the 'result' map.
     */
    Map<Integer, Integer> result = countCoins(amountInCents);

    /**
     * Iterates through each entry (coin denomination and count) in the 'result' map
     * and prints the details.
     */
    for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
      System.out.println(entry.getKey() + " cent coin: " + entry.getValue() + " pieces");
    }
  }

  /**
   * This method calculates the number of coins required for a given amount in cents.
   * 
   * @param amount The amount in cents to be converted into coins
   * @return A map containing coin denominations (keys) and their corresponding counts (values)
   */
  public static Map<Integer, Integer> countCoins(int amount) {
    int[] coins = {50, 20, 10, 5, 2, 1}; // Supported coin denominations (descending order)

    /**
     * Creates a HashMap to store coin denominations and their counts.
     */
    Map<Integer, Integer> coinCount = new HashMap<>();

    // Initializes each coin denomination with a count of 0
    for (int coin : coins) {
      coinCount.put(coin, 0);
    }

    /**
     * Iterates through each coin denomination in the 'coins' array.
     */
    for (int coin : coins) {
      if (amount >= coin) {
        /**
         * Calculates the number of coins needed for the current denomination
         * and stores it in the 'coinCount' map.
         */
        coinCount.put(coin, amount / coin);
        amount = amount % coin; // Updates remaining amount after using current denomination
      }
    }

    return coinCount;
  }
}
