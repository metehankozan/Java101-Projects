package EvenDublicates;

public class EvenDublicates {

    static boolean isPresent(int[] dublicates, int elem){
        for(int value: dublicates){
            if(value==elem){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,4,6,6,7,8,3,2,4};
        int[] dublicates = new int[arr.length];
        int index = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]%2==0 && arr[i]==arr[j] && !isPresent(dublicates, arr[i])){
                    dublicates[index++] = arr[i];
                }
            }
        }

        for(int value: dublicates){
            if(value != 0){
                System.out.print(value + " ");
            }else{
                break;
            }
        }

    }
}
