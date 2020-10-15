package web.LoginDemo.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    private static ComboPooledDataSource ds = new ComboPooledDataSource();

    static {//初始化连接池对象

        try {
            ds.setDriverClass("org.sqlite.JDBC");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        ds.setJdbcUrl("jdbc:sqlite:D:\\Database\\ServletDemo.db");

    }

    //获取连接池
    public static DataSource getDatasource() {
        return ds;
    }

    //获取连接对象
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

}
