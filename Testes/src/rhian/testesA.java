package rhian;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class testesA {
	

	@Test
	 public void testCandidatoInvalido() {
		 boolean b = rhian.CalculosTestes.validarCandidato("Rhian");//nomes: Pedro, Paulo, Vitor, Jo�o
		 assertFalse("Candidato v�lido",b);
	 }
	
	 public void testInscricaoValido() {
		 boolean b = rhian.CalculosTestes.validarInscricao(154895); //Numero de Inscri��o 154895, 143658, 345698, 443784
		 assertTrue("Inscri��o inv�lida",b);
	 }


	 public void testCandidatoValido() {
		 boolean b = rhian.CalculosTestes.validarCandidato("Pedro");//nomes: Pedro, Paulo, Vitor, Jo�o
		 assertTrue("Candidato inv�lido",b);
	 }
	 
	 public void testInscricaoInvalido() {
		 boolean b = rhian.CalculosTestes.validarInscricao(123456); //Numero de Inscri��o 154895, 143658, 345698, 443784
		 assertFalse("Inscri��o v�lida",b);
	 }
	 
	 public void testGabaritoCompleto() {
		 boolean b = rhian.CalculosTestes.validarGabarito(1); //numero do gabarito 1 ou 2
		 assertFalse("Cart�o-Resposta Incompleto",b);
	 }
	 
	
	 public void testGabaritoIncompleto() {
		 boolean b = rhian.CalculosTestes.validarGabarito(2); //numero do gabarito 1 ou 2
		 assertTrue("Cart�o-Resposta Completo",b);
	 }
	 
	 public void testDesistencia() {
		 boolean b = rhian.CalculosTestes.validarDesistencia("Vitor"); //nomes: Pedro, Paulo, Vitor, Jo�o
		 assertTrue("Candidato n�o desistente",b);
	 }
	 
	 public void testGabaritoCorreto() {
		 ArrayList<String> gabaritoCorreto = new ArrayList<>();
		 gabaritoCorreto.add("D");
		 gabaritoCorreto.add("E");
		 gabaritoCorreto.add("C");
		 gabaritoCorreto.add("A");
		 boolean b = rhian.CalculosTestes.correcaoGabarito(1,gabaritoCorreto.get(0),gabaritoCorreto.get(1),gabaritoCorreto.get(2),
				 gabaritoCorreto.get(3)); //numero do gabarito 1 ou 2
		 assertTrue("Cart�o-Resposta preenchido incorretamente",b);
	 }
	 
	 public void testGabaritoExist() {
			 boolean b = rhian.CalculosTestes.validarGabaritoExist(2); //numero do gabarito 1 ou 2
			 assertTrue("Cart�o-Resposta inexistente",b);
		 }
	 
	public void testValidarPresenca() {
		boolean b = rhian.CalculosTestes.validarPresenca("Jo�o"); //nomes: Pedro, Paulo, Vitor, Jo�o
		assertTrue("Candidato faltoso",b);
	}
	
		


}