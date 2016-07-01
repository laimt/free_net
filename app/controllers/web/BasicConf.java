package controllers.web;

import java.util.ArrayList;
import java.util.List;

import moudles.basic.service.FnBasicConfService;
import common.annotation.GuestAuthorization;
import common.core.Pager;
import common.core.WebController;
import constants.GlobalConstants;
import controllers.web.dto.response.FnBasicConfModel;
import exception.BusinessException;

public class BasicConf extends WebController {

	@GuestAuthorization
	public static void list(int page, int pageSize) throws BusinessException{
		if(page <= 0) {
			page = GlobalConstants.DEFAULT_PAGE;
		}
		if(pageSize <= 0) {
			pageSize = GlobalConstants.DEFAULT_PAGE_SIZE;
		}
		int count = FnBasicConfService.count();
		List<FnBasicConfModel> result = FnBasicConfService.list(page, pageSize);
		if(null == result) {
			result = new ArrayList<FnBasicConfModel>();
		}
		
		Pager<FnBasicConfModel> pageData = new Pager<FnBasicConfModel>(count, page, pageSize);
		pageData.setList(result);
		
		renderTemplate("web/basicConf/rel.html", pageData, page);
	}
	
}
