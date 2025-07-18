public class BreakEcontinue {
    public static void main(String[] args){

        // break = saída de um loop (PARAR/STOP)
        // continue = pular a atual iteração (repetição) de um loop (PULAR/SKIP)

        for(int i = 0; i < 10; i++){

            if(i == 5){
                break;    // sai totalmente do loop. No caso, quando atingir o 5, o loop simplesmente vai acabar e irá printar apenas até o 4
            }

            System.out.print(i + " ");
        }

        for(int i = 0; i < 10; i++){

            if(i == 5){
                continue;  // pula apenas um ciclo específico do loop. No caso, não vai printar o 5 e vai pular do 4 pro 6 diretamente
            }

            System.out.print("\n" + i + " ");
        }

    }
}
