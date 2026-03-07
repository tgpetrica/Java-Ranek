class InternalComponent {
    protected String name;

    public InternalComponent (String name) {
        this.name = name;
    }

    public String toString() {
        return "Internal component: " + name;
    }
}

class ExternalComponent {
    protected String name;

    public ExternalComponent (String name) {
        this.name = name;
    }

    public String toString() {
        return "External component: " + name;
    }
}

class CPU extends InternalComponent {
    private int cores;

    public CPU (String name, int cores) {
        super(name);
        this.cores = cores;
    }

    public String toString() {
        return "CPU: " + name + ", cores: " + cores;
    }
}

class RAM extends InternalComponent {
    private int capacity;

    public RAM(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }

    public String toString() {
        return "RAM: " + name + ", capacity: " + capacity + "GB";
    }
}

class Mouse extends ExternalComponent {
    public Mouse (String name) {
        super(name);
    }

    public String toString() {
        return "Mouse: " + name;
    }
}

class Computer {
    private CPU cpu;
    private RAM ram;

    private ExternalComponent[] extComp;
    private int count = 0;

    public Computer(CPU cpu, RAM ram) {
        this.cpu = cpu;
        this.ram = ram;

        extComp = new ExternalComponent[3];
    }

    public void addExtComp(ExternalComponent component) {
        if (count < extComp.length) {
            extComp[count] = component;
            count++;
        }
    }

    public void show() {
        System.out.println("Internal Components:");
        System.out.println(cpu);
        System.out.println(ram);
        System.out.println("External Components:");
        for (int i = 0; i < count; i++) {
            System.out.println(extComp[i]);
        }
    }
}

public class ComputerDemo {
    public static void main(String[] args) {
        CPU cpu = new CPU ("Intel i7", 8);
        RAM ram = new RAM ("Kingston", 16);

        Computer pc = new Computer(cpu, ram);

        Mouse mouse = new Mouse("Logitech");

        pc.addExtComp(mouse);

        pc.show();
    }
}
