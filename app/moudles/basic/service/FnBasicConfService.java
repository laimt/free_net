package moudles.basic.service;

import java.util.List;

import moudles.basic.dao.FnBasicConfAutoDao;
import utils.paramVlidate.IntegerUtil;
import constants.GlobalConstants;
import controllers.web.dto.response.FnBasicConfModel;

public class FnBasicConfService {
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
		return FnBasicConfAutoDao.list(page, pageSize);
	}
	
	public static int count() {
		return FnBasicConfAutoDao.count();
	}
}
