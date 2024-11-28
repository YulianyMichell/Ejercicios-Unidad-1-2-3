class Rectangulo{
    int ancho;
    int alto;
}

public class modificarObjeto {
    public static void main(String[] args)throws Exception {
        
        Rectangulo rectangulo=new Rectangulo();
        rectangulo.ancho=0;
        rectangulo.alto=0;
        System.out.println(rectangulo.ancho + " "+rectangulo.alto);
        modificarRectangulo(rectangulo);
        System.out.println(rectangulo.ancho + " "+ rectangulo.alto);
    }

    static void modificarRectangulo(Rectangulo rectangulo){
        rectangulo.ancho=8;
        rectangulo.alto=10;
    }
}
