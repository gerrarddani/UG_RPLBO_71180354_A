package bebas;

public class UsernameException extends Exception {
    private int errCode;
    private String errMessage;

    public UsernameException(int errCode) {
        this.errCode = errCode;
        if (errCode == 1) {
            this.errMessage = "Input email tidak boleh kosong";
        } else if (errCode == 2) {
            this.errMessage = "Username minimal harus terdiri dari 6 karakter";
        }

    }

    public UsernameException(String errorMessage) {
        super(errorMessage);
    }

    public int getErrorCode() {

        return this.errCode;
    }

    public String getErrorMessage() {

        return this.errMessage;
    }
}