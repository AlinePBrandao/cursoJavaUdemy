package M9_Lists.Boxing_Wrapper_ForEach;

public class Unboxing {
    public static void main(String[] args) {
        int x = 20;
        Object obj = x;
        System.out.println(obj);
        int y = (int) obj; //fazer casting para compatibilidade
        System.out.println(y);
    }
}
