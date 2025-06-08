import java.util.*;

public class LetterCombinations {
    private static final String[] KEYPAD = {
        "",     "",     "abc", "def",
        "ghi", "jkl", "mno", "pqrs",
        "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return result;
        backtrack(0, digits, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int index, String digits, StringBuilder path, List<String> result) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char ch : letters.toCharArray()) {
            path.append(ch);
            backtrack(index + 1, digits, path, result);
            path.deleteCharAt(path.length() - 1);
        }
    }

    public static void main(String[] args) {
        LetterCombinations lc = new LetterCombinations();
        List<String> combinations = lc.letterCombinations("23");
        System.out.println(combinations);
    }
}
