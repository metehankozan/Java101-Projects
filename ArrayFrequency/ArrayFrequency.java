package ArrayFrequency;

public class ArrayFrequency {

    static void printArrayFrequency(int[] arr){
        boolean[] visited = new boolean[arr.length];

        for(int i=0; i<arr.length; i++){

            if(visited[i] == true){
                continue;
            }

            int count = 1;

            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " sayısı " + count + " kere tekrar etti.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        
        printArrayFrequency(arr);
    }
}
