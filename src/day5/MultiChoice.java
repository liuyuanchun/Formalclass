package day5;

public class MultiChoice extends Question{
	private String[] options;
	private String[] answerIds;
	public MultiChoice(){
		
	}
	public MultiChoice(String text, String[] options, String[] answerIds) {
		super(text);
		this.options = options;
		this.answerIds = answerIds;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public String[] getAnswerIds() {
		return answerIds;
	}
	public void setAnswerIds(String[] answerIds) {
		this.answerIds = answerIds;
	}
	
}
