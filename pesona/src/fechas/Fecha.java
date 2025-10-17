package fechas;

public class Fecha {
	
	private int dia, mes, ano;

	public Fecha(){
		
		this.dia = 1;
		this.mes = 1;
		this.ano = 1900;
	}
	
	public Fecha(int dia, int mes, int ano){
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.valida();
		
	}
	

	public void mostrarFecha() {
		System.out.println("Fecha: " + this.dia + "/" + this.mes + "/" + this.ano);
	}
	
	
	public boolean esBisiesto() {
		
		if ((this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public int diasMes() {
		
		int dias = 0;
		
		switch(this.mes) {
		case 1: dias = 31;
		break;
		case 2: if (esBisiesto()) {
            dias = 29;
        } else {
            dias = 28;
        }
        break;
		case 3: dias = 31;
		break;
		case 4: dias = 30;
		break;
		case 5: dias = 31;
		break;
		case 6: dias = 30;
		break;
		case 7: dias = 31;
		break;
		case 8: dias = 31;
		break;
		case 9: dias = 30;
		break;
		case 10: dias = 31;
		break;
		case 11: dias = 30;
		break;
		case 12: dias = 31;
		break;
		}
		return dias;
	}

	
	private void valida() {
		
		if (!(this.ano >= 1900 && this.ano <= 2050)) {
			this.ano = 1900;
		}
		
		if (!(this.mes >= 1 && this.mes <= 12)) {
			this.mes = 1;
		}
		
		if (!(this.dia >= 1 && this.dia <= this.diasMes())) {
			this.dia = 1;
		}
		
	}
	
	public void siguiente() {
		if(this.dia<this.diasMes()) {
			this.dia++;
		} else {
			this.dia=1;
			
			if (this.mes<12) {
				this.mes++;
			} else {
				this.dia=1;
				this.mes=1;
				
				if(this.ano<2025) {
					this.ano++;
				} else {
					this.ano=1900;
				}
				
			}
			
		}
	}
	
	public void anterior() {
		
		
		
	}
	
	public boolean esMayorQue(Fecha otraFecha) {
		boolean resultado = false;
		
		if (this.ano > otraFecha.ano) {
			resultado = true;
		} else if (this.ano == otraFecha.ano) {
			if (this.mes > otraFecha.mes) {
				resultado = true;
			} else if (this.mes == otraFecha.mes) {
				if(this.dia > otraFecha.dia) {
					resultado=true;
				}
			}
		}
		return resultado;
		
	}
	
	
	
}
