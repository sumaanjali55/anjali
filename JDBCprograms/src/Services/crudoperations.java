package Services;
import java.sql.*;
import DBUti.DBUtil;

public class crudoperations {

	public class Crudoperations {
		static Connection con;
		static PreparedStatement pst;
		static ResultSet rs;
		
		static {
			con=DBUtil.getConnection();
			if(con!=null)
			{
				System.out.println("connection is Succesfully.\n");
			}
			else
			{
				System.out.println("Failed to connect to the database.\n");
			}
		}
		
		//insert
		public static int addStudent(int sid,String sname)
		{
			int n=0;
			try {
				pst=con.prepareStatement("INSERT INTO student VALUES(?,?)");
				pst.setInt(1, sid);
				pst.setString(2, sname);
				pst.executeUpdate();
				System.out.println(n+"record(s) inserted");
			}catch(Exception e)
			{
				
			}
			return n;
		}
		 //UPDATE
	    public static int updateStudentName(int sid, String newName) 
	    {
	        int n = 0;
	        try {
	            pst = con.prepareStatement("UPDATE student SET sname = ? WHERE sid = ?");
	            pst.setString(1, newName);
	            pst.setInt(2, sid);
	            n = pst.executeUpdate();
	            System.out.println(n + " record(s) updated.");
	        } catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        return n;
	    }

	    //DELETE
	    public static int deleteStudent(int sid)
	    {
	        int n = 0;
	        try {
	            pst = con.prepareStatement("DELETE FROM student WHERE sid = ?");
	            pst.setInt(1, sid);
	            n = pst.executeUpdate();
	            System.out.println(n + " record(s) deleted.");
	        } catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	        return n;
	    }

	    // SELECT
	    public static void displayAllStudents() 
	    {
	        try {
	            pst = con.prepareStatement("SELECT * FROM student");
	            rs = pst.executeQuery();
	            System.out.println("\n--- Student Table ---");
	            while (rs.next()) {
	                System.out.println("ID: " + rs.getInt("sid") + " | Name: " + rs.getString("sname"));
	            }
	            System.out.println("------------------------\n");
	        } catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }

	    // SELECT ONE 
	    public static void searchStudent(int sid)
	    {
	        try {
	            pst = con.prepareStatement("SELECT * FROM student WHERE sid = ?");
	            pst.setInt(1, sid);
	            rs = pst.executeQuery();

	            if (rs.next()) 
	            {
	                System.out.println("Student Found → ID: " + rs.getInt("sid") +
	                                   ", Name: " + rs.getString("sname"));
	            } 
	            else
	            {
	                System.out.println("No student found with ID: " + sid);
	            }
	        } catch (Exception e)
	        {
	            e.printStackTrace();
	        }
		
	}
}

	public static void addStudent(int i, String string) {
		// TODO Auto-generated method stub
		
	}
}