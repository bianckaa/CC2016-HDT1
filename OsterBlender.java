public class OsterBlender implements IBlender{
    private int velocidad = 0;
    private boolean lleno = false;

    @Override
    public void SpeedUp(){
        velocidad++;
    }

    @Override
    public boolean IsFull(){
        return lleno;
    }

    @Override
    public void Fill(){
        lleno = true;
    }

    @Override
    public void Empty(){
        lleno=false;
    }

    @Override
    public void SpeedDown (){
        velocidad--;
    }

    @Override
    public int GetSpeed(){
        return velocidad;
    }
    
}
