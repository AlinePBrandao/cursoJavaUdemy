package M9_Lists.Boxing_Wrapper_ForEach;

public class ForEach {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob", "Alex"};
        for (int i=0; i< vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("--------------------------");
        //usando for each
        for (String obj : vect){ //percorre os elemento do vect chamando de obj
            System.out.println(obj);
        }
    }
}
