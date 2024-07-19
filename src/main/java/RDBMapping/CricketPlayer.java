package RDBMapping;

public class CricketPlayer extends Player {
  double battingAverage;

  public CricketPlayer(String name, double battingAverage) {
    this.name = name;
    this.battingAverage = battingAverage;
  }

  public double getBattingAverage() {
    return battingAverage;
  }

}
