import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        this.celestialObjects = new ArrayList<CelestialObject>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject celestialObject) {
        celestialObjects.add(celestialObject);
    }

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> massRepartition = new LinkedHashMap<String, Integer>();
        massRepartition.put("Star", 0);
        massRepartition.put("Planet", 0);
        massRepartition.put("Other", 0);

        for (CelestialObject celestialObject : celestialObjects) {
            String type = "Other";
            if (celestialObject instanceof Star) {
                type = "Star";
            } else if (celestialObject instanceof Planet) {
                type = "Planet";
            }

            massRepartition.put(type, massRepartition.get(type) + celestialObject.getMass());
        }

        return massRepartition;
    }
}
