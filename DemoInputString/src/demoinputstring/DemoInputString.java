package demoinputstring;
import java.io.*;
class DemoInputString {
    public static void main(String[] args) throws IOException {
        System.out.println("Maukkan nama anda: ");
        String nama;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        nama = br.readLine();
        System.out.println("Halo " + nama +", sudahkah Anda mengerti Java?");
    }
    
}
