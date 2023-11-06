package Ex04_GLU_AlcantaraLS;

public class Move {
    private final String name;
    private Move strongAgainst;
    private Move strongAgainst2;
    
    public Move(String name){
        this.name = name;
        this.strongAgainst = null;
    }
	public String getName(){
		return this.name;
	}
	public Move getStrongAgainst(){
		return this.strongAgainst;
	}
	public Move getStrongAgainst2(){
		return this.strongAgainst2;
	}
	public void setStrongAgainst(Move strongAgainst){
		if(this.strongAgainst == null){
                    this.strongAgainst = strongAgainst;
                }else{
                    this.strongAgainst2 = strongAgainst;
                }
	}
        public static int compareMoves(Move m1, Move m2){
		// This method returns 0 if m1 wins, 1 if m2 wins, and 2 if neither wins
		if(m1.getStrongAgainst() ==  m2 || m1.getStrongAgainst2() == m2) return 0;
		else if (m2.getStrongAgainst() == m1 || m2.getStrongAgainst2() == m1) return 1;
		else return 2;
	}
}
