/******************************************************************************
 *  Purpose: Command Executer is use for run the command.
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.DesignPattern;

public interface CommandExecutor {
	
	public void runCommand(String cmd) throws Exception;

}
