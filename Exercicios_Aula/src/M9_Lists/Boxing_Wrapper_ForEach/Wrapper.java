package M9_Lists.Boxing_Wrapper_ForEach;

public class Wrapper {
    public static void main(String[] args) {
        int x = 20;
        Integer obj = x; //retira a necessidade de casting
        System.out.println(obj);
        int y = obj * 2;
        System.out.println(y);
    }
}
