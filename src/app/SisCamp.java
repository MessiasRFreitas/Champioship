package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Jogos;

public class SisCamp {

	public static void main(String[] args) {
		receberDados();
	}
	public static void receberDados() {
		Scanner sc = new Scanner(System.in);
		// List<Jogos> lj = new ArrayList<Jogos>();
		Jogos jg = new Jogos();
		System.out.print("Digite a data da partida (dd/mm/yyyy): ");
		String dataPartida = sc.nextLine();
		System.out.print("Digite o nome da Equipe Mandante: ");
		String eqMand = sc.nextLine();
		System.out.print("Digite o nome da Equipe Visitante: ");
		String eqVis = sc.nextLine();
		System.out.print("Local da partida: ");
		String localPartida = sc.nextLine();
		System.out.print("Numero de gols feitos pelo Mandante: ");
		int numGolsMand = sc.nextInt();
		System.out.print("Numero de gols feitos pelo Visitante: ");
		int numGolsVis = sc.nextInt();
		System.out.print("Numero de gols Cartões Amarelos recebidos pelo Mandante: ");
		int numCAMand = sc.nextInt();
		System.out.print("Numero de gols Cartões Amarelos recebidos pelo Visitante: ");
		int numCAVis = sc.nextInt();
		System.out.print("Numero de gols Cartões Vermelhos recebidos pelo Mandante: ");
		int numCVMand = sc.nextInt();
		System.out.print("Numero de gols Cartões Vermelhos recebidos pelo Visitante: ");
		int numCVVis = sc.nextInt();
		
		System.out.println(dataPartida+","+ eqMand+","+ eqVis+","+ localPartida+","+ numGolsMand+","+ numGolsVis+","+ numCAMand+","+ numCAVis+","+ numCVMand+","+ numCVVis);
		gravarArquivos(dataPartida, eqMand, eqVis, localPartida, numGolsMand, numGolsVis, numCAMand, numCAVis, numCVMand, numCVVis);
		sc.close();
	}

	public static void gravarArquivos(String dataPartida, String eqMand, String EqVis, String localPartida,
			int numGolsMand, int numGolsVis, int numCAMand, int numCAVis, int numCVMand, int numCVVis) {
		String path = "F:\\WORKSPACES\\ws-sds2\\Campeonato\\regJogos.txt";
		Jogos jg = new Jogos();
		// registrar na classe jogos
		jg.setDatajogo(dataPartida);
		jg.setEquipeMandante(eqMand);
		jg.setEquipeVisitante(EqVis);
		jg.setLocalJogo(localPartida);
		jg.setNumGolsMandante(numGolsMand);
		jg.setNumGolsVisitante(numGolsVis);
		jg.setNumCAmareloMand(numCAMand);
		jg.setNumCAmareloVis(numCAMand);
		jg.setNumCVermelhoMand(numCVVis);
		jg.setNumCVermelhoVis(numCVVis);
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));) {
			String dados = jg.getDatajogo() + "," + jg.getEquipeMandante() + "," + jg.getEquipeVisitante() + ","
					+ jg.getLocalJogo() + "," + String.valueOf(jg.getNumGolsMandante()) + "," + String.valueOf(jg.getNumGolsVisitante()) + ","
					+ String.valueOf(jg.getNumCAmareloMand()) + "," + String.valueOf(jg.getNumCAmareloVis()) + "," + String.valueOf(jg.getNumCVermelhoMand()) + ","
					+ String.valueOf(jg.getNumCVermelhoVis());
			bw.newLine();
			bw.write(dados);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		jg.toString();
	}

}
