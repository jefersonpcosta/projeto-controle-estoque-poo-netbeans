/**
 *
 */
package projeto.modelo.negocio;

import java.util.ArrayList;
import java.util.Collection;
import projeto.erro.ConexaoException;
import projeto.erro.GeralException;
import projeto.erro.RepositorioException;
import projeto.modelo.repositorio.IRepositorioTipo;
import projeto.modelo.repositorio.RepositorioTipo;
import projeto.modelo.to.Tipo;

/**
 * @author Felipe Carlos
 *
 */
public class NegocioTipo {

    private IRepositorioTipo rep;

    /**
     * Contrutor inicializa o atributo "rep" responsável pela camada de acesso a
     * dados
     */
    public NegocioTipo() {
        rep = new RepositorioTipo();
    }

    /**
     * Verificar os dados antes de salvar este método usa Exceptions para
     * transmitir mensagens entre as camadas do sistema (negocio ->
     * apresentação)
     */
    public void salvar(Tipo t) throws GeralException {
        //validação dos campos no próprio método

        if (t.getTipos_Descricao() == null) {
            throw new GeralException("Descrição não informada!");
        }

        try {

            Tipo tconsul = rep.consultarTipos(t.getTipos_Descricao());
            if (tconsul != null) {
                throw new GeralException("Tipo já cadastrado!");
            }

            rep.salvar(t);
            throw new GeralException("Tipo salvo com sucesso!");

        } catch (RepositorioException ex) {
            throw new GeralException("Felipe fez algo errado");
        } catch (ConexaoException ex) {
            throw new GeralException("O banco de dados não está acessível!");
        }
    }

    /**
     * Verifica os dados antes de consultar a String Descricao
     */
    public Tipo consultarTipos(String tipos_Descricao) throws GeralException {
        Tipo t = null;

        if (tipos_Descricao == null) {
            throw new GeralException("Descrição do tipo não informada");
        }

        try {
            t = rep.consultarTipos(tipos_Descricao);

            if (t == null) {
                throw new GeralException("Tipo não encontrado!");
            }

        } catch (RepositorioException ex) {
            throw new GeralException("Felipe fez algo errado");
        } catch (ConexaoException ex) {
            throw new GeralException("O banco de dados não está acessível!");
        }
        return t;
    }

    /**
     * Verifica os dados antes de consultar a String Codigo
     */
    public Tipo consultarTipos(int tipos_Codigo) throws GeralException {
        Tipo t = null;

        if (tipos_Codigo <= 0) {
            throw new GeralException("Codigo do tipo não informada");
        }

        try {
            t = rep.consultarTipos(tipos_Codigo);

            if (t == null) {
                throw new GeralException("Tipos não encontrado!");
            }

        } catch (RepositorioException ex) {
            throw new GeralException("Felipe fez algo de errado");
        } catch (ConexaoException ex) {
            throw new GeralException("O banco de dados não está acessível!");
        }
        return t;
    }

    /**
     * Verificar os dados antes de excluir o tipo este método usa Exceptions
     * para transmitir mensagens entre as camadas do sistema (negocio ->
     * apresentação)
     */
    public void excluirTipos(int tipos_Codigo) throws GeralException {

        //verificar se o tipo foi informado
        if (tipos_Codigo <= 0) {
            throw new GeralException("Tipo não foi selecionado para ser deletado!");
        }

        try {

            Tipo t = rep.consultarTipos(tipos_Codigo);
            if (t == null) {
                throw new GeralException("Tipo não existe!");
            }

            rep.excluirTipos(tipos_Codigo);

        } catch (RepositorioException ex) {
            throw new GeralException("Felipe fez algo errado");

        } catch (ConexaoException ex) {
            throw new GeralException("O banco de dados não está acessível!");
        }
    }

    public void excluirTipos(String tipos_Descricao) throws GeralException {

        //verificar se o codigo do produto foi informado
        if (tipos_Descricao == null) {
            throw new GeralException("Tipo não foi selecionado para ser deletado!");
        }

        try {

            Tipo t = rep.consultarTipos(tipos_Descricao);
            if (t == null) {
                throw new GeralException("Tipo não existe!");
            }

            rep.excluirTipos(tipos_Descricao);

        } catch (RepositorioException ex) {
            throw new GeralException("Felipe fez algo errado");

        } catch (ConexaoException ex) {
            throw new GeralException("O banco de dados não está acessível!");
        }
    }

    /**
     * Verificar os dados antes de Aletar Tipo
     *
     * @throws GeralException
     */
    public void alterar(Tipo t) throws GeralException {
        //validação dos campos no próprio método

        //validação da seleção do Produto
        if (t.getTipos_Codigo() <= 0) {
            throw new GeralException("Tipo não informado!");
        }

        //validação da descricao
        if (t.getTipos_Descricao() == null) {
            throw new GeralException("Tipo da Descrição não informada!");
        }

        try {

            Tipo tconsul = rep.consultarTipos(t.getTipos_Codigo());
            if (tconsul == null) {
                throw new GeralException("Tipo não existe!");
            }

            rep.alterar(t);

        } catch (RepositorioException ex) {
            throw new GeralException("Felipe fez algo de errado!");
        } catch (ConexaoException ex) {
            throw new GeralException("O banco de dados não está acessível!");
        }
    }

    /**
     * Verificar os dados antes de consultar a lista
     */
    public Collection<Tipo> listarTipo(String tipos_Descricao) throws GeralException {

        ArrayList<Tipo> lista;

        if (tipos_Descricao == null) {
            throw new GeralException("Descrição do produto não informada");
        }
        try {
            lista = (ArrayList<Tipo>) new RepositorioTipo().listarTipo(tipos_Descricao);

        } catch (RepositorioException ex) {
            throw new GeralException("Felipe fez algo de errado!");
        } catch (ConexaoException ex) {
            throw new GeralException("O banco de dados não está acessível!");
        }
        return lista;
    }
}