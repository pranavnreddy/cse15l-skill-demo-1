public class SkillDemo1 {
    public static int exponent(int base, int power) {
        if(base == 0 && power == 0) {
            throw new IllegalArgumentException();
        }
        int result = 1;
        for(int i = 0; i < power; i++) {
            result = result * base;
        }
        return result;
    }
}
