package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BankUtil {

	private static Connection con;

	static {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localHost:3306/jdbc_bank_java", "root", "Aniket19%");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int addNewEntry(int acno, String name, double balance, String email) throws Exception {

		String query = "insert into bank values(?,?,?,?)";

		PreparedStatement stt = con.prepareStatement(query);
		stt.setInt(1, acno);
		stt.setString(2, name);
		stt.setDouble(3, balance);
		stt.setString(4, email);

		return stt.executeUpdate();

	}

	// show all DB table content
	public static void showAllData() throws Exception {
		String query = "select * from Bank";
		Statement stt = con.createStatement();
		ResultSet set = stt.executeQuery(query);
		while (set.next())
			System.out
					.println(set.getInt(1) + " " + set.getString(2) + " " + set.getDouble(3) + " " + set.getString(4));

	}

	public static int updateDetails(int acno, String name, String email) throws Exception {
		String query = "update bank set cname=?,email=? where AcNo=?";
		PreparedStatement stt = con.prepareStatement(query);
		stt.setString(1, name);
		stt.setString(2, email);
		stt.setInt(3, acno);

		return stt.executeUpdate();
	}

	public static int deleteAccount(int acno) throws Exception {
		String query = "delete from bank where acno =?";
		PreparedStatement stt = con.prepareStatement(query);
		stt.setInt(1, acno);
		return stt.executeUpdate();

	}

	public static int withdrawAmount(int acno, double amt) throws Exception {
		String query = "update bank set Bankbalance=Bankbalance-? where acno = ? ";
		PreparedStatement stt = con.prepareStatement(query);
		stt.setDouble(1, amt);
		stt.setInt(2, acno);

		return stt.executeUpdate();

	}

	public static int depositAmount(int acno, double amt) throws Exception {
		String query = "update bank set Bankbalance= ?+Bankbalance where acno=?";
		PreparedStatement stt = con.prepareStatement(query);
		stt.setDouble(1, amt);
		stt.setInt(2, acno);
		return stt.executeUpdate();
	}

	public static void moneyTransfer(int sender, int receiver, double amt) throws SQLException {

		String str = "update bank set bankbalance=bankbalance-? where acno = ?";
		PreparedStatement stt = con.prepareStatement(str);
		stt.setDouble(1, amt);
		stt.setInt(2, sender);
		stt.executeUpdate();
		str = "update bank set bankbalance=bankbalance+? where acno = ?";
		stt = con.prepareStatement(str);
		stt.setDouble(1, amt);
		stt.setInt(2, receiver);
		stt.executeUpdate();

	}

}
