package dao;

import connection.DBConnect;
import model.mhs;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class mhsDaoImpl implements BaseDao<mhs> {

    @Override
    public mhs Save(mhs mahasiswa) {
        String sql = "INSERT INTO mahasiswa VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement stat = DBConnect.getInstance().getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stat.setLong(1, mahasiswa.getId());
            stat.setString(2, mahasiswa.getNim());
            stat.setString(3, mahasiswa.getNama());
            stat.setString(4, mahasiswa.getAlamat());
            stat.executeUpdate();

            ResultSet generatedKeys = stat.getGeneratedKeys();
            if (generatedKeys.next()) {
                mahasiswa.setId(generatedKeys.getLong(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mahasiswa;
    }

    @Override
    public mhs update(mhs mahasiswa) {
        String sql = "UPDATE mahasiswa SET nim = ?, nama = ?, alamat = ? "
                + "WHERE id = ? ";
        try {
            PreparedStatement stat = DBConnect.getInstance().getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stat.setString(1, mahasiswa.getNim());
            stat.setString(2, mahasiswa.getNama());
            stat.setString(3, mahasiswa.getAlamat());
            stat.setLong(4, mahasiswa.getId());
            stat.executeUpdate();

            ResultSet generatedKeys = stat.getGeneratedKeys();
            if (generatedKeys.next()) {
                mahasiswa.setId(generatedKeys.getLong(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mahasiswa;
    }

    @Override
    public List<mhs> find(int offset, int limit) {
        List<mhs> mahasiswas = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa ORDER BY id ASC ";

        if (offset != 0 && limit != 0) {
            sql += "limit ?, ? ";
        }
        System.out.println("limit "+limit);

        try {
            PreparedStatement statement = DBConnect.getInstance().getConnection().prepareStatement(sql);
            if (offset != 0 && limit != 0) {
                statement.setInt(1, offset);
                statement.setInt(2, limit);
            }

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                mhs mahasiswa = new mhs();
                mahasiswa.setId(rs.getInt("id"));
                mahasiswa.setNim(rs.getString("nim"));
                mahasiswa.setNama(rs.getString("nama"));
                mahasiswa.setAlamat(rs.getString("alamat"));
                mahasiswas.add(mahasiswa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mahasiswas;
    }

    @Override
    public mhs findById(long id) {
        mhs mahasiswa = new mhs();
        String sql = "SELECT * FROM mahasiswa WHERE id = ? ";

        try {
            PreparedStatement statement = DBConnect.getInstance().getConnection().prepareStatement(sql);
            statement.setLong(1, id);
//            statement.executeUpdate();

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                mahasiswa.setId(rs.getInt("id"));
                mahasiswa.setNim(rs.getString("nim"));
                mahasiswa.setNama(rs.getString("nama"));
                mahasiswa.setAlamat(rs.getString("alamat"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mahasiswa;
    }

    @Override
    public String delete(long id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ? ";
        String message;
        try {
            PreparedStatement statement = DBConnect.getInstance().getConnection().prepareStatement(sql);
            statement.setLong(1, id);
            int status = statement.executeUpdate();
            if (status == 0) {
                message = "Delete Failed!";
            } else {
                message = "Record is deleted!";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            message = "Delete Failed!";
        }

        return message;
    }
}
