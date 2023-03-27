import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int limit,smallNumber,bigNumber,number;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kaç Sayı Gireceksiniz: ");
        limit = inp.nextInt();

        System.out.println("1. sayıyı giriniz");
        number= inp.nextInt();
        smallNumber=number;
        bigNumber=number;

        for (int i =1 ;i < limit ;i++ ){
            System.out.println(i+1 + ". sayıyı giriniz");
            number= inp.nextInt();

            if(number < smallNumber){
                smallNumber=number;
            }else if (number > bigNumber){
                bigNumber=number;
            }

        }
        System.out.println("En büyük sayı : "+ bigNumber);
        System.out.println("En küçük sayı : " + smallNumber);
    }
}