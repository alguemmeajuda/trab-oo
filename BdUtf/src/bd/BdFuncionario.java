package bd;

import model.Funcionario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BdFuncionario {
     public Funcionario localiza(int registro) {
        String sql = "update funcionario set nome=?, dataAdmissao=?, salarioBase=? where registro=?";
        Funcionario funcionario = new Funcionario();
        try {
            PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, registro);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                funcionario.setRegistro(rs.getInt("registro"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setDataAdmissao("data de Admissão");
                funcionario.setSalarioBase(rs.getDouble("salário base"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return funcionario;
    }
     
     public List pesquisa(String busca) {
        String sql = "select * from funcionario where nome like ?";
        List lista = new ArrayList();
        try {
            PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + busca + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setRegistro(rs.getInt("registro"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setDataAdmissao("data de Admissão");
                funcionario.setSalarioBase(rs.getDouble("salário base"));
                lista.add(funcionario);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return lista;
    }
}
