package com.credloc.startup;

/**
 * 
 * @author Vedant.Sahu
 * 
 * This class is a bootstrapper class for credLoc
 *
 */
@SuppressWarnings("unused")
public class CredLocBootStrapper {
public static CredLocBootStrapper credLocBootstrapper = new CredLocBootStrapper();

	public static CredLocBootStrapper getCredLocBootstrapper() {
	return credLocBootstrapper;
	}

	/**
	 * @implNote Entry Point of the project
	 * @param args
	 */
	public static void main(String[] args) {
		credLocBootstrapper.InitializeSystem();
	}
	
	private void InitializeSystem()
	{
		
	}
}
