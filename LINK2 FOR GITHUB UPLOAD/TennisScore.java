import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TennisScore {
    public static void main(String[] args) {
        try {
            File file1 = new File("scores.csv");
            FileReader file2 = new FileReader(file1);
            BufferedReader buffer = new BufferedReader(file2);         
            String lineA = buffer.readLine(); // read the first line for Player A
            String lineB = buffer.readLine(); // read the second line for Player B
            buffer.close();
            
            String[] scoresA = lineA.split(","); // split the scores for Player A
            String[] scoresB = lineB.split(","); // split the scores for Player B
            
            int countA = 0; // count the total number of games won by Player A
            int countB = 0; // count the total number of games won by Player B
            
            for (int i = 0; i < scoresA.length; i++) {
                if (Integer.parseInt(scoresA[i]) > Integer.parseInt(scoresB[i])) {
                    countA++;
                } else {
                    countB++;
                }
            }
            
            if (countA > countB) {
                System.out.println("Winner is: Player-A");
            } else {
                System.out.println("Winner is: Player-B");
            }
        } catch (Exception e) {
            System.out.println("An error occurred" + e.getMessage());;
        }
    }
}
