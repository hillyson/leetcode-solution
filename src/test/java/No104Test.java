import org.junit.Assert;
import org.junit.Test;

/**
 * No 104 Test
 * Created by Hillyson on 16/10/30.
 */
public class No104Test {
    @Test
    public void solutionTest() {
        No104 testClass = new No104();
        No104.TreeNode root = new No104.TreeNode(0);
        No104.TreeNode level2_Left = new No104.TreeNode(1);
        No104.TreeNode level2_Right = new No104.TreeNode(2);
        No104.TreeNode level3_Left_In_Level2_Left = new No104.TreeNode(3);
        No104.TreeNode level3_Left_In_Level2_Right = new No104.TreeNode(4);
        No104.TreeNode level3_Right_In_Level2_Right = new No104.TreeNode(5);
        No104.TreeNode level4_Right_In_Level3_Right = new No104.TreeNode(6);

        root.left = level2_Left;
        root.right = level2_Right;

        level2_Left.left = level3_Left_In_Level2_Left;

        level2_Right.left = level3_Left_In_Level2_Right;
        level2_Right.right = level3_Right_In_Level2_Right;

        level3_Right_In_Level2_Right.right = level4_Right_In_Level3_Right;

        Assert.assertEquals(testClass.maxDepth(root), 4);
        Assert.assertEquals(testClass.maxDepth(level2_Left), 2);
        Assert.assertEquals(testClass.maxDepth(level2_Right), 3);
    }
}
