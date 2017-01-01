class CCoche
{
	String Marca;
	String Modelo;
	String Color;
	boolean MotorEncendido;
	int PalancaDeCambios;
	boolean PedalAcelerador;
	boolean PedalFreno;
	
	void ArrancarMotor()
	{
		if(MotorEncendido == true)
			System.out.println("El motor ya está encendido.");
		else
		{
			MotorEncendido = true;
			System.out.println("El motor se ha encendido.");
		}
	}
	
	void CambiarVelocidad()
	{
		if(PedalAcelerador == true)
			PalancaDeCambios = PalancaDeCambios + 1;
		if(PedalFreno == true)
			PalancaDeCambios = PalancaDeCambios - 1;
		
		System.out.println("$PalancaDeCambios:~>" + PalancaDeCambios);
	} 
	
	void Acelerar()
	{
		PedalAcelerador = true;
		PedalFreno = false;
		CambiarVelocidad();
	}
	
	void Frenar()
	{
		PedalAcelerador = false;
		PedalFreno = true;
		CambiarVelocidad();
	}
	
	void PararMotor()
	{
		if(MotorEncendido == true)
		{
			MotorEncendido = false;
			System.out.println("El motor se ha parado.");
		}
		else
			System.out.println("El motor ya está parado.");
	}
	
	
	public static void main(String[] args){
		CCoche MiCoche = new CCoche();
		MiCoche.Marca = "Ford";
		MiCoche.Modelo = "Mustang";
		MiCoche.Color = "Negro";
		MiCoche.PalancaDeCambios = 0;
		MiCoche.ArrancarMotor();
		MiCoche.Acelerar();
		MiCoche.Frenar();
		MiCoche.PararMotor();
	}
}