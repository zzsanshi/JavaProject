package LearningCode2._多态Polymorphic;

//接口也是父类--继父
public class Demo3 {
    public static void main(String[] args) {
        Computer c = new Computer();
        USB xiaomi = new Mouse("小米");
        USB cherry = new KeyBoard("樱桃");
        c.install(cherry);
        c.install(xiaomi);
    }
}

class Computer {
    //安装USB的入口
    //多态用法
    public void install(USB usb) {
        usb.connect();
        if (usb instanceof KeyBoard) {
            ((KeyBoard) usb).keyDown();
        } else if (usb instanceof Mouse) {
            ((Mouse) usb).dbclick();
        }
        usb.unconnect();
    }
}

class KeyBoard implements USB {
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "插入");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "拔出");

    }

    public void keyDown() {
        System.out.println(name + "点击!");
    }
}

class Mouse implements USB {
    private String name;

    public void dbclick() {
        System.out.println(name + "双击!");
    }

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功接入!");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功拔出!");
    }
}

//定义USB规范
interface USB {
    public void connect();//接入

    public void unconnect();//拔出
}