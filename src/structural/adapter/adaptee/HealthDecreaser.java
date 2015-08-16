package structural.adapter.adaptee;

/**
 * HealthDecreaser Class
 *
 * @author a.slepakurov
 * @version 8/11/2015
 */
public class HealthDecreaser {
    public int decreaseHealth(int current, int decreaserBy) {
        return (current < decreaserBy) ? 0 : current - decreaserBy;
    }
}
