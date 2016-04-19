
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("b4j.example.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4j.example.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mainform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _treeview1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper");
public static RemoteObject _dialogue8 = RemoteObject.declareNull("b4j.example.dialogs8");
public static RemoteObject _boolhandlingmouseclick = RemoteObject.createImmutable(false);
public static RemoteObject _lasttreeitemselected = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
public static RemoteObject _tvm = RemoteObject.declareNull("b4j.example.treeviewmanager");
public static RemoteObject _mapcontextmenus = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _mapmainmenus = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _taresults = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
public static RemoteObject _btntoxml = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btntojson = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _menubar1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
public static RemoteObject _txtfield1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfield2 = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtfield3 = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _mapdatastore = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _book_closed = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
public static RemoteObject _book_open = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
  public Object[] GetGlobals() {
		return new Object[] {"book_closed",main._book_closed,"book_open",main._book_open,"boolHandlingMouseClick",main._boolhandlingmouseclick,"btnToJson",main._btntojson,"btnToXML",main._btntoxml,"dialogue8",main._dialogue8,"fx",main._fx,"lastTreeItemSelected",main._lasttreeitemselected,"MainForm",main._mainform,"mapContextMenus",main._mapcontextmenus,"mapDataStore",main._mapdatastore,"mapMainMenus",main._mapmainmenus,"MenuBar1",main._menubar1,"taResults",main._taresults,"TreeView1",main._treeview1,"tvm",main._tvm,"txtField1",main._txtfield1,"txtField2",main._txtfield2,"txtField3",main._txtfield3};
}
}