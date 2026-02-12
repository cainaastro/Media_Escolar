package util;

public class subjects {
	
	public static String[] list = {"Português", "Matemática", "Química", "Física", "Biologia", 
								   "Geografia", "História", "Filosofia", "Sociologia", "Inglês"};
	
	
	public static String getSubject( int resp ) {
		return list[resp - 1];
	}
	
}
