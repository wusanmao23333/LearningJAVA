package iostram;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;


public class FileBrowser extends JPanel {
	
	private JTree tree; //创建树
    private TreePath treePath; //树的路径
    int t=0;
    public FileBrowser() {
    	
        this.setLayout(new BorderLayout());
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("我的电脑");//设置根路径
        tree = new JTree(root);
        File[] roots = File.listRoots();
        for (int i = 0; i < roots.length; i++) {
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(roots[i].getPath());
            root.add(node);//���ӵ����ڵ�
        }
        MouseListener ml = new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                try {
                    TreePath tp = tree.getPathForLocation(e.getX(), e.getY());
                    String ttt=tp.getLastPathComponent().toString();
                    System.out.println(ttt);
                    System.out.println("-->"+tp);
                    if (tp != null) {
                        treePath = tp;
                        int size = treePath.getPath().length;
                        System.out.println("-->"+size);
                        StringBuffer pathname = new StringBuffer();
                        if (size > 0) {
                            File file = new File(ttt+"\\");
                            File[] list = file.listFiles();
                            for (int i = 0; i < list.length; i++) {
                                String[] strings = list[i].getPath().split("////");
                                for(int j=0;j<strings.length;j++){
                                	System.out.println(strings[j]);
                                }
                                DefaultMutableTreeNode node = new DefaultMutableTreeNode(strings[strings.length - 1]);
                                ((DefaultMutableTreeNode) tp.getLastPathComponent()).add(node);
                            }
                        }
                    }
                } catch (Exception e1) {
                    System.out.println("can not open");
                }
            }
        };
        tree.addMouseListener(ml);
        tree.setShowsRootHandles(true);
        tree.setRootVisible(true);
        JScrollPane scrPane = new JScrollPane(tree);
        add(scrPane);
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("FileBrowser");
        jFrame.setLayout(new BorderLayout());
        jFrame.add(new FileBrowser());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(350, 700);
        jFrame.setVisible(true);
    }

}

