package RecursiveDesign;

public class RecursiveDesign {
    public static void recDesign(int n){
        if(n <= 0){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        recDesign(n-5);
        System.out.print(n+" ");
        
    }
    public static void main(String[] args) {
        recDesign(16);
    }
}
