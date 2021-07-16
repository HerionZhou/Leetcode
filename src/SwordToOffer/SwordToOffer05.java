package SwordToOffer;

public class SwordToOffer05 {
    public static String algorithm(String s){
        // 使用StringBulider生成字符串;用.toCharArray()将原字符串转变为数组，方便遍历
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()){
            if (c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args){
        String s = "12 132313   1323";
        System.out.println(algorithm(s));
    }
}
