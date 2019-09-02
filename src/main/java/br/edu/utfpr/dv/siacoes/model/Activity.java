package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter

public class Activity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int idActivity;
	private ActivityGroup group;
	private ActivityUnit unit;
	private Department department;
	private String description;
	private double score;
	private double maximumInSemester;
	private boolean active;
	private int sequence;
	
	public Activity(){
		this.setIdActivity(0);
		this.setGroup(new ActivityGroup());
		this.setUnit(new ActivityUnit());
		this.setDepartment(new Department());
		this.setDescription("");
		this.setScore(0);
		this.setMaximumInSemester(0);
		this.setActive(true);
	}
	
	@Override
    public int hashCode() {
        return this.getIdActivity();
    }
	
	@Override
    public boolean equals(final Object object) {
        if (!(object instanceof Activity)) {
            return false;
        }else if(this.getIdActivity() == ((Activity)object).getIdActivity()){
        	return true;
        }else{
        	return false;
        }
    }
	
}
