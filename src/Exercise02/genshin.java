package Exercise02;

public class genshin {
    
    private String name;
    private String region;
    private boolean isMale;
        
        public genshin(String n, String r, boolean i){
            name = n;
            region = r;
            isMale = i;
        }
        public String getName(){
            return name;
        }
        public String getRegion(){
            return region;
        }
        public boolean getIsMale(){
            return isMale;
        }
}
