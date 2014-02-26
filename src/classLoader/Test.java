/**    
 * 文件名：Test.java    
 *    
 * 版本信息：    
 * 日期：2014-2-26    
 * Copyright 足下 Corporation 2014     
 * 版权所有    
 *    
 */
package classLoader;


/**    
 *     
 * 项目名称：ClassLoaderTest    
 * 类名称：Test    
 * 类描述：    
 * 创建人：1207264    
 * 创建时间：2014-2-26 下午02:14:39    
 * 修改人：1207264    
 * 修改时间：2014-2-26 下午02:14:39    
 * 修改备注：    
 * @version     
 *     
 */
public class Test {
	private static boolean running = true;
	public static void main(String args[]) {
			try {
				ClassLoaderTest t = new ClassLoaderTest("file:C:\\Users\\1207264\\Desktop\\test.jar");
				t.start();
				
				ClassLoaderTest tt = new ClassLoaderTest("file:C:\\Users\\1207264\\Desktop\\11.jar");
				tt.start();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
