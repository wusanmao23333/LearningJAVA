# JAVA的IO操作
### 实验一 基本IO操作
#### 实验要求  

从键盘接收字节流
写入到当前目录下的src.txt文件中
将src.txt文件内容复制到当前目录下dest.txt文件中
将dest.txt文件内容显示到屏幕上

#### 实验结果  

result:   

![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/IOBaisc.png)  

### 实验二 获取系统的文件树
#### 实验要求

获取某个目录下的目录信息，目录从控制台输入。
目录信息包括该目录下的所有文件和文件夹的列表。对于每个文件夹显示其名称，修改日期。对于每个文件显示其名称，修改日期和大小。
目录的信息写出到文件中。注意，文件信息首先按类型分类，文件夹在前，文件在后，并且他们各自按照文件名字符串的顺序排序。  

#### 部分代码展示
		 `System.out.println("Enter FilePath: ");
			String str = scan.nextLine();
			File file = new File(str);
	      	FileWriter  inFile = new FileWriter("src/Filebin.txt"); 
			scan.close();
			File[] Filelist = file.listFiles();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			
			System.out.println("该目录下对象个数：" + Filelist.length + "记录到Filebin.txt里");
			
			for (int i = 0; i < Filelist.length; i++) {
				 if (!Filelist[i].isFile()) {
					 cal.setTimeInMillis(Filelist[i].lastModified());
					 String s = df.format(cal.getTime());	
			         inFile.write("文件夹：" + Filelist[i] + "\t修改日期：" + s + "\t文件大小：" + Filelist[i].length()*1.0/1024 + "KB" + "\n");
				 } 
			}
			
			for (int i = 0; i < Filelist.length; i++) {
				 if (Filelist[i].isFile()) {
					 cal.setTimeInMillis(Filelist[i].lastModified());
					 String s = df.format(cal.getTime());
					 inFile.write("文件：" + Filelist[i] + "\t修改日期：" + s + "\t文件大小：" + Filelist[i].length()*1.0/1024 + "KB" + "\n");
				 } 
			}    
      inFile.close();`
#### 实验结果

result:

![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/FileScanner.png)   
  
# 实验二扩展以及自学部分 文件浏览器
#### 实验要求

利用JAVA的GUI（Swing等）创建一个简易的文件浏览器。  

#### 部分代码展示
		`private JTree tree; //创建默认的树
    private TreePath treePath; //路径
    int t=0;
    public FileBrowser() {
    	
        this.setLayout(new BorderLayout());
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("我的计算机");//设置跟节点
        tree = new JTree(root);
        File[] roots = File.listRoots();
        for (int i = 0; i < roots.length; i++) {
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(roots[i].getPath());
            root.add(node);//增加到根节点
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
    }`
#### 实验结果

result:

![image](https://raw.githubusercontent.com/wusanmao23333/LearningJAVA/master/img/FileBrowser.png)
