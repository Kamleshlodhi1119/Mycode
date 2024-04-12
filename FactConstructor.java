
class Fact {// factorial using constructor parametrize default

    int num, f;

    Fact() {
        f = 1;
    }

    Fact(int n) {
        this();
        num = n;
    }

    public int getFact() {
        while (num != 0) {
            f = f * num--;
        }
        System.out.println(f);
        return f;
    }
}

class FactConstructor {
    public static void main(String[] args) {
        int m = 4;
        Fact f = new Fact();
        f = new Fact(m);
        f.getFact();
    }
}