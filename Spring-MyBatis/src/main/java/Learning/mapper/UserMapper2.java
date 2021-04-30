package Learning.mapper;

import Learning.User;

import java.util.List;

public interface UserMapper2 {
    public List<User> findByCondition(User user);
    public List<User> findByIds(List<Integer> ids);
}
