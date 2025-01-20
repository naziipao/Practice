import java.util.Scanner;
public class Tester {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of query:");
        int t=in.nextInt();
        int [][] arr1 = new int[t][3];

        for(int i=0;i<t;i++){
            System.out.println("Enter the value of a:");
            int a = in.nextInt();
            System.out.println("Enter the value of b:");
            int b = in.nextInt();
            System.out.println("Enter the value of n:");
            int n = in.nextInt();

            arr1[i][0] = a;
            arr1[i][1] = b;
            arr1[i][2] = n;
        }

        int num = 0;
        for(int i = 0; i <t ; i++) {
            //Calculating each query
            System.out.print("Query " + (i+1) + ":      ");
            for (int j = 0; j<arr1[i][2];j++) {
                num = num + (int) Math.pow(2, j);
                System.out.print((arr1[i][0]+num * arr1[i][1])+"      ");
            }

            System.out.println();
            num = 0;   //Resetting the value of num for next query
        }
    }
}