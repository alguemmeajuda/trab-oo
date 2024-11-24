package bd;

import model.Professor;
import model.Disciplina;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BdProfessor {
    public Professor localiza(int registro) {
        String sql = "update professor set nome=?, dataAdmissao=?, salarioBase=?, titulacao=?, disciplina=? where registro=?";
        //tem q usar o join?
        Professor professor = new Professor();
        try {
            PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, registro);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                professor.setRegistro(rs.getInt("registro"));
                professor.setNome(rs.getString("nome"));
                professor.setDataAdmissao("data de Admissão");
                professor.setSalarioBase(rs.getDouble("salário base"));
                professor.setTitulacao("titulaçao");
                
                Disciplina disciplina = new Disciplina();
                disciplina.getCodigo(rs.getInt("codigo"));
                disciplina.setNomeDisciplina("nome disciplina");
                disciplina.setCargaHoraria(rs.getDouble("carga horária"));
                disciplina.setEmenta("ementa");
                professor.setDisciplinas(disciplinas);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return professor;
    }
     
     public List pesquisa(String busca) {
        String sql = "select * from professor where nome like ?";
        List lista = new ArrayList();
        try {
            PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + busca + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Professor professor = new Professor();
                professor.setRegistro(rs.getInt("registro"));
                professor.setNome(rs.getString("nome"));
                professor.setDataAdmissao("data de Admissão");
                professor.setSalarioBase(rs.getDouble("salário base"));
                professor.setTitulacao("titulaçao");
                
                Disciplina disciplina = new Disciplina();
                disciplina.getCodigo(rs.getInt("codigo"));
                disciplina.setNomeDisciplina("nome disciplina");
                disciplina.setCargaHoraria(rs.getDouble("carga horária"));
                disciplina.setEmenta("ementa");
                professor.setDisciplinas(disciplinas);
                lista.add(professor);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return lista;
    }
}
