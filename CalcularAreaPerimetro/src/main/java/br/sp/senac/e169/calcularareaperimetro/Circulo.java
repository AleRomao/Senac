package br.sp.senac.e169.calcularareaperimetro;

public class Circulo {
    private double raio;
    private double area;
    private double perimetro;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
   
    public void calcularArea() {
        area = Math.PI * Math.pow(raio,2);
    }
    
    public void calcularPerimetro() {
      perimetro = Math.PI * 2 * raio;
    }
    
    public void mostrar(){
        System.out.println("Raio>>>>>>"+getRaio());
        System.out.println("Area>>>>>>>>"+getArea());
        System.out.println("Perimetro>>>>"+getPerimetro());
    }
}
