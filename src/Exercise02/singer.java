package Exercise02;

public class singer {
    private String name;
    private static int noOfPerformances;
    private double earnings;
    private song favSong;
    private int viewers;
    
        public singer(String n, song newSong){
            name = n;
            favSong = newSong;
        }
        public void performForAudience(int v, singer newSinger){
            noOfPerformances++;
            viewers = v;
            earnings += 100*viewers;
            System.out.println(newSinger.name + " sang " + newSinger.getFavSong().getTitle() + " by " + favSong.getArtist() + " for "  + getViewers() + " people and has earned " + newSinger.getEarnings());
        }
        public void performForAudience(int v, singer newSinger1, singer newSinger2){
            noOfPerformances++;
            viewers = v;
            newSinger1.earnings = (viewers*100)/2;
            newSinger2.earnings = (viewers*100)/2;
        }
        public void changeFavSong(song newsong, singer newSinger1){
            favSong = newsong;
            System.out.println(newSinger1.getName() + "'s favorite song changed to " + favSong.getTitle() + " by " + favSong.getArtist());
        }
        public String getName(){
            return name;
        }
        public static int getNoOfPerformances(){
            return noOfPerformances;
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
