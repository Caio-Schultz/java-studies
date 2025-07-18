public class Relogio {

    public int hora;
    public int minuto;
    public int segundo;

    public Relogio(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    public Relogio(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public int getHora(){
        return hora;
    }
    public void setHora(int hora){
        this.hora = hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public void setMinuto(int minuto){
        this.minuto = minuto;
    }
    public int getSegundo(){
        return segundo;
    }
    public void setSegundo(int segundo){
        this.segundo = segundo;
    }
    public void incrementarSegundo() {
        if(this.segundo > 60){
            this.minuto = this.minuto + (this.segundo / 60);
            this.segundo = this.segundo % 60;
        }
    }
    public void incrementarMinuto(){
               if (this.minuto > 60){
                   this.hora = this.hora + (this.minuto / 60);
                   this.minuto = this.minuto % 60;

               }
    }
    public void incrementarHora(){
        if(this.hora > 23){
            this.hora = 0;
        }
    }
    public void decrementarSegundo(){
       if(this.segundo < 0){
           this.segundo = 59;
           this.minuto = this.minuto - 1;
       }
    }
    public void decrementarMinuto(){
       if(this.minuto < 0){
           this.minuto = 59;
           this.hora = this.hora - 1;
       }
    }
    public void decrementarHora(){
        if(this.hora < 0){
            this.hora = 23;
        }
    }
    public String getHorario() {
        if (getHora() >= 10 && getMinuto() >= 10 && getSegundo() >= 10) {
            return getHora() + ":" + getMinuto() + ":" + getSegundo();
        } else if (getHora() < 10 && getMinuto() >= 10 && getSegundo() >= 10) {
            return "0" + getHora() + ":" + getMinuto() + ":" + getSegundo();
        } else if (getHora() >= 10 && getMinuto() < 10 && getSegundo() >= 10) {
            return getHora() + ":0" + getMinuto() + ":" + getSegundo();
        } else if (getHora() >= 10 && getMinuto() < 10 && getSegundo() >= 10) {
            return getHora() + ":" + getMinuto() + ":0" + getSegundo();
        } else if (getHora() < 10 && getMinuto() < 10 && getSegundo() >= 10) {
            return "0" + getHora() + ":0" + getMinuto() + ":" + getSegundo();
        } else if (getHora() >= 10 && getMinuto() < 10 && getSegundo() < 10) {
            return getHora() + ":0" + getMinuto() + ":0" + getSegundo();
        }
        else{
            return "0" + getHora() + ":" + getMinuto() + ":0" + getSegundo();
        }

    }
}