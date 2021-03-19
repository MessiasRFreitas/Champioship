package entidades;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Jogos implements Serializable{
	private static final long serialVersionUID = 1L;
	private String datajogo;
	private String equipeMandante;
	private String equipeVisitante;
	private String localJogo;
	private int numGolsMandante;
	private int numGolsVisitante;
	private int numCAmareloMand;
	private int numCAmareloVis;
	private int numCVermelhoMand;
	private int numCVermelhoVis;
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Jogos() {
	}

	public Jogos(String datajg, String equipeMandante, String equipeVisitante, String localJogo, int numGolsMandante,
			int numGolsVisitante, int numCAmareloMand, int numCAmareloVis, int numCVermelhoMand, int numCVermelhoVis) throws ParseException {
		this.datajogo = sdf1.format(datajg);
		this.equipeMandante = equipeMandante;
		this.equipeVisitante = equipeVisitante;
		this.localJogo = localJogo;
		this.numGolsMandante = numGolsMandante;
		this.numGolsVisitante = numGolsVisitante;
		this.numCAmareloMand = numCAmareloMand;
		this.numCAmareloVis = numCAmareloVis;
		this.numCVermelhoMand = numCVermelhoMand;
		this.numCVermelhoVis = numCVermelhoVis;
	}

	public String getDatajogo() {
		return datajogo;
	}

	public void setDatajogo(String datajogo) {
		this.datajogo = datajogo;
	}

	public String getEquipeMandante() {
		return equipeMandante;
	}

	public void setEquipeMandante(String equipeMandante) {
		this.equipeMandante = equipeMandante;
	}

	public String getEquipeVisitante() {
		return equipeVisitante;
	}

	public void setEquipeVisitante(String equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}

	public String getLocalJogo() {
		return localJogo;
	}

	public void setLocalJogo(String localJogo) {
		this.localJogo = localJogo;
	}

	public int getNumGolsMandante() {
		return numGolsMandante;
	}

	public void setNumGolsMandante(int numGolsMandante) {
		this.numGolsMandante = numGolsMandante;
	}

	public int getNumGolsVisitante() {
		return numGolsVisitante;
	}

	public void setNumGolsVisitante(int numGolsVisitante) {
		this.numGolsVisitante = numGolsVisitante;
	}

	public int getNumCAmareloMand() {
		return numCAmareloMand;
	}

	public void setNumCAmareloMand(int numCAmareloMand) {
		this.numCAmareloMand = numCAmareloMand;
	}

	public int getNumCAmareloVis() {
		return numCAmareloVis;
	}

	public void setNumCAmareloVis(int numCAmareloVis) {
		this.numCAmareloVis = numCAmareloVis;
	}

	public int getNumCVermelhoMand() {
		return numCVermelhoMand;
	}

	public void setNumCVermelhoMand(int numCVermelhoMand) {
		this.numCVermelhoMand = numCVermelhoMand;
	}

	public int getNumCVermelhoVis() {
		return numCVermelhoVis;
	}

	public void setNumCVermelhoVis(int numCVermelhoVis) {
		this.numCVermelhoVis = numCVermelhoVis;
	}

	@Override
	public String toString() {
		return "Jogos [datajogo=" + datajogo + ", equipeMandante=" + equipeMandante + ", equipeVisitante="
				+ equipeVisitante + ", localJogo=" + localJogo + ", numGolsMandante=" + numGolsMandante
				+ ", numGolsVisitante=" + numGolsVisitante + ", numCAmareloMand=" + numCAmareloMand
				+ ", numCAmareloVis=" + numCAmareloVis + ", numCVermelhoMand=" + numCVermelhoMand + ", numCVermelhoVis="
				+ numCVermelhoVis + "]";
	}
	
	
	
}
