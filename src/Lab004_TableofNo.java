import java.util.Scanner;
class Lab004_TableofNo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to get table");
        int number= sc.nextInt();

        for(int i=1; i<=10; i++)
        {
            System.out.println(i*number);
        }
    }
}