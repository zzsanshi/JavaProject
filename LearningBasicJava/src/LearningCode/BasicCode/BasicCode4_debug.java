package LearningCode.BasicCode;

public class BasicCode4_debug {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                sum +=1;
            }
        }
        System.out.println(sum);
    }
}
