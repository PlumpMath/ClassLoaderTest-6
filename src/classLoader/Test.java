/**    
 * �ļ�����Test.java    
 *    
 * �汾��Ϣ��    
 * ���ڣ�2014-2-26    
 * Copyright ���� Corporation 2014     
 * ��Ȩ����    
 *    
 */
package classLoader;


/**    
 *     
 * ��Ŀ���ƣ�ClassLoaderTest    
 * �����ƣ�Test    
 * ��������    
 * �����ˣ�1207264    
 * ����ʱ�䣺2014-2-26 ����02:14:39    
 * �޸��ˣ�1207264    
 * �޸�ʱ�䣺2014-2-26 ����02:14:39    
 * �޸ı�ע��    
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
