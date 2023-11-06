package exercise01;

public class Exercise01 {

    public static void main(String[] args) {
        
        character character1 = new character("Lyney", false, 40);
        character character2 = new character("Songonomiya Kokomi", true, 69);
        character character3 = new character("Kaedehara Kazuha", true, 15);
        
        System.out.println("Character name: " + character1.name + "\nGuaranteed 5-star?: " + character1.guaranteed + "\nPity: " + character1.pity);
        System.out.println("\nCharacter name: " + character2.name + "\nGuaranteed 5-star?: " + character2.guaranteed + "\nPity: " + character2.pity);
        System.out.println("\nCharacter name: " + character3.name + "\nGuaranteed 5-star?: " + character3.guaranteed + "\nPity: " + character3.pity);
        
        System.out.println("The characters are: " + character1.name + ", " + character2.name + ", and " + character3.name);
        System.out.println("Total number of pulls: " + (character1.pity+character2.pity+character3.pity));
        System.out.println("Was Lyney and Kazuha both Guaranteed? " + (character1.guaranteed&&character3.guaranteed));
        System.out.println("Does Lyney have less pity than Kokomi? " + (character1.pity<character2.pity));
    }
    
}
