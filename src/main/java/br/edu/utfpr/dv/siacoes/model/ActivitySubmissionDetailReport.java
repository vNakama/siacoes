package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

import br.edu.utfpr.dv.siacoes.util.DateUtils;

@AllArgsConstructor
@Getter
@Setter

public class ActivitySubmissionDetailReport implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String activity;
	private int group;
	private String unit;
	private double score;
	private double amount;
	private double total;
	private int semester;
	private int year;
}
