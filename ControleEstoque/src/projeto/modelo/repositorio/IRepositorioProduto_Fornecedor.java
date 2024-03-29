/**
 *
 */
package projeto.modelo.repositorio;

import java.util.Collection;
import projeto.erro.ConexaoException;
import projeto.erro.RepositorioException;
import projeto.modelo.to.Produto_Fornecedor;

/**
 * @author diego
 *
 */
public interface IRepositorioProduto_Fornecedor {

    /**
     * Insere um registro no Produto_Fornecedor, responsável por ligar o
     * fornecedor ao produto fornecido Metodo padrão
     */
    public void salvar(Produto_Fornecedor pf) throws ConexaoException, RepositorioException;

    /**
     * CONSULTAR um registro no Produto_Fornecedor, responsável por ligar o
     * fornecedor ao produto fornecido Metodo padrão
     */
    public Produto_Fornecedor ConsultarLigacaoFornecedorProduto(String Fornecedores_RazaoSocial, String Produtos_Descricao) throws ConexaoException, RepositorioException;

    /**
     * EXCLUIR um registro no Produto_Fornecedor, responsável por ligar o
     * fornecedor ao produto fornecido Metodo padrão
     */
    public void excluir(int Fornecedor_Codigo, int Produto_Codigo) throws ConexaoException, RepositorioException;

    /**
     * ALTERAR o vinculo do Fornecedor com o Produto
     */
    public void alterar(int FFornecedor_Codigo, int NProduto_Codigo, int Fornecedor_Codigo, int Produto_Codigo) throws ConexaoException, RepositorioException;

    /**
     * LISTAR todos vinculos que o tal produto tem com fornecedores
     *
     * @param Produto_Descricao
     * @return
     * @throws ConexaoException
     * @throws RepositorioException
     */
    public Collection<Produto_Fornecedor> listar(String Produto_Descricao) throws ConexaoException, RepositorioException;
    
    /**
     * LISTAR todos os vinculos que o fornecedor tem com produtos
     * @param Fornecedor_RazaoSocial
     * @return
     * @throws ConexaoException
     * @throws RepositorioException 
     */
    public Collection<Produto_Fornecedor> listarFornecedor(String Fornecedor_RazaoSocial) throws ConexaoException, RepositorioException;
    
    /**
     * LISTAR todos os fornecedores de tal produto
     * @return
     * @throws ConexaoException
     * @throws RepositorioException 
     */
    public Collection<Produto_Fornecedor> listarTodos() throws ConexaoException, RepositorioException;
    
    /**
     * LISTAR todos os produtos não fornecidos pelo fornecedor
     * @param fornecedor_RazaoSocial
     * @return
     * @throws ConexaoException
     * @throws RepositorioException 
     */
    public Collection<Produto_Fornecedor> listadeProdutosNaoFornecidos(String fornecedor_RazaoSocial) throws ConexaoException, RepositorioException;
}