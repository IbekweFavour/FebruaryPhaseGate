public class IntergersBetweenOneToThirty{

public static int getDivisible(int numbers){
	int sum = 0;
	for (int count = 0; count <= numbers; count++){
		if (count % 3 == 0){
			sum += count;
		}
	
	}
	return sum;
}
	

public static void main(String... args){
	System.out.print(getDivisible(30));	
}
}