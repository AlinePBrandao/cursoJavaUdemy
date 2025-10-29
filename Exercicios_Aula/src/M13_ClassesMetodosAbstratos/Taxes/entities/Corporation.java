package M13_ClassesMetodosAbstratos.Taxes.entities;

public class Corporation {

    private Integer totalEmployess;

    public Corporation(Integer totalEmployess) {
        this.totalEmployess = totalEmployess;
    }

    public Integer getTotalEmployess() {
        return totalEmployess;
    }

    public void setTotalEmployess(Integer totalEmployess) {
        this.totalEmployess = totalEmployess;
    }
}
