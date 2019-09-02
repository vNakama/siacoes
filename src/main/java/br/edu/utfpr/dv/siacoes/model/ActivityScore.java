package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter

public class ActivityScore implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idActivity;
	private String activity;
	private double score;
}
