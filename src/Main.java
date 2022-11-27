public class Main {


    public static void main(String [] args){
        Pilha pi = new Pilha(5);

        Aluno al = new Aluno("Teste", 2, "CC" );
        Aluno al1 = new Aluno("Ronaldo", 3, "CC" );
        Aluno al2 = new Aluno("Maria", 4, "CC" );
        Aluno al3 = new Aluno("Luis", 5, "CC" );

        pi.push(al);
        pi.push(al1);
        pi.push(al2);
        pi.push(al3);
        pi.push(al3);
        pi.push(al3);
        System.out.println(pi.pop(5));
        System.out.println("Posiçoes vazias "+ pi.vazio());
        pi.pushFront(al3);
        pi.pushLast(al);

        for (int i = 0; i < pi.max; i++){
            System.out.println(pi.show().nome);
        }

    }
}
