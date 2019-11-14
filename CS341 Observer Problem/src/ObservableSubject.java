import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ObservableSubject extends PropertyChangeSupport {
	private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

	public ObservableSubject(Object observerWindow) {
		super(observerWindow);
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.pcs.addPropertyChangeListener(listener);
	}

	public void setValue(String dataOld, String dataNew) {
		// The parameter values of firePropertyChange method
		// constitute the PropertyChangeEvent object
		pcs.firePropertyChange("message", dataOld, dataNew);
	}

}
