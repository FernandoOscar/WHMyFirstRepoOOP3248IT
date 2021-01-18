/** Copyright ESPE-DECC
*/

package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Edison Lascano Hypertech ESPE-DCCO
 */
public class Egg {
    private int id;

    @Override
    public String toString() {
        return "Egg{" + "id=" + id + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    public Egg(int id) {
        this.id = id;
    }
    
    
    
}
