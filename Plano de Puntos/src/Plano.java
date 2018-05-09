import java.io.BufferedInputStream;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Plano <T1 extends Number,T2 extends Number> {
	private List<Punto<T1,T2>> puntos;
	
	public Plano() {
		this.setPuntos(new LinkedList<Punto<T1,T2>>());
	}

	public List<Punto<T1,T2>> getPuntos() {
		return puntos;
	}

	public void setPuntos(List<Punto<T1,T2>> puntos) {
		this.puntos = puntos;
	}
	
	public void agregarPunto(Punto<T1,T2> punto) {
		this.getPuntos().add(punto);
	}
	
	public void agregarPuntos(String nombreArchivo) {
		
	}
		
		
	
	public Map<Cuadrante, List<Punto<T1, T2>>> getMapaxCuadrante(){
		Map<Cuadrante, List<Punto<T1, T2>>> mapa = new HashMap<Cuadrante, List<Punto<T1, T2>>>();
		
		for (Cuadrante cuadrante: Cuadrante.values()) {
			mapa.put(cuadrante, new LinkedList<Punto<T1,T2>>());
			
		}
		for (Punto<T1,T2> punto: this.getPuntos()) {
			if(punto.getX().intValue() > 0 && punto.getY().intValue() > 0)
				mapa.get(Cuadrante.PRIMER).add(punto);
			if(punto.getX().intValue() < 0 && punto.getY().intValue() > 0)
				mapa.get(Cuadrante.SEGUNDO).add(punto);
			if(punto.getX().intValue() < 0 && punto.getY().intValue() < 0)
				mapa.get(Cuadrante.TERCERO).add(punto);
			if(punto.getX().intValue() > 0 && punto.getY().intValue() < 0)
				mapa.get(Cuadrante.CUARTO).add(punto);
		}
		return mapa;
		
	}
	

}
