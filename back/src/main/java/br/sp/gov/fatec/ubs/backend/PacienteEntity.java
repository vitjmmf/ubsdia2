package br.sp.gov.fatec.ubs.backend;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "Paciente")
public class PacienteEntity {
    @Id
    private String nomeCompleto;
    private String nomeSocial;
    private String nomeMae;
    private String nomePai;
    private String dataNascimento;
    private String sexo;
    private String nacionalidade;
    private String municipioNasc;
    private String racaCor;
    private Boolean freqEscola;
    private String escolaridade;
    private String situacaoFamiliar;
    private String estabelecVinculo;
    private String estabelecCadastro;
    private Id deficiencia;
    private int cpf;
    private String endereco;
    private String identidade;
    private String celular;
    private String residencial;
    private String comercial;
    private String contato;
    private String email;
    private String origEnd;

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getNomeSocial() {
        return nomeSocial;
    }
    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    public String getNomePai() {
        return nomePai;
    }
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getMunicipioNasc() {
        return municipioNasc;
    }
    public void setMunicipioNasc(String municipioNasc) {
        this.municipioNasc = municipioNasc;
    }
    public String getRacaCor() {
        return racaCor;
    }
    public void setRacaCor(String racaCor) {
        this.racaCor = racaCor;
    }
    public Boolean getFreqEscola() {
        return freqEscola;
    }
    public void setFreqEscola(Boolean freqEscola) {
        this.freqEscola = freqEscola;
    }
    public String getEscolaridade() {
        return escolaridade;
    }
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    public String getSituacaoFamiliar() {
        return situacaoFamiliar;
    }
    public void setSituacaoFamiliar(String situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }
    public String getEstabelecVinculo() {
        return estabelecVinculo;
    }
    public void setEstabelecVinculo(String estabelecVinculo) {
        this.estabelecVinculo = estabelecVinculo;
    }
    public String getEstabelecCadastro() {
        return estabelecCadastro;
    }
    public void setEstabelecCadastro(String estabelecCadastro) {
        this.estabelecCadastro = estabelecCadastro;
    }
    public Id getDeficiencia() {
        return deficiencia;
    }
    public void setDeficiencia(Id deficiencia) {
        this.deficiencia = deficiencia;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getIdentidade() {
        return identidade;
    }
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getResidencial() {
        return residencial;
    }
    public void setResidencial(String residencial) {
        this.residencial = residencial;
    }
    public String getComercial() {
        return comercial;
    }
    public void setComercial(String comercial) {
        this.comercial = comercial;
    }
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getOrigEnd() {
        return origEnd;
    }
    public void setOrigEnd(String origEnd) {
        this.origEnd = origEnd;
    }

    

}
