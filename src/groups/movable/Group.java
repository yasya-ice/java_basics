package groups.movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> movables;

    public Group() {
        movables = new ArrayList<Movable>();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable movable : movables) {
            result.append(movable.toString()).append("\n");
        }
        return result.toString();
    }

    public void addToGroup(Movable movable) {
        this.movables.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }
}
