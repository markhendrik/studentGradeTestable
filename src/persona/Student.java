package persona;

import java.util.Date;
import java.util.List;


public class Student {
	
	private String name;
	private GradeSheet sheet;
	
	public Student(String name, GradeSheet sheet) {
		this.name = name;
		this.sheet = sheet;
	}

	public Student() {}
	
	public void setSheet(GradeSheet sheet) {
		this.sheet = sheet;
	}
	
	public Double getAverageGradeBetween(Date startDate, Date endDate) {
        List<GradeEntry> entries = getEntriesBetween(startDate, endDate);

        Integer total = new Integer(0);
        int count = 0;
        for (GradeEntry each : entries) {
            total += sheet.verifyEntry(each).getGrade();
        }
        return (double) (total/count);
    }

    protected List<GradeEntry> getEntriesBetween(Date startDate, Date endDate) {
        // Grades e.g from database.
    	throw new IllegalStateException("can't get data from..");
    }

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
