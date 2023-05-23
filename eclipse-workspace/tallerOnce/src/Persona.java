import java.util.Scanner;

public class Persona {

	private String nombre = "";
	private int edad = 0;
	private String DNI = generaDNI();
	private char sexo = SEXO_DEFAULT;
	private boolean genero =  false;
	private double peso = 0;
	private double altura = 0;
	
	static char SEXO_DEFAULT = 'H';
	static int PESO_IDEAL = -1;
	static int BAJO_PESO = 0;
	static int SOBRE_PESO = 1;
	
	public Persona() {	
		this.DNI = generaDNI();
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		genero = comprobarSexo(sexo);
		if(genero) {
			this.sexo = sexo;
		} else {
			this.sexo = SEXO_DEFAULT;
		}	
	}
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		genero = comprobarSexo(sexo);
		if(genero) {
			this.sexo = sexo;
		} else {
			this.sexo = SEXO_DEFAULT;
		}		
		this.peso = peso;
		this.altura = altura;
	}
	
	public int calcularIMC() {
		double IMC = this.peso / Math.pow(this.altura, 2);
		
		if( IMC < 20) {
			return PESO_IDEAL;
		} else if (IMC >= 20 && IMC <= 25) {
			return BAJO_PESO;
		} else {
			return SOBRE_PESO;
		}
	}	
	
	public  void comprobarPesoIdeal(Persona p) {
		int puntajeIMC = p.calcularIMC();
		
		switch (puntajeIMC) {
		case -1:
			System.out.println(this.nombre + ", esta con un peso ideal de " + this.peso + " kg");
			break;
		
		case 0:
			System.out.println(this.nombre + ", esta por debajo de su peso ideal con " + this.peso + " kg");
			break;
			
		case 1:
			System.out.println(this.nombre + ", esta por encima de su peso ideal con " + this.peso + " kg");
			break;
			
		default:
			break;
		}
	}
	
	public boolean esMayorDeEdad() {
		boolean edadPersona = false;
		
		if(this.edad >= 18) {
			edadPersona = true;
		} 
		return edadPersona;
	}
	
	public void MayoriaEdad(Persona p) {
		if(p.esMayorDeEdad()) {
			System.out.println(this.nombre + ", es mayor de edad.");
		} else {
			System.out.println(this.nombre + ", no es mayor de edad.");
		}
	}
	
	public boolean comprobarSexo(char sexo) {
		boolean sexoCorrecto = false;
		if(sexo == 'M' || sexo == 'H') {
			this.sexo = sexo;
			sexoCorrecto = true;
		} 
		return sexoCorrecto;
	}

	
	public String generaDNI() {
	    int numeroDNI = (int)(Math.random()*((99999999-1)+1))+1;
	    int indexLetra = (int)((Math.random()*((9-0)+1))+0);
	    
	    char letraDNI = setLetraDNI(indexLetra);	    
	    DNI = Integer.toString(numeroDNI) + letraDNI;
	    
	    return DNI;
	}
	
    private char setLetraDNI(int indexLetra) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P','H'}; 
        return letras[indexLetra];
    }	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getDNI() {
		return DNI;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}	
}
