public class Balance {
    private int right = 0;
    private int left = 0;

    public void addRight(int n) {
        right += n;
    }

    public void addLeft(int n) {
        left += n;
    }

    public String getSituation() {
        if (right > left) return "R";
        if (right < left) return "L";
        return "=";
    }
}
