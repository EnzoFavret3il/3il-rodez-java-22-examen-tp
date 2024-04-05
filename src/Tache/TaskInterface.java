package Tache;

public interface TaskInterface {

	public void ajouterTache(Task tache);
	public void modifierTache(Task tache);
	public void supprimerTache(Task tache);
	public Task[] getTaches();
}
