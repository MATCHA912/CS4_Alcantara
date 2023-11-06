package Ex04_GLU_AlcantaraLS;

import static Ex04_GLU_AlcantaraLS.Move.compareMoves;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise04{
    public static void main(String[] args) throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        int playerScore = 0;
        int botScore = 0;
        int winsNeeded = 2;
        boolean leave = false;
        
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");
	Move lizard = new Move("Lizard");
	Move spock = new Move("Spock");
        
		
	scissors.setStrongAgainst(paper);
	paper.setStrongAgainst(rock);
	rock.setStrongAgainst(lizard);
	lizard.setStrongAgainst(spock);
	spock.setStrongAgainst(scissors);
	scissors.setStrongAgainst(lizard);
	lizard.setStrongAgainst(paper);
	paper.setStrongAgainst(spock);
	spock.setStrongAgainst(rock);
	rock.setStrongAgainst(scissors);

        while (leave == false) {
            
            System.out.println("\nWelcome to Rock, Paper, Scissors, Lizard, Spock. Please choose an option:");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");
        
            String choice = reader.readLine();
               
            switch(choice){
                case "1":
                    System.out.print("\nThis match will be first to " + winsNeeded + " wins.");

                    for(int i = 0; i < (winsNeeded*2-1); i++){
                        Move[] moves = {rock, paper, scissors, lizard, spock};
                        
                        int botChoice = (int)(Math.random() * 5) + 1;
                        Move botMove = moves[botChoice - 1];
                        
                        System.out.print("\nThe computer has selected its move. Select your move:" + "\n1. Rock" + "\n2. Paper" + "\n3. Scissors\n4. Lizard\n5. Spock\n");

                        String playerChoice = reader.readLine();
                        
                        if (playerChoice.equals("1") || playerChoice.equals("2") || playerChoice.equals("3") || playerChoice.equals("4") || playerChoice.equals("5")) {
                            Move playerMove = moves[Integer.parseInt(playerChoice)- 1];
                            
                            int win = compareMoves(playerMove, botMove);
                            
                            switch (win){
                                case 0:
                                    System.out.printf("%nPlayer chose %s. Computer chose %s. Player wins round!", playerMove.getName(), botMove.getName());
                                    playerScore++; 
                                    break;
                                case 1:
                                    System.out.printf("%nPlayer chose %s. Computer chose %s. Computer wins round!", playerMove.getName(), botMove.getName());
                                    botScore++;
                                    break;
                                case 2:
                                    System.out.printf("%nPlayer chose %s. Computer chose %s. Round is tied!", playerMove.getName(), botMove.getName());
                                    i--;
                                    break; 
                            }
                                    
                            System.out.printf("%n Player: %d - Computer: %d%n", playerScore, botScore);
                            if(playerScore == winsNeeded){
                                System.out.println("\nPlayer Wins!");
                                break;
                            }else if(botScore == winsNeeded){
                                System.out.println("\nComputer wins!");
                                break;
                            }
                        } else {
                            System.out.println("Invalid move. Please choose 1, 2, or 3.");
                            i--;
                        }
                    }
                    
                    botScore = 0;
                    playerScore = 0;
                    break;
                case "2":
                    System.out.println("\nHow many wins are needed to win a match?");
                    winsNeeded = Integer.parseInt(reader.readLine());
                    System.out.println("\nNew Setting has been saved!");
                    break;
                case "3":
                    System.out.println("\nThank you for playing!");
                    leave = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
                    break;
            }
        }
    }
}
