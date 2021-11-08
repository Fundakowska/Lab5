package simulation;

public class WorldMap extends AbstractWorldMap{

    private Animal animal;

    public WorldMap(int width,int height){
        super(width, height);
        animal = new Animal(new Vector2D(0,0));
    }

    @Override
    public void run() {
        animal.move(MapDirection.values()[random.nextInt(MapDirection.values().length)],width,height);
    }
}
