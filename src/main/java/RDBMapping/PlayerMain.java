package RDBMapping;

import RDBMapping.db.PlayerDB;

public class PlayerMain {
  public static void main(String[] args) {
/**
 * 테이블 생성
 */
//    String sql = "CREATE TABLE players (" +
//        "name VARCHAR," +
//        "club VARCHAR," +
//        "batting_average NUMERIC," +
//        "bowling_average NUMERIC," +
//        "type VARCHAR" +
//        ");";
//
//    try (var conn = DB.connect()) {
//      var stmt = conn.createStatement();
//      stmt.executeUpdate(sql);
//    } catch (SQLException e) {
//      throw new RuntimeException(e);
//    }

    PlayerDB.add(new SoccerPlayer("김민서", "와이소프트"));
    PlayerDB.add(new CricketPlayer("문동민",2.0));
    PlayerDB.add(new BowlingPlayer("유재영", 2.0,3.0));

  }
}
