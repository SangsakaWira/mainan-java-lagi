import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = scanner.nextInt();
        for(int i = 0;i <=jumlahBaris;i++){
            for(int j = 0;j<=jumlahBaris;j++){
                System.out.print("*"); 
            } 
            System.out.println(""); 
        }
        scanner.close();
    }
}