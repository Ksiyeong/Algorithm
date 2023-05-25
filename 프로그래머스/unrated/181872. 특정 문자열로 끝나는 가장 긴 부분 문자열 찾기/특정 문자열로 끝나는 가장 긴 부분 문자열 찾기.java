class Solution {
    public String solution(String myString, String pat) {
        String myStringReverse = new StringBuilder(myString).reverse().toString();
        String patReverse = new StringBuilder(pat).reverse().toString();
        return myString.substring(0, myString.length() - myStringReverse.indexOf(patReverse));
    }
}