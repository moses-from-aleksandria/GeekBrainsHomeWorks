import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;




public class homework3 {


    public static void main(String[] args) {
       // binarySearchGame();
       // isEmail();
        wordsGame();
    }

        public static void isEmail() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите свой email:");
            String email = sc.next();
            boolean a = email.matches("[a-zA-Z0-9.]+@[a-zA-Z0-9.]+");
            if ( a == true){
                System.out.println("Введен корректный email");
            } else System.out.println("Введен не корректный email");

        }

        public static void binarySearchGame() {
            int secretValue = new Random().nextInt(100); // компьютер загадывает число
            Scanner sc = new Scanner(System.in);
            System.out.println("Угадайте число от 0 до 100");
            int number;
            for (int i = 1; i <= 8; i++) {
                if (i == 8){
                    System.out.println("Вы проиграли(\n Сыграем еще?\n  1-ДА/2-НЕТ");
                    int replay = sc.nextInt();
                    if(replay == 1){
                        binarySearchGame();
                    } else return;
                }
                number = sc.nextInt();
                 if ( number == secretValue ){
                    System.out.println("Вы выиграли!!!\nСыграем еще?\n1-ДА/2-НЕТ");
                     int replay = sc.nextInt();
                     if(replay == 1){
                         binarySearchGame();
                     } else return;
                } else if ( number < secretValue ){
                    System.out.println("Ваше число меньше");
                } else {
                    System.out.println("Ваше число больше");
                }
            }
        }

        public static void wordsGame() {
            Scanner sc = new Scanner(System.in);
            String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                    "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                    "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
                    "pumpkin", "potato"};
            Random rnd = new Random();
            String secretWord = words[rnd.nextInt(words.length)];
            System.out.println("Загаданно слово, попробуй отгадать его!");
            while (true) {
                System.out.println("Введи слово");
                String word = sc.next();
                if (word.equals(secretWord)){
                    System.out.println("Ты угадал");
                    break;
                } else {
                    String s = "";
                    int minLength = Math.min(word.length(), secretWord.length());
                    for(int i = 0; i < minLength; i++) {
                        if (word.charAt(i) != secretWord.charAt(i)){
                            i = 100000000;
                            break;
                        } else {
                            s += word.charAt(i);

                        }
                    }
                    while (s.length() < 15) s +="#";
                    System.out.println(s);
                }
            }
        }
    }

