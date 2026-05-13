class Solution {
    public boolean isAnagram(String s, String t) {
        char [] ana1=new char[s.length()];
         char [] ana2=new char[t.length()];

         ana1=s.toCharArray();
            ana2=t.toCharArray();

            Arrays.sort(ana1);
              Arrays.sort(ana2);

              return Arrays.equals(ana1,ana2);

    }
}
