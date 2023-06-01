package ExercicioUmListaOito;
public class Bola{

   private String cor = "Azul";
   private double circunferência = 50.0;
   private String material = "Couro";

public String getCor() {
    return cor;
}
public void setCor(String cor) {
    this.cor = cor;
}
public double getCircunferência() {
    return circunferência;
}
public void setCircunferência(double circunferência) {
    this.circunferência = circunferência;
}
public String getMaterial() {
    return material;
}
public void setMaterial(String material) {
    this.material = material;
}

public String trocaCor(String novaCor){
   return cor = novaCor;
}
public String mostraCor(){
    return ("A cor da bola é: " + cor);
}
}

