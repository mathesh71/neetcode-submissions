class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer>seen=new HashMap<>();
        for (int num :arr){
            seen.put(num,seen.getOrDefault(num,0)+1);
        }
        int maxlucky=-1;
        for(Map.Entry<Integer,Integer> entry:seen.entrySet()){
            int key=entry.getKey();
            int freq=entry.getValue();
            if(key==freq){
                maxlucky=Math.max(maxlucky,freq);
            }
        }
        return maxlucky;
    }
}