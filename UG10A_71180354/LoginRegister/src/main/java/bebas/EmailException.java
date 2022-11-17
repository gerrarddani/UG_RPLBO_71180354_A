package bebas;

public class EmailException extends Exception {
    private int errCode;
    private String errMessage;

    public EmailException(int errCode) {
        this.errCode = errCode;
        if (errCode == 1) {
            this.errMessage = "Input email tidak boleh kosong";
        } else if (errCode == 2) {
            this.errMessage = "Format email harus valid (cth: email@ukdw.com)";
        }

    }

    public EmailException(String errorMessage) {
        super(errorMessage);
    }

    public int getErrorCode() {

        return this.errCode;
    }

    public String getErrorMessage() {

        return this.errMessage;
    }
}
