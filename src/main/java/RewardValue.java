public class RewardValue {
    final private double cashValue;
    final private int milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Returns the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Returns how many miles the RewardValue is worth
    public int getMilesValue() {
        return milesValue;
    }
}