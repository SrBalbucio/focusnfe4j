package balbucio.focusnfe4j.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentoImportacao {

    @JsonProperty("numero")
    private String numero;

    @JsonProperty("data_registro")
    private String dataRegistro;

    @JsonProperty("local_desembaraco_aduaneiro")
    private String localDesembaracoAduaneiro;

    @JsonProperty("uf_desembaraco_aduaneiro")
    private String ufDesembaracoAduaneiro;

    @JsonProperty("data_desembaraco_aduaneiro")
    private String dataDesembaracoAduaneiro;

    @JsonProperty("via_transporte")
    private Integer viaTransporte;

    @JsonProperty("valor_afrmm")
    private Double valorAfrmm;

    @JsonProperty("forma_intermedio")
    private Integer formaIntermedio;

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("uf_terceiro")
    private String ufTerceiro;

    @JsonProperty("codigo_exportador")
    private String codigoExportador;

    @JsonProperty("adicoes")
    private List<Adicao> adicoes;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getLocalDesembaracoAduaneiro() {
        return localDesembaracoAduaneiro;
    }

    public void setLocalDesembaracoAduaneiro(String localDesembaracoAduaneiro) {
        this.localDesembaracoAduaneiro = localDesembaracoAduaneiro;
    }

    public String getUfDesembaracoAduaneiro() {
        return ufDesembaracoAduaneiro;
    }

    public void setUfDesembaracoAduaneiro(String ufDesembaracoAduaneiro) {
        this.ufDesembaracoAduaneiro = ufDesembaracoAduaneiro;
    }

    public String getDataDesembaracoAduaneiro() {
        return dataDesembaracoAduaneiro;
    }

    public void setDataDesembaracoAduaneiro(String dataDesembaracoAduaneiro) {
        this.dataDesembaracoAduaneiro = dataDesembaracoAduaneiro;
    }

    public Integer getViaTransporte() {
        return viaTransporte;
    }

    public void setViaTransporte(Integer viaTransporte) {
        this.viaTransporte = viaTransporte;
    }

    public Double getValorAfrmm() {
        return valorAfrmm;
    }

    public void setValorAfrmm(Double valorAfrmm) {
        this.valorAfrmm = valorAfrmm;
    }

    public Integer getFormaIntermedio() {
        return formaIntermedio;
    }

    public void setFormaIntermedio(Integer formaIntermedio) {
        this.formaIntermedio = formaIntermedio;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUfTerceiro() {
        return ufTerceiro;
    }

    public void setUfTerceiro(String ufTerceiro) {
        this.ufTerceiro = ufTerceiro;
    }

    public String getCodigoExportador() {
        return codigoExportador;
    }

    public void setCodigoExportador(String codigoExportador) {
        this.codigoExportador = codigoExportador;
    }

    public List<Adicao> getAdicoes() {
        return adicoes;
    }

    public void setAdicoes(List<Adicao> adicoes) {
        this.adicoes = adicoes;
    }
}
