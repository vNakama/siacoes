package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter

public class ActivityGroupStatus implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private ActivityGroup group;
	private double averageScore;
}
