/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
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
@WebServlet("/edit")
public class editController extends HttpServlet {

    private mhsservice service = new mhsservice();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        mhs mahasiswa = new mhs();
        if (req.getParameter("id") != null) {
            mahasiswa = service.findById(Long.parseLong(req.getParameter("id")));
        }
        
        req.setAttribute("mahasiswa", mahasiswa);
        
//        req.setAttribute("nims", mahasiswa.getNim());
//        req.setAttribute("namas", mahasiswa.getNama());
//        req.setAttribute("alamats", mahasiswa.getAlamat());
        req.getRequestDispatcher("/edit.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        mhs mahasiswa = new mhs();
        if (req.getParameter("id") != null) {
            mahasiswa.setId(Long.parseLong(req.getParameter("id")));
        }
        mahasiswa.setNim(req.getParameter("nim"));
        mahasiswa.setNama(req.getParameter("nama"));
        mahasiswa.setAlamat(req.getParameter("alamat"));

        service.Save(mahasiswa);
        resp.sendRedirect("/CRUDMahasiswa/tes");
    }

}
