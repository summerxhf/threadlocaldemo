package usageScenario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库连接threadlocal
 */
public class ConnectionHolderThreadDemo {
   public static String DB_URL="todo:dburl";
    private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>() {
        public Connection initialValue()  {
            try {
                return DriverManager.getConnection(DB_URL);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }
    };

    public static Connection getConnection(){
        return connectionHolder.get();
    }
}
