package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class pruebaExcepciones2 {
	
	//throws io se que va ocurrir pero asi lo muestro se propaga al contexto de llamada
	//checked hay que capturarlas, hacer el throws, unchecked no
	//throws no deberia estar en el main
	//si tenemos una checek como myOther declaracion throws en la cabecera del metodo, si varias x,  x, x, x
	public static void main(String[] args) throws MyOtherException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new java.io.InputStreamReader(System.in));
		
		throw new MyOtherException();
		
	}

}
