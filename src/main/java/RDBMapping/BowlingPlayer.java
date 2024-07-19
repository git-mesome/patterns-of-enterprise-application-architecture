package RDBMapping;

public class BowlingPlayer extends CricketPlayer {
  private double bowlingAverage;

  public BowlingPlayer(String name, double battingAverage, double bowlingAverage) {
    super(name, battingAverage);
    this.bowlingAverage = bowlingAverage;
  }

  public double getBowlingAverage() {
    return bowlingAverage;
  }

}
