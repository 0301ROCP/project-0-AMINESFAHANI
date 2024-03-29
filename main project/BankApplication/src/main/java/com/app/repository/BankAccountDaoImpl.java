package com.app.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.models.BankAccount;
import com.app.utility.ConnectionFactory;

public class BankAccountDaoImpl implements BankAccountDao {

	@Override
	public BankAccount sellectById(int id) {
		BankAccount b=null;
		try(Connection conn=ConnectionFactory.getConnection()){
				String sql="select * from BankAccount where id=?";
		        PreparedStatement prs=conn.prepareStatement(sql);
		        prs.setInt(1, id);
		        ResultSet rs=prs.executeQuery();
		        while(rs.next()) {
		        	 b=new BankAccount(rs.getInt(1), rs.getBoolean(2), rs.getBoolean(3), rs.getInt(4), rs.getInt(5));
		        }
		        
		                		
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return b ;
	}

	@Override
	public BankAccount sellectByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	@Override
	public ArrayList<BankAccount> sellectAllAccounts() {
    ArrayList<BankAccount> accountList = new ArrayList<>();
		
		String sql = "SELECT * FROM BankAccount";
		
		try(Connection conn = ConnectionFactory.getConnection()) {
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				accountList.add( new BankAccount(rs.getInt(1), rs.getBoolean(2), rs.getBoolean(3), rs.getInt(4), rs.getInt(5)));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return accountList;
	}

	@Override
	public boolean deleteBankAccountById(int id) {
	try(Connection conn = ConnectionFactory.getConnection()){
			
			String sql = "delete from BankAccount where id= ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			
			ps.setInt(1,id);
			
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}	
	

	@Override
	public boolean updateByBalance(int id, double balance) {
	try(Connection conn = ConnectionFactory.getConnection()){
			
			String sql = "UPDATE BankAccount SET balance = ? WHERE id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setDouble(1, balance);
			ps.setInt(2,id);
			
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateByBalance(BankAccount b, int balance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertBankAccount(boolean a,boolean b,double amount,int id) {
try(Connection conn = ConnectionFactory.getConnection()){
			
			String sql = "insert into bankaccount (saving,checking,balance,customer_id) values(?,?,?,?)";
					
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setBoolean(1,a);
			ps.setBoolean(2,b);
			ps.setDouble(3,amount);
			ps.setInt(4,id);
			
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean insertBankAccount(BankAccount b) {
try(Connection conn = ConnectionFactory.getConnection()){
			
			String sql = "insert into bankaccount (saving,checking,balance,customer_id) values(?,?,?,?)";
					
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setBoolean(1,b.isSavingAccount());
			ps.setBoolean(2,b.isChekingAccount());
			ps.setDouble(3,b.getBalance());
			ps.setInt(4,b.getCostumerId());
			
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	 

}
