public class OsterBlender implements IBlender{
    private int velocidad = 0;

    @Override
    public void SpeedUp(){
        velocidad++;
    }

    @Override
    public boolean IsFull(){
        
    }

    @Override
    public void Fill(){

    }

    @Override
    public void Empty(){

    }

    @Override
    public void SpeedDown (){
        velocidad--;
    }

    @Override
    public int GetSpeed(){
        
    }
}
