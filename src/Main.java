import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int check = 0, count =0 , selection, balance = 2000, amount;
        String username,password;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Kullanıcı adınız :");
            username = input.nextLine();
            input.nextLine();
            System.out.print("Şifreniz :");
            password = input.nextLine();
            if (username.equals("patika") && password.equals("dev123")) {
                System.out.print("Hesabınıza giriş yaptınız!\n"
                        + "İşlem seçiniz :\n"
                        + "1-Para yatırma\n"
                        + "2-Para çekme\n"
                        + "3-Bakiye sorgulama\n"
                        + "4-Çıkış yap\n");
                selection = input.nextInt();

                switch (selection) {
                    case 1:
                        System.out.print("Yatıracağınız tutarı giriniz :");
                        amount = input.nextInt();
                        balance += amount;
                        System.out.print("Yeni bakiyeniz :" + balance);
                        check = 3;
                        break;
                    case 2:
                        System.out.print("Çekeceğiniz tutarı giriniz :");
                        amount = input.nextInt();
                        if (balance < amount) {
                            System.out.println("Bakiye yetersiz!");
                        } else {
                            balance -= amount;
                            System.out.println("Yeni bakiyeniz :" + balance);
                        }
                        check = 3;
                        break;
                    case 3:
                        System.out.print("Bakiyeniz :" + balance);
                        check = 3;
                        break;
                    case 4:
                        System.out.print("Çıkış yapılıyor...");
                        check = 3;
                        break;
                    default:
                        System.out.println("yanlış giriş yaptınız");
                        check = 3;

                }
            } else {
                if (count == 2) {
                    break;
                }else{
                    System.out.println("Tekrar deneyiniz.");
                    count++;
                }

            } check++;
        } while (check < 3);

        if(count==2){
            System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
        }else {
            System.out.println("Çıkış yaptınız");
        }


    }
}