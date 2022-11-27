public class Pilha {
    int max;
    public Aluno[] list_Aluno;
    public Aluno[] new_list_Aluno;
    int top;
    int cont = 0;
    public Pilha(int max){
        this.max = max;
        list_Aluno = new Aluno[this.max];
        top = -1;
    }
    public void push(Aluno ag1){
        if (isFull()){
            new_list_Aluno = new Aluno[this.max + 5];

            for (int i = 0; i < list_Aluno.length; ++i){
                new_list_Aluno[i] = list_Aluno[i];
            }
            list_Aluno = new Aluno[new_list_Aluno.length];
            for (int j = 0; j < new_list_Aluno.length; ++j){
                list_Aluno[j] = new_list_Aluno[j];
            }

        }
        top++;
        list_Aluno[top] = ag1;

    }

    public void pushFront(Aluno ag1){

        list_Aluno[0] = ag1;

    }

    public void pushLast(Aluno ag1){

        list_Aluno[top - 1] = ag1;

    }

    public String pop(int matricula){
        if (isEmpty()){
            throw new RuntimeException("Empty Stack!");
        }

        for (int i = 0; i < list_Aluno.length; i++){
            if (list_Aluno[i].matricula == matricula){
                Aluno e = new Aluno("", 0,"");
                list_Aluno[i] = e;
                return "Aluno removido";

            }
        }
        return "Matricula nao encontrada";

    }

    public Aluno show(){
        if (cont > top){
            return null;

        }else{
            Aluno newShow;
            newShow = list_Aluno[cont];
            cont++;
            return newShow;
        }

    }

    public boolean isEmpty(){
        return (top == -1);

    }

    public boolean isFull(){
        return (top == this.max - 1);
    }

    public int vazio(){
        int conts = 0;
        for(int i = 0; i < list_Aluno.length; i++){
            if(list_Aluno[i] == null){
                conts++;
            }
        }
        return conts;
    }

}