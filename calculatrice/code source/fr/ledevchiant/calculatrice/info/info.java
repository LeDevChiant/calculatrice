package fr.ledevchiant.calculatrice.info;

//class qui permet les infos annexes//

public class info {
	private static String author = new String();
	private static boolean guiuse;
	private static float version;
	private static String description = new String();
	
	@SuppressWarnings("unused")
	public static void init() {
		
		setAuthor("D4rkSasuke");
		boolean gui = false;
		setVersion((float) 0.4);
		setDescription("Application calculatrice basique développer en java.");
		getAuthor();
		getVersion(version, guiuse);
		remerciement();
		System.out.println(getDescription());
	}
	
	final private static void author(String author) {
		System.out.println("Auteur du programme : " + author + ".");
		
	}
	
	final private static void version(float version2, boolean gui) {
		if(gui==false) {
			System.out.println("Version du programme : " + version2 + "(NO GUI VERSION).");
		}
		else {
			System.out.println("Version du programme : " + version2);
		}
		
	}
	
	final public static void remerciement() {
		String remerciement[] = {"Mary", "Gaynael"};
		System.out.println("Remerciement a :");
		for(int i = 0; i < remerciement.length; i++) {
			System.out.println("    -" + remerciement[i]);
		}
	}
	
	@SuppressWarnings("unused")
	final private void description(String description) {
		System.out.println(description);
	}

	public static void getAuthor() {
		author(author);
	}

	public static void setAuthor(String author1) {
		author = author1;
	}

	public static void getVersion(float version2, boolean gui) {
		
		version(version2, gui);
	}

	public static void setVersion(float version2) {
		version = version2;
	}

	public static String getDescription() {
		return description;
	}

	public static void setDescription(String description1) {
		description = description1;
	}

}
