public class questao15 {

    private float MEDIA;


    public void media(float x1, float x2, int x3){
        float M;
        M = (x1 + x2 + x3) / 3;
        System.out.println("A media do aluno é: " + M);
        this.MEDIA = M;
    }


    public void status(){
        if(this.MEDIA > 6){
            System.out.println("Aprovado!");
        }else if(this.MEDIA >= 4 && this.MEDIA <= 6){
            System.out.println("Verificação Suplementar");
        }else{
            System.out.println("Reprovado!");
        }
    }
}  

