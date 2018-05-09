
public class Main
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Monedero monedero = new Monedero(350.0);
		System.out.println(monedero.consultarMonto());
		monedero.sacarDinero(150.0);
		System.out.println(monedero.consultarMonto());
		monedero.sacarDinero(200.0);
		System.out.println(monedero.consultarMonto());
		monedero.agregarDinero(110.0);
		System.out.println(monedero.consultarMonto());
	}
}
