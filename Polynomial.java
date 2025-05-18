public class Polynomial{
	double[] coeffs;
	public Polynomial(){
	}
	public Polynomial (double[] coeffs){
		this.coeffs = coeffs;
	}
	
	public Polynomial add(Polynomial poly) {
		for(int i = 0; i < Math.min(poly.coeffs.length, this.coeffs.length); i++){
			this.coeffs[i] += poly.coeffs[i];
		}
		if(poly.coeffs.length > this.coeffs.length){
			for(int i = 0; i < this.coeffs.length; i++){
				poly.coeffs[i] = this.coeffs[i];
			}
			return poly;
		}
		return this;
	}
	
	public double evaluate(double x){
		if(this.coeffs == null) {
			return 0;
		}
		double n = 0;
		for(int i = 0; i < this.coeffs.length; i++){
			n += this.coeffs[i] * (Math.pow(x, i));
		}
		return n;
	}
	
	public boolean hasRoot(int x){
		return (this.evaluate(x) == 0);
	}
}