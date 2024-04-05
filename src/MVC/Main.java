//Classe principale contenant la méthode main
package MVC;



public class Main {
 public static void main(String[] args) {
     Model model = new Model();
     Vue view = new Vue();
     Control control = new Control(model, view);
 }
}