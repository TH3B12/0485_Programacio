package herencia;

	public class trabajador extends persona{
		
		private String especialidad;
		private int sueldo=0;
		
		public trabajador (String nom,int año,int sueldo, String especialidad ) {
			super (nom,año);
			this.especialidad=especialidad;
			this.sueldo=sueldo;
			
			
			
			public string tostring() { 
				return super.toString()+"\n"+especialidad+"\n"+ sueldo;
			}
		}
	}
	
	
	

