package model;

public class Estacao {
	private int id;
	private String ip, status, infoAdicional;

	private Estacao(int id, String ip, String status, String infoAdicional) {
		this.id = id;
		this.ip = ip;
		this.status = status;
		this.infoAdicional = infoAdicional;
	}

	public Estacao() {
	};

	public static class EstacaoBuilder {
		private int id;
		private String ip, status, infoAdicional;

		public EstacaoBuilder id(int id) {
			this.id = id;
			return this;
		}

		public EstacaoBuilder ip(String ip) {
			this.ip = ip;
			return this;
		}

		public EstacaoBuilder status(String status) {
			this.status = status;
			return this;
		}

		public EstacaoBuilder infoAdicional(String infoAdicional) {
			this.infoAdicional = infoAdicional;
			return this;
		}

		public Estacao build() {
			return new Estacao(id, ip, status, infoAdicional);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
