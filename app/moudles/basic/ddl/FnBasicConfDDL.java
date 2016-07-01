package moudles.basic.ddl;

import jws.dal.annotation.Column;
import jws.dal.annotation.GeneratedValue;
import jws.dal.annotation.GenerationType;
import jws.dal.annotation.Id;
import jws.dal.annotation.Table;
import jws.dal.common.DbType;
/**
 * 
 * @author auto
 * @createDate 2016-07-01 15:45:15
 **/
@Table(name="fn_basic_conf")
public class FnBasicConfDDL{
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

	@Column(name="enabled", type=DbType.Int)
	private Integer enabled;
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled){
		this.enabled=enabled;
	}

	@Column(name="password", type=DbType.Varchar)
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}

	@Column(name="encry_method", type=DbType.Varchar)
	private String encryMethod;
	public String getEncryMethod() {
		return encryMethod;
	}
	public void setEncryMethod(String encryMethod){
		this.encryMethod=encryMethod;
	}

	@Column(name="protocal", type=DbType.Int)
	private Integer protocal;
	public Integer getProtocal() {
		return protocal;
	}
	public void setProtocal(Integer protocal){
		this.protocal=protocal;
	}

	@Column(name="port", type=DbType.Int)
	private Integer port;
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port){
		this.port=port;
	}

	@Column(name="domain_conf_id", type=DbType.Int)
	private Integer domainConfId;
	public Integer getDomainConfId() {
		return domainConfId;
	}
	public void setDomainConfId(Integer domainConfId){
		this.domainConfId=domainConfId;
	}

	@Column(name="create_time", type=DbType.DateTime)
	private Long createTime;
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime){
		this.createTime=createTime;
	}

	@Column(name="modify_time", type=DbType.DateTime)
	private Long modifyTime;
	public Long getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Long modifyTime){
		this.modifyTime=modifyTime;
	}

	public static FnBasicConfDDL newExample(){
		FnBasicConfDDL object=new FnBasicConfDDL();
		object.setId(null);
		object.setEnabled(null);
		object.setPassword(null);
		object.setEncryMethod(null);
		object.setProtocal(null);
		object.setPort(null);
		object.setDomainConfId(null);
		object.setCreateTime(null);
		object.setModifyTime(null);
		return object;
	}
}
