package joaoRodriguesDeMelo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aluguel {

	GregorianCalendar gc = new GregorianCalendar();

	private int cpf;
	private String placa;
	private Date comecoAluguel;
	private int diasDeAluguel;
	private int tipo;
	private double precoAluguel;

	public Aluguel(String placa, int cpf, int diasDeAluguel, double precoAluguel, Date comecoAluguel) {
		this.cpf = cpf;
		this.placa = placa;
		this.diasDeAluguel = diasDeAluguel;
		this.precoAluguel = precoAluguel;
		this.comecoAluguel = comecoAluguel;
		this.tipo = 0;
	}

	public Date dataFinal() {
		gc.setGregorianChange(comecoAluguel);
		gc.add(Calendar.DAY_OF_MONTH, diasDeAluguel);
		Date data;
		data = gc.getTime();
		return data;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Date getComecoAluguel() {
		return comecoAluguel;
	}

	public void setComecoAluguel(Date comecoAluguel) {
		this.comecoAluguel = comecoAluguel;
	}

	public int getDiasDeAluguel() {
		return diasDeAluguel;
	}

	public void setDiasDeAluguel(int diasDeAluguel) {
		this.diasDeAluguel = diasDeAluguel;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getPrecoAluguel() {
		return precoAluguel;
	}

	public void setPrecoAluguel(double precoAluguel) {
		this.precoAluguel = precoAluguel;
	}

}
