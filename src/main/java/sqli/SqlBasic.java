package sqli;

import static utils.SqlUtils.getJDBCConnection;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;

public class SqlBasic {

  HttpServletRequest request;

  public void setRequest(HttpServletRequest request) {
    this.request = request;
  }

  public void sqlBasic1() {
    String ip = request.getParameter("ip");
    try {
      Statement statement = getJDBCConnection().createStatement();
      String sql =
          "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip
              + "')";
      statement.execute(sql);
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
    System.out.print("sdfsf");
  }

  public void sqlBasic2() {
    String ip = request.getParameter("ip");
    try {
      Statement statement = getJDBCConnection().createStatement();
      statement.execute(
          "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip
              + "')");
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
    System.out.print("sdfsf");
  }

  public void sqlBasic3() {
    String ip = request.getParameter("ip");
    try {
      String sql =
          "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip
              + "')";
      getJDBCConnection().createStatement().execute(sql);
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
    System.out.print("sdfsf");
  }

  public void sqlBasic4() {
    String ip = request.getParameter("ip");
    try {
      getJDBCConnection().createStatement().execute(
          "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip
              + "')");
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
    System.out.print("sdfsf");
  }

}
