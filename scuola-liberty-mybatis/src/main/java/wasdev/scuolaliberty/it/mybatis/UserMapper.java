package wasdev.scuolaliberty.it.mybatis;


import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mybatis.cdi.Mapper;

@Mapper
public interface UserMapper {
	@Results({
        @Result(property = "id", column = "ID"),
        @Result(property = "name", column = "NAME"),
        @Result(property = "surname", column = "SURNAME"),
        @Result(property = "age", column = "AGE")
      })
	@Select("SELECT id, name, surname, age from users WHERE id = #{id}")
	User selectUser(int id);
}
