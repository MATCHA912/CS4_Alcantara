package Exercise02;

public class Exercise02 {
    public static void main(String[] args) {
        genshin childe = new genshin("Tartaglia", "Snezhnaya", true);
        genshin lyney = new genshin("Lyney", "Fontaine", true);
        genshin hutao = new genshin("Hu Tao", "Liyue", false);
        
        song song1 = new song("Africa", "TOTO");
        song song2 = new song("Fireflies", "Owl City");
                
        singer singer1 = new singer(childe.getName(), song1);
        
        singer1.performForAudience(12, singer1);
        
        singer1.changeFavSong(song2, singer1);
        
        
    }
}
