package executavel;

import model.dao.telefonia.EnderecoDAO;
import model.dao.telefonia.TelefoneDAO;
import model.vo.telefonia.Endereco;
import model.vo.telefonia.Telefone;

public class ExecutavelTelefonia {

	public static void main(String[] args) {
		
		TelefoneDAO dbaDeTelefones = new TelefoneDAO();
		Telefone telefoneJaExistente = new Telefone("48", "84708470", true, true);
		dbaDeTelefones.inserir(telefoneJaExistente);
		
		
		telefoneJaExistente.setNumero("00009999");
		boolean atualizouTelefone = dbaDeTelefones.atualizar(telefoneJaExistente);
		telefoneJaExistente = dbaDeTelefones.consultarPorId(4);
		if(atualizouTelefone) {
			System.out.println("Telefone atualizado.");
		} else {
			System.out.println("Telefone não foi atualizado.");
		}
		System.out.println(telefoneJaExistente);
//		Endereco endereco1 = new Endereco("88000123", "Nereu Ramos", "10", "Centro", "Florianópolis", "SC");
		EnderecoDAO dbaDeEnderecos = new EnderecoDAO();
//		//dbaDeEnderecos.inserir(endereco1);
//		
//		if(dbaDeEnderecos.excluir(9)) {
//			System.out.println("Endereço foi excluído");
//		}else {
//			System.out.println("Erro ao excluir endereço");
//		}
//		
//		/*
//		 * if(endereco1.getId() != null) {
//		 * System.out.println("Novo endereço cadastrado"); }else {
//		 * System.out.println("Erro ao cadastrar endereço"); }
//		 */
//		
//		Endereco enderecoQueJaExiste = new Endereco("88888888", "Rua editada", "1234", "Monte Verde", "Florianópolis", "SC");
//		//Endereco enderecoQueJaExiste = dbaDeEnderecos.consultarPorId(2);
//		 
//		dbaDeEnderecos.inserir(enderecoQueJaExiste);
//		System.out.println(enderecoQueJaExiste);
//		enderecoQueJaExiste.setRua("Rua do limoeiro");
//		boolean atualizou = dbaDeEnderecos.atualizar(enderecoQueJaExiste);
//		enderecoQueJaExiste = dbaDeEnderecos.consultarPorId(2);
//		if(atualizou) {
//			System.out.println("Endereço foi atualizado");
//		}else {
//			System.out.println("Erro ao atualizar endereço");
//		}
		
		//System.out.println(enderecoQueJaExiste);
		
		
//		List<Telefone> telefonesDoSocrates = new ArrayList<Telefone>();
//		Telefone telefone1 = new Telefone("48", "32328888", true, false);
//		telefonesDoSocrates.add(telefone1);
//		telefonesDoSocrates.add(new Telefone("48", "98881234", true, true));
//		
//		Cliente pele = new Cliente("Edson Arantes", "11122233344", null, true, endereco1);
//		Cliente socrates = new Cliente("Sócrates Brasileiro", "33322233344", telefonesDoSocrates, true, endereco1);
//		
//		List<Cliente> clientes = new ArrayList<Cliente>();
//		clientes.add(pele);
//		clientes.add(socrates);
//		
//		System.out.println("------------ Clientes da firma ------------");
//		for(Cliente c: clientes) {
//			System.out.println(c.toString());
//		}
//		
//		for(int i=0; i < clientes.size(); i++) {
//			Cliente c = clientes.get(i);
//			System.out.println(c.toString());
//		}
		
	}
}