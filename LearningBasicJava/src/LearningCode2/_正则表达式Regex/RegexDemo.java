package LearningCode2._正则表达式Regex;

/**
 * 作用:特殊字符组成的校验规则,可以校验信息的正确性,校验邮箱是否合法
 */
public class RegexDemo {
    public static void main(String[] args) {

    }

    //用正则表达式
    public static boolean check1(String qq) {
        return qq != null && qq.matches("\\d{4,}");
    }

    //不用正则表达式
    public static boolean check(String QQ) {
        if (QQ == null) {
            return false;
        } else {
            if (QQ.length() >= 4) {
                return true;
            } else
                return false;
        }
    }

}
