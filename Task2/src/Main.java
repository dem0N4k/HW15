import java.util.Scanner;

public class Main {
    public static final String CORRECT_CHARS = " абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ-";

    public static void main(String[] args) {
        boolean isValid = true;
        int spaceCount = 0;

        System.out.println("Введите ФИО");
        String name = new Scanner(System.in).nextLine().trim();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                spaceCount++;
            }
            if (!CORRECT_CHARS.contains(String.valueOf(name.charAt(i)))) {
                isValid = false;
                break;
            }
        }
        if (isValid && spaceCount == 2) {
            System.out.println("Фамилия: " + name.substring(0, name.indexOf(' '))
                    + "\nИмя:" + name.substring(name.indexOf(' '), name.lastIndexOf(' '))
                    + "\nОтчество:" + name.substring(0, name.indexOf(' ')));
        } else {
            System.out.println("Введенная строка не является ФИО!");
        }
    }
}
