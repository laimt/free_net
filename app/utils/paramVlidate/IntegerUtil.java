package utils.paramVlidate;

public class IntegerUtil {
	
	/**
	 * 
	 * @param var
	 * @return
	 */
	public static boolean isNotNullAndLargeThanZero(Integer var) {
		if(null != var && var > 0) {
			return false;
		}
		return true;
	}
}
