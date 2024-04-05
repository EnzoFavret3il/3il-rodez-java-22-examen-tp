//Classe principale contenant la méthode main
package MVC;

import Tache.Task;

public class main {
 public static void main(String[] args) {
     Task tache = new Task();
     Vue view = new Vue();
     Control control = new Control(tache, view);
 }
}