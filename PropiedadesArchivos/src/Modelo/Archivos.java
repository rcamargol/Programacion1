package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Archivos {
	private File f;
	private FileWriter fw;
	private FileReader fr;
	private PrintWriter pw;
	private BufferedReader br;
	
	public File getF() {
		return f;
	}
	public void setF(File f) {
		this.f = f;
	}
	public FileWriter getFw() {
		return fw;
	}
	public void setFw(FileWriter fw) {
		this.fw = fw;
	}
	public FileReader getFr() {
		return fr;
	}
	public void setFr(FileReader fr) {
		this.fr = fr;
	}
	public PrintWriter getPw() {
		return pw;
	}
	public void setPw(PrintWriter pw) {
		this.pw = pw;
	}
	public BufferedReader getBr() {
		return br;
	}
	public void setBr(BufferedReader br) {
		this.br = br;
	}
	
}
