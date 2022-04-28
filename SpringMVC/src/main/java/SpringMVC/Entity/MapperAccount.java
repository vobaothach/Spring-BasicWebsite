package SpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class MapperAccount implements RowMapper<Account> {

	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account ac = new Account();
		ac.setMail(rs.getString(1));
		ac.setPass(rs.getString(2));
		ac.setName(rs.getString(3));
		ac.setAddress(rs.getString(4));
		ac.setPhone(rs.getString(5));
		ac.setRole(rs.getInt(6));
		return null;
	}

}
