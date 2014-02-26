/**
 * 下发表错误码
 * @author 1207264
 *
 */
public class SendErrCode {
	private int response;
	private int err;
	private int status;
	private int stat;
	private String fail_desc;
	private String detail;
	
	/**
	 * 提交运营商失败
	 */
	public static final SendErrCode submitErr = new SendErrCode(-1000,-1000,-1000,-1000,"UNDELIV");
	/**
	 * 提交运营商无响应
	 */
	public static final SendErrCode submitNoResponse = new SendErrCode(2,2,2,2,"UNDELIV_提交运营商无响应");
	
	private SendErrCode(int response, int err, int status,int stat, String fail_desc) {
		this.response = response;
		this.err = err;
		this.status = status;
		this.fail_desc = fail_desc;
		this.stat = stat;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int toResponse(){
		return response;
	}
	public int toErr(){
		return err;
	}
	public int toStat(){
		return status;
	}
	public String toDesc(){
		return fail_desc;
	}
	public String toString(){
		return detail+" response:"+response+" err:"+err+" stat:"+status+" fail_desc:"+fail_desc;
	}
}
