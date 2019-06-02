package 创建型模式.BuilderMode;

/**
 * Created by hasee on 2018/12/13.
 *建造者模式的实体用于存储信息
 */
public class Sti {
    private String E;
    private String Shift;
    private String Q;
    private String F;

    public String getE() {
        return E;
    }

    public void setE(String e) {
        this.E = e;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String shift) {
        Shift = shift;
    }

    public String getQ() {
        return Q;
    }

    public void setQ(String q) {
        Q = q;
    }

    public String getF() {
        return F;
    }

    public void setF(String f) {
        F = f;
    }

    @Override
    public String toString() {
        return "Sti{" +
                "E='" + E + '\'' +
                ", Shift='" + Shift + '\'' +
                ", Q='" + Q + '\'' +
                ", F='" + F + '\'' +
                '}';
    }
}
