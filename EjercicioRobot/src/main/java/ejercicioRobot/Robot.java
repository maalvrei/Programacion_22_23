package ejercicioRobot;

public class Robot {

	private int name;
	private int model;
	private int clase;
	private static int numeroDeRobots;
	
	//En el constructor con todos los parametros incrementamos el numeroDeRobots para que este aumente en uno cada vez q creamos un nuevo objeto
	// de la clase Robot. Ademas, llamamos al toString de la propia clase para añadir informacion adicional aparte de notificar el incremento
	// del numero de robots. 
	
	public Robot (int name, int model, int clase) {
		this.name = name;
		this.model = model;
		this.clase = clase;
		numeroDeRobots++;
		System.out.println("Se ha creado el robot numero " + numeroDeRobots + "\n" + this.toString());
	}
	
	public Robot (Robot r) {
		this(r.name,r.model,r.clase);
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public static int getNumeroDeRobots() {
		return numeroDeRobots;
	}
	
	@Override
	public String toString() {
		return "Nombre del robot: " + name + "\nModelo del robot: " + model + "\nClase del robot: " + clase;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (!(obj instanceof Robot)) {
			return false;
		} else {
			Robot r = (Robot) obj;
			boolean resultado = (this.name == r.name && this.clase == r.clase && this.model == r.model)? true : false;
			return resultado;
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Robot(this.name, this.model, this.clase);
	}
}
