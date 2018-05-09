
public class Monedero 
{
private Double monto;
	
	public Monedero(Double monto) 
	{
		this.setMonto(monto);
	}
	
	private void setMonto(Double monto) 
	{
		this.monto = monto;
	}
	
	public Double consultarMonto() 
	{
		return this.monto;
	}
	
	public void agregarDinero(Double monto) 
	{
		this.setMonto(this.consultarMonto() + monto);
	}
	
	public void sacarDinero(Double monto) 
	{
		if (this.validarMonto(monto))
			this.setMonto(this.consultarMonto() - monto);
	}
	
	private Boolean validarMonto(Double monto) 
	{
		return this.consultarMonto() >= monto;
	}
	
}
