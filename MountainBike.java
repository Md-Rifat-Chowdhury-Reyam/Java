
class MountainBike extends Bycycle{


    public int seatHieght;

    public MountainBike(int g, int s, int seatHieght)
    {
        super(g,s);
        this.seatHieght = seatHieght;

    }

    @Override
    public String toString()
    {
        return (super.toString()+" \n seat height "+seatHieght);
    }
    
}
