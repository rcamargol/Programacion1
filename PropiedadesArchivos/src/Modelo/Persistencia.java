package Modelo;


//Representa los datos de persistencia que van a ser utilizados por el mundo y/o controlador
//es opcional: puede o no tener datos.


public class Persistencia {
	
	//private String rutatest = "C:\\Users\\RicardoD\\Downloads\\ArchivosSegundoParcial-1\\zzz-test\\";
	private String archivo = "C:/data/RepasoFundamentos.zip";
	private String archivoProp = "C:\\data\\archivo.properties";
	private String archivoProject = "C:\\Users\\RicardoD\\Downloads\\ArchivosSegundoParcial-1\\zzz-test\\";

	public String getArchivo() {
		return this.archivo;
	}

	public String getArchivoProject() {
		return archivoProject;
	}

	public void setArchivoProject(String archivoProject) {
		this.archivoProject = archivoProject;
	}

	public String getArchivoProp() {
		return archivoProp;
	}

	public void setArchivoProp(String archivoProp) {
		this.archivoProp = archivoProp;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}
	
	public String setXML(String nombre) {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<projectDescription>\r\n" + 
				"	<name>"+nombre+"</name>\r\n" + 
				"	<comment></comment>\r\n" + 
				"	<projects>\r\n" + 
				"	</projects>\r\n" + 
				"	<buildSpec>\r\n" + 
				"		<buildCommand>\r\n" + 
				"			<name>org.eclipse.jdt.core.javabuilder</name>\r\n" + 
				"			<arguments>\r\n" + 
				"			</arguments>\r\n" + 
				"		</buildCommand>\r\n" + 
				"	</buildSpec>\r\n" + 
				"	<natures>\r\n" + 
				"		<nature>org.eclipse.jdt.core.javanature</nature>\r\n" + 
				"	</natures>\r\n" + 
				"</projectDescription>";
		return xml;
	}
	
}
