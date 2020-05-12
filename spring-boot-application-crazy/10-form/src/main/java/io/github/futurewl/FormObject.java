package io.github.futurewl;

public class FormObject {

    private String name;

    private String[] myColors;

    private boolean best;

    public String[] getMyColors() {
        return myColors;
    }

    public void setMyColors(String[] myColors) {
        this.myColors = myColors;
    }

    public boolean isBest() {
        return best;
    }

    public void setBest(boolean best) {
        this.best = best;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
