public class CBBAtividadePratica5{
    public static void main(String[] args){
        String[] diasDaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        int cont = 0;
        int tamanhoArray = diasDaSemana.length;
        
        System.out.println("Solução com While:");
        while(cont < tamanhoArray){
            System.out.print(diasDaSemana[cont] + " ");
            cont += 1;
        }
        System.out.println();
        
        System.out.println("\nSolução com For:");
        for(int i = 0; i < tamanhoArray; i++){
            System.out.print(diasDaSemana[i] + " ");
        }
        System.out.println();
        
        cont = 0;
        System.out.println("\nSolução com Do-While:");
        do{
            System.out.print(diasDaSemana[cont] + " ");
            cont += 1;
        } while(cont < tamanhoArray);
    }
}