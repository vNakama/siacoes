package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

import br.edu.utfpr.dv.siacoes.model.ActivitySubmission.ActivityFeedback;

@AllArgsConstructor
@Getter
@Setter

public class ActivitySubmissionItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idActivitySubmissionItem;
	private Activity activity;
	private ActivitySubmission submission;
	private ActivityFeedback feedback;

	public void setIdActivitySubmissionItem(int idActivitySubmissionItem) {
		this.idActivitySubmissionItem = idActivitySubmissionItem;
	}
}
