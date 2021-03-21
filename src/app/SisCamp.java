package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Jogos;

public class SisCamp {

	public static void main(String[] args) throws ParseException {
		receberDados();
	}
	public static void receberDados() throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		/*Jogos jg = new Jogos();
		System.out.print("Digite a data da partida (dd/mm/yyyy): ");
		String dtPartida = sc.nextLine();
		Date dataPartida = new SimpleDateFormat("dd/MM/yyyy").parse(dtPartida);*/
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
		sc.nextLine();
		
		System.out.println("X-X-X-X-X-X-X- RESULTADO DA GRAVAÇÃO -X-X-X-X-X-X-");
		System.out.println(eqMand+","+ eqVis+","+ localPartida+","+ numGolsMand+","+ numGolsVis+","+ numCAMand+","+ numCAVis+","+ numCVMand+","+ numCVVis);
		gravarArquivo(eqMand, eqVis, localPartida, numGolsMand, numGolsVis, numCAMand, numCAVis, numCVMand, numCVVis);
		//lerArquivo();
		lerArquivo(eqMand, eqVis, localPartida, numGolsMand, numGolsVis, numCAMand, numCAVis, numCVMand, numCVVis);

		sc.close();

	}
	

	public static void gravarArquivo(String eqMand, String EqVis, String localPartida,
			int numGolsMand, int numGolsVis, int numCAMand, int numCAVis, int numCVMand, int numCVVis) throws ParseException {
		String path = "F:\\WORKSPACES\\ws-sds2\\Campeonato\\regJogos.txt";
		Jogos jg = new Jogos();
		//SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		// registrar na classe jogos
		//Date dp = dataPartida;
		//Date dp = sdf1.parse(dataPartida);
		//jg.setDatajogo(dp);
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
			String dados = jg.getEquipeMandante() + "," + jg.getEquipeVisitante() + ","
					+ jg.getLocalJogo() + "," + String.valueOf(jg.getNumGolsMandante()) + "," + String.valueOf(jg.getNumGolsVisitante()) + ","
					+ String.valueOf(jg.getNumCAmareloMand()) + "," + String.valueOf(jg.getNumCAmareloVis()) + "," + String.valueOf(jg.getNumCVermelhoMand()) + ","
					+ String.valueOf(jg.getNumCVermelhoVis());
			bw.newLine();
			bw.write(dados);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}


	}
	public static void lerArquivo(String eqMand, String EqVis, String localPartida,
			int numGolsMand, int numGolsVis, int numCAMand, int numCAVis, int numCVMand, int numCVVis) throws ParseException {

		String path = "F:\\WORKSPACES\\ws-sds2\\Campeonato\\regJogos.txt";
		Jogos jg = new Jogos();	
		List<Jogos> lj = new ArrayList<Jogos>();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		try (BufferedReader br = new BufferedReader(new FileReader(path));) {
			
			String line = br.readLine();
			line = br.readLine();
			System.out.println("X-X-X-X-X-X-X- RESULTADO DA LEITURA -X-X-X-X-X-X-");		
			System.out.printf("%-15s %-15s %-15s %-8s %-5s %-5s %-5s %-5s %-5s","MANDANTE","VISITANTE","LOCAL","GOLS-MAND","GOLS-VISIT","CA-MAND", "CA-VISIT", "CV-MAND","CV-VISIT"+ "\n");

			while(line != null) {				
				String[] vect = line.split(",");  
				String equipeMandante = vect[0];
				String equipeVisitante = vect[1];
				String localJogo = vect[2];
				int numGolsMandante = Integer.parseInt(vect[3]);
				int numGolsVisitante = Integer.parseInt(vect[4]);
				int numCAmareloMand = Integer.parseInt(vect[5]);
				int numCAmareloVis = Integer.parseInt(vect[6]);
				int numCVermelhoMand = Integer.parseInt(vect[7]);
				int numCVermelhoVis = Integer.parseInt(vect[8]);

				Jogos jogos = new Jogos(equipeMandante, equipeVisitante, localJogo, numGolsMandante, numGolsVisitante, 
						numCAmareloMand, numCAmareloVis, numCVermelhoMand, numCVermelhoVis);
				lj.add(jogos);
				line = br.readLine();
				
			}
			for(Jogos j : lj) {
				System.out.println(j);
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		jg.toString();		
	}


}
