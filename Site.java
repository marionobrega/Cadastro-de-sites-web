import java.io.Serializable;

public class Site implements Serializable {
    private static final long serialVersionUID = 1L;
    private String descricao;
    private String url;
    private String dataCadastro;

    public Site(String descricao, String url, String dataCadastro) {
        this.descricao = descricao;
        this.url = url;
        this.dataCadastro = dataCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrl() {
        return url;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }
}
