import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;



public class TT {

	public static List<A> produce(){
		List<A> list = new ArrayList<A>();
		for(int i = 0 ; i < 100 ; i++){
			A a = new A(i);
			list.add(a);
		}	
		return list;
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InterruptedException {
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:/oos.dat")));
//		oos.writeObject(produce());
//		oos.flush();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:/oos.dat")));
		for(int i = 0 ; i < 100 ; i ++){
			oos.writeObject(new A(i));
		}
		oos.writeObject(null);
		oos.flush();
		oos.close();
		Thread.sleep(1000);
		FileInputStream fis = new FileInputStream(new File("D:/oos.dat"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		A tmp = null;
		List<A> ll = new ArrayList<A>();
		try {
			while((tmp = (A) ois.readObject()) != null ){
				ll.add(tmp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ois.close();
		System.out.println(ll);
	}

}
