package Stack;

public class Dyanamicstack  extends CustomStack{
    public Dyanamicstack(){
        super();
    }
    public Dyanamicstack(int Size){
        super(Size);
    }

    @Override
    public boolean push(int value) throws Exception {
        if(ptr==data.length-1){
            int[] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(value);
    }
}
