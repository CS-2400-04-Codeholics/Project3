import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DriverBTTest
{
    @Test
    void main()
    {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();

        String expectedOutput = """
            1st Testing Example:

            Given Tree:

                 A
               /   \\
              B     C
             / \\   /
            D   E  F
                    \\
                     G

            (BinaryTree) post-order:
            D, E, B, G, F, C, A
            (BinaryNode) post-order:
            D, E, B, G, F, C, A
            (BinaryTree) Height of tree is 4
            (BinaryNode) Height of tree is 4

            (BinaryTree) # nodes of tree is 7
            (BinaryNode) # nodes of tree is 7
            ==========================================

            2nd Testing Example:

            Given Tree:

                  A
                /   \\
               B     C
                   /   \\
                  D     E
                 /    /   \\
                F    G     H

            (BinaryTree) post-order:
            B, F, D, G, H, E, C, A
            (BinaryNode) post-order:
            B, F, D, G, H, E, C, A
            (BinaryTree) Height of tree is 4
            (BinaryNode) Height of tree is 4

            (BinaryTree) # nodes of tree is 8
            (BinaryNode) # nodes of tree is 8
            Done.
            """;

        System.setOut(new PrintStream(out));
        DriverBT.main(null);
        String actualOutput = out.toString();
        assertEquals(expectedOutput, actualOutput);
    }

}