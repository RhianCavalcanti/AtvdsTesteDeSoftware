package rhian;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class testesA {
	

	@Test
	 public void testCandidatoInvalido() {
		 boolean b = rhian.CalculosTestes.validarCandidato("Rhian");//nomes: Pedro, Paulo, Vitor, João
		 assertFalse("Candidato válido",b);
	 }
	
	 public void testInscricaoValido() {
		 boolean b = rhian.CalculosTestes.validarInscricao(154895); //Numero de Inscrição 154895, 143658, 345698, 443784
		 assertTrue("Inscrição inválida",b);
	 }


	 public void testCandidatoValido() {
		 boolean b = rhian.CalculosTestes.validarCandidato("Pedro");//nomes: Pedro, Paulo, Vitor, João
		 assertTrue("Candidato inválido",b);
	 }
	 
	 public void testInscricaoInvalido() {
		 boolean b = rhian.CalculosTestes.validarInscricao(123456); //Numero de Inscrição 154895, 143658, 345698, 443784
		 assertFalse("Inscrição válida",b);
	 }
	 
	 public void testGabaritoCompleto() {
		 boolean b = rhian.CalculosTestes.validarGabarito(1); //numero do gabarito 1 ou 2
		 assertFalse("Cartão-Resposta Incompleto",b);
	 }
	 
	
	 public void testGabaritoIncompleto() {
		 boolean b = rhian.CalculosTestes.validarGabarito(2); //numero do gabarito 1 ou 2
		 assertTrue("Cartão-Resposta Completo",b);
	 }
	 
	 public void testDesistencia() {
		 boolean b = rhian.CalculosTestes.validarDesistencia("Vitor"); //nomes: Pedro, Paulo, Vitor, João
		 assertTrue("Candidato não desistente",b);
	 }
	 
	 public void testGabaritoCorreto() {
		 ArrayList<String> gabaritoCorreto = new ArrayList<>();
		 gabaritoCorreto.add("D");
		 gabaritoCorreto.add("E");
		 gabaritoCorreto.add("C");
		 gabaritoCorreto.add("A");
		 boolean b = rhian.CalculosTestes.correcaoGabarito(1,gabaritoCorreto.get(0),gabaritoCorreto.get(1),gabaritoCorreto.get(2),
				 gabaritoCorreto.get(3)); //numero do gabarito 1 ou 2
		 assertTrue("Cartão-Resposta preenchido incorretamente",b);
	 }
	 
	 public void testGabaritoExist() {
			 boolean b = rhian.CalculosTestes.validarGabaritoExist(2); //numero do gabarito 1 ou 2
			 assertTrue("Cartão-Resposta inexistente",b);
		 }
	 
	public void testValidarPresenca() {
		boolean b = rhian.CalculosTestes.validarPresenca("João"); //nomes: Pedro, Paulo, Vitor, João
		assertTrue("Candidato faltoso",b);
	}
	
		


}