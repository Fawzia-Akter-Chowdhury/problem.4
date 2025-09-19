import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int N1, N2, N3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number:");
        N1=sc.nextInt();

        System.out.print("Enter 2nd Number:");
        N2=sc.nextInt();

        System.out.print("Enter 3rd Number:");
        N3=sc.nextInt();

        if(N1 >= N2 && N1 >= N3)
            System.out.println("Number 1 is Maximum");
        else if(N2 >= N1 && N2 >= N3 )
            System.out.println("The number 2 is Maximum");
        else
            System.out.println("The number 3 is Maximum");

    }
}