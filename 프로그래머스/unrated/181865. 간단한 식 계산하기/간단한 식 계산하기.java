class Solution {
    public int solution(String binomial) {
    String[] split = binomial.split(" ");
        
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[2]);

        switch (split[1]) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            default: // "*"
                return a * b;
        }
    }
}