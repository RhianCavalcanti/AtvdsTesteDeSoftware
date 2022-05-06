package rhian;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.junit.Test;

public class CalculosTestes {
	@Test
	public static boolean validarCandidato(String nome) {
		ArrayList<String> listNomeCandidato = new ArrayList<>();
		listNomeCandidato.add("Pedro");
		listNomeCandidato.add("João");
		listNomeCandidato.add("Victor");
		if (listNomeCandidato.contains(nome)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean validarInscricao(Integer numero) {
		ArrayList<Integer> listInscricao = new ArrayList<>();
		listInscricao.add(154895); 
		listInscricao.add(143658);
		listInscricao.add(345698);
		listInscricao.add(443784);
		if (listInscricao.contains(numero)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean validarGabarito(Integer numerogabarito) {
		ArrayList<String> gabarito1 = new ArrayList<>();
		gabarito1.add("A");
		gabarito1.add("B");
		gabarito1.add("C");
		gabarito1.add("D");
		ArrayList<String> gabarito2 = new ArrayList<>();
		gabarito2.add("A");
		gabarito2.add("B");
		gabarito2.add("C");
		gabarito2.add(null);
		ArrayList<List> gabaritos = new ArrayList<>();
		gabaritos.add(gabarito2);
		gabaritos.add(gabarito1);
		int vargabarito=numerogabarito-1;
		if (gabaritos.get(vargabarito).contains(null)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean validarDesistencia(String nome) {
		HashMap<String,String> candidatos = new HashMap<>();
		candidatos.put("Pedro",null);
		candidatos.put("João",null);
		candidatos.put("Vitor","Desistente");
		candidatos.put("Paulo",null);
		if (candidatos.get(nome)=="Desistente") {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean validarPresenca(String nome) {
		HashMap<String,String> candidatos = new HashMap<>();
		candidatos.put("Pedro",null);
		candidatos.put("João","Falta");
		candidatos.put("Vitor",null);
		candidatos.put("Paulo",null);
		if (candidatos.get(nome)=="Falta") {
			return false;
		}
		else {
			return true;
		}
	}
	public static boolean correcaoGabarito(Integer numerogabarito,String resposta1, String resposta2, String resposta3, String resposta4) {
		ArrayList<String> gabarito1 = new ArrayList<>();
		gabarito1.add("A");
		gabarito1.add("B");
		gabarito1.add("C");
		gabarito1.add("D");
		ArrayList<String> gabarito2 = new ArrayList<>();
		gabarito2.add("D");
		gabarito2.add("E");
		gabarito2.add("C");
		gabarito2.add("A");
		ArrayList<List> gabaritos = new ArrayList<>();
		gabaritos.add(gabarito2);
		gabaritos.add(gabarito1);
		int vargabarito=numerogabarito-1;
		int totalpontos = 0;
		if (gabaritos.get(vargabarito).get(0)==resposta1) {
			totalpontos=totalpontos+1;
		}
		if (gabaritos.get(vargabarito).get(1)==resposta2) {
			totalpontos=totalpontos+1;
		}
		if (gabaritos.get(vargabarito).get(2)==resposta3) {
			totalpontos=totalpontos+1;
		}
		if (gabaritos.get(vargabarito).get(3)==resposta4) {
			totalpontos=totalpontos+1;
		}
		if(totalpontos==4) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean validarGabaritoExist(Integer numerogabarito) {
		ArrayList<String> gabarito1 = new ArrayList<>();
		gabarito1.add("A");
		gabarito1.add("B");
		gabarito1.add("C");
		gabarito1.add("D");
		ArrayList<String> gabarito2 = new ArrayList<>();
		gabarito2.add("D");
		gabarito2.add("E");
		gabarito2.add("C");
		gabarito2.add("A");
		ArrayList<List> gabaritos = new ArrayList<>();
		gabaritos.add(gabarito2);
		gabaritos.add(gabarito1);
		int vargabarito=numerogabarito-1;
		if(gabaritos.get(vargabarito)!=null) {
			return true;
		}
		else {
			return false;
		}
	}
}
