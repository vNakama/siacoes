package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter

public class ActivityUnit implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idActivityUnit;
	private String description;
	private boolean fillAmount;
	private String amountDescription;

	public String toString(){
		return this.getDescription();
	}
	
	@Override
    public int hashCode() {
        return this.getIdActivityUnit();
    }
	
	@Override
    public boolean equals(final Object object) {
        if (!(object instanceof ActivityUnit)) {
            return false;
        }else if(this.getIdActivityUnit() == ((ActivityUnit)object).getIdActivityUnit()){
        	return true;
        }else{
        	return false;
        }
    }

}
