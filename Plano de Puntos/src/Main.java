
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto<Integer,Integer> p1 = new Punto<Integer,Integer>(14,20);
		Punto<Integer,Integer> p2 = new Punto<Integer,Integer>(25,50);
	    Plano<Integer,Integer> plano = new Plano<Integer,Integer>();
	    plano.agregarPunto(p1);
	    plano.agregarPunto(p2);
	    System.out.println(plano);
	    
	    
		
		

	}

}
