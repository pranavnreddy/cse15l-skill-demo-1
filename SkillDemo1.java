public class SkillDemo1 {
    public static int exponent(int base, int power) {
        int result = 1;
        for(int i = 0; i < power; i++) {
            result = result * base;
        }
        return result;
    }
}
