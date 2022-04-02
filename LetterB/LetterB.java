package LetterB;

public class LetterB {

    static void printB(String[][] letter){
        int firstRow = 0;
        int midRow = (letter.length - 1) / 2;
        int lastRow = letter.length - 1;
        int firstCol = 0;
        int lastCol = letter[0].length - 1;
        
        for(int i=0; i<letter.length; i++){
            for(int j=0; j<letter[i].length; j++){
                if(i==firstRow || i==midRow || i==lastRow){
                    if(j == lastCol){
                        letter[i][j] = "   ";
                        continue;
                    }
                    letter[i][j] = " * ";
                }else if(j==firstCol || j==lastCol){
                    letter[i][j] = " * ";
                }else{
                    letter[i][j] = "   ";
                }
            }
        }

        for(String[] row: letter){
            for(String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] letter = new String[6][4];
        printB(letter);
    }
}
