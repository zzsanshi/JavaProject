package LearningJavaDay0803._12File类;
/*
  File类:代表当前操作系统的文件对象
  File类:是用来操作操作系统的文件对象的,删除文件,获取文件信息,创建文件(文件夹)
         广义来说操作系统认为文件包含(文件和文件夹)
  API:1.构造器:
         ---public File(String pathname):根据路径获取文件对象
         ---public File(String parent ,String child):根据父路径和文件名获取路径
         ---public File(File parent,String child):

       2.File创建文件对象的格式:
         a.File f=new File("绝对路径/相对路径")
            绝对路径:带盘符
                 分割符: 正斜杠:/
                        反斜杆:\\
            相对路径:不带盘符
         b.File f=new File("文件对象/文件夹对象")
            广义来说:文件包含文件和文件夹

       3.获取功能API:
         --public String getAbsolutePath():返回File的绝对路径名字字符串
         --public String getPath(): 获取创建文件对象的时候用的路径--定义的时候的路径
         --public String getName(): 返回由此File表示的文件或目录的名称
         --public long  length():返回由此File表示的文件的长度

       4.判断功能API:
         --public boolean exists():此File表示的文件或目录是否实际存在
         --public boolean isDirectory():此File表示的是否为目录
         --public boolean  isFile() :此File表示的是否为文件

       5.File类的创建和删除方法:
         --public boolean createNewFile() :当且仅当具有该名称的文件尚不存在时,创建一个新的空文件
         --public boolean delete():删除由此File表示的文件或目录(只能删除空目录)
         --public boolean mkdir():创建由此File表示的目录.(只能创建一级目录)
         --public boolean mkdirs():可以创建多级目录(建议使用)

       6.File类的遍历--针对目录的遍历
         --public String[] list():获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回
         --public File[] listFiles()(常用):获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回(重点)


 */
public class FileDemo {
}
