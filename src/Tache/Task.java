package Tache;

import java.util.Date;

public class Task implements TaskInterface{
	int id;
	String titre;
	String description;
	String dateEcheance;
	String priorite;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPriorite(String priorite) {
		this.priorite=priorite;
	}
	public String getPriorite() {
		return priorite;
	}
	public String getDateEcheance() {
		return dateEcheance;
	}
	public void setDateEcheance(String dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	public Task(int id, String titre, String description, String dateEcheance, String priorite) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.dateEcheance = dateEcheance;
		this.priorite=priorite;
	}
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
	public Task[] getTaches() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Voici les informations de la tâche: "+this.id+" "+this.titre+" "+this.description + " "+ this.dateEcheance+ " "+ this.priorite;
	};
	
	
	
	
}
