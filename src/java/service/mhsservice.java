/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.mhsDaoImpl;
import java.util.List;
import model.mhs;

/**
 *
 * @author Annisa
 */
public class mhsservice implements BaseService<mhs> {

    private mhsDaoImpl mahasiswaDao;

    public mhsservice() {
        mahasiswaDao = new mhsDaoImpl();
    }

    
    @Override
    public mhs Save(mhs entity) {
        if (entity.getId() == 0) {
            entity = mahasiswaDao.Save(entity);
        } else {
            entity = mahasiswaDao.update(entity);
        }

        return entity;
    }
    
    @Override
    public List<mhs> find(int offset, int limit) {
        return mahasiswaDao.find(offset, limit);
    }

    @Override
    public mhs findById(long id) {
        return mahasiswaDao.findById(id);
    }

    @Override
    public String delete(long id) {
        return mahasiswaDao.delete(id);
    }

}
