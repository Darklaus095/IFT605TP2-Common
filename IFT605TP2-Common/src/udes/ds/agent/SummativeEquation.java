/**
 * udes.ds.rmi SummativeEquation.java 3 sept. 08
 */
package udes.ds.agent;

/**
 * Stores an equation of the type f(x) + g(x)
 *
 * @author Luc Bergevin
 * @version 1.0
 */
public class SummativeEquation extends AbstractEquation {

    private static final long serialVersionUID = 1L;
    private AbstractEquation _first;
    private AbstractEquation _second;

    public SummativeEquation(AbstractEquation first, AbstractEquation second) {
        super();
        _first = first;
        _second = second;
    }

    public AbstractEquation getFirst() {
        return _first;
    }

    public AbstractEquation getSecond() {
        return _second;
    }

    /**
     * @param x
     * @return
     * @see udes.ds.rmi.hw.Equation#getFunctionValue(double)
     */
    @Override
    public double getFunctionValue(double x) {
        return (_first.getFunctionValue(x) + _second.getFunctionValue(x));
    }

    /**
     * @return @see udes.ds.rmi.hw.AbstractEquation#getUserReadableString()
     */
    @Override
    public String getUserReadableString() {
        return new String(_first.getUserReadableString() + " + " + _second.getUserReadableString());
    }

}
