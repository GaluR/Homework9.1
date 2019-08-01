import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int a = 5;
        int[] array = new int[a];
        Random numbers = new Random();

        for(int i=0; i<array.length; i++){
            array[i]= numbers.nextInt();
        }

        for (int i=0; i<array.length; i++){
            System.out.printf("%d ", array[i]);
            System.out.printf("%d ", Array.reverseArray(i,array));
        }
    }
    static int reverseArray(int i, int [] b){
        return b[b.length-i-1];
    }
}
