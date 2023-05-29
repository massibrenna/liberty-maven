/*******************************************************************************
 * (c) Copyright IBM Corporation 2017.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package wasdev.scuolaliberty.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.mybatis.cdi.Mapper;

import wasdev.scuolaliberty.it.mybatis.User;

import wasdev.scuolaliberty.it.mybatis.UserMapper;

@Stateless(name = "SampleEJB")
public class SampleStatelessBean {

	@Inject
	private UserMapper mapper;
	//private UserDAO userDAOinjected;
	
    public String hello(Integer id) {
    	
    	//UserDAO userDAO = new UserDAO();
		//User user =userDAO.getData(id);
    	User user = mapper.selectUser(id);
    	
        return user.getSurname();
    }
}
