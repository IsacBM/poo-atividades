package com.isacbm.atividade02;
import java.time.LocalDate;
import java.time.Period;
/**
 * @author Isac B.M - 2K24
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    
    public Pessoa(String nome, String cpf, String email, String telefone, LocalDate data){
        this.setNome(nome);
        this. setCpf(cpf);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setDataNascimento(data); 
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        if(cpf == null){
            return "O CPF informado e invalido! :(";
        }else{
            return cpf;
        }
    }

    public void setCpf(String cpf) {
        String cpfOriginal = cpf;
        if(cpf.length() == 14){
            cpf = cpf.replace(".", "");
            cpf = cpf.replace("-", "");
            
        }
        if(cpf.length() == 11){
            int auxErro = 0;
            for(int i = 0; i < cpf.length(); i++){
                if (Character.isDigit(cpf.charAt(i)) == false){
                    auxErro++;
                }
            }
            if (auxErro == 0){  // Primeira válidação
                int somaTotal = 0;
                int aux1 = 10;
                for(int i = 0; i < cpf.length() - 2; i++ ){
                    somaTotal = somaTotal + (aux1 * (cpf.charAt(i) - '0'));
                    aux1--;
                }
                
                int digitoUm = somaTotal % 11;
                
                if (digitoUm >= 10){
                    digitoUm = 0;
                } else{
                    digitoUm = 11 - digitoUm;
                }
                if (digitoUm == cpf.charAt(9) - '0'){
                     int somaTotal2 = 0;
                    int aux2 = 11;
                    for(int i = 0; i < cpf.length() - 1; i++ ){
                        somaTotal2 = somaTotal2 + (aux2 * (cpf.charAt(i) - '0'));
                        aux2--;
                    }
                    int digitoDois = somaTotal2 % 11;
                
                    if (digitoDois >= 10 || digitoDois == 0){
                        digitoDois = 0;
                    } else{
                        digitoDois = 11 - digitoDois;
                    }
                    if(digitoDois == cpf.charAt(10) - '0'){
                        this.cpf = cpfOriginal;
                    }
                }
            }
        }
    }

    public String getEmail() {
        if(email == null){
            return "O email digitado e invalido";
        }else{
            return email;
        }
    }

    public void setEmail(String email) {
        int aux = 0;
        int contArrob = 0;
        int contPontArrob = 0;
        int contPont = 0;
        
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == ' '){
                aux++;
            } else if(email.charAt(0) == '.' || email.charAt(email.length()-1) == '.'){
                aux++;
            } else if(email.charAt(i) == '@'){
                if(i != 0 && i != email.length()-1){
                    contArrob++;
                    contPontArrob = i;
                }else if (contArrob > 1){
                    aux++;
                } else{
                    aux++;
                }
            } else{
                for (int j = 0; j <= contPontArrob; j++){
                    if(email.charAt(j) == '.'){
                        aux++;
                    }
                }
                for (int k = contPontArrob + 1; k < email.length(); k++){
                    if (email.charAt(k) == '.'){
                        contPont++;
                    }
                }
            }
        }
        if(aux == 0 && contPont >= 1){
            this.email = email;
        }
     
    }

    public String getTelefone() {
        if(telefone == null){
            return "Numero informado e Invalido!";
        } else{
            return telefone;
        }
    }

    public void setTelefone(String telefone) {
        if(telefone.length() == 11){
            int aux = 0;
            for(int i=0;  i < telefone.length(); i++){
                if(Character.isDigit(telefone.charAt(i)) == true){
                    aux++;
                }
            }
            if(aux == 11){
                this.telefone = telefone;
            }
        } 
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public int getIdade(){
        Period periodo = Period.between(this.dataNascimento,LocalDate.now());
        return periodo.getYears();
    }

    public void exibirDados(){
        System.out.println(
                "Ola, seja muito bem-vindo(a) Sr(a) "
                + this.getNome() + "! Essas sao suas informacoes: \n"
                 + "Nome: " + this.getNome()
                + "\nCPF: " + this.getCpf() 
                + "\nEmail: " + this.getEmail() 
                + "\nTelefone: " + this.getTelefone() 
                + "\nData de Nascimento: " + this.getDataNascimento()
                + "\nSua idade atual: " + this.getIdade() + " Anos"
        );
    }
}