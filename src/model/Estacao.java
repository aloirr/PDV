package model;

public class Estacao {
	
	private String id,ip,status,infoAdicional;

	private Estacao(String id, String ip, String status, String infoAdicional) {
		super();
		this.id = id;
		this.ip = ip;
		this.status = status;
		this.infoAdicional = infoAdicional;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInfoAdicional() {
		return infoAdicional;
	}

	public void setInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
	

}
