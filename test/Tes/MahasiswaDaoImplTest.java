package Tes;

import dao.mhsDaoImpl;
import model.mhs;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MahasiswaDaoImplTest {

    private mhsDaoImpl impl;
    private mhs param;

    @Before
    public void setUp() throws Exception {
        impl = new mhsDaoImpl();
        param = new mhs();
    }

    @Test
    public void testSuite() throws Exception {
//        save();
//        update();
//        find();
        findById();
//        delete();
    }

    public void save() throws Exception {
        param.setNim("1234");
        param.setNama("andi");
        param.setAlamat("makassar");
        param = impl.Save(param);
        System.out.println("save : " + param.toString());
        Assert.assertTrue(param.getId() != 0);
    }

    public void update() {
        param.setAlamat("jogja");
        param = impl.update(param);
        System.out.println("update : " + param.toString());
        Assert.assertTrue(param.getAlamat().equals("jogja"));
        System.out.println("id>>" + param.getId());
    }

    public void find() throws Exception {
        List<mhs> mahasiswas = impl.find(0, 0);
        System.out.println("find -> Mahasiswas : " + mahasiswas.toString());
        Assert.assertFalse(mahasiswas.isEmpty());
    }

    public void findById() throws Exception {
        param = impl.findById(45);
        System.out.println("findByid : " + param.toString());
        Assert.assertNotNull(param);
    }

    public void delete() throws Exception {
        System.out.println("delete : " + impl.delete(param.getId()));
    }
}