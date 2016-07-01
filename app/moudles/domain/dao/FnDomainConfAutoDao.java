package moudles.domain.dao;

import java.util.ArrayList;
import java.util.List;

import constants.GlobalConstants;
import jws.dal.Dal;
import jws.dal.sqlbuilder.Condition;
import jws.dal.sqlbuilder.Shard;
import jws.dal.sqlbuilder.Sort;
import moudles.domain.ddl.FnDomainConfDDL;
import utils.DaoUtil;
import utils.paramVlidate.IntegerUtil;
/**
 *  Dao
 * @author auto
 * @createDate 2016-07-01 15:38:06
 **/
public class FnDomainConfAutoDao{
	public static boolean insert (FnDomainConfDDL param,Shard shard){
		if(param==null){return false;}
		if(Dal.rowcacheInsert(param) >0){
			listCacheUpdate(param,shard);
			return true;
		}
		return false;
	}
	public static boolean delete (long id,Shard shard){
		if(id<0){return false;}
		FnDomainConfDDL param = get(id);
		if(Dal.rowcacheDelete(FnDomainConfDDL.class,id,shard)>0){
			listCacheUpdate(param,shard);
			return true;
		}
		return false;
	}
	public static boolean update (FnDomainConfDDL param,String update,Shard shard){
		if(param==null){return false;}
		FnDomainConfDDL old = get(param.getId());		if(Dal.rowcacheUpdate(param,update,shard)>0){
			listCacheUpdate(param,shard);
			listCacheUpdate(old,shard);
			return true;
		}
		return false;
	}
	public static FnDomainConfDDL get(long id){
		return Dal.rowcacheSelect(FnDomainConfDDL.class,id);
	}
	public static void listCacheUpdate(FnDomainConfDDL ddl,Shard shard){
//		Dal.listcacheUpdate("fn_domain_conf_listByDomainName",ddl,shard);
	}
	
	/**
	 * 列出所有符合条件的列表
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public static List<FnDomainConfDDL> list(Integer page, Integer pageSize) {
		if(!IntegerUtil.isNotNullAndLargeThanZero(page)) {
			page = GlobalConstants.DEFAULT_PAGE;
		}
		if(!IntegerUtil.isNotNullAndLargeThanZero(pageSize)) {
			pageSize = GlobalConstants.DEFAULT_PAGE_SIZE;
		}
		Condition cond = new Condition("FnDomainConfDDL.id", ">", 0);
		
		return Dal.select(DaoUtil.genAllFields(FnDomainConfDDL.class), cond, new Sort("FnDomainConfDDL.id", false), 
				(page-1)*pageSize, pageSize, null);
	}
}
