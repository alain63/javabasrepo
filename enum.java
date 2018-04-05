ExempleCours:

======================
package wetic.javabase.gui;

public class ExemplesCours {

	public enum Semaine {
		Dimanche,
		Lundi,
		Mardi,
		Mercredi,
		Jeudi,
		Vendredi,
		Samdi,
	}
	
	public class Semaine1 {
		public static final int DIMANCHE = 0;
		public static final int LUNDI = 1;
		public static final int MARDI = 2;
		public static final int MERCREDI = 3;
		public static final int JEUDI = 4;
		public static final int VENDREDI = 5;
		public static final int SAMEDI = 6;		
	}
	
	public static void main(String[] args) {
		Semaine j = Semaine.Lundi;
	}
	
}


EnumLangage
==================================
package wetic.javabase.gui;

public class EnumLangage {

	public enum Langage{
		JAVA("Langage java", "Eclipse"), C("Lagage C", "Code Block")
			, CPlus("Lanagae C++", "Visual Studio"), 
			PHP("Langage PHP", "Ps Pad"); 
		private String name = "";
		private String editor = "";
		
		public void getEditor() {
			System.out.println("Editeur: " + editor);;
		}

		public void getname() {
			System.out.println("Name: " + name);;
		}

		Langage(String name, String editor){
			this.name = name;
			this.editor = editor;
		}
	}

	public static void main(String[] args) {
		Langage lang1 = Langage.JAVA;
		Langage lang2 = Langage.PHP;
		lang1.getEditor();
		lang2.getEditor();

	}

}
