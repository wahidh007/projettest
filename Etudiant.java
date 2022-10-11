class Etudiant {
  String nom;
  int age;

  Etudiant(String nom) {
   this.nom = nom;
  }

  Etudiant(String nom, int age) {
   this.nom = nom;
   this.age = age;
  }

  public static void main(String[] args) {
    Etudiant e1 = new Etudiant("Salah");
    
    System.out.println("Bonjour " + e1.nom);
  }
}