package rectangle;

/**
 *
 * @author dmr
 */
public class Main {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Rectangle rectangle1 = new Rectangle(5, 4);
        
        System.out.println("\nLongueur rectangle1 : " + rectangle1.getLongueur());
        System.out.println("Largeur rectangle1 : " + rectangle1.getLargeur());
        System.out.println("Nb rectangle : " + Rectangle.getNbRectangle() + "\n");
        
        Rectangle rectangle2 = new Rectangle();
        
        System.out.println("\nLongueur rectangle2 : " + rectangle2.getLongueur());
        System.out.println("Largeur rectangle2 : " + rectangle2.getLargeur());
        System.out.println("Nb rectangle : " + Rectangle.getNbRectangle());
        
        rectangle1.setLongueur(36);
        
        System.out.println("\nLongueur rectangle1 : " + rectangle1.getLongueur());
        
        System.out.println("Surface rectangle1 : " + rectangle1.getSurface());
        System.out.println("Périmètre rectangle1 : " + rectangle1.getPerimetre());
        
        rectangle1.setLongueur(5);
        
        System.out.println("\nSurface rectangle1 après modif : " + rectangle1.getSurface());
        System.out.println("Périmètre rectangle1 après modif : "  + rectangle1.getPerimetre());
        
        System.out.println("Nb rectangle : " + Rectangle.getNbRectangle());
    }
}