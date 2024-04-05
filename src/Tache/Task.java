package Tache;

import java.util.Date;

public class Task {
	int id;
	String titre;
	String description;
	Date dateEcheance;
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
	public Date getDateEcheance() {
		return dateEcheance;
	}
	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	public Task(int id, String titre, String description, Date dateEcheance) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.dateEcheance = dateEcheance;
	};
	
	
	
}
