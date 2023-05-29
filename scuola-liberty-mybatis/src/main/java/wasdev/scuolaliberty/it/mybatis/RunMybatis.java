package wasdev.scuolaliberty.it.mybatis;

public class RunMybatis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO userDAO = new UserDAO();
		User user =userDAO.getData(50);
		 //select
		
		  System.out.println("id:"+user.getId()+", Name:"+user.getName()+", Surname:"+user.getSurname()+", Age:"+user.getAge());
	}

}
