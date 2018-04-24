package ru.vbekarev.git;

/**
 * Created by v.bekarev on 24.04.2018.
 */
public class BaseEntity {

    private Long ig;

    public Long getIg() {
        return ig;
    }

    public void setIg(Long ig) {
        this.ig = ig;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "ig=" + ig +
                '}';
    }
}
