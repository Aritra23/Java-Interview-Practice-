import java.util.Arrays;


public class StringPermutation {

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPermutation ob = new StringPermutation();
		System.out.println(ob.permutationstring("\n","\n"));

	}*/
	public boolean permutationstring(String s1, String s2)
	{
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
	    if(Arrays.equals(c1, c2))
	    {
	    	return true;
	    }
		return false;
	}
	

}
