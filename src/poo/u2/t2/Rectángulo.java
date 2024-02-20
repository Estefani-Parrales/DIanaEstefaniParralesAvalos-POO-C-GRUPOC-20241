package poo.u2.t2;
public class Rectángulo {
    double ancho ;
    double altura ;
    double area ;
    double perimetro ;

    Rectángulo(double ancho, double altura) {
        this.ancho = ancho ;
        this.altura = altura ;
    }
    double area (){
        return ancho*altura ;
    }
    
    double perimetro () {
        return (2*ancho)+(2*altura) ;
    }
}
