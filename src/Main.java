import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        String correctGuessedLetters = "";
        HashMap<Character, Boolean> correctGuessedWordLettersMap = new HashMap<>();

        String wrongGuessedLetters = "";
        String wordToGuess = getWordToGuess();
        System.out.println(wordToGuess);
//        String wordToGuess = generateWord(4);
        int guesses = 7;
        int guessesFromStart = guesses;
        int numberOfCorrectLetters = 0;

        System.out.println("Du har " + guesses + " chanser att gissa fel.");

        drawGameStateWithMap(wordToGuess, correctGuessedWordLettersMap, 0);

        do
        {
            String guess = getUserGuess();
            System.out.println(guess);
            //System.out.println(numberOfCorrectLetters +"   " + wordToGuess.length());
            if (wordToGuess.contains(guess)){
//                correctGuessedLetters += guess;
                correctGuessedWordLettersMap.put(guess.charAt(0), true);
            }else{
                wrongGuessedLetters += guess;
                guesses -= 1;
            }
            drawGameStateWithMap(wordToGuess, correctGuessedWordLettersMap, (guessesFromStart - guesses));
            System.out.println("Du har " + (guesses == 0 ? "ingen": guesses) +  (guesses <= 1 ? " gång" : " gånger") +" kvar att gissa fel.");
            if (!wrongGuessedLetters.isEmpty()){
                System.out.println("Tecken som inte finns med: " + wrongGuessedLetters);

            }
            System.out.println();
            //System.out.println(numberOfCorrectLetters);
        } while ( correctGuessedWordLettersMap.size() != wordToGuess.length() && guesses != 0);

        if (numberOfCorrectLetters == wordToGuess.length()){
            System.out.println("Wow du gjorde det ordet var " + wordToGuess.toUpperCase() +
                    " och du hade kvar " + (guessesFromStart - guesses) + " felgissningar.");
        }else {
            System.out.println("Tyvärr så fick du inte fram rätt ord. Ordet var " + wordToGuess.toUpperCase());
        }

    }
//    static int drawGameState(String wordToGuess, String correctGuessedLetters, int imageToDraw) {
//        int numberOfCorrectLetters = 0;
//        drawImage(imageToDraw);
//        for (char c : wordToGuess.toCharArray()) {
//
//            if (correctGuessedLetters.indexOf(c) != -1 ) {
//                System.out.print(" " + c + " ");
//                numberOfCorrectLetters += 1;
//            } else System.out.print(" _ ");
//
//        }
//        System.out.println();
//        //System.out.println("Rätt gissade " + correctGuessedLetters);
//        return numberOfCorrectLetters;
//    }

    static void drawGameStateWithMap(String wordToGuess, HashMap<Character, Boolean> correctGuessedLettersMap, int imageToDraw) {

        drawImage(imageToDraw);
        for (char c : wordToGuess.toCharArray()) {

            if (correctGuessedLettersMap.containsKey(c)) {
                System.out.print(" " + c + " ");

            } else System.out.print(" _ ");

        }
        System.out.println();
        //System.out.println("Rätt gissade " + correctGuessedLetters);

    }

    static String generateWord(int lengthOfWord){
        String [] wordWith4Letters = {"kaka", "lata", "reta", "leta"};
//        String [] wordWtih5Letters = {"smaka", "bråka", "leta", "" };
        String [] wordWith6Letters = {"kastar", "bråkar", "kaktus", "flaska" };
        String [] wordWith8Letters = {"ostmacka", "flugfisk", "förtvätt", "hantverk", "motverka"};


        String [] wordArray = {"ostmacka", "plåtslagare", "receptionist", "flaska", "känguru", "flugfiske"};
        Random rand = new Random();
        int indexOfWord;
        switch ( lengthOfWord){
            case 4:
                indexOfWord =  rand.nextInt(wordWith4Letters.length);
                return wordWith4Letters[indexOfWord].toUpperCase();
            case 6:
                indexOfWord =  rand.nextInt(wordWith6Letters.length);
                return wordWith6Letters[indexOfWord].toUpperCase();
            case 8:
                indexOfWord =  rand.nextInt(wordWith8Letters.length);
                return wordWith8Letters[indexOfWord].toUpperCase();
        }
        return "fault";
//        return wordArray[indexOfWord];
    }


    public static void drawImage(int imageToDraw){
        switch (imageToDraw) {
            case 0 -> {
            }
            case 1 -> System.out.println("   ___|___");
            case 2 -> {
                System.out.println("      |/");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("   ___|___");
            }
            case 3 -> {
                System.out.println("      _________");
                System.out.println("      |/");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("   ___|___");
            }
            case 4 -> {
                System.out.println("      _________");
                System.out.println("      |/      |");
                System.out.println("      |      (_)");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("   ___|___");
            }
            case 5 -> {
                System.out.println("      _________");
                System.out.println("      |/      |");
                System.out.println("      |      (_)");
                System.out.println("      |       |");
                System.out.println("      |       |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("   ___|___");
            }
            case 6 -> {
                System.out.println("      _________");
                System.out.println("      |/      |");
                System.out.println("      |      (_)");
                System.out.println("      |      \\|/");
                System.out.println("      |       |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("   ___|___");
            }
            case 7 -> {
                System.out.println("      _________");
                System.out.println("      |/      |");
                System.out.println("      |      (_)");
                System.out.println("      |      \\|/");
                System.out.println("      |       |");
                System.out.println("      |      / \\");
                System.out.println("      |");
                System.out.println("   ___|___");
            }
        }


    }


    static String getWordToGuess(){

        String wordToGuess = "fault";
        do {
            System.out.println("Vill du gissa på ett ord med 4/6/8 bokstäver?");
            try{
                int lettersOfWord = sc.nextInt();
                sc.nextLine();
                wordToGuess = generateWord(lettersOfWord);
            }catch (InputMismatchException e){
                sc.nextLine();
                wordToGuess = "fault";
            }


        }while(wordToGuess.equals("fault"));
        return wordToGuess;
    }

    static String getUserGuess(){
        System.out.println("Gissa på en bokstav:");
        String guess = sc.nextLine();
        while (guess.length() != 1){
            System.out.println("Du får bara skriva ett tecken!");
            System.out.println("Gissa på en bokstav:");
            guess = sc.nextLine();
        }
        return guess.toUpperCase();
    }

    static void fillMap(HashMap<Character, Boolean> map, String word){
        for (char c:word.toCharArray()) {
            System.out.println();
        }
    }

}

