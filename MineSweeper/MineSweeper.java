package MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private final int rowNumber;
    private final int colNumber;
    private final int templateRowNumber;
    private final int templateColNumber;
    private int selectedRow;
    private int selectedCol;
    public final int numberOfEmptyFields;
    private int nearbyBombs;
    private static final int LEFTBOUND = 2;
    private final int rightBound;
    private static final int UPPERBOUND = 2;
    private final int bottomBound;
    private String[][] playground;
    private String[][] playgroundWithBombs;
    private Scanner scanner = new Scanner(System.in);

    public MineSweeper(int rowNumber, int colNumber){
        if(rowNumber<1 || colNumber<1){
            System.out.println("Please initilize the game with valid row and column numbers!");
            System.exit(0);
        }
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.templateRowNumber = rowNumber + 2;
        this.templateColNumber = colNumber + 2;
        this.rightBound = colNumber+1;
        this.bottomBound = rowNumber+1;
        this.playground = makePlayground();
        this.playgroundWithBombs = makePlayground();
        insertBombs();
        this.numberOfEmptyFields = numberOfEmptyFields();
        
    }

    public void run(){
        int count = 0;
        System.out.println("\n==== MINE SWEEPER ====");
        print(this.playground);
        while(count < numberOfEmptyFields){
            takeShot();
            if(isValidEntry(this.selectedRow, this.selectedCol)){
                if(checkBomb()){
                    break;
                }
                countNearbyBombs();
                insertNumberOfNearbyBombs(this.nearbyBombs);      
                if(++count < this.numberOfEmptyFields){
                    print(this.playground);
                    System.out.println("Time for the next guess\n");
                }
            }else{
                System.out.println("\nPlease enter a valid place on the field.\n");
                continue;
            }
        }
        print(playgroundWithBombs);;
        if(count == numberOfEmptyFields){
            System.out.println("Congratulations!! You won it all!");
        }else{
            System.out.println("Game Over! Maybe next time..");
        }
    }

    private String[][] makePlayground(){
        String[][] template = new String[this.templateRowNumber][this.templateColNumber];
        for(int i=0; i<this.templateRowNumber; i++){
            for(int j=0; j<this.templateColNumber; j++){
                if(i<2 && j<2){
                    template[i][j] = "   ";
                }else if(i==0){
                    template[i][j] = Integer.toString(j-1) + "   ";
                }else if(i==1){
                    template[i][j] = "   ";
                }else if(j==0){
                    template[i][j] = Integer.toString(i-1) + " ";
                }else if(j==1){
                    template[i][j] = "  ";
                }else if(j==this.templateColNumber-1){
                    template[i][j] = "| ? |";
                }else{
                    template[i][j] = "| ? ";
                }
            }
        }
        return template;
    }

    private void insertBombs(){
        Random random = new Random();
        int numberOfBombs = this.rowNumber * this.colNumber / 4;
        for(int k=0; k<numberOfBombs; k++){
            int i = random.nextInt(this.rowNumber)+2;
            int j = random.nextInt(this.colNumber)+2;
            if(j == this.templateColNumber-1){
                this.playgroundWithBombs[i][j] = "| * |";
            }else{
                this.playgroundWithBombs[i][j] = "| * ";
            }
        }
    }

    private void insertNumberOfNearbyBombs(int nearbyBombs){
        String stringNearbyBombs = Integer.toString(nearbyBombs);
        final String lastOccr = "| " + stringNearbyBombs + " |";
        final String otherOccr = "| " + stringNearbyBombs + " ";
        if(this.selectedCol == this.templateColNumber-1){
            this.playground[this.selectedRow][this.selectedCol] = lastOccr;
            this.playgroundWithBombs[this.selectedRow][this.selectedCol] = lastOccr;
        }else{
            this.playground[this.selectedRow][this.selectedCol] = otherOccr;
            this.playgroundWithBombs[this.selectedRow][this.selectedCol] = otherOccr;
        }
    }

    private void print(String[][] arr){
        System.out.println();
        for(String[] row: arr){
            for(String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
    }

    private void takeShot(){
        System.out.print("Row choice => ");
        this.selectedRow = scanner.nextInt()+1;
        System.out.print("Column choice => ");
        this.selectedCol = scanner.nextInt()+1;
    }

    private boolean checkBomb(){
        if(this.playgroundWithBombs[this.selectedRow][this.selectedCol].contains("*")){
            return true;
        }
        return false;
    }

    private int numberOfEmptyFields(){
        int count = 0;
        for(String[] row : this.playgroundWithBombs){
            for(String col : row){
                if(col.startsWith("|") && !col.contains("*")){
                    count++;
                }
            }
        }
        return count;
    }

    private void countNearbyBombs(){
        int count = 0;
        int startingRow = this.selectedRow - 1;
        int startingCol = this.selectedCol - 1;

        for(int i=startingRow; i<startingRow+3; i++){
            for(int j=startingCol; j<startingCol+3; j++){
                if(!isValidEntry(i, j)){
                    continue;
                }
                if(this.playgroundWithBombs[i][j].contains("*")){
                    count++;
                }
            }
        }
        this.nearbyBombs = count;
    }

    private boolean isValidEntry(int row, int col){
        if(row<UPPERBOUND || row>bottomBound || col<LEFTBOUND || col>rightBound || hasChosen()){
            return false;
        }
        return true;
    }

    private boolean hasChosen(){
        if(this.playgroundWithBombs[this.selectedRow][this.selectedCol].contains("?") ||
           this.playgroundWithBombs[this.selectedRow][this.selectedCol].contains("*")){
               return false;
           }
        return true;
    }
}
