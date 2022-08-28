import  java.util.Scanner;

public class WorkersSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int work1 = scan.nextInt();
        int work2 = scan.nextInt();
        int work3 = scan.nextInt();

        if (work1 > work2) {
            int a = work1 - work2;
            System.out.println(a);
        } else if (work3 > work1) {
            int b = work3 - work1;
            System.out.println(b);
        } else if (work1 > work2) {
            int c = work1 - work2;
            System.out.println(c);
        } else if (work3 > work2) {
            int d = work3 - work2;
            System.out.println(d);
        } else if (work1 > work3) {
            int e = work1 - work3;
            System.out.println(e);
        } else if (work2 > work3) {
            int f = work2 - work3;
            System.out.println(f);
        }
    }
}
