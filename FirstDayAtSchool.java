
import java.util.Arrays;

public class FirstDayAtSchool {

	public String[] prepareMyBag() {
		String[] schoolbag = {"Books", "Notebookss", "Penss"};
		System.out.println("My school bag contains: "+Arrays.toString(schoolbag));
		return schoolbag;
	}

	public String[] addPencils() {
		String[] schoolbag = {"Books", "Notebookss", "Penss", "Pencilss"};
		System.out.println("Now my school bag contain: "+Arrays.toString(schoolbag));
		return schoolbag;
	}
}