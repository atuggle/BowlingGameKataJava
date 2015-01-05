
public class Game {

    private int currentRoll = 0;
    private int[] rolls = new int[21];
     
    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }
    
    public int score(){
        
        int score = 0;
        int currentIndx = 0;
        
        for (int frame=0; frame<10; frame++) {
            
            if (rolls[currentIndx] == 10) {
                score += 10 + rolls[currentIndx + 1] + rolls[currentIndx + 2];
                currentIndx += 1;
            } else if (rolls[currentIndx] + rolls[currentIndx + 1] == 10) {
                score += 10 + rolls[currentIndx + 2];
                currentIndx += 2;
            } else {
                score += rolls[currentIndx] + rolls[currentIndx + 1];                
                currentIndx += 2;
            }
        }
        
        return score;
    }
}
