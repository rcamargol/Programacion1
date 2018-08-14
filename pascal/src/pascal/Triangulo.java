package pascal;

public class Triangulo extends Operaciones{
	void generarTriangulo(int terminos){
		int i,j,res=0;
		for (i=0;i<=terminos; i++){
			for(j=0;j<=i;j++){
				res=this.coeficiente(i, j);
				System.out.print("("+i+","+j+"):"+res+" ");
			}
			System.out.println("");
		}
	}
}
