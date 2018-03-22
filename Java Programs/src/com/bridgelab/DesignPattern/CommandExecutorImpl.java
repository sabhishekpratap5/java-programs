/******************************************************************************
 *  Purpose: this program is refer for command executer Implementation.
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.DesignPattern;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor{

	public void runCommand(String cmd) throws IOException {
		
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}

}
