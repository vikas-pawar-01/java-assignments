public class Hello {
    public static void main(String[] args) {

        int a = 5;   // Binary: 00000101
        int b = 3;   // Binary: 00000011

        // Bitwise AND
        int andResult = a & b; // Result: 00000001 (1)
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise OR
        int orResult = a | b;  // Result: 00000111 (7)
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // Result: 00000110 (6)
        System.out.println("Bitwise XOR: " + xorResult);

        // Bitwise Complement
        int complement = ~a;  // Result: 11111010 (Two's complement: -6)
        System.out.println("Bitwise Complement of a: " + complement);

        // Left Shift
        int leftShift = a << 1; // Result: 00001010 (10)
        System.out.println("Left Shift: " + leftShift);

        // Right Shift
        int rightShift = a >> 1; // Result: 00000010 (2)
        System.out.println("Right Shift: " + rightShift);

        // Unsigned Right Shift
        int unsignedRightShift = -5 >>> 2; // Logical shift 00000010
        System.out.println("Unsigned Right Shift: " + unsignedRightShift);

        a = 16; // Binary: 00000000 00000000 00000000 00010000
        int result = a >>> 2; // Shift right by 2

        // Result: 00000000 00000000 00000000 00000100 (Decimal: 4)
        System.out.println("Positive Unsigned Right Shift: " + result);

        b = -16; // Binary: 11111111 11111111 11111111 11110000 (Two's complement)
        result = b >>> 2;

        // Result: 00111111 11111111 11111111 11111100 (Decimal: 1073741820)
        System.out.println("Negative Unsigned Right Shift: " + result);

    }
}
