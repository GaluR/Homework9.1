import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int a = 10;
        int[] array = new int[a];
        Random numbers = new Random();

        for(int i=0; i<array.length; i++){
            array[i]= numbers.nextInt(100);
        }

        for (int i=0; i<(array.length)*2; i++) {
            if (i < array.length){
                System.out.printf("%d ", array[i]);
        }else{
                System.out.printf("%d ", array[(array.length-1)*2-i+1]);
        }
    }
}}
