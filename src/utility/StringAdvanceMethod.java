package utility;

// Type your code
public class StringAdvanceMethod{
	
	private String input1;
	private String input2;
	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getInput2() {
		return input2;
	}

	public void setInput2(String input2) {
		this.input2 = input2;
	}

	public String concat(String s1,String s2) {
		return (s1+s2);
	}
	
	public String split(String s1,String s2) {
		String output[] = s1.split(s2);
		String resu="";
		for(int i=0;i<output.length;i++) {
		resu=resu+" "+output[i];
		}
		return resu;
	}
	public String indexof(String s1,String s2) {
		String x;
		x=String.valueOf(s1.indexOf(s2));
		System.out.println(String.valueOf(s1.indexOf(s2)));
		return x;
	}
}

