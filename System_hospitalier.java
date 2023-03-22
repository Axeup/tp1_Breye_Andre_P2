package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		// Analyser la requête, ceci est une classe qui permet de renvoyer un string "requête analysée" lorsque le système reçcoit une demande d'analyse de requête
		return "requête analysée";
	}
	
	private String comparerDonnes() {
		// Comparaison des données, ceci est une classe qui permet de renvoyer un string "Cluster trouvé" lorsque le système effectue une comparaison de données
		return "Cluster trouvé";
	}

}
