package moudles.basic.dao;

import java.util.List;

import jws.dal.Dal;
import jws.dal.sqlbuilder.Condition;
import moudles.basic.ddl.FnBasicConfDDL;
import utils.paramVlidate.IntegerUtil;
import common.dao.QueryConnectionHandler;
import constants.GlobalConstants;
import controllers.web.dto.response.FnBasicConfModel;

public class FnBasicConfAutoDao {
	/**
	 * 列出符合条件的所有记录
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public static List<FnBasicConfModel> list(Integer page, Integer pageSize) {
		if(IntegerUtil.isNotNullAndLargeThanZero(page)) {
			page = GlobalConstants.DEFAULT_PAGE;
		}
		if(IntegerUtil.isNotNullAndLargeThanZero(pageSize)) {
			pageSize = GlobalConstants.DEFAULT_PAGE_SIZE;
		}
		StringBuilder sb = new StringBuilder("select b.id,b.enabled,b.password,b.encry_method encryMethod,b.protocal, ")
		.append(" b.port,b.domain_conf_id domainConfId,date_format(b.create_time,'%Y-%m-%d %T') createTime,date_format(b.modify_time,'%Y-%m-%d %T') modifyTime, ")
		.append(" c.domain_name domainName, c.domain_ip domainIp")
        .append(" from fn_basic_conf b, fn_domain_conf c where b.domain_conf_id=c.id " );
		
		//起始行
		int i = (page-1) * pageSize;
		sb.append(" limit ").append( i +","+pageSize);
	
		FnBasicConfModel t = new FnBasicConfModel();
		return Dal.getConnection(GlobalConstants.dbSource, new QueryConnectionHandler(t,sb.toString()));
	}
	
	public static int count() {
		Condition cond = new Condition("FnBasicConfDDL.id", ">", 0);
		return Dal.count(cond, null);
	}
}
