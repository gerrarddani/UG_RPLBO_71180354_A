package bebas;

public class PasswordException extends Exception {
    private int errCode;
    private String errMessage;

    public PasswordException(int errCode) {
        this.errCode = errCode;
        if (errCode == 1) {
            this.errMessage = "Input password tidak boleh kosong";
        } else if (errCode == 2) {
            this.errMessage = "Password minimal harus terdiri dari 7 karakter";
        } else if (errCode == 3) {
            this.errMessage = "Password minimal harus mengandung 1 karakter huruf kecil, huruf besar, simbol, dan angka";
        } else if (errCode == 4) {
            this.errMessage = "Password tidak boleh sama dengan username!";
        } else if (errCode == 5) {
            this.errMessage = "Password harus sama dengan konfirmasi password";
        }

    }

    public PasswordException(String errorMessage) {
        super(errorMessage);
    }

    public int getErrorCode() {

        return this.errCode;
    }

    public String getErrorMessage() {

        return this.errMessage;
    }
}