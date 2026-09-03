class Solution {
    public boolean isAnagram(String s, String t) {
        String s1=s.toLowerCase();
        String s2=t.toLowerCase();

        if(s1.length()!=s2.length()){
            return false;
        }
        int[] freq=new int[26];
        for(char ch : s1.toCharArray()){
            if(ch >= 'a' && ch<='z'){
                freq[ch -'a']++;
            }
        }
        for(char ch : s2.toCharArray()){
            freq[ch - 'a']--;
        }
        for(int count:freq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
