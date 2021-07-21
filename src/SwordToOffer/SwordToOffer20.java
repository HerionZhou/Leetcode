package SwordToOffer;

public class SwordToOffer20 {
    //数字：isNum = true
    //正负号：只能在第一位或前一位是e、E
    //e、E：前面不能有e、E且不能没有数字
    //点：前面不能有e、E且前面不能有点
    public static boolean algorithm(String s){
        char[] str = s.trim().toCharArray();
        boolean isNum = false, isE = false, isDot = false;
        for (int i = 0; i < str.length; i++){
            if (str[i] == '+' || str[i] == '-'){
                if (i != 0 && str[i - 1] != 'e' && str[i - 1] != 'E') return false;
            } else if (str[i] >= '0' && str[i] <= '9'){
                isNum = true;
            } else if (str[i] == '.'){
                if (isDot || isE) return false;
                isDot = true;
            } else if (str[i] == 'e' || str[i] == 'E'){
                if (isE || !isNum) return false;
                isE = true;
                isNum = false;
            }
            else return false;
        }
        return isNum;
    }

}
