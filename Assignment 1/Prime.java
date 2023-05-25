import java.util.Scanner;

class Prime{
    static int isPrime(int num){

        int flag = 1;
        if(num <= 1){
            flag = 0;
        }
        else{
            for(int i = 2; i<num;i++){
                if(num%i == 0){
                    flag = 0;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("");

        int ans = isPrime(num);

        if(ans == 1){
            System.out.println("The given number is prime");
        }
        else{
            System.out.println("The given number is not prime");
        }
    }
}