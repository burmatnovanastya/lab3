import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите пароль, содержащий 8 и более символов, среди которых хотя бы одна заглавная буква, одна маленькая букву и одна цифра: ");
        String passwd = s.nextLine();
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
        String pattern2 = "[a-zA-Z\\d_]*";
        if(passwd.matches(pattern) && passwd.matches(pattern2)){
            System.out.println("Пароль надёжный!");
        } else {
            System.out.print("Ошибка! Соблюдайте требования!");
        }
        s.close();
    }
}