package RDBMapping;

public class SoccerPlayer extends Player {
  String club;

  public SoccerPlayer(String name, String club) {
    this.name = name;
    this.club = club;
  }

  public String getClub() {
    return club;
  }

}
