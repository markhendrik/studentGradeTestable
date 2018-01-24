package persona;



public class GradeEntry {
	private Integer grade;
	private Evaluation evalation;
	
	public GradeEntry(Integer grade, Evaluation evalation) {
		this.grade = grade;
		this.evalation = evalation;
	}
	
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Evaluation getEvalation() {
		return evalation;
	}
	public void setEvalation(Evaluation evalation) {
		this.evalation = evalation;
	}
	
	public enum Evaluation {
		UUESTI_TEGEMISEL, // 1, 2, 3
		MITTERAHULDAV, // 1, 2
		RAHULDAV, // 3,4
		HEA, // 4
		VÄGA_HEA, // 4, 5
		SUUREPÄRANE, // 5
		VÕIKS_PAREM_OLLA, // 1, 2, 3, 4
		PARIM // 5
	}
}
