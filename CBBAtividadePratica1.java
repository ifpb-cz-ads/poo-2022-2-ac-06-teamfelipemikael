public class CBBAtividadePratica1{
    public static void main(String[] args){
        int[] arrayInt = new int[100];

        for (int i = 0; i < 100; i++){
            arrayInt[i] = i;
        }
        
        for (int j = 0; j < arrayInt.length; j++){
            System.out.print(arrayInt[j] + " ");
        }
    }
}