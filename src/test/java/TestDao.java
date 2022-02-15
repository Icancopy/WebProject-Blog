import com.test.dao.UserMapper;
import com.test.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @ClassName: TestDao
 * @Description: 测试Dao接口
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/12 10:15
 */
public class TestDao {
    @Test
    void testDao() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(userMapper.selectUserById(1));
    }
}
