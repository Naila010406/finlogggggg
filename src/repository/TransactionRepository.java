/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
import entity.Transaction;
import connection.KoneksiWindowsAuth;

public class TransactionRepository {
    public void create(Transaction t) throws SQLException {
        String sql = "INSERT INTO transactions (type, date, category, amount, notes, created_at) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = KoneksiWindowsAuth.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, t.getType());
            stmt.setDate(2, t.getDate());
            stmt.setString(3, t.getCategory());
            stmt.setBigDecimal(4, t.getAmount());
            stmt.setString(5, t.getNotes());
            stmt.setTimestamp(6, t.getCreatedAt());
            stmt.executeUpdate();
        }
    }

    public BigDecimal getTotalPengeluaranByMonth(int year, int month) {
        String sql = "SELECT COALESCE(SUM(amount), 0) FROM transactions " +
                     "WHERE type = 'Pengeluaran' " +
                     "AND YEAR(date) = ? " +
                     "AND MONTH(date) = ?";

        try (Connection conn = KoneksiWindowsAuth.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, year);
            stmt.setInt(2, month);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getBigDecimal(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return BigDecimal.ZERO;
    }

    public Transaction read(Long id) throws SQLException {
        String sql = "SELECT * FROM transactions WHERE id = ?";
        try (Connection conn = KoneksiWindowsAuth.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return mapRow(rs);
            }
        }
        return null;
    }

    public List<Transaction> findAll() throws SQLException {
        List<Transaction> list = new ArrayList<>();
        String sql = "SELECT * FROM transactions ORDER BY date DESC";
        try (Connection conn = KoneksiWindowsAuth.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(mapRow(rs));
            }
        }
        return list;
    }

    public void update(Transaction t) throws SQLException {
        String sql = "UPDATE transactions SET type = ?, date = ?, category = ?, amount = ?, notes = ?, created_at = ? WHERE id = ?";
        try (Connection conn = KoneksiWindowsAuth.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, t.getType());
            stmt.setDate(2, t.getDate());
            stmt.setString(3, t.getCategory());
            stmt.setBigDecimal(4, t.getAmount());
            stmt.setString(5, t.getNotes());
            stmt.setTimestamp(6, t.getCreatedAt());
            stmt.setLong(7, t.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(Long id) throws SQLException {
        String sql = "DELETE FROM transactions WHERE id = ?";
        try (Connection conn = KoneksiWindowsAuth.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }

    private Transaction mapRow(ResultSet rs) throws SQLException {
        Transaction t = new Transaction();
        t.setId(rs.getLong("id"));
        t.setType(rs.getString("type"));
        t.setDate(rs.getDate("date"));
        t.setCategory(rs.getString("category"));
        t.setAmount(rs.getBigDecimal("amount"));
        t.setNotes(rs.getString("notes"));
        t.setCreatedAt(rs.getTimestamp("created_at"));
        return t;
    }
}
