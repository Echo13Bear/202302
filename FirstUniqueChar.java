public class FirstUniqueChar {
    //homework4
//    Given a string s, find the first non-repeating character in it and return its index.
//    If it does not exist, return -1.


    public int firstUniqChar(String s) {
        int[] bucket = new int[26];
        char[] str = s.toCharArray();
        int res = -1;

        for(int i = 0; i < str.length; i++) {
            int index = str[i] - 'a';
            bucket[index]++;
        }

        for(int i = 0; i < str.length; i++) {
            if(bucket[str[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
