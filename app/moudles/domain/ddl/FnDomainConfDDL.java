package moudles.domain.ddl;

import jws.dal.annotation.Column;
import jws.dal.annotation.GeneratedValue;
import jws.dal.annotation.GenerationType;
import jws.dal.annotation.Id;
import jws.dal.annotation.Table;
import jws.dal.common.DbType;
/**
 * 
 * @author auto
 * @createDate 2016-07-01 15:38:06
 **/
@Table(name="fn_domain_conf")
public class FnDomainConfDDL{
	@Id
	@GeneratedValue(generationType= GenerationType.Auto)
	@Column(name="id", type=DbType.Int)
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id){
		this.id=id;
	}

	@Column(name="domain_name", type=DbType.Varchar)
	private String domainName;
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName){
		this.domainName=domainName;
	}

	@Column(name="domain_ip", type=DbType.Varchar)
	private String domainIp;
	public String getDomainIp() {
		return domainIp;
	}
	public void setDomainIp(String domainIp){
		this.domainIp=domainIp;
	}

	public static FnDomainConfDDL newExample(){
		FnDomainConfDDL object=new FnDomainConfDDL();
		object.setId(null);
		object.setDomainName(null);
		object.setDomainIp(null);
		return object;
	}
}
