package common.core;

import java.sql.Connection;
import java.util.List;

import jws.dal.ConnectionHandler;
import jws.dal.Dal;

/**
 * 执行复杂的自定义SQL
 * @author fish
 *
 */
public class BaseDao <T>{
	
	public List<T> execute(T t,Class cl,String sql){
		Dal.getConnection(cl, new ConnectionHandler(){
			@Override
			public <T> T handle(Connection arg0) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		});
		return null;
	}
}
