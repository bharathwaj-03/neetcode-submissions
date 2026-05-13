class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map= new HashMap<>();
        for(String s:strs){
            char[] res1=s.toCharArray();
            Arrays.sort(res1);
            String sortedKey= new String(res1);
            if(!map.containsKey(sortedKey)){
                map.put(sortedKey,new ArrayList<>());
            }
            map.get(sortedKey).add(s);
        }

        return new ArrayList<>(map.values());
        
    }
}
