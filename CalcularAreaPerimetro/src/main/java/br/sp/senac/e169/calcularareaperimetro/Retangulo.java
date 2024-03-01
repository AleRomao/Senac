package br.sp.senac.e169.calcularareaperimetro;

public class Retangulo {
    
    private double largura;
    private double altura;
    private double area;
    private double perimetro;
    
    public double getLagura() {
        return largura;
    }
    
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
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
        this.area = this.largura * this.altura;
    }
    
    public void calcularPerimetro() {
        this.perimetro = 2 * (this.largura + this.altura);
    }
    
    public void mostrar() {
        System.out.println("Largura: " + this.largura);
        System.out.println("Altura: " + this.altura);
        System.out.println("Area: " + this.area);
        System.out.println("Perimetro: " + this.perimetro);
    }
    
}
