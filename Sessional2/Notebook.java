public class Notebook {

    NotebookType type;

    public Notebook(int type){
        setType(type);
    }

    void setType(int type){
        if (type == 1){
            this.type = NotebookType.SPIRAL;
        }else if(type == 2){
            this.type = NotebookType.LAB;
        }else{
            System.out.println("Invalid Type");
        }
    }

    NotebookType getType(){
        return this.type;
    }
}
