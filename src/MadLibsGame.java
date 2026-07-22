import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        String[] infos = {"1. noun ", "2. verb ending in ing ", "3. noun ", "4. noun ", "5. exclamation ", "6. verb ending in ing ", "7. noun-plural ", "8. noun ", "9. verb past-tense ", "10. noun ", "11. adjective ", "12. verb past-tense ", "13. noun ", "14. verb past-tense ", "15. noun ", "16. noun ", "17. noun ", "18. verb past-tense ", "19. noun - a body part ", "20. noun - a place ", "21. adjective - a color ", "22. noun ", "23. verb ending in ing ", "24. verb past-tense ", "25. noun ", "26. adverb ", "27. noun ", "28. nouns - plural "};
        List<String> userInput = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (String info : infos) {
            System.out.print(info);
            userInput.add(scanner.nextLine());
        }
        System.out.println(userInput);
        scanner.close();
        System.out.println("\"Put Your Hands up\" said the " + (userInput.get(0) != null ? userInput.get(0) : "_____(noun)______") + ". \"You're underarrest for " + (userInput.get(0) != null ? userInput.get(1) : "_____(verb ending in ing)______") + " the " + (userInput.get(0) != null ? userInput.get(2) : "_____(noun)______") + ". \"You're underarrest for " + (userInput.get(0) != null ? userInput.get(3) : "_______(noun)_______") + " at the _______(noun)_______ \".\n\"_______(exclamation)______! thought frank. His hands were ________(verb ending in ing)______ like ______(noun plural)______ on a ______(noun)______.\n This wasn't a first time he had ______(verb - past tense)_____ a _____(noun)______ and he knew he was in _____(adjective)_____ trouble. Just moments before frank\n ______(verb - past tense)_____ into a _____(noun)_____ and _____(verb - past tense)_____ a _____(noun)_____ and a _____(noun)______. He was spotted and\n a big ____(noun)_____ chased after him and ______(verb - past tense)______ him in the ______(noun - a body part)______. Now Frank was surrounded and had no choice\n but to surrender. So it was off to _____(noun - a place)____ for Frank. Frank was the ______(adjective - a color)_____ sheep of his ______(noun)______, always\n ______(verb - ending in ing)_____ into trouble. It started when frank ______(verb - past tense)_____ a _____(noun)_____ from a neighbour and\n ______(adverb)_____ rode the ______(noun)_____ home.");
    }
}
