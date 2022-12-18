import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        int min=1,max=0,n,temp;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane Sayı Gireceksiniz : ");
        n = input.nextInt();

        for (int i=1;i<=n;i++){
            System.out.print(i+".Sayıyı Giriniz: ");
            temp =input.nextInt();

            if (temp>0){
                if (temp>max){
                    max=temp;
                }else if (min==0 && temp<max) {
                    min=temp;
            } else if (min!=0 && temp < min) {
                    min=temp;
                }
            }else if (temp<0){
                if (temp>min && max==0){
                    max=temp;
                } else if (temp>min && max!=0 && temp >max) {
                    max=temp;
                } else if (temp<min) {
                min=temp;
            }
            }
        }
        System.out.println("En Büyük Sayı : "+max);
        System.out.print("En Küçük Sayı : "+min);
    }
}
