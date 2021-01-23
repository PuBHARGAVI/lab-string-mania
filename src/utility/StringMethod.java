package utility;

// Type your code
public class StringMethod{
	private String input;
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String lower(String s1) {
		return s1.toLowerCase();
	}
	public String upper(String s1) {
		return s1.toUpperCase();
	}
	public String firstCharacter(String s1) {
		return String.valueOf(s1.charAt(0));
	}
	public String length(String s1) {
		return String.valueOf(s1.length());
	}
	public String trim(String s1) {
		return s1.trim();
	}
}
