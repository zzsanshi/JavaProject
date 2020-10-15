package web.LoginDemo.Dao;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import web.LoginDemo.domain.User;
import web.LoginDemo.utils.JDBCUtils;

public class UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDatasource());//声明连接

    public User login(User user) {

        try {
            String sql = "select * from user where username=?and password=?";
            User Searchuser = template.queryForObject(sql,
                    new BeanPropertyRowMapper<>(User.class),
                    user.getUsername(), user.getPassword());
            return Searchuser;
        } catch (DataAccessException e) {

            e.printStackTrace();
            return null;
        }
    }
}
