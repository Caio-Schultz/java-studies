public class ProgramTelefoneComMatriz {
    public static void main(String[] args){

        char telefonePad[][] = {{'1', '2', '3'},
                                {'4', '5', '6'},
                                {'7', '8', '9'},
                                {'*', '0', '#'}};

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(telefonePad[i][j] + " ");
            }
            System.out.println();
        }


    }
}
