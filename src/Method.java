import java.util.Scanner;

public class Method {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void parityCheck(int number){
        if (number%2==0){
            System.out.println("is an even number");
        }else {
            System.out.println("is the odd number");
        }
    }
    public static void checkSquareNumber(int number){
        if (Math.sqrt(number)%1==0){
            System.out.println("is the square number");
        }else {
            System.out.println("is not the square number");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        do {
            System.out.println("----------------");
            System.out.println("1. Kiểm tra số nguyên tố");
            System.out.println("2. Kiểm tra số chẵn lẻ");
            System.out.println("3. Kiểm tra số chính phương");
            System.out.println("4. Thoát chương trình");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("nhập số");
                    int a = Integer.parseInt(sc.nextLine());
                    if (isPrime(a)){
                        System.out.println("là snt");
                    }else {
                        System.out.println("ko là snt");
                    }
                    break;
                case 2:
                    System.out.println("nhập số");
                    int a1 = Integer.parseInt(sc.nextLine());
                    parityCheck(a1);
                    break;
                case 3:
                    System.out.println("nhập số");
                    int a2=Integer.parseInt(sc.nextLine());
                    checkSquareNumber(a2);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while (true);

    }
}
