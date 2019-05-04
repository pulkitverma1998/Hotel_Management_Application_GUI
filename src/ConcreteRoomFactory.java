public class ConcreteRoomFactory extends AbstractRoomFactory {

    @Override
    public AbstractRoom createAbstractRoom() {
        return new AquaWorldRoom();
    }
}
