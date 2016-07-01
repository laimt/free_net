package common.role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 角色类型
 * 
 * @createDate 2015年4月27日
 * 
 */
public enum RoleType {
	/**
	 * 8868运营人员
	 */
	ADMIN(0, 1L << 0, "ChannelMng.list","后台管理人员"),
	
	READ_ALL(5, 1L << 5, "ChannelMng.list","查看权限"),
	;
	
	/**
	 * 值（类似id）
	 */
	private Integer value;
	
	/**
	 * 权限标记
	 */
	private Long privilegeFlag;
	
	/**
	 * 权限默认关联页面
	 */
	private String page;
	
	/**
	 * 权限中文名
	 */
	private String cnName;
	
	private RoleType(Integer value, Long privilegeFlag, String page,String cnName) {
		this.value = value;
		this.privilegeFlag = privilegeFlag;
		this.page = page;
		this.cnName = cnName;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public Long getPrivilegeFlag() {
		return privilegeFlag;
	}
	
	public String getPage() {
		return page;
	}
	

    public String getCnName() {
        return cnName;
    }

    public static RoleType getRoleType(Integer value) {
		if(value == null) {
			return null;
		}
		for(RoleType roleType: RoleType.values()) {
			if (roleType.value.equals(value)) {
				return roleType;
			}
		}
		return null;
	}
    
    public static List<RoleType> list(){
        RoleType[] roles = RoleType.values();
        return Arrays.asList(roles);
    }
}
