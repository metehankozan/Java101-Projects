package JavaSignIn;
import java.util.Scanner;

public class signIn{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, answer;

        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yapılıyor..");
        }
        else if(userName.equals("patika") && !(password.equals("java123"))){
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet yada hayır yazınız) ");

            answer = input.nextLine();

            if(answer.equals("evet")){
                System.out.print("Yeni şifreniz: ");
                password = input.nextLine();
                
                if(password.equals("java123")){
                    System.out.println("Şifreniz önceki şifrenizden farklı olmalıdır");
                }
                else{
                    System.out.println("Şifreniz değiştirildi.");
                }
            }
            else{
                System.out.println("Bilgilerinizde değişiklik yapılmadı.");
            }

        }
        else{
            System.out.println("Bilgileriniz Hatalı!");
        }

        input.close();


    }
}