/**    
 * �ļ�����CopyFile.java    
 *    
 * �汾��Ϣ��    
 * ���ڣ�2014-2-26    
 * Copyright ���� Corporation 2014     
 * ��Ȩ����    
 *    
 */
package classLoader.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**    
 *     
 * ��Ŀ���ƣ�ClassLoaderTest    
 * �����ƣ�CopyFile    
 * ��������    
 * �����ˣ�1207264    
 * ����ʱ�䣺2014-2-26 ����02:52:41    
 * �޸��ˣ�1207264    
 * �޸�ʱ�䣺2014-2-26 ����02:52:41    
 * �޸ı�ע��    
 * @version     
 *     
 */
public class CopyFile {
	public void copy(String from ,String to) throws Exception{
		FileInputStream fis = new FileInputStream(new File(from));
		FileOutputStream fos = new FileOutputStream(new File(to));
//		fos.
	}
}
