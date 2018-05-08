package repository.Implement;

import repository.ChefRepository;
import domain.Chef;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rodrique on 5/8/2018.
 */
public class ChefRepImpl implements ChefRepository {
    private static ChefRepImpl respository = null;

    private Map<Long, Chef> chefTable;

    private ChefRepImpl() {
        chefTable = new HashMap<Long, Chef>();
    }

    public static ChefRepImpl getInstance() {
        if (respository == null)
            respository = new ChefRepImpl();
        return respository;
    }

    public Chef create(Chef chef) {
        chefTable.put(chef.getId(), chef);
        Chef savedChef = chefTable.get(chef.getId());
        return savedChef;
    }

    public Chef read(String id) {
        Chef chef = chefTable.get(id);
        return chef;
    }

    public Chef update(Chef chef) {
        chefTable.put(chef.getId(), chef);
        Chef savedChef = chefTable.get(chef.getId());
        return savedChef;
    }

    public void delete(String id) {
        chefTable.remove(id);

    }
}