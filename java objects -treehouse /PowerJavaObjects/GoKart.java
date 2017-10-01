//treehouse trak challenge
class GoKart {
  public static final int MAX_BARS = 8;
  private String color;
  private int barCount;
  private int lapsDriven;

  public GoKart(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void charge() {
    barCount = MAX_BARS;
  }

  public boolean isBatteryEmpty() {
    return barCount == 0;
  }

  public boolean isFullyCharged() {
    return MAX_BARS == barCount;
  }
  
  public void drive() {
      barCount--;
    return lapsDriven++;
  }
}