package SpringMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import SpringMVC.Entity.Account;
import SpringMVC.Entity.MapperAccount;

@Repository
public class AcountDao {
	

@Autowired
private JdbcTemplate jdbcTemplate;
	public List<Account> getAllAccount(){
		List<Account> list = new ArrayList<Account>();
		String sql = "select * from account";
		list = jdbcTemplate.query(sql, new MapperAccount());
		return list;
	}
	
}
