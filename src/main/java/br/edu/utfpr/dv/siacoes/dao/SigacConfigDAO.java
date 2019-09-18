package br.edu.utfpr.dv.siacoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.utfpr.dv.siacoes.log.UpdateEvent;
import br.edu.utfpr.dv.siacoes.model.SigacConfig;

public class SigacConfigDAO extends TemplateDAO {
	@Override
	protected String getInsertStatement () {
		return "INSERT INTO sigacconfig(minimumScore, maxfilesize, idDepartment) VALUES(?, ?, ?)";
	}

	@Override
	protected String getUpdateStatement () {
		return "UPDATE sigacconfig SET minimumScore=?, maxfilesize=? WHERE idDepartment=?";
	}

	@Override
	protected String getFindByIdStatement () {
		return "SELECT * FROM sigacconfig WHERE idDepartment = ?";
	}

	protected void setStatement (PreparedStatement stmt, T obj) {
		stmt.setDouble(1, config.getMinimumScore());
		stmt.setInt(2, config.getMaxFileSize());
		stmt.setInt(3, config.getDepartment().getIdDepartment());
	}
}
