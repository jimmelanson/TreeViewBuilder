
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class treeviewmanager {
    public static RemoteObject myClass;
	public treeviewmanager() {
	}
    public static PCBA staticBA = new PCBA(null, treeviewmanager.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _familyerrornode = RemoteObject.createImmutable(0);
public static RemoteObject _listglobal = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mappickup = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"FamilyErrorNode",_ref.getField(false, "_familyerrornode"),"fx",_ref.getField(false, "_fx"),"listGlobal",_ref.getField(false, "_listglobal"),"mapPickup",_ref.getField(false, "_mappickup")};
}
}