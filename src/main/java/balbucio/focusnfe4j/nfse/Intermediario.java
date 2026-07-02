package balbucio.focusnfe4j.nfse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Intermediario {

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("nif")
    private String nif;

    @JsonProperty("motivo_ausencia_nif")
    private String motivoAusenciaNif;

    @JsonProperty("inscricao_municipal")
    private String inscricaoMunicipal;

    @JsonProperty("razao_social")
    private String razaoSocial;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getMotivoAusenciaNif() {
        return motivoAusenciaNif;
    }

    public void setMotivoAusenciaNif(String motivoAusenciaNif) {
        this.motivoAusenciaNif = motivoAusenciaNif;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
