package model.dbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import view.DialogFactory;

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
    }
    
    
    private void checkConnect(){
        try {
            if(conn == null || conn.isClosed())
                connect();
        } catch (SQLException ex) {
            Logger.getLogger(DbProperties.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public DSLContext getDsl() {
        checkConnect();
        return dsl;
    }
    
    public Connection getConn() {
        checkConnect();
        return conn;
    }
    
    public void connect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, userName, password);
            dsl = DSL.using(conn, SQLDialect.SQLSERVER2012);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbProperties.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            //Logger.getLogger(DbProperties.class.getName()).log(Level.SEVERE, null, ex);
            DialogFactory.getInstance().showError("Błąd połączenia z bazą danych", ex.getLocalizedMessage());
        }
    }
}
