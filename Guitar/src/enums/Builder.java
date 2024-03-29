package enums;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINS, OLSON, RYAN, PRS, ANY;
    public String toSting(){
        switch (this) {
            case FENDER:
                return "Fender";
            case MARTIN:
                return "Martin";
            case GIBSON:
                return  "Gibson";
            case COLLINS:
                return "Collins";
            case OLSON:
                return "Olson";
            case RYAN:
                return "Ryan";
            case PRS:
                return "PRS";
            case ANY:
                return "Any";
        }
        return null;
    }
}
