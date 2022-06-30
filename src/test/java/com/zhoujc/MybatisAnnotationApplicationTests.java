package com.zhoujc;

import com.zhoujc.dao.UserDao;
import com.zhoujc.pojo.User;
import com.zhoujc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisAnnotationApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void allUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        System.out.println(mapper.allUser());

        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void getUserById() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        System.out.println(mapper.getUserById(1));

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        System.out.println(mapper.addUser(new User(14, "zhoujc", "zhoujc", "jjjjjjj")));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        System.out.println(mapper.updateUser(new User(14, "科幻", "科技史", "uuuuuu")));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        System.out.println(mapper.deleteUser(14));

        sqlSession.commit();
        sqlSession.close();
    }

}
