
/******************************************************************************
 *  Purpose: this program is refer for manegging stock account. 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.objectOriented;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONObject;

import com.bridgelab.utility.Utility;



public class StockAccount 
{
	String mCustomerPath = "/home/bridgeit/abhishek-workspace/Java Programs/src/stockCustomer.json";
	String mStockPath = "/home/bridgeit/abhishek-workspace/Java Programs/src/StockAccount.json";

	Map<String, String> transaction = new HashMap<String, String>();
	SimpleDateFormat dateFormat = new SimpleDateFormat("hh-mm-ss dd/MM/YYYY");
	Date date = new Date();
	int count = 1;

	public StockAccount() 
	{	}

	/**
	 * StockAccount constructor used to initialize the customer object
	 * @param customer
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	public StockAccount(Customer customer)
	{
		// System.out.println(customer);
		JSONObject name = new JSONObject();
		JSONObject jsonObject = Utility.readFromJsonFile1(mCustomerPath);
		JSONObject jsonObject1 = new JSONObject();

		name.put("Money", customer.getMoney());
		name.put("TotalShare", customer.getTotal_share());
		jsonObject.put(customer.getName(), name);
		Utility.writeJsonObjectToFile2(mCustomerPath, jsonObject);
	}

	/**
	 * buy the share
	 * @param symbol
	 * @param no_of_shares
	 * @param name
	 */
	@SuppressWarnings("unchecked")
	public void buyShare(String symbol, long no_of_shares, String name) 
	{
		JSONObject jsonStock = Utility.readFromJsonFile1(mStockPath);
		JSONObject stockSymbol = (JSONObject) jsonStock.get(symbol);
		long price = (long) stockSymbol.get("Price");
		stockSymbol.put("NumberOfShare", (long) stockSymbol.get("NumberOfShare") - no_of_shares);
		jsonStock.put(symbol, stockSymbol);
		Utility.writeJsonObjectToFile2(mStockPath, jsonStock);
		boolean flag = false;
		JSONObject jsonObject = Utility.readFromJsonFile1(mCustomerPath);
		JSONObject customer = (JSONObject) jsonObject.get(name);
		JSONObject share_value = null;
		if (customer.get("Shares") == null)
		{
			share_value = new JSONObject();
			flag = true;
		} else 
		{
			share_value = (JSONObject) customer.get("Shares");
			flag = false;
		}
		if (flag == true) 
		{
			share_value.put(symbol, no_of_shares);
		} 
		else 
		{
			if (share_value.get(symbol) == null) 
			{
				share_value.put(symbol, no_of_shares);
			} else 
			{
				share_value.put(symbol, (long) share_value.get(symbol) + no_of_shares);
			}
		}
		customer.put("Money", (long) customer.get("Money") - (no_of_shares * price));
		customer.put("TotalShare", (long) customer.get("TotalShare") + no_of_shares);
		customer.put("Shares", share_value);
		jsonObject.put(name, customer);
		Utility.writeJsonObjectToFile2(mCustomerPath, jsonObject);
		transaction.put((count++) + " " + symbol,
				name + " bought " + no_of_shares + " Share at time " + dateFormat.format(date));

	}

	/**
	 * sell the share
	 * @param symbol
	 * @param no_of_shares
	 * @param name
	 */
	@SuppressWarnings("unchecked")
	public void sellShare(String symbol, long no_of_shares, String name)
	{
		JSONObject customerJson = Utility.readFromJsonFile1(mCustomerPath);
		JSONObject stockJson = Utility.readFromJsonFile1(mStockPath);

		JSONObject symbolJson = (JSONObject) stockJson.get(symbol);
		long price = (long) symbolJson.get("Price");
		symbolJson.put("NumberOfShare", (long) symbolJson.get("NumberOfShare") + no_of_shares);
		stockJson.put(symbol, symbolJson);
		Utility.writeJsonObjectToFile2(mStockPath, stockJson);

		JSONObject nameJson = (JSONObject) customerJson.get(name);
		nameJson.put("Money", (long) nameJson.get("Money") + (price * no_of_shares));
		customerJson.put(name, nameJson);

		nameJson.put("TotalShare", (long) nameJson.get("TotalShare") - no_of_shares);
		customerJson.put(name, nameJson);

		JSONObject share = (JSONObject) nameJson.get("Shares");
		share.put(symbol, (long) share.get(symbol) - no_of_shares);

		nameJson.put("Shares", share);
		customerJson.put(name, nameJson);

		Utility.writeJsonObjectToFile2(mCustomerPath, customerJson);

		transaction.put((count++) + " " + symbol,
				name + " sold " + no_of_shares + " Share at time " + dateFormat.format(date));
	}

	/**
	 * add new company
	 * @param symbol
	 * @param noOfShares
	 * @param priceOfEachShare
	 */
	@SuppressWarnings("unchecked")
	public void addNewSymbol(String symbol, long noOfShares, long priceOfEachShare) 
	{
		JSONObject jsonObject = Utility.readFromJsonFile1(mStockPath);
		JSONObject jsonSymbol = new JSONObject();
		jsonSymbol.put("NumberOfShare", noOfShares);
		jsonSymbol.put("Price", priceOfEachShare);
		jsonObject.put(symbol, jsonSymbol);
		Utility.writeJsonObjectToFile2(mStockPath, jsonObject);
	}

	/**remove the company
	 * @param symbol
	 */
	public void removeSymbol(String symbol) 
	{
		JSONObject jsonObject = Utility.readFromJsonFile1(mStockPath);
		jsonObject.remove(symbol);
		Utility.writeJsonObjectToFile2(mStockPath, jsonObject);
	}

	/**
	 * display transactions details
	 */
	public void displayTransactionDetails() 
	{
		Iterator<Map.Entry<String, String>> iterator = transaction.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}
	}

	/**
	 * print the report 
	 */
	public void displayReport() 
	{
		JSONObject jsonStock = Utility.readFromJsonFile1(mStockPath);
		System.out.println(jsonStock.toJSONString());
		JSONObject jsonCustomer = Utility.readFromJsonFile1(mCustomerPath);
		System.out.println(jsonCustomer.toJSONString());
	}
}
