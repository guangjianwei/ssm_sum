package cn.guangjian.domain;


public class errorMessage extends Exception{
    private String errorMag;

    public errorMessage(String errorMag) {
        this.errorMag = errorMag;
    }

    public String getErrorMag() {

        return errorMag;
    }

    public void setErrorMag(String errorMag) {
        this.errorMag = errorMag;
    }
}
