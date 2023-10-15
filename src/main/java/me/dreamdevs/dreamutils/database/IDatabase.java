package me.dreamdevs.dreamutils.database;

/**
 * This interface is used to create connection,
 * loading and saving data in different type of database.
 */

public interface IDatabase {

	/**
	 * This method allows you to create connection.
	 */

	void connect();

	/**
	 * This method is used to disconnect connection.
	 */

	void disconnect();

	/**
	 * This is method which is used to loading data from database,
	 * this should be use after saving data and from the server start.
	 */

	void loadData();

	/**
	 * This method saves all data.
	 */

	void saveData();

}