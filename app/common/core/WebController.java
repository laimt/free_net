package common.core;
 

import org.apache.commons.lang.StringUtils;
import common.annotation.GuestAuthorization;
import exception.BusinessException;
import jws.Jws;
import jws.Logger;
import jws.mvc.Before;
import jws.mvc.Catch;

public class WebController extends BaseController {
  	protected static String loginTpl = "index.html";
	@Before
	protected static void beforeAction() throws SecurityException, NoSuchMethodException, BusinessException {
		if(getActionAnnotation(GuestAuthorization.class) != null) {
			return;
		}
	}
	
	/**
	 * 初始化全局参数
	 * 
	 * @author chenxx
	 */
	private static void initParams() {}
	
	@Catch(Exception.class)
	protected static void onException(Throwable throwable) {
		
		if (throwable instanceof BusinessException){
			BusinessException be = (BusinessException)throwable;
			Logger.warn(throwable, "@Catch Exception: " + be.getMessage());
			String msg = be.getMessage();
			renderTemplate("errors/error.html", msg);
		} else {
			Logger.error(throwable, "Unknown Exception: " + throwable.getMessage());
		}
	}
	
	protected static void renderError(String msg) {
		renderTemplate("errors/error.html", msg);
	}
	
}
