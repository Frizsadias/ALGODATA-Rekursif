import java.util.Scanner;
import java.util.InputMismatchException;

public class Tugas_Rekursif {

private static void perpangkatan(){
    int angka,pangkat,hasil;
    Scanner a=new Scanner(System.in);
    System.out.println("=== PANGKAT BILANGAN == ");
    
    System.out.print("Masukkan Angka : ");
    angka=a.nextInt();
    System.out.print("Masukkan Pangkat :");
    Scanner b=new Scanner(System.in);
    pangkat=b.nextInt();
    
    hasil=(int) Math.pow(angka, pangkat);
    System.out.println("Hasil "+angka+" pangkat "+pangkat+" = "+hasil);
    
}
    private static void fibonaci(){
    System.out.println("=== DERET FIBONACCI == ");
    System.out.println("Masukkan Jumlah Deret Fibonacci : ");
    Scanner c= new Scanner(System.in);
    int n=c.nextInt();
    long fib[]=new long[n];
    
    fib[0]=0;
    fib[1]=1;
    
            for (int i = 2; i < n; i++) {
                fib[i]=fib[i-1]+fib[i-2];
            }
            
            for (int i = 0; i <n ; i++) {
                System.out.print(fib[i]+" ");
            }
}
    private static void ganjil(){
    System.out.println("=== DERET BILANGAN GANJIL 1-100 == ");
            for (int i = 1; i <= 100; i+=2) {
                System.out.print(i);
                System.out.print(",");
            }
}
    private static void nama(){
    System.out.println("=== CETAK NAMA == ");
            for (int i = 1; i <= 100; i++) {
                System.out.println("Frizsa Dias Puspitasari");
                
            }
}
    private static void Keluar() {
    String quitss = "y";
    System.out.print("Keluar dari Program? (Y/T): ");
    quitss = new Scanner(System.in).nextLine();
    if(quitss.equalsIgnoreCase("y")) {
        System.exit(0);
    }
    else {
        menuProgram();
    }
}

private static void menuChooser(int choosenMenu) {
    switch(choosenMenu) {
            case 1:
                perpangkatan();
                break;
            case 2:
                fibonaci();
                break;
            case 3:
                ganjil();
                break;
            case 4:
                nama();
                break;
            case 5:
                Keluar();
                break;
    }
    menuProgram();
}

private static void menuProgram() {
    int data = 0;
    int choosenMenu = 0;
    while(data == 0) {
        System.out.println(" ");
        System.out.println("===== MENU =====");
        System.out.println("1. Bilangan Pangkat");
        System.out.println("2. Deret Fibonnaci");
        System.out.println("3. Angka Ganjil 1-100");
        System.out.println("4. Cetak Nama");
        System.out.println("5. Keluar");
        System.out.print("Masukkan Nomor Menu [1-5] : ");
        Scanner menuOption = new Scanner(System.in);
        try {
            choosenMenu = menuOption.nextInt();
            data = 1;
        }catch(InputMismatchException e) {
            
        }
    }
    System.out.println("");
    menuChooser(choosenMenu);
}

public static void main(String[] args) {
    menuProgram();
}
}
