package com.app.models;



public class BankAccount {
	private int id;
	private boolean chekingAccount;
	private boolean  savingAccount;
	private double balance;
	private int costumerId;
	
    public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	;
	public BankAccount(int id, boolean chekingAccount, boolean savingAccount, double balance, int costumerId) {
		super();
		this.id = id;
		this.chekingAccount = chekingAccount;
		this.savingAccount = savingAccount;
		this.balance = balance;
		this.costumerId = costumerId;
	}

	

    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isChekingAccount() {
		return chekingAccount;
	}

	public void setChekingAccount(boolean chekingAccount) {
		this.chekingAccount = chekingAccount;
	}

	public boolean isSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(boolean savingAccount) {
		this.savingAccount = savingAccount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getCostumerId() {
		return costumerId;
	}

	public void setCostumerId(int costumerId) {
		this.costumerId = costumerId;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", chekingAccount=" + chekingAccount + ", savingAccount=" + savingAccount
				+ ", balance=" + balance + ", costumerId=" + costumerId + "]";
	}

	
	

}
