package mock_test1;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Build the frequency map
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No non-repeating character found
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println(firstUniqChar(s1));  // Output: 0

        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s2));  // Output: 2

        String s3 = "aabb";
        System.out.println(firstUniqChar(s3));  // Output: -1
    }
}

