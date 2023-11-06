//Ex03_GLU_AlcantaraLS
package Ex03_GLU_AlcantaraLS;

public class genshin {
    
    private String name;
    private String region;
    private boolean isMale;
        
        public genshin(String name, String region, boolean isMale){
            this.name = name;
            this.region = region;
            this.isMale = isMale;
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
