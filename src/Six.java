//输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
// 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。


import java.util.Arrays;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Six {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null ||in==null)
        {
            return null;
        }
        if(pre.length==0||in.length==0)
        {
            return null;
        }
        if(pre.length!=in.length)
        {
            return null;
        }
        TreeNode root=new TreeNode(pre[0]);
        for(int i=0;i<pre.length;i++)
        {
            if(pre[0]==in[i])
            {
                root.left= reConstructBinaryTree(Arrays.copyOfRange(pre,1,i),Arrays.copyOfRange(in,
                        0,i-1));
                root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length-1),Arrays.copyOfRange(
                        in,i+1,in.length-1)
                );

            }
        }
        return root;
    }
}