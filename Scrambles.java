public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
      int[] arr = new int[26];
      for (char c : str2.toCharArray())
      {
        arr[c - 'a']++;
      }
      for (char c : str1.toCharArray())
      {
        arr[c - 'a']--;
      }
      for (int value : arr) 
      {
        if (value > 0) {
            return false;
      }
    }
    return true;
    }
}
