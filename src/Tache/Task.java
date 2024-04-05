package Tache;

import java.util.Date;

public class Task implements TaskInterface{
	int id;
	String titre;
	String description;
	String dateEcheance;
	String priorite;
	//getter
	public int getId() {
		return id;
	}
	//setter
	public void setId(int id) {
		this.id = id;
	}
	//getter
	public String getTitre() {
		return titre;
	}
	//setter
	public void setTitre(String titre) {
		this.titre = titre;
	}
	//getter
	public String getDescription() {
		return description;
	}
	//setter
	public void setDescription(String description) {
		this.description = description;
	}
	//setter
	public void setPriorite(String priorite) {
		this.priorite=priorite;
	}
	//getter
	public String getPriorite() {
		return priorite;
	}
	//getter
	public String getDateEcheance() {
		return dateEcheance;
	}
	//setter
	public void setDateEcheance(String dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	//Constructeur réel d'une tache
	public Task(int id, String titre, String description, String dateEcheance, String priorite) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.dateEcheance = dateEcheance;
		this.priorite=priorite;
	}
	//Getter basique => utilise seulement ici pour montrer le fonctionnement du MVC
	public Task() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void ajouterTache(Task tache) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void modifierTache(Task tache) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void supprimerTache(Task tache) {
		// TODO Auto-generated method stub
		
	}
	@Override
	/**Renvoie les taches enregistrer sous forme de liste => pas implémenté*/
	public Task[] getTaches() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	/**Renvoie les informations d'une tache sous la forme d'un chaine de caractère*/
	public String toString() {
		// TODO Auto-generated method stub
		return "Voici les informations de la tâche: "+this.id+" "+this.titre+" "+this.description + " "+ this.dateEcheance+ " "+ this.priorite;
	};
	
	
	
	
}
