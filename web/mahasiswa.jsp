<%-- 
    Document   : mahasiswa
    Created on : Dec 5, 2017, 5:23:14 AM
    Author     : Annisa
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <legend>Tambah Mahasiswa</legend>
                </div>
                <div class="form-group">
                    <label for="nim" class="col-sm-2 control-label">NIM</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="nim" name="nim" placeholder="NIM">
                    </div>
                </div>
                <div class="form-group">
                    <label for="nama" class="col-sm-2 control-label">Nama</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="nama" name="nama" placeholder="Nama">
                    </div>
                </div>
                <div class="form-group">
                    <label for="alamat" class="col-sm-2 control-label">Alamat</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="alamat" name="alamat" placeholder="Alamat">
                    </div>
                </div>


                <div class="form-group">
                    <div class="col-sm-10 col-sm-offset-2">
                        <button type="submit" class="btn btn-primary pull-right">Save</button>
                    </div>
                </div>
            </form>
        </div>
        <table class="table table-bordered table-hover" border="1">
            <thead>
                <tr>
                    <th>No</th>
                    <th>NIM</th>
                    <th>Nama</th>
                    <th>Alamat</th>
                    <th>Action</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach items="${mahasiswas}" var="mahasiswa" varStatus="loop">
                    <tr>
                        <td>${loop.index+1}</td>                        
                        <td>${mahasiswa.nim}</td>
                        <td>${mahasiswa.nama}</td>
                        <td>${mahasiswa.alamat}</td>
                        <td>
                            <a href="/CRUDMahasiswa/edit?id=${mahasiswa.id}">Edit</a>
                            <a href="/CRUDMahasiswa/tes?id=${mahasiswa.id}" class="btn btn-danger btn-sm">Hapus</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
