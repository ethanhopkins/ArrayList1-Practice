import java.util.ArrayList;
import java.util.Iterator;

public class AnimalList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Animals = new ArrayList<String>();
		Animals.add("cat");
		Animals.add("Dog");
		Animals.add("Horse");
		Animals.add("Cow");
		Animals.add("Leopard");
		
		System.out.println(Animals.get(2));
		System.out.println(Animals.get(4));
		System.out.println(Animals.size());
		
		Animals.set(3, "Buffalo");
		System.out.println(Animals.get(3));
		Animals.set(4, "Tiger");
		System.out.println(Animals.get(4));
		
		Animals.remove(0);
		//Each index lowers by 1 after each removal
		//Dog is now Animals(0)
		//Horse is now Animals(1)
		Animals.remove(0);
		
		for (String i: Animals) {
			System.out.println(i);
		}
		
		Iterator<String> it = Animals.iterator();
		System.out.println("The first element is " + it.next());
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
