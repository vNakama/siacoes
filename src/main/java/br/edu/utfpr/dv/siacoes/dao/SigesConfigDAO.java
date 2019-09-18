package br.edu.utfpr.dv.siacoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.utfpr.dv.siacoes.log.UpdateEvent;
import br.edu.utfpr.dv.siacoes.model.SigesConfig;
import br.edu.utfpr.dv.siacoes.model.SigetConfig.SupervisorFilter;

public class SigesConfigDAO extends TemplateDAO {

	protected String getInsertStatement () {
		return "INSERT INTO sigesconfig(minimumScore, supervisorPonderosity, companySupervisorPonderosity, showgradestostudent, supervisorfilter, supervisorFillJuryForm, maxfilesize, jurytime, idDepartment) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
	}
	protected String getUpdateStatement () {
		return "UPDATE sigesconfig SET minimumScore=?, supervisorPonderosity=?, companySupervisorPonderosity=?, showgradestostudent=?, supervisorfilter=?, supervisorFillJuryForm=?, maxfilesize=?, jurytime=? WHERE idDepartment=?";
	}

	@Override
	protected String getFindByIdStatement () {
		return "SELECT * FROM sigesconfig WHERE idDepartment = ?";
	}
	protected void setStatement (PreparedStatement stmt, T obj) {
		stmt.getDepartment().setIdDepartment(rs.getInt("idDepartment"));
		stmt.setMinimumScore(rs.getDouble("minimumScore"));
		stmt.setSupervisorPonderosity(rs.getDouble("supervisorPonderosity"));
		stmt.setCompanySupervisorPonderosity(rs.getDouble("companySupervisorPonderosity"));
		stmt.setShowGradesToStudent(rs.getInt("showgradestostudent") == 1);
		stmt.setSupervisorFilter(SupervisorFilter.valueOf(rs.getInt("supervisorfilter")));
		stmt.setSupervisorFillJuryForm(rs.getInt("supervisorFillJuryForm") == 1);
		stmt.setMaxFileSize(rs.getInt("maxfilesize"));
		stmt.setJuryTime(rs.getInt("jurytime"));
	}
}
