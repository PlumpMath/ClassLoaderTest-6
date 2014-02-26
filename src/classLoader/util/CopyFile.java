/**    
 * 文件名：CopyFile.java    
 *    
 * 版本信息：    
 * 日期：2014-2-26    
 * Copyright 足下 Corporation 2014     
 * 版权所有    
 *    
 */
package classLoader.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**    
 *     
 * 项目名称：ClassLoaderTest    
 * 类名称：CopyFile    
 * 类描述：    
 * 创建人：1207264    
 * 创建时间：2014-2-26 下午02:52:41    
 * 修改人：1207264    
 * 修改时间：2014-2-26 下午02:52:41    
 * 修改备注：    
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
