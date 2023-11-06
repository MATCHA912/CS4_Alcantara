//Ex03_GLU_AlcantaraLS
package Ex03_GLU_AlcantaraLS;

public class Ex03_GLU_AlcantaraLS {
    public static void main(String[] args) {
        genshin childe = new genshin("Tartaglia", "Snezhnaya", true);
        genshin lyney = new genshin("Lyney", "Fontaine", true);
        genshin hutao = new genshin("Hu Tao", "Liyue", false);
        
        song song1 = new song("Africa", "TOTO");
        song song2 = new song("Fireflies", "Owl City");
                
        singer singer1 = new singer(childe.getName(), song1);
        singer singer2 = new singer(lyney.getName(), song2);
        
        singer1.performForAudience(12, singer1, singer2);
        singer1.performForAudience(12, singer1);
     
        System.out.println(singer1.getName() + " played a total of " + singer1.getNoOfPerformances() + " performances and earned a total of " + singer1.getEarnings() + ".");
        System.out.println(singer2.getName() + " played a total of " + singer2.getNoOfPerformances() + " performances and earned a total of " + singer2.getEarnings() + ".");
        System.out.println(" total performances: " + singer.totalPerformances());
    }
}
