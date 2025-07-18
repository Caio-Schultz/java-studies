package anonymousclass;

public class Main {
    public static void main(String[] args){

        // Anonymous Class = Uma classe que não possui um nome. Não pode ser reutilizada
        //                   Adiciona comportamentos customizados sem precisar criar uma classe nova
        //                   Geralmente usado para apenas um uso (TimerTask, Runnable, callbacks)


        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro(){   // isso é uma anonymous class. Nesse exemplo, cachorro2 seria um "cachorro falante" como Scooby Doo, logo ele possui uma característica única que também terá uso único, por isso é mais conveniente usar uma anonymous class
            @Override
            void fazerBarulho(){
                System.out.println("Scooby doh fala *Ruh Roh*");
            }
        };

        cachorro1.fazerBarulho();
        cachorro2.fazerBarulho();




    }
}
