package bd;

import model.TecnicoAdministrativo;
import model.Processo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BdTecnicoAdministrativo {
     public TecnicoAdministrativo localiza(int registro) {
        String sql = "update tecnicoAdministrativo set nome=?, dataAdmissao=?, salarioBase=?, adicionalNoturno=? where registro=?";
        TecnicoAdministrativo tec = new TecnicoAdministrativo();
        try {
            PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, registro);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tec.setRegistro(rs.getInt("registro"));
                tec.setNome(rs.getString("nome"));
                tec.setDataAdmissao("data de Admissão");
                tec.setSalarioBase(rs.getDouble("salário base"));
                tec.setAdicionalNoturno(rs.getDouble("adicional noturno"));
                
                Processo processo = new Processo();
                processo.setNumero(rs.getInt("numero"));
                processo.setDataCriacao("data criaçao");
                processo.setDescricao("descriçao");
                tec.setProcessos(processos);
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return tec;
    }
     
     public List pesquisa(String busca) {
        String sql = "select * from tecnicoAdministrativo where nome like ?";
        List lista = new ArrayList();
        try {
            PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + busca + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TecnicoAdministrativo tec = new TecnicoAdministrativo();
                tec.setRegistro(rs.getInt("registro"));
                tec.setNome(rs.getString("nome"));
                tec.setDataAdmissao("data de Admissão");
                tec.setSalarioBase(rs.getDouble("salário base"));
                tec.setAdicionalNoturno(rs.getDouble("adicional noturno"));
                
                Processo processo = new Processo();
                processo.setNumero(rs.getInt("numero"));
                processo.setDataCriacao("data criaçao");
                processo.setDescricao("descriçao");
                tec.setProcessos(processos);
                lista.add(tec);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return lista;
    }
}
