package applications;

public class Investimento {

	
	private double valorInicial;
	private double taxaDeJuros;
	private int anos;
	
	 //constructor
	public Investimento(double valorInicial, double taxaDeJuros, int anos) {
	        this.valorInicial = valorInicial;
	        this.taxaDeJuros = taxaDeJuros;
	        this.anos = anos;
	  }
	
	
	  //método
	  public double calcularValorFuturo() {
	        return valorInicial * Math.pow((1 + taxaDeJuros), anos);
	  }

	  
}
