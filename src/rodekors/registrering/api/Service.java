package rodekors.registrering.api;

import java.io.File;
import java.util.Collection;

import rodekors.registrering.service.Ungdom;

public interface Service {
	public void updateLog(String log);
	public File createNewLogDay();
	public Collection readLog();
	public void updateKid(Ungdom u);
	public void newkid(Ungdom u);
	public Collection getAllKids();
}
