package stringPrograms;

public class CountNoOfWords {

	public static void main(String[] args) {
	String str="My name is sheik  ";
	String[] s=str.trim().split(" ");
	for(String word:s)
	{
		System.out.println(word);
	}

	}

}
