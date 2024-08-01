public class Bell {
    private String currentSound = "ding";

    public void sound() {
        System.out.println(currentSound);
        currentSound = currentSound.equals("ding") ? "dong" : "ding";
    }
}
