
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto(1.0,1.0);
		Punto p2 = new Punto(5.0,5.0);
		 
		//calculo de la distancia entre dos puntos
		double distancia = p1.calcularDistancia(p2);
		System.out.println("La distancia entre los puntos es:" + distancia);
		}
		 

	}


