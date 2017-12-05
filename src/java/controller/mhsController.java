/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.mhs;
import service.mhsservice;

/**
 *
 * @author Annisa
 */
@WebServlet("/tes")
public class mhsController extends HttpServlet {

    private mhsservice service = new mhsservice();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String id = req.getParameter("id");
        if (id != null) {
            service.delete(Long.parseLong(id));
        }
        List<mhs> mahasiswas = service.find(0, 0);
        req.setAttribute("mahasiswas", mahasiswas); 
        req.getRequestDispatcher("/mahasiswa.jsp").forward(req, resp);
    }

    @Override
    public void init() throws ServletException {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        mhs mahasiswa = new mhs();
        if (req.getParameter("id") != null){
            mahasiswa.setId(Long.parseLong(req.getParameter("id")));
        }

        mahasiswa.setNim(req.getParameter("nim"));
        mahasiswa.setNama(req.getParameter("nama"));
        mahasiswa.setAlamat(req.getParameter("alamat"));

        service.Save(mahasiswa);
        resp.sendRedirect("/CRUDMahasiswa/tes");
    }
}
