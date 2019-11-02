package bernd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Country{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String iso;
    private String nicename;
    private String name;
    private String iso3;
    private Integer numcode;
    private Integer phonecode;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIso() {
		return iso;
	}
	public void setIso(String iso) {
		this.iso = iso;
	}
	public String getNicename() {
		return nicename;
	}
	public void setNicename(String nicename) {
		this.nicename = nicename;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIso3() {
		return iso3;
	}
	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}
	public Integer getNumcode() {
		return numcode;
	}
	public void setNumcode(Integer numcode) {
		this.numcode = numcode;
	}
	public Integer getPhonecode() {
		return phonecode;
	}
	public void setPhonecode(Integer phonecode) {
		this.phonecode = phonecode;
	}
    
}
