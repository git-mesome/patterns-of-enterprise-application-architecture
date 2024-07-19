package RDBMapping.db;

import RDBMapping.Player;

import java.sql.SQLException;


public class PlayerDB {

  public static int add(Player player) {

    String sql = "INSERT INTO " +
        "players(name, club, batting_average, bowling_average)" +
        " VALUES (?,?,?,?)";

    String sql1 = "INSERT INTO players(name, club,)" +
        " VALUES (?,?)";

    try (var conn = DB.connect()) {
      var pstmt = conn.prepareStatement(sql);

      pstmt.setString(1, player.getName());
      pstmt.setString(2, player.getClub());
      pstmt.setDouble(3, player.getBattingAverage());
      pstmt.setDouble(4, player.getBowlingAverage());

      return pstmt.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return -1;
  }

}
