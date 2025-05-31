package uapbases;

public abstract class Shape {
    protected String name;

    public Shape() {
        this.name = "";
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getName() {
        return this.name;
    }

    public abstract void printInfo();
}
