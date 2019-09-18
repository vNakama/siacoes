package br.edu.utfpr.dv.siacoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.utfpr.dv.siacoes.log.UpdateEvent;
import br.edu.utfpr.dv.siacoes.model.SigetConfig;
import br.edu.utfpr.dv.siacoes.model.SigetConfig.AttendanceFrequency;
import br.edu.utfpr.dv.siacoes.model.SigetConfig.SupervisorFilter;

public class SigetConfigDAO extends TemplateDAO {

	protected String getInsertStatement () {
		return "INSERT INTO sigetconfig(minimumScore, registerProposal, showgradestostudent, supervisorfilter, cosupervisorfilter, supervisorIndication, maxTutoredStage1, maxTutoredStage2, requestFinalDocumentStage1, repositoryLink, supervisorJuryRequest, supervisorAgreement, supervisorJuryAgreement, validateAttendances, attendanceFrequency, maxfilesize, minimumJuryMembers, minimumJurySubstitutes, jurytimestage1, jurytimestage2, supervisorAssignsGrades, idDepartment) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	}
	protected String getUpdateStatement () {
		return "UPDATE sigetconfig SET minimumScore=?, registerProposal=?, showgradestostudent=?, supervisorfilter=?, cosupervisorfilter=?, supervisorIndication=?, maxTutoredStage1=?, maxTutoredStage2=?, requestFinalDocumentStage1=?, repositoryLink=?, supervisorJuryRequest=?, supervisorAgreement=?, supervisorJuryAgreement=?, validateAttendances=?, attendanceFrequency=?, maxfilesize=?, minimumJuryMembers=?, minimumJurySubstitutes=?, jurytimestage1=?, jurytimestage2=?, supervisorAssignsGrades=? WHERE idDepartment=?";
	}

	protected String getFindByIdStatement () {
		return "SELECT * FROM sigetconfig WHERE idDepartment = ?";
	}

	protected void setStatement (PreparedStatement stmt, T obj) {
		stmt.getDepartment().setIdDepartment(rs.getInt("idDepartment"));
		stmt.setMinimumScore(rs.getDouble("minimumScore"));
		stmt.setRegisterProposal(rs.getInt("registerProposal") == 1);
		stmt.setShowGradesToStudent(rs.getInt("showgradestostudent") == 1);
		stmt.setSupervisorFilter(SupervisorFilter.valueOf(rs.getInt("supervisorFilter")));
		stmt.setCosupervisorFilter(SupervisorFilter.valueOf(rs.getInt("cosupervisorFilter")));
		stmt.setSupervisorIndication(rs.getInt("supervisorIndication"));
		stmt.setMaxTutoredStage1(rs.getInt("maxTutoredStage1"));
		stmt.setMaxTutoredStage2(rs.getInt("maxTutoredStage2"));
		stmt.setRequestFinalDocumentStage1(rs.getInt("requestFinalDocumentStage1") == 1);
		stmt.setRepositoryLink(rs.getString("repositoryLink"));
		stmt.setSupervisorJuryRequest(rs.getInt("supervisorJuryRequest") == 1);
		stmt.setSupervisorAgreement(rs.getInt("supervisorAgreement") == 1);
		stmt.setSupervisorJuryAgreement(rs.getInt("supervisorJuryAgreement") == 1);
		stmt.setValidateAttendances(rs.getInt("validateAttendances") == 1);
		stmt.setAttendanceFrequency(AttendanceFrequency.valueOf(rs.getInt("attendanceFrequency")));
		stmt.setMaxFileSize(rs.getInt("maxfilesize"));
		stmt.setMinimumJuryMembers(rs.getInt("minimumJuryMembers"));
		stmt.setMinimumJurySubstitutes(rs.getInt("minimumJurySubstitutes"));
		stmt.setJuryTimeStage1(rs.getInt("jurytimestage1"));
		stmt.setJuryTimeStage2(rs.getInt("jurytimestage2"));
		stmt.setSupervisorAssignsGrades(rs.getInt("supervisorAssignsGrades") == 1);
	}
}
