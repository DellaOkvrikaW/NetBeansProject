package demoinputnumberik2;
import java.io.*;
public class DemoInputNumberik2 {
    public static void main(String[] args) throws IOException {
        
        System.out.println("Masukkan sebuah bilagan riil");
        
        String temp;
        double bilangan = 0;
        
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        // input data dianggap saebagai string
        temp = br.readLine();
        try{
            // konversi dari string ke floating-point
            bilangan = Double.parseDouble(temp);
        } catch (NumberFormatException nfe) {
            System.out.println("Data yang dimasukkan bukan bilangan");
            System.exit(1);
        }
        System.out.println("Bbilangan yang dimasukkan " +"adalah " + bilangan);
    }  
}
