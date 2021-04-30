package Learning.mapper;

import Learning.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface UserMapper4 {

    @Insert("insert into user(username,password) values(#{username},#{password})")
    public void save(User user);
    @Update("update user set username=#{username},password=#{password} where id=#{id}")
    public void update(User user);


    
}
