package camellia.hibernatedemo.dao;

import camellia.hibernatedemo.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author anthea
 * @date 2023/9/3 19:56
 */
@Repository(value = "userMapper")
public interface UserMapper extends JpaRepository<User, Integer> {
    @Query(value = "SELECT u FROM User u WHERE u.name=:name")
    List<User> getByName(String name);
}
