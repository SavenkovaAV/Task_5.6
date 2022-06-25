package ru.vsu.cs.course1.test;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.course1.tree.BinaryTreeAlgorithms;
import ru.vsu.cs.course1.tree.SimpleBinaryTree;

public class Tests {

    static SimpleBinaryTree<Integer> tree = new SimpleBinaryTree<>(Integer::parseInt);

    @Test
    public void testSimpleBinaryTree() throws Exception {
        tree.fromBracketNotation("37 (5 (4 (0), 10 (, 22 (21 (14), 30 (23)))), 41 (39, 45 (44, 59 (52, 81 (65 (63, 74 (66 (, 73 (67)), 76 (, 80))), 92 (, 95))))))");

        int actualResult = BinaryTreeAlgorithms.findMaxNumber(tree);
        int correctResult = 95;

        Assert.assertEquals(actualResult, correctResult);
    }

   @Test
    public void testSimpleBinaryTree2() throws Exception {
        tree.fromBracketNotation("34 (7 (0 (, 6), 26 (24 (21 (19 (11, 20), 22), 25), 33 (29))), 58 (54 (47 (, 53 (49))), 59 (, 65 (62, 94 (93 (70 (, 72 (, 87 (83 (79), 89)))))))))");

        int actualResult = BinaryTreeAlgorithms.findMaxNumber(tree);
        int correctResult = 94;

        Assert.assertEquals(actualResult, correctResult);
    }

    @Test
    public void testSimpleBinaryTree3() throws Exception {
        tree.fromBracketNotation("7 (0 (, 1 (, 3 (2))), 80 (42 (9 (, 40 (36 (18 (10, 26)))), 64 (46 (, 51 (, 60 (59))), 74 (66))), 91 (90, 93 (, 98 (95)))))");

        int actualResult = BinaryTreeAlgorithms.findMaxNumber(tree);
        int correctResult = 98;

        Assert.assertEquals(actualResult, correctResult);
    }

    @Test
    public void testSimpleBinaryTree4() throws Exception {
        tree.fromBracketNotation("30 (16 (10, 17), 88 (59))");

        int actualResult = BinaryTreeAlgorithms.findMaxNumber(tree);
        int correctResult = 88;

        Assert.assertEquals(actualResult, correctResult);
    }

    @Test
    public  void testSimpleBinaryTree5() throws Exception {
        tree.fromBracketNotation("64 (29 (8 (, 17 (16)), 36 (, 48)))");

        int actualResult = BinaryTreeAlgorithms.findMaxNumber(tree);
        int correctResult = 64;

        Assert.assertEquals(actualResult, correctResult);
    }
}
