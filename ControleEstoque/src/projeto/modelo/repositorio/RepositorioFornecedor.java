/**
 *
 */
package projeto.modelo.repositorio;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import projeto.conexao.GerenciadorConexao;
import projeto.conexao.IGerenciadorConexao;
import projeto.erro.ConexaoException;
import projeto.erro.RepositorioException;
import projeto.modelo.to.Fornecedor;

/**
 * @author Daniel
 */
public class RepositorioFornecedor implements IRepositorioFornecedor {

    private IGerenciadorConexao g;

    public RepositorioFornecedor() {
        g = GerenciadorConexao.getInstancia();
    }

    @Override
    public void salvar(Fornecedor f) throws ConexaoException, RepositorioException {
        Connection c = g.conectar();
        String sqlSalvar = "INSERT INTO fornecedores( FORNECEDORES_CNPJ, FORNECEDORES_RAZAOSOCIAL, FORNECEDORES_NUMERORESIDENCIA, ENDERECOS_CODIGO ) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pstm = c.prepareStatement(sqlSalvar);
            pstm.setString(1, f.getFornecedores_CNPJ());
            pstm.setString(2, f.getFornecedores_RazaoSocial());
            pstm.setInt(3, f.getFornecedores_NumeroResidencia());
            pstm.setInt(4, f.getEnderecos_Codigo());
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException ex) {
            throw new RepositorioException(ex.getMessage());
        } finally {
            g.desconectar(c);
        }
    }

    @Override
    public void excluir(int fornecedores_Codigo) throws ConexaoException, RepositorioException {
        Connection c = g.conectar();
        String sqlExcluir = "DELETE FROM Fornecedores WHERE ( fornecedores_Codigo = ? )";
        try {
            PreparedStatement pstm = c.prepareStatement(sqlExcluir);
            pstm.setInt(1, fornecedores_Codigo);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException ex) {
            throw new RepositorioException();
        } finally {
            g.desconectar(c);
        }
    }

    @Override
    public void excluir(String fornecedores_CNPJ) throws ConexaoException, RepositorioException {
        Connection c = g.conectar();
        String sqlExcluir = "DELETE FROM Fornecedores WHERE ( fornecedores_CNPJ = ? )";
        try {
            PreparedStatement pstm = c.prepareStatement(sqlExcluir);
            pstm.setString(1, fornecedores_CNPJ);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException ex) {
            throw new RepositorioException();
        } finally {
            g.desconectar(c);
        }
    }

    @Override
    public void alterar(Fornecedor f) throws ConexaoException, RepositorioException {
        Connection c = g.conectar();
        String sqlAlterar = "UPDATE fornecedores SET ENDERECOS_CODIGO = ?, FORNECEDORES_CNPJ = ?, FORNECEDORES_RAZAOSOCIAL = ?, FORNECEDORES_NUMERORESIDENCIA = ? WHERE FORNECEDORES_CODIGO = ?";
        try {
            PreparedStatement pstm = c.prepareStatement(sqlAlterar);
            pstm.setInt(1, f.getEnderecos_Codigo());
            pstm.setString(2, f.getFornecedores_CNPJ());
            pstm.setString(3, f.getFornecedores_RazaoSocial());
            pstm.setInt(4, f.getFornecedores_NumeroResidencia());
            pstm.setInt(5, f.getFornecedores_Codigo());
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException ex) {
            throw new RepositorioException();
        } finally {
            g.desconectar(c);
        }
    }

    @Override
    public Fornecedor consultarRazaoSocial(String fornecedores_RazaoSocial) throws ConexaoException, RepositorioException {
        Fornecedor f = null;
        Connection c = g.conectar();
        String sqlConsultar = "SELECT f.fornecedores_Codigo, f.fornecedores_CNPJ, f.Fornecedores_RazaoSocial, f.fornecedores_NumeroResidencia, end.enderecos_Codigo, end.enderecos_CEP, end.enderecos_Logradouro, end.cidades_Codigo, cd.cidades_Nome from (FORNECEDORES AS f INNER JOIN ENDERECOS AS end ON f.enderecos_Codigo = end.enderecos_Codigo) INNER JOIN CIDADES AS cd ON end.cidades_Codigo = cd.cidades_Codigo WHERE FORNECEDORES_RazaoSocial = ?";
        try {
            PreparedStatement pstm = c.prepareStatement(sqlConsultar);
            pstm.setString(1, fornecedores_RazaoSocial);
            ResultSet rs = pstm.executeQuery();
            //verifica se retornou algum registro e cria o Objeto
            if (rs.next()) {
                f = new Fornecedor();
                f.setFornecedores_Codigo(rs.getInt("fornecedores_Codigo"));
                f.setFornecedores_CNPJ(rs.getString("fornecedores_CNPJ"));
                f.setFornecedores_RazaoSocial(rs.getString("fornecedores_RazaoSocial"));
                f.setFornecedores_NumeroResidencia(rs.getInt("fornecedores_NumeroResidencia"));
                f.setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_CEP(rs.getString("enderecos_CEP"));
                f.getEndereco().setEnderecos_Logradouro(rs.getString("enderecos_Logradouro"));
                f.getEndereco().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Nome(rs.getString("cidades_Nome"));
            }
        } catch (SQLException e) {
            throw new RepositorioException(e.getMessage());
        } finally {
            g.desconectar(c);
        }
        return f;
    }

    @Override
    public Fornecedor consultarCNPJ(String fornecedores_CNPJ) throws ConexaoException, RepositorioException {
        Fornecedor f = null;
        Connection c = g.conectar();
        String sqlConsultar = "SELECT f.fornecedores_Codigo, f.fornecedores_CNPJ, f.Fornecedores_RazaoSocial, f.fornecedores_NumeroResidencia, end.enderecos_Codigo, end.enderecos_CEP, end.enderecos_Logradouro, end.cidades_Codigo, cd.cidades_Nome from (FORNECEDORES AS f INNER JOIN ENDERECOS AS end ON f.enderecos_Codigo = end.enderecos_Codigo) INNER JOIN CIDADES AS cd ON end.cidades_Codigo = cd.cidades_Codigo WHERE FORNECEDORES_CNPJ = ?";
        try {
            PreparedStatement pstm = c.prepareStatement(sqlConsultar);
            pstm.setString(1, fornecedores_CNPJ);
            ResultSet rs = pstm.executeQuery();
            //verifica se retornou algum registro e cria o Objeto
            if (rs.next()) {
                f = new Fornecedor();
                f.setFornecedores_Codigo(rs.getInt("fornecedores_Codigo"));
                f.setFornecedores_CNPJ(rs.getString("fornecedores_CNPJ"));
                f.setFornecedores_RazaoSocial(rs.getString("fornecedores_RazaoSocial"));
                f.setFornecedores_NumeroResidencia(rs.getInt("fornecedores_NumeroResidencia"));
                f.setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_CEP(rs.getString("enderecos_CEP"));
                f.getEndereco().setEnderecos_Logradouro(rs.getString("enderecos_Logradouro"));
                f.getEndereco().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Nome(rs.getString("cidades_Nome"));
            }
        } catch (SQLException e) {
            throw new RepositorioException(e.getMessage());
        } finally {
            g.desconectar(c);
        }
        return f;
    }

    @Override
    public Collection<Fornecedor> listar() throws ConexaoException, RepositorioException {
        ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
        Fornecedor f;
        Connection c = g.conectar();
        String sqlLista = "SELECT f.fornecedores_Codigo, f.fornecedores_CNPJ, f.Fornecedores_RazaoSocial, f.fornecedores_NumeroResidencia, end.enderecos_Codigo, end.enderecos_CEP, end.enderecos_Logradouro, end.cidades_Codigo, cd.cidades_Nome from (FORNECEDORES AS f INNER JOIN ENDERECOS AS end ON f.enderecos_Codigo = end.enderecos_Codigo) INNER JOIN CIDADES AS cd ON end.cidades_Codigo = cd.cidades_Codigo ORDER BY f.fornecedores_CNPJ";

        try {
            Statement stm = c.createStatement();
            ResultSet rs = stm.executeQuery(sqlLista);
            //verifica se retornou algum registro e cria os Objetos
            while (rs.next()) {
                f = new Fornecedor();
                f.setFornecedores_Codigo(rs.getInt("fornecedores_Codigo"));
                f.setFornecedores_CNPJ(rs.getString("fornecedores_CNPJ"));
                f.setFornecedores_RazaoSocial(rs.getString("fornecedores_RazaoSocial"));
                f.setFornecedores_NumeroResidencia(rs.getInt("fornecedores_NumeroResidencia"));
                f.setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_CEP(rs.getString("enderecos_CEP"));
                f.getEndereco().setEnderecos_Logradouro(rs.getString("enderecos_Logradouro"));
                f.getEndereco().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Nome(rs.getString("cidades_Nome"));
                lista.add(f);
            }
            return lista;
        } catch (SQLException e) {
            throw new RepositorioException(e);
        } finally {
            g.desconectar(c);
        }
    }

    @Override
    public Collection<Fornecedor> listarForCNPJ(String fornecedores_CNPJ) throws ConexaoException, RepositorioException {
        ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
        Fornecedor f;
        Connection c = g.conectar();
        String sqlLista = "SELECT f.fornecedores_Codigo, f.fornecedores_CNPJ, f.Fornecedores_RazaoSocial, f.fornecedores_NumeroResidencia, end.enderecos_Codigo, end.enderecos_CEP, end.enderecos_Logradouro, end.cidades_Codigo, cd.cidades_Nome from (FORNECEDORES AS f INNER JOIN ENDERECOS AS end ON f.enderecos_Codigo = end.enderecos_Codigo) INNER JOIN CIDADES AS cd ON end.cidades_Codigo = cd.cidades_Codigo WHERE fornecedores_CNPJ LIKE ? ORDER BY f.fornecedores_CNPJ";

        try {
            PreparedStatement pstm = c.prepareStatement(sqlLista);
            pstm.setString(1, fornecedores_CNPJ+"%");
            ResultSet rs = pstm.executeQuery();
            //verifica se retornou algum registro e cria os Objetos
            while (rs.next()) {
                f = new Fornecedor();
                f.setFornecedores_Codigo(rs.getInt("fornecedores_Codigo"));
                f.setFornecedores_CNPJ(rs.getString("fornecedores_CNPJ"));
                f.setFornecedores_RazaoSocial(rs.getString("fornecedores_RazaoSocial"));
                f.setFornecedores_NumeroResidencia(rs.getInt("fornecedores_NumeroResidencia"));
                f.setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_CEP(rs.getString("enderecos_CEP"));
                f.getEndereco().setEnderecos_Logradouro(rs.getString("enderecos_Logradouro"));
                f.getEndereco().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Nome(rs.getString("cidades_Nome"));
                lista.add(f);
            }
            return lista;
        } catch (SQLException e) {
            throw new RepositorioException(e);
        } finally {
            g.desconectar(c);
        }
    }

    @Override
    public Collection<Fornecedor> listarForRazaoSocial(String fornecedores_RazaoSocial) throws ConexaoException, RepositorioException {
        ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
        Fornecedor f;
        Connection c = g.conectar();
        String sqlLista = "SELECT f.fornecedores_Codigo, f.fornecedores_CNPJ, f.Fornecedores_RazaoSocial, f.fornecedores_NumeroResidencia, end.enderecos_Codigo, end.enderecos_CEP, end.enderecos_Logradouro, end.cidades_Codigo, cd.cidades_Nome from (FORNECEDORES AS f INNER JOIN ENDERECOS AS end ON f.enderecos_Codigo = end.enderecos_Codigo) INNER JOIN CIDADES AS cd ON end.cidades_Codigo = cd.cidades_Codigo WHERE fornecedores_RazaoSocial LIKE ? ORDER BY f.fornecedores_CNPJ";

        try {
            PreparedStatement pstm = c.prepareStatement(sqlLista);
            pstm.setString(1, "%"+fornecedores_RazaoSocial+"%");
            ResultSet rs = pstm.executeQuery();
            //verifica se retornou algum registro e cria os Objetos
            while (rs.next()) {
                f = new Fornecedor();
                f.setFornecedores_Codigo(rs.getInt("fornecedores_Codigo"));
                f.setFornecedores_CNPJ(rs.getString("fornecedores_CNPJ"));
                f.setFornecedores_RazaoSocial(rs.getString("fornecedores_RazaoSocial"));
                f.setFornecedores_NumeroResidencia(rs.getInt("fornecedores_NumeroResidencia"));
                f.setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_CEP(rs.getString("enderecos_CEP"));
                f.getEndereco().setEnderecos_Logradouro(rs.getString("enderecos_Logradouro"));
                f.getEndereco().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Nome(rs.getString("cidades_Nome"));
                lista.add(f);
            }
            return lista;
        } catch (SQLException e) {
            throw new RepositorioException(e);
        } finally {
            g.desconectar(c);
        }
    }

    @Override
    public Collection<Fornecedor> listarForCEP(String enderecos_CEP) throws ConexaoException, RepositorioException {
        ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
        Fornecedor f;
        Connection c = g.conectar();
        String sqlLista = "SELECT f.fornecedores_Codigo, f.fornecedores_CNPJ, f.Fornecedores_RazaoSocial, f.fornecedores_NumeroResidencia, end.enderecos_Codigo, end.enderecos_CEP, end.enderecos_Logradouro, end.cidades_Codigo, cd.cidades_Nome from (FORNECEDORES AS f INNER JOIN ENDERECOS AS end ON f.enderecos_Codigo = end.enderecos_Codigo) INNER JOIN CIDADES AS cd ON end.cidades_Codigo = cd.cidades_Codigo WHERE enderecos_CEP LIKE ? ORDER BY f.fornecedores_CNPJ";

        try {
            PreparedStatement pstm = c.prepareStatement(sqlLista);
            pstm.setString(1, enderecos_CEP+"%");
            ResultSet rs = pstm.executeQuery();
            //verifica se retornou algum registro e cria os Objetos
            while (rs.next()) {
                f = new Fornecedor();
                f.setFornecedores_Codigo(rs.getInt("fornecedores_Codigo"));
                f.setFornecedores_CNPJ(rs.getString("fornecedores_CNPJ"));
                f.setFornecedores_RazaoSocial(rs.getString("fornecedores_RazaoSocial"));
                f.setFornecedores_NumeroResidencia(rs.getInt("fornecedores_NumeroResidencia"));
                f.setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_CEP(rs.getString("enderecos_CEP"));
                f.getEndereco().setEnderecos_Logradouro(rs.getString("enderecos_Logradouro"));
                f.getEndereco().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Nome(rs.getString("cidades_Nome"));
                lista.add(f);
            }
            return lista;
        } catch (SQLException e) {
            throw new RepositorioException(e);
        } finally {
            g.desconectar(c);
        }
    }

    @Override
    public Collection<Fornecedor> listarForLog(String enderecos_Logradouro) throws ConexaoException, RepositorioException {
        ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
        Fornecedor f;
        Connection c = g.conectar();
        String sqlLista = "SELECT f.fornecedores_Codigo, f.fornecedores_CNPJ, f.Fornecedores_RazaoSocial, f.fornecedores_NumeroResidencia, end.enderecos_Codigo, end.enderecos_CEP, end.enderecos_Logradouro, end.cidades_Codigo, cd.cidades_Nome from (FORNECEDORES AS f INNER JOIN ENDERECOS AS end ON f.enderecos_Codigo = end.enderecos_Codigo) INNER JOIN CIDADES AS cd ON end.cidades_Codigo = cd.cidades_Codigo WHERE enderecos_Logradouro LIKE ? ORDER BY f.fornecedores_CNPJ";

        try {
            PreparedStatement pstm = c.prepareStatement(sqlLista);
            pstm.setString(1, "%"+enderecos_Logradouro+"%");
            ResultSet rs = pstm.executeQuery();
            //verifica se retornou algum registro e cria os Objetos
            while (rs.next()) {
                f = new Fornecedor();
                f.setFornecedores_Codigo(rs.getInt("fornecedores_Codigo"));
                f.setFornecedores_CNPJ(rs.getString("fornecedores_CNPJ"));
                f.setFornecedores_RazaoSocial(rs.getString("fornecedores_RazaoSocial"));
                f.setFornecedores_NumeroResidencia(rs.getInt("fornecedores_NumeroResidencia"));
                f.setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_CEP(rs.getString("enderecos_CEP"));
                f.getEndereco().setEnderecos_Logradouro(rs.getString("enderecos_Logradouro"));
                f.getEndereco().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Nome(rs.getString("cidades_Nome"));
                lista.add(f);
            }
            return lista;
        } catch (SQLException e) {
            throw new RepositorioException(e);
        } finally {
            g.desconectar(c);
        }
    }
    
    @Override
    public Collection<Fornecedor> listarForCidade(String cidades_Nome) throws ConexaoException, RepositorioException {
        ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
        Fornecedor f;
        Connection c = g.conectar();
        String sqlLista = "SELECT f.fornecedores_Codigo, f.fornecedores_CNPJ, f.Fornecedores_RazaoSocial, f.fornecedores_NumeroResidencia, end.enderecos_Codigo, end.enderecos_CEP, end.enderecos_Logradouro, end.cidades_Codigo, cd.cidades_Nome from (FORNECEDORES AS f INNER JOIN ENDERECOS AS end ON f.enderecos_Codigo = end.enderecos_Codigo) INNER JOIN CIDADES AS cd ON end.cidades_Codigo = cd.cidades_Codigo WHERE cidades_Nome = ? ORDER BY f.fornecedores_CNPJ";

        try {
            PreparedStatement pstm = c.prepareStatement(sqlLista);
            pstm.setString(1, cidades_Nome);
            ResultSet rs = pstm.executeQuery();
            //verifica se retornou algum registro e cria os Objetos
            while (rs.next()) {
                f = new Fornecedor();
                f.setFornecedores_Codigo(rs.getInt("fornecedores_Codigo"));
                f.setFornecedores_CNPJ(rs.getString("fornecedores_CNPJ"));
                f.setFornecedores_RazaoSocial(rs.getString("fornecedores_RazaoSocial"));
                f.setFornecedores_NumeroResidencia(rs.getInt("fornecedores_NumeroResidencia"));
                f.setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_Codigo(rs.getInt("enderecos_Codigo"));
                f.getEndereco().setEnderecos_CEP(rs.getString("enderecos_CEP"));
                f.getEndereco().setEnderecos_Logradouro(rs.getString("enderecos_Logradouro"));
                f.getEndereco().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Codigo(rs.getInt("cidades_Codigo"));
                f.getEndereco().getCidade().setCidades_Nome(rs.getString("cidades_Nome"));
                lista.add(f);
            }
            return lista;
        } catch (SQLException e) {
            throw new RepositorioException(e);
        } finally {
            g.desconectar(c);
        }
    }
}