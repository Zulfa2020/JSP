import java.util.*;

public class Progra_Annotations {

	
	@Override
	public String toString() {
		return "Progra_Annotations::toString()";
	}
@SuppressWarnings({"unchecked", "rawtypes" })
public static void main(String[] args) {
	Progra_Annotations demo=null;
	demo=new Progra_Annotations();
	System.out.println(demo.toString());
	
	List list=new ArrayList();
	list.add(10);
	list.add(20);
	System.out.println("list Array[]:"+list);
		
		
	}

}
