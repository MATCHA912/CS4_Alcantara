//Ex03_GLU_AlcantaraLS
package Ex03_GLU_AlcantaraLS;

public class singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private song favSong;
    private int viewers;
    private static int totalPerformances;
    
        public singer(String name, song favSong){
            this.name = name;
            this.favSong = favSong;
        }
        public void performForAudience(int viewers, singer newSinger){
            newSinger.noOfPerformances++;
            this.viewers = viewers;
            newSinger.earnings += 100*viewers;
            totalPerformances++;
            System.out.println(newSinger.name + " sang " + newSinger.getFavSong().getTitle() + " by " + favSong.getArtist() + " for "  + getViewers() + " people and has earned " + newSinger.getEarnings());
        }
        public void performForAudience(int v, singer newSinger1, singer newSinger2){
            newSinger1.noOfPerformances++;
            newSinger2.noOfPerformances++;
            totalPerformances++;
            viewers = v;
            newSinger1.earnings = (viewers*100)/2;
            newSinger2.earnings = (viewers*100)/2;
            System.out.println(newSinger2.getName() + " sang " + newSinger2.getFavSong().getTitle() + " with " + newSinger1.getName() + " for "  + getViewers() + " people and they both earned " + newSinger1.getEarnings());
        }
        public void changeFavSong(song newsong, singer newSinger1){
            favSong = newsong;
            System.out.println(newSinger1.getName() + "'s favorite song changed to " + favSong.getTitle() + " by " + favSong.getArtist());
        }
        public String getName(){
            return name;
        }
        public int getNoOfPerformances(){
            return noOfPerformances;
        }
        public static int totalPerformances(){
            return totalPerformances;
        }
        public double getEarnings(){
            return earnings;
        }
        public song getFavSong(){
            return favSong;
        }
        public int getViewers(){
            return viewers;
        }
}
