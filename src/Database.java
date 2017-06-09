import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public Database() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getPersonID()
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select persID from Person";
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			rs.last();
			return rs.getString(1);
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return null;
		
		
		
		
	}
	
	
	public String getEmplomentID()
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select empID from Employment";
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			rs.last();
			return rs.getString(1);
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return null;
	
	}
	
	

	public void addPerson(String name, String email)
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String sql = "Insert into Person(persName,email) values('"+name+"','"+email+"')";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			 if(!stmt.execute(sql))
			 {
				 
				
				sql= "Select * from Person where persName='"+name+"'";
				stmt=con.createStatement();
				rs=stmt.executeQuery(sql);
				
				ResultSetMetaData col=rs.getMetaData();
				for(int i=1;i<=col.getColumnCount();i++)
				{
					
					System.out.print(col.getColumnName(i) + "\t");
				}
				System.out.println();
				System.out.println();
						
				rs.last();	
				for(int i=1;i<=col.getColumnCount();i++)
				{
						
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
				
			}
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	public void addSchooling(String college, int yearGrad, String degType, String degMajor,String persID)
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String sql = "Insert into Schooling(persID, degType, degMajor, college, yearGrad) values('"+persID+"','"+degType+"','"+degMajor+"','"+college+"','"+yearGrad+"')";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			 if(!stmt.execute(sql))
			 {
				 
				
				sql= "Select * from Schooling where persID='"+persID+"'";
				stmt=con.createStatement();
				rs=stmt.executeQuery(sql);
				
				ResultSetMetaData col=rs.getMetaData();
				for(int i=1;i<=col.getColumnCount();i++)
				{
					
					System.out.print(col.getColumnName(i) + "\t");
				}
				System.out.println();
				System.out.println();
						
				rs.last();	
				for(int i=1;i<=col.getColumnCount();i++)
				{
						
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
				
			}
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
	public void addEmployment(String title, String company, String startDate, String endDate, String persID)
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String sql = "Insert into Employment(persID, title, company, startDate, endDate) values('"+persID+"','"+title+"','"+company+"','"+startDate+"','"+endDate+"')";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			 if(!stmt.execute(sql))
			 {
				 
				
				sql= "Select * from Employment where persID='"+persID+"'";
				stmt=con.createStatement();
				rs=stmt.executeQuery(sql);
				
				ResultSetMetaData col=rs.getMetaData();
				for(int i=1;i<=col.getColumnCount();i++)
				{
					
					System.out.print(col.getColumnName(i) + "\t");
				}
				System.out.println();
				System.out.println();
						
				rs.last();	
				for(int i=1;i<=col.getColumnCount();i++)
				{
						
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
				
			}
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
	public void addDuty(String empID, String dutyDesc)
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String sql = "Insert into Duty(empID, dutyDesc) values('"+empID+"','"+dutyDesc+"')";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			 if(!stmt.execute(sql))
			 {
				 
				
				sql= "Select * from Duty where empID='"+empID+"'";
				stmt=con.createStatement();
				rs=stmt.executeQuery(sql);
				
				ResultSetMetaData col=rs.getMetaData();
				for(int i=1;i<=col.getColumnCount();i++)
				{
					
					System.out.print(col.getColumnName(i) + "\t");
				}
				System.out.println();
				System.out.println();
						
				rs.last();	
				for(int i=1;i<=col.getColumnCount();i++)
				{
						
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
				
			}
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	public void addSkills(String persID, String skillName,String skillRating)
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String sql = "Insert into Skill(persID, skillName, skillRating) values('"+persID+"','"+skillName+"','"+skillRating+"')";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			 if(!stmt.execute(sql))
			 {
				 
				
				sql= "Select * from Skill where persID='"+persID+"'";
				stmt=con.createStatement();
				rs=stmt.executeQuery(sql);
				
				ResultSetMetaData col=rs.getMetaData();
				for(int i=1;i<=col.getColumnCount();i++)
				{
					
					System.out.print(col.getColumnName(i) + "\t");
				}
				System.out.println();
				System.out.println();
						
				rs.last();	
				for(int i=1;i<=col.getColumnCount();i++)
				{
						
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
				
			}
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
	

}
