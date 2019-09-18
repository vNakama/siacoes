package br.edu.utfpr.dv.siacoes.dao;

import br.edu.utfpr.dv.siacoes.model.SigacConfig;
import br.edu.utfpr.dv.siacoes.model.SigesConfig;

public abstract class TemplateDAO {
    public T findByDepartment(int idDepartment){
        return null;
    }

    public int save(int idUser, T config) {
        return 0;
    }

    private T loadObject(ResultSet rs){
        return null;
    }
}
