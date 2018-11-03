package day02.demo03;

public class CollectionArrayList<MVP> {
    private MVP name;

    public CollectionArrayList(MVP name){
        this.name= name;
    }
    public MVP get(){
        return name;
    }

    public MVP getName() {
        return name;
    }

    public void setName(MVP name) {
        this.name = name;
    }

    public CollectionArrayList() {

    }
}
