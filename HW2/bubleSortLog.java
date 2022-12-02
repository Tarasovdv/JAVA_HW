package HW2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class bubleSortLog {
    public static void main(String[] args) throws IOException {
        FileWriter filelog = new FileWriter("bubleSort.log", true);
        int [] mas = {11, 3, 14, 16, 7};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                    //System.out.println(Arrays.toString(mas));
                    filelog.append("\n" + Arrays.toString(mas));
                }
            }
        }
        //System.out.println(Arrays.toString(mas));
        filelog.close();
    }
    
}
