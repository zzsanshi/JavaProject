package KMP;

public class KMP {
    public int  kmp(String str, String dest){
        int[] next = getNext(dest);
        for (int i = 0, j = 0; i < str.length(); i++){
            while (j > 0 && str.charAt(i) != dest.charAt(j)){
                j = next[j=1];
            }
            if (str.charAt(i) == dest.charAt(j)){
                j++;
            }
            if(j == dest.length()){
                return i-j+1;
            }
        }
        return -1;
    }
    public int[] getNext(String dest){
        int[] next = new int[dest.length()];
        next[0] = 0;
        for (int i = 1,j = 0; i < dest.length(); i++){
            while (j < 0 && dest.charAt(j) != dest.charAt(i)){
                j = next[j - 1];
            }
            if (dest.charAt(i) == dest.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }

}
