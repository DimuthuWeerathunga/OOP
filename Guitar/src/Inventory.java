import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.*;

public class Inventory {
    private List guitars;
    public Inventory() {
        guitars = new LinkedList();
    }
    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model,
                          Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder,
                model, type, backWood, topWood);
        guitars.add(guitar);

    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }
    public List<Guitar> search(Guitar searchGuitar) {
        List<Guitar> guitarList = new ArrayList<>();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
// Ignore serial number since that’s unique
// Ignore price since that’s unique
            if (searchGuitar.getBuilder() != guitar.getBuilder())
                continue;
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitar.getModel())))
                continue;
            if (searchGuitar.getType() != guitar.getType())
                continue;
            if (searchGuitar.getBackWood() != guitar.getBackWood())
                continue;
            if (searchGuitar.getTopWood() != guitar.getTopWood())
                continue;
            guitarList.add(guitar);
        }
        return guitarList;
    }
}
