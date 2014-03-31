package model.dbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class DbProperties {
    private final static DbProperties ourInstance = new DbProperties();
    
    private final String url = "jdbc:sqlserver://localhost:1433;databaseName=hurtowniaLekow";
    private final String userName = "student";
    private final String password = "student";
    private Connection conn;
    private DSLContext dsl;
    
    public static DbProperties getInstance() {
        return ourInstance;
    }
    
    private DbProperties() {
        connect();
    }
    
    public Connection getConn() {
        return conn;
    }
    
    public DSLContext getDsl() {
        return dsl;
    }
    
    public void connect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, userName, password);
            dsl = DSL.using(conn, SQLDialect.SQLSERVER2012);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbProperties.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DbProperties.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
