//Classe principale contenant la méthode main
package MVC;

import Tache.Task;

public class main {
 public static void main(String[] args) {
     Task tache = new Task();
     UtilisateurInterface view = new UtilisateurInterface();
     Controller control = new Controller(tache, view);
 }
}