package funcionbinaria;
import java.util.Random;
public class FuncionBinaria1 {
    static int size = 10000000;
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[size];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Random().nextInt(100);
        }
        funcionBinaria(vector);
    } 
    public static void funcionBinaria(int[] vector) {
        for (int i = 0; i < size; i++) {
            int index = -1;
            for (int j = 0; j < vector.length; j++) {
                if (vector[j] == 80) {
                    index = j;
                }
            }
        }
    }
}
