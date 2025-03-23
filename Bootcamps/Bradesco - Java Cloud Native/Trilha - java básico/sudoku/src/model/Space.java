package model;
public class Space {

    private Integer actual;
    private boolean fixed;
    private final int expected;
    public Space( int expected ,boolean fixed) {
        this.fixed = fixed;
        this.expected = expected;
        if (fixed) {
            this.actual = expected;
        }
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) {
        if(fixed) return;
        this.actual = actual;
    }

    public void clearSpace(){
        setActual(null);
    }

    public int getExpected() {
        return expected;
    }
    public boolean isFixed(){
        return fixed;
    }   
}
