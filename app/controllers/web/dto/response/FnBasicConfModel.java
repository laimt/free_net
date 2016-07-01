package controllers.web.dto.response;

import jws.dal.annotation.Column;
import jws.dal.annotation.GeneratedValue;
import jws.dal.annotation.GenerationType;
import jws.dal.annotation.Id;
import jws.dal.common.DbType;

public class FnBasicConfModel {
	private Integer id;
	private Integer enabled;
	private String password;
	private String encryMethod;
	private Integer protocal;
	private Integer port;
	private Integer domainConfId;
	private String domainName;
	private String domainIp;
	private String createTime;
	private String modifyTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEncryMethod() {
		return encryMethod;
	}
	public void setEncryMethod(String encryMethod) {
		this.encryMethod = encryMethod;
	}
	public Integer getProtocal() {
		return protocal;
	}
	public void setProtocal(Integer protocal) {
		this.protocal = protocal;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public Integer getDomainConfId() {
		return domainConfId;
	}
	public void setDomainConfId(Integer domainConfId) {
		this.domainConfId = domainConfId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public String getDomainIp() {
		return domainIp;
	}
	public void setDomainIp(String domainIp) {
		this.domainIp = domainIp;
	}
}
