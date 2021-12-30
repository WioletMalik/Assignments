package JavaAssignments;

public class MainNumberHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		int n1 =1;
		float n2 = 2.3f;		
		
		NumberHolder aNumberHolder = new NumberHolder(n1, n2);
		
		
		System.out.println(aNumberHolder.anInt);
		System.out.println(aNumberHolder.aFloat);
	}

}
