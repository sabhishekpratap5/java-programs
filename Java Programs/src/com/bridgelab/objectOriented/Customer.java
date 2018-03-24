package com.bridgelab.objectOriented;

public class Customer 
{

	private String mName;
	private long mMoney;
	private long mTotalShare;
	
	public Customer(String name, long money, long totalShare) 
	{
		this.mName = name;
		this.mMoney = money;
		this.mTotalShare = totalShare;
	}

	public String getName() 
	{
		return mName;
	}

	public void setName(String name) 
	{
		this.mName = name;
	}

	public long getMoney() 
	{
		return mMoney;
	}

	public void setMoney(long money) 
	{
		this.mMoney = money;
	}


	public long getTotal_share() 
	{
		return mTotalShare;
	}

	public void setTotal_share(int totalShare) 
	{
		this.mTotalShare = totalShare;
	}

	@Override
	public String toString() 
	{
		return "Customer [name=" + mName + ", money=" + mMoney + ", total_share=" + mTotalShare	+ "]";
	}	
	
}
