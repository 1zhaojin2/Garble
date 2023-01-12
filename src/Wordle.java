package src;

import java.awt.Color;
import java.util.ArrayList;

public class Wordle {

    private String word;
    private ArrayList<String> guessWords;
    private ArrayList<String> correctLetters;
    private ArrayList<String> misplcaedLetters;
    private ArrayList<String> excludedLetters;
    private ArrayList<ArrayList<Color>> colorOfLetters;

    public Wordle(String word) {
        this.word = word;
        guessWords = new ArrayList<String>();
        colorOfLetters = new ArrayList<ArrayList<Color>>();
    }

    private boolean validGuess(String s) {
        if (s.length() != word.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private Color getColor(int index, String c) {
        if (word.substring(index, index + 1).equals(c)) {
            correctLetters.add(c);
            return Color.green;
        }
        else if (word.contains(c)) {
            misplcaedLetters.add(c);
            return Color.yellow;
        }
        excludedLetters.add(c);
        return Color.gray;
    }

    public void takeGuess(String s) {
        if (validGuess(s)) {
            guessWords.add(s);

            ArrayList<Color> arr = new ArrayList<Color>();
            for (int i = 0; i < word.length(); i++) {
                arr.add(getColor(i, s.substring(i, i + 1)));
            }
            colorOfLetters.add(arr);
        }
    }

    public ArrayList<String> getGuess() {
        return guessWords;
    }

    public String getWord() {
        return word;
    }

    public ArrayList<ArrayList<Color>> getColors() {
        return colorOfLetters;
    }

    public ArrayList<ArrayList<String>> colorToString() {

        ArrayList<ArrayList<String>> colorsInString = new ArrayList<ArrayList<String>> ();

        for (ArrayList<Color> arr : colorOfLetters) {
            ArrayList<String> curColors = new ArrayList<String>();
            for (Color c : arr) {
                curColors.add(c.toString());
            }
            colorsInString.add(curColors);
        }

        return colorsInString;
    }
}
