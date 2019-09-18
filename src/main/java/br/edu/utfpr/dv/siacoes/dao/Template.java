package br.edu.utfpr.dv.siacoes.dao;

import br.edu.utfpr.dv.siacoes.model.SigacConfig;
import br.edu.utfpr.dv.siacoes.model.SigesConfig;

public abstract class TemplateDAO {
    public final T findByDepartment(int idDepartment){
        return null;
    }

    public final int save(int idUser, T config) {
        return 0;
    }

    public final T loadObject(ResultSet rs){
        return null;
    }
}
