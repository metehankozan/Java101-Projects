package Java_ATMProject;
import java.util.Scanner;

public class ATM {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500;
        int choice;
        while(right > 0){
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();

            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if(userName.equals("patika")  && password.equals("dev123")){
                System.out.println("Giriş yapılıyor..");
                do{
                    System.out.println("Lütfen işlem seçiniz: ");
                    System.out.println("1 - Para Yatırma\n" +
                                        "2 - Para Çekme\n" +
                                        "3 - Bakiye Sorgulama\n" +
                                        "4 - Çıkış");
                    choice = input.nextInt();

                    switch(choice){
                        case 1:
                        System.out.print("Para miktarı: ");
                        int amount = input.nextInt();
                        balance += amount;
                        System.out.println("Yeni bakiyeniz: "+balance);
                        break;

                        case 2:
                        System.out.print("Para miktarı: ");
                        amount = input.nextInt();
                        if(amount > balance){
                            System.out.println("Yetersiz bakiye!");
                        }
                        else{
                            balance -= amount;
                            System.out.println("Kalan bakiyeniz: "+balance);
                        }
                        break;

                        case 3:
                        System.out.println("Bakiyeniz: "+balance);
                        break;

                        case 4:
                        break;

                        default:
                        System.out.println("Geçersiz işlem!");                  

                    }
                    if(choice != 4){
                        System.out.println("Ana menüye dönülüyor..\n");
                    }
                    
                }while(choice != 4);
                System.out.println("Çıkış Yapılıyor..");
                break;
            }
            else{
                --right;
                if(right == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankanız ile iletişime geçiniz.");
                }
                else{
                    System.out.println("Kullanıcı bilgileri hatalı! Lütfen tekrar deneyiniz.");
                    System.out.println(right+" hakkınız kaldı!");
                }
            }

            
        }
        
        input.close();
        
    }
}
