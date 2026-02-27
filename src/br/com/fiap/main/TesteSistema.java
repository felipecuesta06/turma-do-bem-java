package br.com.fiap.main;

import br.com.fiap.entities.*;

import javax.swing.*;

public class TesteSistema {
    static String texto(String j) {return JOptionPane.showInputDialog(j);}
    static int inteiro (String j) {return Integer.parseInt(JOptionPane.showInputDialog(j));}
    static double real (String j) {return Double.parseDouble(JOptionPane.showInputDialog(j));}

    public static void main(String[] args) {
        //========== Ong ==========//
 //public Ong(String cnpj, String razaoSocial, String nomeFantasia) {
        Ong objOng = new Ong(
                texto("CNPJ da Ong:"),
                texto("Razão Social da Ong:"),
                texto("Nome Fantasia da Ong:")
        );

        //========== Funcionario ==========//
 //public Funcionario(String nome, String cargo, String cpf, int idade) {
        Funcionario objFuncionario = new Funcionario(
                texto("Nome do Funcionário:"),
                texto("Cargo do Funcionário:"),
                texto("CPF do Funcionário:"),
                inteiro("Idade do Funcionário:")
        );
        objOng.setFuncionario(objFuncionario);

        //========== Paciente ==========//
 //public Paciente(String nome, int idade, String cpf) {
        Paciente objPaciente = new Paciente(
                texto("Nome do Paciente:"),
                inteiro("Idade do Paciente:"),
                texto("CPF do Paciente:")
        );
        //========== Dentista ==========//
 //public Dentista(String nome, String cro, String cpf) {
        Dentista objDentista = new Dentista(
                texto("Nome do Dentista:"),
                texto("CRO do Dentista:"),
                texto("CPF do Dentista:")
        );


        //========== Endereco Paciente  ==========//
 //public Endereco(String logradouro, int numero, String complemento, String cep, String bairro, String cidade, String estado) {
        Endereco objEndPaci = new Endereco(
                texto("Logradouro Residência do Paciente:"),
                inteiro("Número Residência do Paciente:"),
                texto("Complemento Residência do Paciente:"),
                texto("CEP Residência do Paciente:"),
                texto("Bairro Residência do Paciente:"),
                texto("Cidade Residência do Paciente:"),
                texto("Estado Residência do Paciente:")
        );
        objPaciente.setEndereco(objEndPaci);


        //========== Endereco Dentista ==========//
 //public Endereco(String logradouro, int numero, String complemento, String cep, String bairro, String cidade, String estado) {
        Endereco objEndDenti = new Endereco(
                texto("Logradouro Consultório do Dentista:"),
                inteiro("Número Consultório do Dentista:"),
                texto("Complemento Consultório do Dentista:"),
                texto("CEP Consultório do Dentista:"),
                texto("Bairro Consultório do Dentista:"),
                texto("Cidade Consultório do Dentista:"),
                texto("Estado Consultório do Dentista:")
        );
        objDentista.setEndereco(objEndDenti);
        //========== Contato Funcionario ==========//
 //public Contato(String telefone, String email, String tipo) {
        Contato objContFunci = new Contato(
                texto("Telefone do Funcionário:"),
                texto("Email do Funcionário:"),
                texto("Tipo:")
        );
        objFuncionario.setContato(objContFunci);
        //========== Contato Dentista ==========//
 //public Contato(String telefone, String email, String tipo) {
        Contato objContDenti = new Contato(
                texto("Telefone do Dentista:"),
                texto("Email do Dentista:"),
                texto("Tipo:")
        );
        objDentista.setContato(objContDenti);
        //========== Contato Paciente ==========//
 //public Contato(String telefone, String email, String tipo) {
        Contato objContPaciente = new Contato(
                texto("Telefone do Paciente:"),
                texto("Email do Paciente:"),
                texto("Tipo:")
        );
        objPaciente.setContato(objContPaciente);
        //========== Consulta ==========//
 //public Consulta(String data) {
        Consulta objConsulta = new Consulta(
                texto("Data da Consulta:")
        );
        //========== Tratamento ==========//
 //public Tratamento(String descricao, String horaInicio, String horaFim, String status) {
        Tratamento objTratamento = new Tratamento(
                texto("Descrição do Tratamento:"),
                texto("Hora Início:"),
                texto("Hora Fim:"),
                texto("Status do Tratamento:")
        );
        objConsulta.setTratamento(objTratamento);
        //========== Material ==========//
 //public Material(String materialUsado, double materialValor) {
        Material objMaterial = new Material(
                texto("Material Usado:"),
                real("Valor do Material:")

        );
        objTratamento.setMaterial(objMaterial);
        //========== Triagem ==========//
 //public Triagem(int peso, double altura, String problemaSaude) {
        Triagem objTriagem = new Triagem(
                inteiro("Peso do Paciente:"),
                real("Altura do Paciente:"),
                texto("Problema de Saúde Bocal do do Paciente:")

        );
        objPaciente.setTriagem(objTriagem);


        System.out.println(
                objOng + "" + objPaciente + objDentista


        );


    }



}
