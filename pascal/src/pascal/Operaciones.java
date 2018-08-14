package pascal;

public class Operaciones {
	int factorial(int n){
		int fact = 1;
		for (int i=1;i<=n;i++){
			fact*=i;
		}
		return fact;
	}
	int coeficiente(int i, int j){
		int coef = 1;
		coef = this.factorial(i)/(this.factorial(j)*this.factorial(i-j));
		return coef;
	}
}
