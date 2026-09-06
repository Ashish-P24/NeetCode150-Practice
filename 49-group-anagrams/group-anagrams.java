class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        for(String s : strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);

            String keys=new String(chars);
            if(!map.containsKey(keys)){
                map.put(keys, new ArrayList<>());
            }
            map.get(keys).add(s);
        }
        return new ArrayList<>(map.values());
    }
}