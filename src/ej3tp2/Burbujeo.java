package ej3tp2;

public class Burbujeo {
	
	// Algoritmo de Ordenamiento por Burbujeo sacado de las filminas de clase	
	
	public static void ordenarPorBurbujeo(int [] A){
        int i, j, aux;
        for(i=0;i<A.length-1;i++)
             for(j=0;j<A.length-i-1;j++)
                  if(A[j+1]<A[j]){
                     aux=A[j+1];
                     A[j+1]=A[j];
                     A[j]=aux;
                  }
}

}
