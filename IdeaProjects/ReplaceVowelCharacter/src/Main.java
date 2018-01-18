import com.tw.practice.ReplaceVowelCharacter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        ReplaceVowelCharacter replaceVowelCharacter = new ReplaceVowelCharacter();
        String result = replaceVowelCharacter.replace(str);
        System.out.println(result);
    }
}
