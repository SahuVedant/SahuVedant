package com.credentials.serverstate;

/**
 * 
 * @author Vedant.Sahu
 * 
 *         This class contains boolean fields which denote the states of the
 *         corresponding modules.
 *
 */
public class ServerState {
	
	
private static ServerState serverState = new ServerState();
public static ServerState getServerState() {
	return serverState;
}

//Logging Module Flag
private boolean loggingModule;
//Alarm Module Flag
private boolean alarmModule;
//Counter Module Flag
private boolean counterModule;
//Configuration Module Flag
private boolean configurationModule;
//Database Module Flag
private boolean databaseModule;
//Pooling Module Flag
private boolean poolingModule;
//Instrumentation Module Flag
private boolean instrumentationModule;
}
