package Patientdto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patientdto {
	@Id
	private String pid;
	private String pname;
	private String bg;
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBg() {
		return bg;
	}
	public void setBg(String bg) {
		this.bg = bg;
	}
}
