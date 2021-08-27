public class questao16 {
    
    private int horas;
    private int minutos;
    private int segundos;

    public void setTempo(int s){
        this.horas = s / 3600;
        int r = s % 3600;
        this.minutos = r / 60;
        r = r % 60;
        this.segundos = r;
    }

    public int getHoras(){
        return this.horas;
    }
    
    public int getMinutos(){
        return this.minutos;
    }

    public int getSegundos(){
        return this.segundos;
    }

    public void status(){
        System.out.println("Horas: " +getHoras());
        System.out.println("Minutos: " +getMinutos());
        System.out.println("Segundos: " +getSegundos());
    }


}

    

