package rectangle;

/**
 *
 * @author dmr
 */
public class Rectangle {
    
    private int longueur;
    private int largeur;
    private static int count = 0;
   
    // Constructeur par défaut
    public Rectangle() {
        System.out.println("Création du rectangle par défaut");
        longueur = 2;
        largeur = 1;
        count++;
    }
    
    // Constructeur avec paramètres
    public Rectangle(int longueur, int largeur) {
        System.out.println("Création du rectangle");
        this.longueur = longueur;
        this.largeur = largeur;
        count++;
    }
    
    public int getLongueur() {
        return longueur;
    }
    
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
    
    public int getSurface() {
        return longueur * largeur;
    }
    
    public int getPerimetre() {
        return (longueur + largeur) * 2;
    }
    
    public static int getNbRectangle() {
        return count;
    }
    
}
