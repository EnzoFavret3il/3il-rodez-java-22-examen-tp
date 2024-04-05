package Tache;

import java.util.Date;

public class Task implements TaskInterface{
	int id;
	String titre;
	String description;
	String dateEcheance;
	enum priorite {HAUTE,MOEYENNE,BASSE, AUCUNE}
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
	public String getDateEcheance() {
		return dateEcheance;
	}
	public void setDateEcheance(String dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	public Task(int id, String titre, String description, String dateEcheance) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.dateEcheance = dateEcheance;
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
	};
	
	
	
}
