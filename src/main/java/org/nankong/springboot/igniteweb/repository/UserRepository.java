package org.nankong.springboot.igniteweb.repository;

import org.nankong.springboot.igniteweb.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User getUserByUsername(String username);
    public User getUserByUsernameAndPassword(String username,String password);
    @Query(value="select * from user where username = ? and password = ? and state = '1'",nativeQuery=true)
    public User getUserBySql(String username,String password);
}
