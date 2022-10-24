import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class NumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		
		ArrayList<Integer> Ran = new ArrayList<Integer>();
		Ran.add(generator.nextInt(0, 10));
		Ran.add(generator.nextInt(0, 10));
		Ran.add(generator.nextInt(0, 10));
		Ran.add(generator.nextInt(0, 10));
		Ran.add(generator.nextInt(0, 10));
		
		Iterator<Integer> it = Ran.iterator();
		
		while (it.hasNext()) {
			Integer newNumber = it.next();
			if (newNumber > 8) {
				it.remove();
			}
			
			//System.out.println(it.next());
		}
		System.out.println(Ran);
		
	}

}
