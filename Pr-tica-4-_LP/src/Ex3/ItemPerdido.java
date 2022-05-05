package Ex3;

public class ItemPerdido {
    private String item, autor, local, data, descricao;


    public ItemPerdido() {

    }

    public String getItem() {
        return item;
    }

    public ItemPerdido setItem(String item) {
        this.item = item;
        return null;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
