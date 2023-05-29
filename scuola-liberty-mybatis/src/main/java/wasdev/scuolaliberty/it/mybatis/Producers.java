package wasdev.scuolaliberty.it.mybatis;

import java.io.Reader;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.cdi.SessionFactoryProvider;

/**
 * Required producer for the SqlSessionFactory
 * 
 */
@ApplicationScoped
public class Producers {

  private static final Logger LOG = Logger.getLogger(Producers.class.getName());

  /**
   * Simple SqlSessionFactory provider. Required by MyBatis.
   */
  @ApplicationScoped
  @Produces
  @SessionFactoryProvider
  public SqlSessionFactory produce() throws Exception {
	String resource = "wasdev/scuolaliberty/it/mybatis-config.xml";
    Reader reader = Resources.getResourceAsReader(resource);// "mybatis-config_1.xml"
   
    SqlSessionFactory manager = new SqlSessionFactoryBuilder().build(reader);
    reader.close();
    // Insert some sample data...
   // insertSampleData(manager);
    return manager;
  }
}