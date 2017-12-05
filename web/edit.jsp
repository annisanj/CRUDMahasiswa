<%-- 
    Document   : edit
    Created on : Dec 5, 2017, 1:35:26 PM
    Author     : Annisa
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Hello World2!</h1>
        <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                <form action="/CRUDMahasiswa/tes" method="post" class="form-horizontal" role="form">
                    <div class="form-group">
                        <a href="mahasiswa.jsp"></a>
                        <legend>Edit Data Mahasiswa</legend>
                    </div>
                    <input type="hidden" class="form-control" id="id" name="id" value="${mahasiswa.id}">
                    <div class="form-group">
                        <label for="nim" class="col-sm-2 control-label">NIM</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control"  value="${mahasiswa.nim}" id="nim" name="nim" placeholder="NIM">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="nama" class="col-sm-2 control-label">Nama</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="nama" name="nama" placeholder="Nama" value="${mahasiswa.nama}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="alamat" class="col-sm-2 control-label">Alamat</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="alamat" name="alamat" placeholder="Alamat" value="${mahasiswa.alamat}">
                        </div>
                    </div>


                    <div class="form-group">
                        <div class="col-sm-10 col-sm-offset-2">
                            <button type="submit" class="btn btn-primary pull-right">Save</button>
                        </div>
                    </div>
                </form>
        </div>
    </body>
</html>
