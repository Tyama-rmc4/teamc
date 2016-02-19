import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;



public class orclTest{
	public static void main(String[] args){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracleに接続する
			Connection cn=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
				"scott","tiger");
			System.out.println("接続完了");
			
			//select文
//			String sql="DROP TABLE threadstest";
//			String sql="CREATE TABLE threadstest(thread_id	NUMBER(3),thread_name	VARCHAR2(20),create_day	VARCHAR2(20))";
//			String sql="INSERT INTO threadstest VALUES(16, 'スレッド', '2016/02/12')";
			String sql="SELECT * FROM threadstest";
			//Statementインターフェイスを実装するクラスをインスタンス化する
			Statement st=cn.createStatement();

			//select文を実行し
			//ResultSetインターフェイスを実装したクラスの
			//インスタンスが返る
			ResultSet rs=st.executeQuery(sql);
			
			rs.next();
			String id = rs.getString(1);
			String name = rs.getString(2);
			String day = rs.getString(3);
			
			System.out.println(id+ "\t" +name+ "\t" +day);
			
			//Oracleから切断する
			cn.close();
			
			System.out.println("切断完了");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("クラスがないみたい。");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("SQL関連の例外みたい。");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

