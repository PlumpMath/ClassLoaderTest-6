package classLoader;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderTest extends Thread{
	private boolean running = true;
	private String path;
	public ClassLoaderTest(String path){
		this.path = path;
	}
	public void f() throws Exception{
		URL url = new URL(path);
		URLClassLoader myClassLoader = new URLClassLoader(new URL[] { url }, Thread.currentThread().getContextClassLoader());
		ActionInterface myClass = (ActionInterface) myClassLoader.loadClass("classLoader.TestAction").newInstance();
//		Method m = myClass.getClass().getMethod("action", null);
//		String s = (String) m.invoke(myClass, null);
//		ActionInterface a = myClass.newInstance();
		String s = myClass.action();
		System.out.println(s);
		Thread.sleep(1000);
	}
	public void run(){
		while(running){
			try {
				f();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void shutdown(){
		this.interrupt();
		running = false;
	}
}