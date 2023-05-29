package wasdev.scuolaliberty.it.mybatis;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;

public class UserDAO {
	
	
	//@Inject
	//@Mapper
	//private UserMapper mapper;
	
	public User getData(Integer id) {
		 SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		UserMapper mapper = session.getMapper(UserMapper.class);
		  User user = mapper.selectUser(id);
		 session.close();
		  return user;
		}
}
