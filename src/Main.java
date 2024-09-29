import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите mac-адрес: ");
        Scanner sc1 = new Scanner(System.in);
        String mac_adres = sc1.nextLine();
        Pattern pattern = Pattern.compile("([0-9A-Fa-f]{2}[:-]){5}[0-9A-Fa-f]{2}$");
        Matcher matcher = pattern.matcher(mac_adres);
        boolean b = matcher.matches();
        if (b == true){
            System.out.println("Вы ввели правильный mac-адрес");
        }
        else{
            System.out.println("Вы ввели неправильный mac-адрес");
        }
    }
}