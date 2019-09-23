
package operaciones;


public class Operaciones {
    
    private float valorUno, valorDos, resta, suma, division, multiplicacion;

    public Operaciones(float valorUno, float valorDos) {
        this.valorUno = valorUno;
        this.valorDos = valorDos;
    }

    public float getResta() {
           resta = valorUno-valorDos;
        return resta;
    }

    public float getMultiplicacion() {
        multiplicacion=valorUno*valorDos;
        return multiplicacion;
    }
     public float getDivision() {
        division=valorUno/valorDos;
         return division;
    }
      public float getSuma() {
        suma=valorUno+valorDos;
          return suma;
    }
    
    
    
}
