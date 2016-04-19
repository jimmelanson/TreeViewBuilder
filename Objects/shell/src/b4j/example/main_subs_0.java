package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,28);
if (RapidSub.canDelegate("appstart")) return main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
RemoteObject _debug = RemoteObject.createImmutable(false);
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 28;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(268435456);
main._mainform = _form1;
 BA.debugLineNum = 30;BA.debugLine="MainForm.SetFormStyle(\"UNIFIED\")";
Debug.ShouldStop(536870912);
main._mainform.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UNIFIED")));
 BA.debugLineNum = 31;BA.debugLine="MainForm.RootPane.LoadLayout(\"main_form\") 'Load t";
Debug.ShouldStop(1073741824);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("main_form")));
 BA.debugLineNum = 32;BA.debugLine="MainForm.Show";
Debug.ShouldStop(-2147483648);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 33;BA.debugLine="tvm.Initialize(TreeView1)";
Debug.ShouldStop(1);
main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_initialize",main.ba,(Object)(main._treeview1));
 BA.debugLineNum = 34;BA.debugLine="dialogue8.Initialize";
Debug.ShouldStop(2);
main._dialogue8.runVoidMethod ("_initialize",main.ba);
 BA.debugLineNum = 35;BA.debugLine="mapDataStore.Initialize";
Debug.ShouldStop(4);
main._mapdatastore.runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="book_closed.Initialize(File.DirAssets,\"book.png\")";
Debug.ShouldStop(16);
main._book_closed.runVoidMethod ("Initialize",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("book.png")));
 BA.debugLineNum = 38;BA.debugLine="book_open.Initialize(File.DirAssets,\"book_open.pn";
Debug.ShouldStop(32);
main._book_open.runVoidMethod ("Initialize",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("book_open.png")));
 BA.debugLineNum = 43;BA.debugLine="BuildTree_Option4 ' Four Levels";
Debug.ShouldStop(1024);
_buildtree_option4();
 BA.debugLineNum = 47;BA.debugLine="mapContextMenus.Initialize";
Debug.ShouldStop(16384);
main._mapcontextmenus.runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="CollectContextMenuItems(mapContextMenus, TreeView";
Debug.ShouldStop(32768);
_collectcontextmenuitems(main._mapcontextmenus,main._treeview1.runMethod(false,"getContextMenu").runMethod(false,"getMenuItems"));
 BA.debugLineNum = 49;BA.debugLine="mapMainMenus.Initialize";
Debug.ShouldStop(65536);
main._mapmainmenus.runVoidMethod ("Initialize");
 BA.debugLineNum = 50;BA.debugLine="CollectMenuItems(mapMainMenus, MenuBar1.Menus)";
Debug.ShouldStop(131072);
_collectmenuitems(main._mapmainmenus,main._menubar1.runMethod(false,"getMenus"));
 BA.debugLineNum = 53;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(1048576);
_r = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 54;BA.debugLine="Dim debug As Boolean = r.GetStaticField(\"anywh";
Debug.ShouldStop(2097152);
_debug = BA.ObjectToBoolean(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("debugMode"))));Debug.locals.put("debug", _debug);Debug.locals.put("debug", _debug);
 BA.debugLineNum = 55;BA.debugLine="Log(debug)";
Debug.ShouldStop(4194304);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_debug)));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntojson_action() throws Exception{
try {
		Debug.PushSubsStack("btnToJson_Action (main) ","main",0,main.ba,main.mostCurrent,721);
if (RapidSub.canDelegate("btntojson_action")) return main.remoteMe.runUserSub(false, "main","btntojson_action");
RemoteObject _strfromjson = RemoteObject.createImmutable("");
 BA.debugLineNum = 721;BA.debugLine="Sub btnToJson_Action";
Debug.ShouldStop(65536);
 BA.debugLineNum = 722;BA.debugLine="Dim strFromJSON As String = tvm.ToJSON(TreeView1)";
Debug.ShouldStop(131072);
_strfromjson = main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_tojson",(Object)(main._treeview1));Debug.locals.put("strFromJSON", _strfromjson);Debug.locals.put("strFromJSON", _strfromjson);
 BA.debugLineNum = 723;BA.debugLine="File.WriteString(File.DirApp, \"treeview_json.txt\"";
Debug.ShouldStop(262144);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("treeview_json.txt")),(Object)(_strfromjson));
 BA.debugLineNum = 724;BA.debugLine="If strFromJSON <> \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",_strfromjson,BA.ObjectToString(""))) { 
 BA.debugLineNum = 725;BA.debugLine="taResults.Text = strFromJSON";
Debug.ShouldStop(1048576);
main._taresults.runMethod(true,"setText",_strfromjson);
 }else {
 BA.debugLineNum = 727;BA.debugLine="taResults.Text = \"JSON string was empty\"";
Debug.ShouldStop(4194304);
main._taresults.runMethod(true,"setText",BA.ObjectToString("JSON string was empty"));
 };
 BA.debugLineNum = 729;BA.debugLine="fx.ShowExternalDocument(File.GetUri(File.DirAp";
Debug.ShouldStop(16777216);
main._fx.runVoidMethod ("ShowExternalDocument",(Object)(main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("treeview_json.txt")))));
 BA.debugLineNum = 730;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntoxml_action() throws Exception{
try {
		Debug.PushSubsStack("btnToXML_Action (main) ","main",0,main.ba,main.mostCurrent,710);
if (RapidSub.canDelegate("btntoxml_action")) return main.remoteMe.runUserSub(false, "main","btntoxml_action");
RemoteObject _strfromxml = RemoteObject.createImmutable("");
 BA.debugLineNum = 710;BA.debugLine="Sub btnToXML_Action";
Debug.ShouldStop(32);
 BA.debugLineNum = 711;BA.debugLine="Dim strFromXML As String = tvm.ToXML(TreeView1)";
Debug.ShouldStop(64);
_strfromxml = main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_toxml",(Object)(main._treeview1));Debug.locals.put("strFromXML", _strfromxml);Debug.locals.put("strFromXML", _strfromxml);
 BA.debugLineNum = 712;BA.debugLine="File.WriteString(File.DirApp, \"treeview_xml.xml\",";
Debug.ShouldStop(128);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("treeview_xml.xml")),(Object)(_strfromxml));
 BA.debugLineNum = 713;BA.debugLine="If strFromXML <> \"\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",_strfromxml,BA.ObjectToString(""))) { 
 BA.debugLineNum = 714;BA.debugLine="taResults.Text = strFromXML";
Debug.ShouldStop(512);
main._taresults.runMethod(true,"setText",_strfromxml);
 }else {
 BA.debugLineNum = 716;BA.debugLine="taResults.Text = \"XML string was empty\"";
Debug.ShouldStop(2048);
main._taresults.runMethod(true,"setText",BA.ObjectToString("XML string was empty"));
 };
 BA.debugLineNum = 718;BA.debugLine="fx.ShowExternalDocument(File.GetUri(File.DirAp";
Debug.ShouldStop(8192);
main._fx.runVoidMethod ("ShowExternalDocument",(Object)(main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("treeview_xml.xml")))));
 BA.debugLineNum = 719;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtree_option2() throws Exception{
try {
		Debug.PushSubsStack("BuildTree_Option2 (main) ","main",0,main.ba,main.mostCurrent,63);
if (RapidSub.canDelegate("buildtree_option2")) return main.remoteMe.runUserSub(false, "main","buildtree_option2");
int _i = 0;
RemoteObject _ti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
int _i2 = 0;
RemoteObject _cti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
 BA.debugLineNum = 63;BA.debugLine="Sub BuildTree_Option2";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="For i = 1 To 3";
Debug.ShouldStop(-2147483648);
{
final int step1 = 1;
final int limit1 = 3;
for (_i = 1 ; (step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1); _i = ((int)(0 + _i + step1)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 66;BA.debugLine="Dim ti As TreeItem";
Debug.ShouldStop(2);
_ti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("ti", _ti);
 BA.debugLineNum = 68;BA.debugLine="ti.Initialize(\"ti\", \"Item #\" & i)";
Debug.ShouldStop(8);
_ti.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("ti")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Item #"),RemoteObject.createImmutable(_i))));
 BA.debugLineNum = 71;BA.debugLine="For i2 = 1 To 10";
Debug.ShouldStop(64);
{
final int step4 = 1;
final int limit4 = 10;
for (_i2 = 1 ; (step4 > 0 && _i2 <= limit4) || (step4 < 0 && _i2 >= limit4); _i2 = ((int)(0 + _i2 + step4)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 73;BA.debugLine="Dim cti As TreeItem";
Debug.ShouldStop(256);
_cti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("cti", _cti);
 BA.debugLineNum = 75;BA.debugLine="cti.Initialize(\"ti\", \"My father is Item #\" &";
Debug.ShouldStop(1024);
_cti.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("ti")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("My father is Item #"),RemoteObject.createImmutable(_i))));
 BA.debugLineNum = 77;BA.debugLine="ti.Children.Add(cti) 'add the child";
Debug.ShouldStop(4096);
_ti.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_cti.getObject())));
 }
}Debug.locals.put("i2", _i2);
;
 BA.debugLineNum = 80;BA.debugLine="TreeView1.Root.Children.Add(ti) 'add the fath";
Debug.ShouldStop(32768);
main._treeview1.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ti.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtree_option3() throws Exception{
try {
		Debug.PushSubsStack("BuildTree_Option3 (main) ","main",0,main.ba,main.mostCurrent,85);
if (RapidSub.canDelegate("buildtree_option3")) return main.remoteMe.runUserSub(false, "main","buildtree_option3");
int _i = 0;
RemoteObject _ti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
int _i2 = 0;
RemoteObject _cti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
int _i3 = 0;
RemoteObject _gcti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
 BA.debugLineNum = 85;BA.debugLine="Sub BuildTree_Option3";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="For i = 1 To 10";
Debug.ShouldStop(2097152);
{
final int step1 = 1;
final int limit1 = 10;
for (_i = 1 ; (step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1); _i = ((int)(0 + _i + step1)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 88;BA.debugLine="Dim ti As TreeItem";
Debug.ShouldStop(8388608);
_ti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("ti", _ti);
 BA.debugLineNum = 90;BA.debugLine="ti.Initialize(\"ti\", \"Item #\" & i)";
Debug.ShouldStop(33554432);
_ti.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("ti")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Item #"),RemoteObject.createImmutable(_i))));
 BA.debugLineNum = 91;BA.debugLine="For i2 = 1 To 10";
Debug.ShouldStop(67108864);
{
final int step4 = 1;
final int limit4 = 10;
for (_i2 = 1 ; (step4 > 0 && _i2 <= limit4) || (step4 < 0 && _i2 >= limit4); _i2 = ((int)(0 + _i2 + step4)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 93;BA.debugLine="Dim cti As TreeItem";
Debug.ShouldStop(268435456);
_cti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("cti", _cti);
 BA.debugLineNum = 95;BA.debugLine="cti.Initialize(\"ti\", \"My father is Item #\" &";
Debug.ShouldStop(1073741824);
_cti.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("ti")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("My father is Item #"),RemoteObject.createImmutable(_i))));
 BA.debugLineNum = 96;BA.debugLine="For i3 = 1 To 5";
Debug.ShouldStop(-2147483648);
{
final int step7 = 1;
final int limit7 = 5;
for (_i3 = 1 ; (step7 > 0 && _i3 <= limit7) || (step7 < 0 && _i3 >= limit7); _i3 = ((int)(0 + _i3 + step7)) ) {
Debug.locals.put("i3", _i3);
 BA.debugLineNum = 98;BA.debugLine="Dim gcti As TreeItem";
Debug.ShouldStop(2);
_gcti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("gcti", _gcti);
 BA.debugLineNum = 100;BA.debugLine="gcti.Initialize(\"ti\", \"My grand-father is I";
Debug.ShouldStop(8);
_gcti.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("ti")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("My grand-father is Item #"),RemoteObject.createImmutable(_i))));
 BA.debugLineNum = 102;BA.debugLine="cti.Children.Add(gcti) 'add the child";
Debug.ShouldStop(32);
_cti.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_gcti.getObject())));
 }
}Debug.locals.put("i3", _i3);
;
 BA.debugLineNum = 105;BA.debugLine="ti.Children.Add(cti) 'add the child";
Debug.ShouldStop(256);
_ti.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_cti.getObject())));
 }
}Debug.locals.put("i2", _i2);
;
 BA.debugLineNum = 108;BA.debugLine="TreeView1.Root.Children.Add(ti) 'add the fath";
Debug.ShouldStop(2048);
main._treeview1.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ti.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtree_option4() throws Exception{
try {
		Debug.PushSubsStack("BuildTree_Option4 (main) ","main",0,main.ba,main.mostCurrent,113);
if (RapidSub.canDelegate("buildtree_option4")) return main.remoteMe.runUserSub(false, "main","buildtree_option4");
int _i = 0;
RemoteObject _ti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
int _i2 = 0;
RemoteObject _cti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
int _i3 = 0;
RemoteObject _gcti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
int _i4 = 0;
RemoteObject _ggcti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
 BA.debugLineNum = 113;BA.debugLine="Sub BuildTree_Option4";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="For i = 1 To 10";
Debug.ShouldStop(131072);
{
final int step1 = 1;
final int limit1 = 10;
for (_i = 1 ; (step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1); _i = ((int)(0 + _i + step1)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 116;BA.debugLine="Dim ti As TreeItem";
Debug.ShouldStop(524288);
_ti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("ti", _ti);
 BA.debugLineNum = 118;BA.debugLine="ti.Initialize(\"ti\", \"Item #\" & i)";
Debug.ShouldStop(2097152);
_ti.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("ti")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Item #"),RemoteObject.createImmutable(_i))));
 BA.debugLineNum = 119;BA.debugLine="For i2 = 1 To 5";
Debug.ShouldStop(4194304);
{
final int step4 = 1;
final int limit4 = 5;
for (_i2 = 1 ; (step4 > 0 && _i2 <= limit4) || (step4 < 0 && _i2 >= limit4); _i2 = ((int)(0 + _i2 + step4)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 121;BA.debugLine="Dim cti As TreeItem";
Debug.ShouldStop(16777216);
_cti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("cti", _cti);
 BA.debugLineNum = 123;BA.debugLine="cti.Initialize(\"ti\", \"Child #\" & i2)";
Debug.ShouldStop(67108864);
_cti.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("ti")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Child #"),RemoteObject.createImmutable(_i2))));
 BA.debugLineNum = 124;BA.debugLine="For i3 = 1 To 4";
Debug.ShouldStop(134217728);
{
final int step7 = 1;
final int limit7 = 4;
for (_i3 = 1 ; (step7 > 0 && _i3 <= limit7) || (step7 < 0 && _i3 >= limit7); _i3 = ((int)(0 + _i3 + step7)) ) {
Debug.locals.put("i3", _i3);
 BA.debugLineNum = 126;BA.debugLine="Dim gcti As TreeItem";
Debug.ShouldStop(536870912);
_gcti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("gcti", _gcti);
 BA.debugLineNum = 128;BA.debugLine="gcti.Initialize(\"ti\", \"Grandhild Item #\" &";
Debug.ShouldStop(-2147483648);
_gcti.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("ti")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Grandhild Item #"),RemoteObject.createImmutable(_i3))));
 BA.debugLineNum = 129;BA.debugLine="For i4 = 1 To 3";
Debug.ShouldStop(1);
{
final int step10 = 1;
final int limit10 = 3;
for (_i4 = 1 ; (step10 > 0 && _i4 <= limit10) || (step10 < 0 && _i4 >= limit10); _i4 = ((int)(0 + _i4 + step10)) ) {
Debug.locals.put("i4", _i4);
 BA.debugLineNum = 131;BA.debugLine="Dim ggcti As TreeItem";
Debug.ShouldStop(4);
_ggcti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("ggcti", _ggcti);
 BA.debugLineNum = 133;BA.debugLine="ggcti.Initialize(\"ti\", \"Great Grandchild i";
Debug.ShouldStop(16);
_ggcti.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("ti")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Great Grandchild is Item #"),RemoteObject.createImmutable(_i4))));
 BA.debugLineNum = 135;BA.debugLine="gcti.Children.Add(ggcti) 'add the child";
Debug.ShouldStop(64);
_gcti.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ggcti.getObject())));
 }
}Debug.locals.put("i4", _i4);
;
 BA.debugLineNum = 138;BA.debugLine="cti.Children.Add(gcti) 'add the child";
Debug.ShouldStop(512);
_cti.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_gcti.getObject())));
 }
}Debug.locals.put("i3", _i3);
;
 BA.debugLineNum = 141;BA.debugLine="ti.Children.Add(cti) 'add the child";
Debug.ShouldStop(4096);
_ti.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_cti.getObject())));
 }
}Debug.locals.put("i2", _i2);
;
 BA.debugLineNum = 144;BA.debugLine="TreeView1.Root.Children.Add(ti) 'add the fath";
Debug.ShouldStop(32768);
main._treeview1.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ti.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtree_option5() throws Exception{
try {
		Debug.PushSubsStack("BuildTree_Option5 (main) ","main",0,main.ba,main.mostCurrent,149);
if (RapidSub.canDelegate("buildtree_option5")) return main.remoteMe.runUserSub(false, "main","buildtree_option5");
int _i = 0;
RemoteObject _ti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
 BA.debugLineNum = 149;BA.debugLine="Sub BuildTree_Option5";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="For i = 1 To 10";
Debug.ShouldStop(2097152);
{
final int step1 = 1;
final int limit1 = 10;
for (_i = 1 ; (step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1); _i = ((int)(0 + _i + step1)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 152;BA.debugLine="Dim ti As TreeItem";
Debug.ShouldStop(8388608);
_ti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("ti", _ti);
 BA.debugLineNum = 154;BA.debugLine="ti.Initialize(\"ti\", \"Item #\" & i)";
Debug.ShouldStop(33554432);
_ti.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("ti")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Item #"),RemoteObject.createImmutable(_i))));
 BA.debugLineNum = 156;BA.debugLine="TreeView1.Root.Children.Add(ti) 'add the fath";
Debug.ShouldStop(134217728);
main._treeview1.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_ti.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtree_option6() throws Exception{
try {
		Debug.PushSubsStack("BuildTree_Option6 (main) ","main",0,main.ba,main.mostCurrent,161);
if (RapidSub.canDelegate("buildtree_option6")) return main.remoteMe.runUserSub(false, "main","buildtree_option6");
int _i = 0;
 BA.debugLineNum = 161;BA.debugLine="Sub BuildTree_Option6";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="For i = 1 To 10";
Debug.ShouldStop(2);
{
final int step1 = 1;
final int limit1 = 10;
for (_i = 1 ; (step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1); _i = ((int)(0 + _i + step1)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 164;BA.debugLine="tvm.AddRoot(TreeView1, \"Item #\" & i)";
Debug.ShouldStop(8);
main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_addroot",(Object)(main._treeview1),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Item #"),RemoteObject.createImmutable(_i))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenuaddsibling_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuAddSibling_Action (main) ","main",0,main.ba,main.mostCurrent,411);
if (RapidSub.canDelegate("cmenuaddsibling_action")) return main.remoteMe.runUserSub(false, "main","cmenuaddsibling_action");
RemoteObject _strnewname = RemoteObject.createImmutable("");
 BA.debugLineNum = 411;BA.debugLine="Sub cmenuAddSibling_Action";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 412;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 413;BA.debugLine="taResults.Text = \"Adding same level sibling\"";
Debug.ShouldStop(268435456);
main._taresults.runMethod(true,"setText",BA.ObjectToString("Adding same level sibling"));
 BA.debugLineNum = 414;BA.debugLine="Dim strNewName As String";
Debug.ShouldStop(536870912);
_strnewname = RemoteObject.createImmutable("");Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 415;BA.debugLine="strNewName = dialogue8.TextInputDialog(\"Topic Li";
Debug.ShouldStop(1073741824);
_strnewname = main._dialogue8.runMethod(true,"_textinputdialog",(Object)(BA.ObjectToString("Topic List Management")),(Object)(BA.ObjectToString("New Topic")),(Object)(BA.ObjectToString("Enter topic name:")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 416;BA.debugLine="If strNewName <> \"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",_strnewname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 417;BA.debugLine="tvm.AddSibling(lastTreeItemSelected, strNewName";
Debug.ShouldStop(1);
main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_addsibling",(Object)(main._lasttreeitemselected),(Object)(_strnewname));
 BA.debugLineNum = 418;BA.debugLine="taResults.Text = \"Adding New Node Name: \" & str";
Debug.ShouldStop(2);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Adding New Node Name: "),_strnewname));
 };
 }else {
 BA.debugLineNum = 421;BA.debugLine="taResults.Text = \"Adding root item\"";
Debug.ShouldStop(16);
main._taresults.runMethod(true,"setText",BA.ObjectToString("Adding root item"));
 BA.debugLineNum = 422;BA.debugLine="Dim strNewName As String";
Debug.ShouldStop(32);
_strnewname = RemoteObject.createImmutable("");Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 423;BA.debugLine="strNewName = dialogue8.TextInputDialog(\"Topic Li";
Debug.ShouldStop(64);
_strnewname = main._dialogue8.runMethod(true,"_textinputdialog",(Object)(BA.ObjectToString("Topic List Management")),(Object)(BA.ObjectToString("New Root Topic")),(Object)(BA.ObjectToString("Enter root topic name:")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 424;BA.debugLine="If strNewName <> \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",_strnewname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 425;BA.debugLine="lastTreeItemSelected = tvm.AddRoot(TreeView1, s";
Debug.ShouldStop(256);
main._lasttreeitemselected = main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_addroot",(Object)(main._treeview1),(Object)(_strnewname));
 BA.debugLineNum = 426;BA.debugLine="taResults.Text = \"Adding New Node Name: \" & str";
Debug.ShouldStop(512);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Adding New Node Name: "),_strnewname));
 };
 };
 BA.debugLineNum = 429;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenuaddsublevel_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuAddSubLevel_Action (main) ","main",0,main.ba,main.mostCurrent,491);
if (RapidSub.canDelegate("cmenuaddsublevel_action")) return main.remoteMe.runUserSub(false, "main","cmenuaddsublevel_action");
RemoteObject _strnewname = RemoteObject.createImmutable("");
 BA.debugLineNum = 491;BA.debugLine="Sub cmenuAddSubLevel_Action";
Debug.ShouldStop(1024);
 BA.debugLineNum = 492;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 493;BA.debugLine="taResults.Text = \"New child is being added to th";
Debug.ShouldStop(4096);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("New child is being added to the selected node "),main._lasttreeitemselected.runMethod(true,"getText")));
 BA.debugLineNum = 494;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(8192);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selected node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable("; Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 BA.debugLineNum = 495;BA.debugLine="Dim strNewName As String";
Debug.ShouldStop(16384);
_strnewname = RemoteObject.createImmutable("");Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 496;BA.debugLine="strNewName = dialogue8.TextInputDialog(\"Topic Li";
Debug.ShouldStop(32768);
_strnewname = main._dialogue8.runMethod(true,"_textinputdialog",(Object)(BA.ObjectToString("Topic List Management")),(Object)(BA.ObjectToString("New Topic")),(Object)(BA.ObjectToString("Enter topic name:")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 497;BA.debugLine="If strNewName <> \"\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",_strnewname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 498;BA.debugLine="tvm.AddChild(lastTreeItemSelected, strNewName)";
Debug.ShouldStop(131072);
main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_addchild",(Object)(main._lasttreeitemselected),(Object)(_strnewname));
 BA.debugLineNum = 499;BA.debugLine="taResults.Text = taResults.Text & CRLF & \"Child";
Debug.ShouldStop(262144);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Child name "),_strnewname,RemoteObject.createImmutable(" has been added.")));
 };
 };
 BA.debugLineNum = 502;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenudrop_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuDrop_Action (main) ","main",0,main.ba,main.mostCurrent,486);
if (RapidSub.canDelegate("cmenudrop_action")) return main.remoteMe.runUserSub(false, "main","cmenudrop_action");
 BA.debugLineNum = 486;BA.debugLine="Sub cmenuDrop_Action";
Debug.ShouldStop(32);
 BA.debugLineNum = 487;BA.debugLine="taResults.text = \"The node \" & lastTreeItemSelect";
Debug.ShouldStop(64);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("The node "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable(" has been moved to a new location.")));
 BA.debugLineNum = 488;BA.debugLine="tvm.Drop(lastTreeItemSelected)";
Debug.ShouldStop(128);
main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_drop",(Object)(main._lasttreeitemselected));
 BA.debugLineNum = 489;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenuedit_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuEdit_Action (main) ","main",0,main.ba,main.mostCurrent,576);
if (RapidSub.canDelegate("cmenuedit_action")) return main.remoteMe.runUserSub(false, "main","cmenuedit_action");
 BA.debugLineNum = 576;BA.debugLine="Sub cmenuEdit_Action";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 577;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 582;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(32);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selected node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable("; Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 };
 BA.debugLineNum = 584;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenulistantecedents_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuListAntecedents_Action (main) ","main",0,main.ba,main.mostCurrent,552);
if (RapidSub.canDelegate("cmenulistantecedents_action")) return main.remoteMe.runUserSub(false, "main","cmenulistantecedents_action");
RemoteObject _listshownames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _listshownodes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 552;BA.debugLine="Sub cmenuListAntecedents_Action";
Debug.ShouldStop(128);
 BA.debugLineNum = 553;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 554;BA.debugLine="taResults.Text = \"Antecedent's Names:\" & CRLF";
Debug.ShouldStop(512);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Antecedent's Names:"),main.__c.getField(true,"CRLF")));
 BA.debugLineNum = 555;BA.debugLine="Dim listShowNames As List";
Debug.ShouldStop(1024);
_listshownames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listShowNames", _listshownames);
 BA.debugLineNum = 556;BA.debugLine="listShowNames.Initialize";
Debug.ShouldStop(2048);
_listshownames.runVoidMethod ("Initialize");
 BA.debugLineNum = 557;BA.debugLine="listShowNames.AddAll(tvm.ListAntecedentNames(las";
Debug.ShouldStop(4096);
_listshownames.runVoidMethod ("AddAll",(Object)(main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_listantecedentnames",(Object)(main._lasttreeitemselected))));
 BA.debugLineNum = 558;BA.debugLine="If listShowNames.Size > 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_listshownames.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 559;BA.debugLine="For i = 0 To listShowNames.Size -1";
Debug.ShouldStop(16384);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_listshownames.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 560;BA.debugLine="taResults.Text = taResults.Text & listShowName";
Debug.ShouldStop(32768);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),_listshownames.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable("; ")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 562;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(131072);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Antecedent's Nodes:"),main.__c.getField(true,"CRLF")));
 BA.debugLineNum = 563;BA.debugLine="Dim listShowNodes As List";
Debug.ShouldStop(262144);
_listshownodes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listShowNodes", _listshownodes);
 BA.debugLineNum = 564;BA.debugLine="listShowNodes.Initialize";
Debug.ShouldStop(524288);
_listshownodes.runVoidMethod ("Initialize");
 BA.debugLineNum = 565;BA.debugLine="listShowNodes.AddAll(tvm.ListAntecedentNodes(la";
Debug.ShouldStop(1048576);
_listshownodes.runVoidMethod ("AddAll",(Object)(main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_listantecedentnodes",(Object)(main._lasttreeitemselected))));
 BA.debugLineNum = 566;BA.debugLine="For i = 0 To listShowNodes.Size -1";
Debug.ShouldStop(2097152);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_listshownodes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14); _i = ((int)(0 + _i + step14)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 567;BA.debugLine="taResults.Text = taResults.Text & listShowNode";
Debug.ShouldStop(4194304);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),_listshownodes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable("; ")));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 570;BA.debugLine="taResults.Text = taResults.Text & \"The selected";
Debug.ShouldStop(33554432);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),RemoteObject.createImmutable("The selected node is root.")));
 };
 BA.debugLineNum = 572;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(134217728);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selected node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable("; Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 };
 BA.debugLineNum = 574;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenulistchildren_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuListChildren_Action (main) ","main",0,main.ba,main.mostCurrent,504);
if (RapidSub.canDelegate("cmenulistchildren_action")) return main.remoteMe.runUserSub(false, "main","cmenulistchildren_action");
RemoteObject _listshownames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _listshownodes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 504;BA.debugLine="Sub cmenuListChildren_Action";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 505;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 506;BA.debugLine="taResults.Text = \"Children's Names:\" & CRLF";
Debug.ShouldStop(33554432);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Children's Names:"),main.__c.getField(true,"CRLF")));
 BA.debugLineNum = 507;BA.debugLine="Dim listShowNames As List";
Debug.ShouldStop(67108864);
_listshownames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listShowNames", _listshownames);
 BA.debugLineNum = 508;BA.debugLine="listShowNames.Initialize";
Debug.ShouldStop(134217728);
_listshownames.runVoidMethod ("Initialize");
 BA.debugLineNum = 509;BA.debugLine="listShowNames.AddAll(tvm.ListChildrenNames(lastT";
Debug.ShouldStop(268435456);
_listshownames.runVoidMethod ("AddAll",(Object)(main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_listchildrennames",(Object)(main._lasttreeitemselected))));
 BA.debugLineNum = 510;BA.debugLine="If listShowNames.Size > 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_listshownames.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 511;BA.debugLine="For i = 0 To listShowNames.Size -1";
Debug.ShouldStop(1073741824);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_listshownames.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 512;BA.debugLine="taResults.Text = taResults.Text & listShowName";
Debug.ShouldStop(-2147483648);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),_listshownames.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable("; ")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 514;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(2);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Children's Nodes:"),main.__c.getField(true,"CRLF")));
 BA.debugLineNum = 515;BA.debugLine="Dim listShowNodes As List";
Debug.ShouldStop(4);
_listshownodes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listShowNodes", _listshownodes);
 BA.debugLineNum = 516;BA.debugLine="listShowNodes.Initialize";
Debug.ShouldStop(8);
_listshownodes.runVoidMethod ("Initialize");
 BA.debugLineNum = 517;BA.debugLine="listShowNodes.AddAll(tvm.ListChildrenNodes(last";
Debug.ShouldStop(16);
_listshownodes.runVoidMethod ("AddAll",(Object)(main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_listchildrennodes",(Object)(main._lasttreeitemselected))));
 BA.debugLineNum = 518;BA.debugLine="For i = 0 To listShowNodes.Size -1";
Debug.ShouldStop(32);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_listshownodes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14); _i = ((int)(0 + _i + step14)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 519;BA.debugLine="taResults.Text = taResults.Text & listShowNode";
Debug.ShouldStop(64);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),_listshownodes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable("; ")));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 522;BA.debugLine="taResults.Text = taResults.Text & \"The selected";
Debug.ShouldStop(512);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),RemoteObject.createImmutable("The selected node has no children.")));
 };
 BA.debugLineNum = 524;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(2048);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selected node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable("; Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 };
 BA.debugLineNum = 526;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenulistsiblings_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuListSiblings_Action (main) ","main",0,main.ba,main.mostCurrent,528);
if (RapidSub.canDelegate("cmenulistsiblings_action")) return main.remoteMe.runUserSub(false, "main","cmenulistsiblings_action");
RemoteObject _listshownames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _listshownodes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 528;BA.debugLine="Sub cmenuListSiblings_Action";
Debug.ShouldStop(32768);
 BA.debugLineNum = 529;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 530;BA.debugLine="taResults.Text = \"Sibling's Names:\" & CRLF";
Debug.ShouldStop(131072);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Sibling's Names:"),main.__c.getField(true,"CRLF")));
 BA.debugLineNum = 531;BA.debugLine="Dim listShowNames As List";
Debug.ShouldStop(262144);
_listshownames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listShowNames", _listshownames);
 BA.debugLineNum = 532;BA.debugLine="listShowNames.Initialize";
Debug.ShouldStop(524288);
_listshownames.runVoidMethod ("Initialize");
 BA.debugLineNum = 533;BA.debugLine="listShowNames.AddAll(tvm.ListSiblingNames(lastTr";
Debug.ShouldStop(1048576);
_listshownames.runVoidMethod ("AddAll",(Object)(main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_listsiblingnames",(Object)(main._lasttreeitemselected))));
 BA.debugLineNum = 534;BA.debugLine="If listShowNames.Size > 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_listshownames.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 535;BA.debugLine="For i = 0 To listShowNames.Size -1";
Debug.ShouldStop(4194304);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_listshownames.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 536;BA.debugLine="taResults.Text = taResults.Text & listShowName";
Debug.ShouldStop(8388608);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),_listshownames.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable("; ")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 538;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(33554432);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Sibling's Nodes:"),main.__c.getField(true,"CRLF")));
 BA.debugLineNum = 539;BA.debugLine="Dim listShowNodes As List";
Debug.ShouldStop(67108864);
_listshownodes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listShowNodes", _listshownodes);
 BA.debugLineNum = 540;BA.debugLine="listShowNodes.Initialize";
Debug.ShouldStop(134217728);
_listshownodes.runVoidMethod ("Initialize");
 BA.debugLineNum = 541;BA.debugLine="listShowNodes.AddAll(tvm.ListSiblingNodes(lastT";
Debug.ShouldStop(268435456);
_listshownodes.runVoidMethod ("AddAll",(Object)(main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_listsiblingnodes",(Object)(main._lasttreeitemselected))));
 BA.debugLineNum = 542;BA.debugLine="For i = 0 To listShowNodes.Size -1";
Debug.ShouldStop(536870912);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_listshownodes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14); _i = ((int)(0 + _i + step14)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 543;BA.debugLine="taResults.Text = taResults.Text & listShowNode";
Debug.ShouldStop(1073741824);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),_listshownodes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable("; ")));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 546;BA.debugLine="taResults.Text = taResults.Text & \"The selected";
Debug.ShouldStop(2);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),RemoteObject.createImmutable("The selected node has no siblings.")));
 };
 BA.debugLineNum = 548;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(8);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selected node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable("; Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 };
 BA.debugLineNum = 550;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenumakeparent_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuMakeParent_Action (main) ","main",0,main.ba,main.mostCurrent,471);
if (RapidSub.canDelegate("cmenumakeparent_action")) return main.remoteMe.runUserSub(false, "main","cmenumakeparent_action");
 BA.debugLineNum = 471;BA.debugLine="Sub cmenuMakeParent_Action";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 472;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 473;BA.debugLine="taResults.Text = \"Moving the node \" & lastTreeIt";
Debug.ShouldStop(16777216);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Moving the node "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable(" to the parent level (left).")));
 BA.debugLineNum = 474;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(33554432);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selected node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable("; Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 BA.debugLineNum = 475;BA.debugLine="tvm.MakeParent(lastTreeItemSelected)";
Debug.ShouldStop(67108864);
main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_makeparent",(Object)(main._lasttreeitemselected));
 };
 BA.debugLineNum = 477;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenumovedown_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuMoveDown_Action (main) ","main",0,main.ba,main.mostCurrent,452);
if (RapidSub.canDelegate("cmenumovedown_action")) return main.remoteMe.runUserSub(false, "main","cmenumovedown_action");
 BA.debugLineNum = 452;BA.debugLine="Sub cmenuMoveDown_Action";
Debug.ShouldStop(8);
 BA.debugLineNum = 453;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 454;BA.debugLine="taResults.Text = \"Moving node named \" & lastTree";
Debug.ShouldStop(32);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Moving node named "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable(" down one level in the list the parents children.")));
 BA.debugLineNum = 455;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(64);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selected node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable("; Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 BA.debugLineNum = 456;BA.debugLine="tvm.MoveDown(lastTreeItemSelected)";
Debug.ShouldStop(128);
main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_movedown",(Object)(main._lasttreeitemselected));
 };
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenumoveup_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuMoveUp_Action (main) ","main",0,main.ba,main.mostCurrent,444);
if (RapidSub.canDelegate("cmenumoveup_action")) return main.remoteMe.runUserSub(false, "main","cmenumoveup_action");
 BA.debugLineNum = 444;BA.debugLine="Sub cmenuMoveUp_Action";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 445;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 446;BA.debugLine="taResults.Text = \"Moving node named \" & lastTree";
Debug.ShouldStop(536870912);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Moving node named "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable(" up one level in the list the parents children.")));
 BA.debugLineNum = 447;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(1073741824);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selected node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable("; Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 BA.debugLineNum = 448;BA.debugLine="tvm.MoveUp(lastTreeItemSelected)";
Debug.ShouldStop(-2147483648);
main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_moveup",(Object)(main._lasttreeitemselected));
 };
 BA.debugLineNum = 450;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenupickup_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuPickup_Action (main) ","main",0,main.ba,main.mostCurrent,479);
if (RapidSub.canDelegate("cmenupickup_action")) return main.remoteMe.runUserSub(false, "main","cmenupickup_action");
 BA.debugLineNum = 479;BA.debugLine="Sub cmenuPickup_Action";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 480;BA.debugLine="taResults.Text = \"\"";
Debug.ShouldStop(-2147483648);
main._taresults.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 481;BA.debugLine="tvm.Pickup(lastTreeItemSelected)";
Debug.ShouldStop(1);
main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_pickup",(Object)(main._lasttreeitemselected));
 BA.debugLineNum = 482;BA.debugLine="taResults.text = \"The node \" & lastTreeItemSelect";
Debug.ShouldStop(2);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("The node "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable(" has been marked for movement to a new location.")));
 BA.debugLineNum = 483;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF & \"";
Debug.ShouldStop(4);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable("; Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; IsSibling: ")));
 BA.debugLineNum = 484;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenurelatetopic_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuRelateTopic_Action (main) ","main",0,main.ba,main.mostCurrent,586);
if (RapidSub.canDelegate("cmenurelatetopic_action")) return main.remoteMe.runUserSub(false, "main","cmenurelatetopic_action");
 BA.debugLineNum = 586;BA.debugLine="Sub cmenuRelateTopic_Action";
Debug.ShouldStop(512);
 BA.debugLineNum = 587;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 588;BA.debugLine="taResults.Text = \"\"";
Debug.ShouldStop(2048);
main._taresults.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 594;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(131072);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selected node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable("; Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 };
 BA.debugLineNum = 596;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenuremove_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuRemove_Action (main) ","main",0,main.ba,main.mostCurrent,460);
if (RapidSub.canDelegate("cmenuremove_action")) return main.remoteMe.runUserSub(false, "main","cmenuremove_action");
 BA.debugLineNum = 460;BA.debugLine="Sub cmenuRemove_Action";
Debug.ShouldStop(2048);
 BA.debugLineNum = 461;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 462;BA.debugLine="taResults.Text = \"Selected to remove the node na";
Debug.ShouldStop(8192);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Selected to remove the node named "),main._lasttreeitemselected.runMethod(true,"getText")));
 BA.debugLineNum = 463;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(16384);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selected node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable("; Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 BA.debugLineNum = 464;BA.debugLine="If dialogue8.ConfirmationDialog(\"Topic List Mana";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",main._dialogue8.runMethod(true,"_confirmationdialog",(Object)(BA.ObjectToString("Topic List Management")),(Object)(BA.ObjectToString("Remove Topic")),(Object)(RemoteObject.createImmutable("Confirm you want to delete this item."))),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 465;BA.debugLine="tvm.Remove(lastTreeItemSelected)";
Debug.ShouldStop(65536);
main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_remove",(Object)(main._lasttreeitemselected));
 BA.debugLineNum = 466;BA.debugLine="taResults.Text = taResults.Text & CRLF & \"Node";
Debug.ShouldStop(131072);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Node removed.")));
 };
 };
 BA.debugLineNum = 469;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenurename_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuRename_Action (main) ","main",0,main.ba,main.mostCurrent,431);
if (RapidSub.canDelegate("cmenurename_action")) return main.remoteMe.runUserSub(false, "main","cmenurename_action");
RemoteObject _strnewname = RemoteObject.createImmutable("");
 BA.debugLineNum = 431;BA.debugLine="Sub cmenuRename_Action";
Debug.ShouldStop(16384);
 BA.debugLineNum = 432;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 433;BA.debugLine="taResults.Text = \"\"";
Debug.ShouldStop(65536);
main._taresults.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 434;BA.debugLine="Dim strNewName As String";
Debug.ShouldStop(131072);
_strnewname = RemoteObject.createImmutable("");Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 435;BA.debugLine="strNewName = dialogue8.TextInputDialog(\"Topic Li";
Debug.ShouldStop(262144);
_strnewname = main._dialogue8.runMethod(true,"_textinputdialog",(Object)(BA.ObjectToString("Topic List Management")),(Object)(BA.ObjectToString("Rename Topic")),(Object)(BA.ObjectToString("Enter new topic name:")),(Object)(main._lasttreeitemselected.runMethod(true,"getText")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 436;BA.debugLine="If strNewName <> \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",_strnewname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 437;BA.debugLine="taResults.Text = \"Renaming \" & lastTreeItemSele";
Debug.ShouldStop(1048576);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Renaming "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable(" to "),_strnewname));
 BA.debugLineNum = 438;BA.debugLine="tvm.Rename(lastTreeItemSelected, strNewName)";
Debug.ShouldStop(2097152);
main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_rename",(Object)(main._lasttreeitemselected),(Object)(_strnewname));
 };
 BA.debugLineNum = 440;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
Debug.ShouldStop(8388608);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable("; Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 };
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _collectcontextmenuitems(RemoteObject _contextmenus,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("CollectContextMenuItems (main) ","main",0,main.ba,main.mostCurrent,172);
if (RapidSub.canDelegate("collectcontextmenuitems")) return main.remoteMe.runUserSub(false, "main","collectcontextmenuitems", _contextmenus, _items);
RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
RemoteObject _mn = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper");
Debug.locals.put("ContextMenus", _contextmenus);
Debug.locals.put("Items", _items);
 BA.debugLineNum = 172;BA.debugLine="Private Sub CollectContextMenuItems(ContextMenus A";
Debug.ShouldStop(2048);
 BA.debugLineNum = 173;BA.debugLine="For Each mi As MenuItem In Items";
Debug.ShouldStop(4096);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
final RemoteObject group1 = _items;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get();
for (int index1 = 0;index1 < groupLen1 ;index1++){
_mi.setObject(group1.runMethod(false,"Get",index1));
Debug.locals.put("mi", _mi);
 BA.debugLineNum = 174;BA.debugLine="If mi.Tag <> Null And mi.Tag <> \"\" Then Conte";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("N",_mi.runMethod(false,"getTag")) && RemoteObject.solveBoolean("!",_mi.runMethod(false,"getTag"),RemoteObject.createImmutable(("")))) { 
_contextmenus.runVoidMethod ("Put",(Object)(_mi.runMethod(false,"getTag")),(Object)((_mi.getObject())));};
 BA.debugLineNum = 175;BA.debugLine="If mi Is Menu Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("i",_mi.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.control.Menu"))) { 
 BA.debugLineNum = 176;BA.debugLine="Dim mn As Menu = mi";
Debug.ShouldStop(32768);
_mn = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper");
_mn.setObject(_mi.getObject());Debug.locals.put("mn", _mn);
 BA.debugLineNum = 177;BA.debugLine="CollectContextMenuItems(ContextMenus, mn.Me";
Debug.ShouldStop(65536);
_collectcontextmenuitems(_contextmenus,_mn.runMethod(false,"getMenuItems"));
 };
 }
Debug.locals.put("mi", _mi);
;
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _collectmenuitems(RemoteObject _menus,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("CollectMenuItems (main) ","main",0,main.ba,main.mostCurrent,182);
if (RapidSub.canDelegate("collectmenuitems")) return main.remoteMe.runUserSub(false, "main","collectmenuitems", _menus, _items);
RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
RemoteObject _mn = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper");
Debug.locals.put("Menus", _menus);
Debug.locals.put("Items", _items);
 BA.debugLineNum = 182;BA.debugLine="Private Sub CollectMenuItems(Menus As Map, Items A";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="For Each mi As MenuItem In Items";
Debug.ShouldStop(4194304);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
final RemoteObject group1 = _items;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get();
for (int index1 = 0;index1 < groupLen1 ;index1++){
_mi.setObject(group1.runMethod(false,"Get",index1));
Debug.locals.put("mi", _mi);
 BA.debugLineNum = 184;BA.debugLine="If mi.Tag <> Null And mi.Tag <> \"\" Then Menus";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("N",_mi.runMethod(false,"getTag")) && RemoteObject.solveBoolean("!",_mi.runMethod(false,"getTag"),RemoteObject.createImmutable(("")))) { 
_menus.runVoidMethod ("Put",(Object)(_mi.runMethod(false,"getTag")),(Object)((_mi.getObject())));};
 BA.debugLineNum = 185;BA.debugLine="If mi Is Menu Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("i",_mi.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.control.Menu"))) { 
 BA.debugLineNum = 186;BA.debugLine="Dim mn As Menu = mi";
Debug.ShouldStop(33554432);
_mn = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper");
_mn.setObject(_mi.getObject());Debug.locals.put("mn", _mn);
 BA.debugLineNum = 187;BA.debugLine="CollectMenuItems(Menus, mn.MenuItems)";
Debug.ShouldStop(67108864);
_collectmenuitems(_menus,_mn.runMethod(false,"getMenuItems"));
 };
 }
Debug.locals.put("mi", _mi);
;
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menubar1_action() throws Exception{
try {
		Debug.PushSubsStack("MenuBar1_Action (main) ","main",0,main.ba,main.mostCurrent,602);
if (RapidSub.canDelegate("menubar1_action")) return main.remoteMe.runUserSub(false, "main","menubar1_action");
RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
 BA.debugLineNum = 602;BA.debugLine="Sub MenuBar1_Action";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 603;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 604;BA.debugLine="Dim mi As MenuItem = Sender";
Debug.ShouldStop(134217728);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_mi.setObject(main.__c.runMethod(false,"Sender",main.ba));Debug.locals.put("mi", _mi);
 BA.debugLineNum = 605;BA.debugLine="Select Case mi.Text";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(_mi.runMethod(true,"getText"),BA.ObjectToString("Add Same Level Topic"),BA.ObjectToString("Make this a Parent Topic"),BA.ObjectToString("Move UP"),BA.ObjectToString("Pick-up"),BA.ObjectToString("Drop"),BA.ObjectToString("Rename"),BA.ObjectToString("Move DOWN"),BA.ObjectToString("Add Sub Topic"),BA.ObjectToString("List Siblings"),BA.ObjectToString("List Children"),BA.ObjectToString("List Antecedents"),BA.ObjectToString("Remove"))) {
case 0: {
 BA.debugLineNum = 607;BA.debugLine="cmenuAddSibling_Action";
Debug.ShouldStop(1073741824);
_cmenuaddsibling_action();
 break; }
case 1: {
 BA.debugLineNum = 609;BA.debugLine="cmenuMakeParent_Action";
Debug.ShouldStop(1);
_cmenumakeparent_action();
 break; }
case 2: {
 BA.debugLineNum = 611;BA.debugLine="cmenuMoveUp_Action";
Debug.ShouldStop(4);
_cmenumoveup_action();
 break; }
case 3: {
 BA.debugLineNum = 613;BA.debugLine="cmenuPickup_Action";
Debug.ShouldStop(16);
_cmenupickup_action();
 break; }
case 4: {
 BA.debugLineNum = 615;BA.debugLine="cmenuDrop_Action";
Debug.ShouldStop(64);
_cmenudrop_action();
 break; }
case 5: {
 BA.debugLineNum = 617;BA.debugLine="cmenuRename_Action";
Debug.ShouldStop(256);
_cmenurename_action();
 break; }
case 6: {
 BA.debugLineNum = 619;BA.debugLine="cmenuMoveDown_Action";
Debug.ShouldStop(1024);
_cmenumovedown_action();
 break; }
case 7: {
 BA.debugLineNum = 621;BA.debugLine="cmenuAddSubLevel_Action";
Debug.ShouldStop(4096);
_cmenuaddsublevel_action();
 break; }
case 8: {
 BA.debugLineNum = 623;BA.debugLine="cmenuListSiblings_Action";
Debug.ShouldStop(16384);
_cmenulistsiblings_action();
 break; }
case 9: {
 BA.debugLineNum = 625;BA.debugLine="cmenuListChildren_Action";
Debug.ShouldStop(65536);
_cmenulistchildren_action();
 break; }
case 10: {
 BA.debugLineNum = 627;BA.debugLine="cmenuListAntecedents_Action";
Debug.ShouldStop(262144);
_cmenulistantecedents_action();
 break; }
case 11: {
 BA.debugLineNum = 629;BA.debugLine="cmenuRemove_Action";
Debug.ShouldStop(1048576);
_cmenuremove_action();
 break; }
}
;
 };
 BA.debugLineNum = 632;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mmenuexit_action() throws Exception{
try {
		Debug.PushSubsStack("mmenuExit_Action (main) ","main",0,main.ba,main.mostCurrent,634);
if (RapidSub.canDelegate("mmenuexit_action")) return main.remoteMe.runUserSub(false, "main","mmenuexit_action");
 BA.debugLineNum = 634;BA.debugLine="Sub mmenuExit_Action";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 635;BA.debugLine="ExitApplication";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 636;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mmenuexportjson_action() throws Exception{
try {
		Debug.PushSubsStack("mmenuExportJSON_Action (main) ","main",0,main.ba,main.mostCurrent,638);
if (RapidSub.canDelegate("mmenuexportjson_action")) return main.remoteMe.runUserSub(false, "main","mmenuexportjson_action");
RemoteObject _strfromjson = RemoteObject.createImmutable("");
 BA.debugLineNum = 638;BA.debugLine="Sub mmenuExportJSON_Action";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 639;BA.debugLine="Dim strFromJSON As String = tvm.ToJSON(TreeView1)";
Debug.ShouldStop(1073741824);
_strfromjson = main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_tojson",(Object)(main._treeview1));Debug.locals.put("strFromJSON", _strfromjson);Debug.locals.put("strFromJSON", _strfromjson);
 BA.debugLineNum = 640;BA.debugLine="File.WriteString(File.DirApp, \"treeview_json.txt\"";
Debug.ShouldStop(-2147483648);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("treeview_json.txt")),(Object)(_strfromjson));
 BA.debugLineNum = 641;BA.debugLine="fx.ShowExternalDocument(File.GetUri(File.DirAp";
Debug.ShouldStop(1);
main._fx.runVoidMethod ("ShowExternalDocument",(Object)(main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("treeview_json.txt")))));
 BA.debugLineNum = 642;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mmenuexportxml_action() throws Exception{
try {
		Debug.PushSubsStack("mmenuExportXML_Action (main) ","main",0,main.ba,main.mostCurrent,644);
if (RapidSub.canDelegate("mmenuexportxml_action")) return main.remoteMe.runUserSub(false, "main","mmenuexportxml_action");
RemoteObject _strfromxml = RemoteObject.createImmutable("");
 BA.debugLineNum = 644;BA.debugLine="Sub mmenuExportXML_Action";
Debug.ShouldStop(8);
 BA.debugLineNum = 645;BA.debugLine="Dim strFromXML As String = tvm.ToXML(TreeView1)";
Debug.ShouldStop(16);
_strfromxml = main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_toxml",(Object)(main._treeview1));Debug.locals.put("strFromXML", _strfromxml);Debug.locals.put("strFromXML", _strfromxml);
 BA.debugLineNum = 646;BA.debugLine="File.WriteString(File.DirApp, \"treeview_xml.xml\",";
Debug.ShouldStop(32);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("treeview_xml.xml")),(Object)(_strfromxml));
 BA.debugLineNum = 647;BA.debugLine="fx.ShowExternalDocument(File.GetUri(File.DirAp";
Debug.ShouldStop(64);
main._fx.runVoidMethod ("ShowExternalDocument",(Object)(main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("treeview_xml.xml")))));
 BA.debugLineNum = 648;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mmenuimportjson_action() throws Exception{
try {
		Debug.PushSubsStack("mmenuImportJSON_Action (main) ","main",0,main.ba,main.mostCurrent,650);
if (RapidSub.canDelegate("mmenuimportjson_action")) return main.remoteMe.runUserSub(false, "main","mmenuimportjson_action");
RemoteObject _strjson = RemoteObject.createImmutable("");
 BA.debugLineNum = 650;BA.debugLine="Sub mmenuImportJSON_Action";
Debug.ShouldStop(512);
 BA.debugLineNum = 651;BA.debugLine="Dim strJSON As String = File.ReadString(File.DirA";
Debug.ShouldStop(1024);
_strjson = main.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("treeview_json.txt")));Debug.locals.put("strJSON", _strjson);Debug.locals.put("strJSON", _strjson);
 BA.debugLineNum = 652;BA.debugLine="tvm.BuildTreeFromJSON(TreeView1, strJSON)";
Debug.ShouldStop(2048);
main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_buildtreefromjson",(Object)(main._treeview1),(Object)(_strjson));
 BA.debugLineNum = 653;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
treeviewmanager.myClass = BA.getDeviceClass ("b4j.example.treeviewmanager");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="Private TreeView1 As TreeView";
main._treeview1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Private dialogue8 As Dialogs8";
main._dialogue8 = RemoteObject.createNew ("b4j.example.dialogs8");
 //BA.debugLineNum = 12;BA.debugLine="Private boolHandlingMouseClick As Boolean";
main._boolhandlingmouseclick = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 13;BA.debugLine="Private lastTreeItemSelected As TreeItem";
main._lasttreeitemselected = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private tvm As TreeViewManager";
main._tvm = RemoteObject.createNew ("b4j.example.treeviewmanager");
 //BA.debugLineNum = 15;BA.debugLine="Private mapContextMenus As Map";
main._mapcontextmenus = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 16;BA.debugLine="Private mapMainMenus As Map";
main._mapmainmenus = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 17;BA.debugLine="Public taResults As TextArea";
main._taresults = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private btnToXML As Button";
main._btntoxml = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private btnToJson As Button";
main._btntojson = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private MenuBar1 As MenuBar";
main._menubar1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private txtField1 As TextField";
main._txtfield1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private txtField2 As TextField";
main._txtfield2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private txtField3 As TextField";
main._txtfield3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private mapDataStore As Map";
main._mapdatastore = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 25;BA.debugLine="Private book_closed,book_open As Image";
main._book_closed = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
main._book_open = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _treecontextalloff() throws Exception{
try {
		Debug.PushSubsStack("TreeContextAllOff (main) ","main",0,main.ba,main.mostCurrent,192);
if (RapidSub.canDelegate("treecontextalloff")) return main.remoteMe.runUserSub(false, "main","treecontextalloff");
RemoteObject _listoff = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listmainoff = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
int _i2 = 0;
RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
 BA.debugLineNum = 192;BA.debugLine="Sub TreeContextAllOff";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 193;BA.debugLine="Dim listOff As List";
Debug.ShouldStop(1);
_listoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOff", _listoff);
 BA.debugLineNum = 194;BA.debugLine="listOff.Initialize";
Debug.ShouldStop(2);
_listoff.runVoidMethod ("Initialize");
 BA.debugLineNum = 195;BA.debugLine="listOff.Add(\"cmnuAdd\")";
Debug.ShouldStop(4);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuAdd"))));
 BA.debugLineNum = 196;BA.debugLine="listOff.Add(\"cmnuMakeParent\")";
Debug.ShouldStop(8);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMakeParent"))));
 BA.debugLineNum = 197;BA.debugLine="listOff.Add(\"cmnuMoveUp\")";
Debug.ShouldStop(16);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMoveUp"))));
 BA.debugLineNum = 198;BA.debugLine="listOff.Add(\"cmnuRename\")";
Debug.ShouldStop(32);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuRename"))));
 BA.debugLineNum = 199;BA.debugLine="listOff.Add(\"cmnuEditContent\")";
Debug.ShouldStop(64);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuEditContent"))));
 BA.debugLineNum = 200;BA.debugLine="listOff.Add(\"cmnuRelateTopic\")";
Debug.ShouldStop(128);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuRelateTopic"))));
 BA.debugLineNum = 201;BA.debugLine="listOff.Add(\"cmnuMoveDown\")";
Debug.ShouldStop(256);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMoveDown"))));
 BA.debugLineNum = 202;BA.debugLine="listOff.Add(\"cmnuAddSubLevel\")";
Debug.ShouldStop(512);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuAddSubLevel"))));
 BA.debugLineNum = 203;BA.debugLine="listOff.Add(\"cmnuRemove\")";
Debug.ShouldStop(1024);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuRemove"))));
 BA.debugLineNum = 204;BA.debugLine="listOff.Add(\"cmnuPickup\")";
Debug.ShouldStop(2048);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuPickup"))));
 BA.debugLineNum = 205;BA.debugLine="listOff.Add(\"cmnuDrop\")";
Debug.ShouldStop(4096);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuDrop"))));
 BA.debugLineNum = 206;BA.debugLine="listOff.Add(\"cmnuListSiblings\")";
Debug.ShouldStop(8192);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuListSiblings"))));
 BA.debugLineNum = 207;BA.debugLine="listOff.Add(\"cmnuListChildren\")";
Debug.ShouldStop(16384);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuListChildren"))));
 BA.debugLineNum = 208;BA.debugLine="listOff.Add(\"cmnuListAntecedents\")";
Debug.ShouldStop(32768);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuListAntecedents"))));
 BA.debugLineNum = 210;BA.debugLine="Dim listMainOff As List";
Debug.ShouldStop(131072);
_listmainoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listMainOff", _listmainoff);
 BA.debugLineNum = 211;BA.debugLine="listMainOff.Initialize";
Debug.ShouldStop(262144);
_listmainoff.runVoidMethod ("Initialize");
 BA.debugLineNum = 212;BA.debugLine="listMainOff.Add(\"mmnuAddSibling\")";
Debug.ShouldStop(524288);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuAddSibling"))));
 BA.debugLineNum = 213;BA.debugLine="listMainOff.Add(\"mmnuMakeParent\")";
Debug.ShouldStop(1048576);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMakeParent"))));
 BA.debugLineNum = 214;BA.debugLine="listMainOff.Add(\"mmnuMoveUp\")";
Debug.ShouldStop(2097152);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMoveUp"))));
 BA.debugLineNum = 215;BA.debugLine="listMainOff.Add(\"mmnuRename\")";
Debug.ShouldStop(4194304);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuRename"))));
 BA.debugLineNum = 216;BA.debugLine="listMainOff.Add(\"mmnuEditContent\")";
Debug.ShouldStop(8388608);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuEditContent"))));
 BA.debugLineNum = 217;BA.debugLine="listMainOff.Add(\"mmnuRelateTopic\")";
Debug.ShouldStop(16777216);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuRelateTopic"))));
 BA.debugLineNum = 218;BA.debugLine="listMainOff.Add(\"mmnuMoveDown\")";
Debug.ShouldStop(33554432);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMoveDown"))));
 BA.debugLineNum = 219;BA.debugLine="listMainOff.Add(\"mmnuAddSubLevel\")";
Debug.ShouldStop(67108864);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuAddSubLevel"))));
 BA.debugLineNum = 220;BA.debugLine="listMainOff.Add(\"mmnuRemove\")";
Debug.ShouldStop(134217728);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuRemove"))));
 BA.debugLineNum = 221;BA.debugLine="listMainOff.Add(\"mmnuPickup\")";
Debug.ShouldStop(268435456);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuPickup"))));
 BA.debugLineNum = 222;BA.debugLine="listMainOff.Add(\"mmnuDrop\")";
Debug.ShouldStop(536870912);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuDrop"))));
 BA.debugLineNum = 223;BA.debugLine="listMainOff.Add(\"mmnuListSiblings\")";
Debug.ShouldStop(1073741824);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuListSiblings"))));
 BA.debugLineNum = 224;BA.debugLine="listMainOff.Add(\"mmnuListChildren\")";
Debug.ShouldStop(-2147483648);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuListChildren"))));
 BA.debugLineNum = 225;BA.debugLine="listMainOff.Add(\"mmnuListAntecedents\")";
Debug.ShouldStop(1);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuListAntecedents"))));
 BA.debugLineNum = 227;BA.debugLine="For i = 0 To mapContextMenus.Size - 1";
Debug.ShouldStop(4);
{
final int step33 = 1;
final int limit33 = RemoteObject.solve(new RemoteObject[] {main._mapcontextmenus.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33); _i = ((int)(0 + _i + step33)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 228;BA.debugLine="For i2 = 0 To listOff.Size - 1";
Debug.ShouldStop(8);
{
final int step34 = 1;
final int limit34 = RemoteObject.solve(new RemoteObject[] {_listoff.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i2 = 0 ; (step34 > 0 && _i2 <= limit34) || (step34 < 0 && _i2 >= limit34); _i2 = ((int)(0 + _i2 + step34)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 229;BA.debugLine="If mapContextMenus.GetKeyAt(i) = listOff.Get(i2";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main._mapcontextmenus.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))),_listoff.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))) { 
 BA.debugLineNum = 230;BA.debugLine="Dim mi As MenuItem = mapContextMenus.Get(listO";
Debug.ShouldStop(32);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_mi.setObject(main._mapcontextmenus.runMethod(false,"Get",(Object)(_listoff.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))));Debug.locals.put("mi", _mi);
 BA.debugLineNum = 231;BA.debugLine="mi.Enabled = False";
Debug.ShouldStop(64);
_mi.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 232;BA.debugLine="Exit";
Debug.ShouldStop(128);
if (true) break;
 };
 }
}Debug.locals.put("i2", _i2);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 236;BA.debugLine="For i = 0 To mapMainMenus.Size - 1";
Debug.ShouldStop(2048);
{
final int step42 = 1;
final int limit42 = RemoteObject.solve(new RemoteObject[] {main._mapmainmenus.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step42 > 0 && _i <= limit42) || (step42 < 0 && _i >= limit42); _i = ((int)(0 + _i + step42)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 237;BA.debugLine="For i2 = 0 To listOff.Size - 1";
Debug.ShouldStop(4096);
{
final int step43 = 1;
final int limit43 = RemoteObject.solve(new RemoteObject[] {_listoff.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i2 = 0 ; (step43 > 0 && _i2 <= limit43) || (step43 < 0 && _i2 >= limit43); _i2 = ((int)(0 + _i2 + step43)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 238;BA.debugLine="If mapMainMenus.GetKeyAt(i) = listMainOff.Get(i";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",main._mapmainmenus.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))),_listmainoff.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))) { 
 BA.debugLineNum = 239;BA.debugLine="Dim mi As MenuItem = mapMainMenus.Get(listMain";
Debug.ShouldStop(16384);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_mi.setObject(main._mapmainmenus.runMethod(false,"Get",(Object)(_listmainoff.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))));Debug.locals.put("mi", _mi);
 BA.debugLineNum = 240;BA.debugLine="mi.Enabled = False";
Debug.ShouldStop(32768);
_mi.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 241;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 };
 }
}Debug.locals.put("i2", _i2);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 245;BA.debugLine="txtField1.Enabled = False";
Debug.ShouldStop(1048576);
main._txtfield1.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 246;BA.debugLine="txtField2.Enabled = False";
Debug.ShouldStop(2097152);
main._txtfield2.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 247;BA.debugLine="txtField3.Enabled = False";
Debug.ShouldStop(4194304);
main._txtfield3.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _treecontextset(RemoteObject _thisnode) throws Exception{
try {
		Debug.PushSubsStack("TreeContextSet (main) ","main",0,main.ba,main.mostCurrent,250);
if (RapidSub.canDelegate("treecontextset")) return main.remoteMe.runUserSub(false, "main","treecontextset", _thisnode);
RemoteObject _liston = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listmainon = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listoff = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listmainoff = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
int _i2 = 0;
RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
Debug.locals.put("thisNode", _thisnode);
 BA.debugLineNum = 250;BA.debugLine="Sub TreeContextSet(thisNode As TreeItem)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="Dim listOn As List";
Debug.ShouldStop(67108864);
_liston = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOn", _liston);
 BA.debugLineNum = 252;BA.debugLine="listOn.Initialize";
Debug.ShouldStop(134217728);
_liston.runVoidMethod ("Initialize");
 BA.debugLineNum = 253;BA.debugLine="listOn.Add(\"cmnuAddSibling\")";
Debug.ShouldStop(268435456);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuAddSibling"))));
 BA.debugLineNum = 254;BA.debugLine="Dim listMainOn As List";
Debug.ShouldStop(536870912);
_listmainon = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listMainOn", _listmainon);
 BA.debugLineNum = 255;BA.debugLine="listMainOn.Initialize";
Debug.ShouldStop(1073741824);
_listmainon.runVoidMethod ("Initialize");
 BA.debugLineNum = 256;BA.debugLine="Dim listOff As List";
Debug.ShouldStop(-2147483648);
_listoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOff", _listoff);
 BA.debugLineNum = 257;BA.debugLine="listOff.Initialize";
Debug.ShouldStop(1);
_listoff.runVoidMethod ("Initialize");
 BA.debugLineNum = 258;BA.debugLine="Dim listMainOff As List";
Debug.ShouldStop(2);
_listmainoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listMainOff", _listmainoff);
 BA.debugLineNum = 259;BA.debugLine="listMainOff.Initialize";
Debug.ShouldStop(4);
_listmainoff.runVoidMethod ("Initialize");
 BA.debugLineNum = 260;BA.debugLine="If thisNode.IsInitialized = True Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_thisnode.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 261;BA.debugLine="txtField1.Enabled = True";
Debug.ShouldStop(16);
main._txtfield1.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 262;BA.debugLine="txtField2.Enabled = True";
Debug.ShouldStop(32);
main._txtfield2.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 263;BA.debugLine="txtField3.Enabled = True";
Debug.ShouldStop(64);
main._txtfield3.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 264;BA.debugLine="listOn.Add(\"cmnuAddSubLevel\")";
Debug.ShouldStop(128);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuAddSubLevel"))));
 BA.debugLineNum = 265;BA.debugLine="listOn.Add(\"cmnuRemove\")";
Debug.ShouldStop(256);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuRemove"))));
 BA.debugLineNum = 266;BA.debugLine="listOn.Add(\"cmnuRename\")";
Debug.ShouldStop(512);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuRename"))));
 BA.debugLineNum = 267;BA.debugLine="listOn.Add(\"cmnuPickup\")";
Debug.ShouldStop(1024);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuPickup"))));
 BA.debugLineNum = 268;BA.debugLine="listMainOn.Add(\"mmnuAddSibling\")";
Debug.ShouldStop(2048);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuAddSibling"))));
 BA.debugLineNum = 269;BA.debugLine="listMainOn.Add(\"mmnuAddSubLevel\")";
Debug.ShouldStop(4096);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuAddSubLevel"))));
 BA.debugLineNum = 270;BA.debugLine="listMainOn.Add(\"mmnuRemove\")";
Debug.ShouldStop(8192);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuRemove"))));
 BA.debugLineNum = 271;BA.debugLine="listMainOn.Add(\"mmnuRename\")";
Debug.ShouldStop(16384);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuRename"))));
 BA.debugLineNum = 272;BA.debugLine="listMainOn.Add(\"mmnuPickup\")";
Debug.ShouldStop(32768);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuPickup"))));
 BA.debugLineNum = 273;BA.debugLine="If tvm.HasSiblings(thisNode) = True Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_hassiblings",(Object)(_thisnode)),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 274;BA.debugLine="listOn.Add(\"cmnuListSiblings\")";
Debug.ShouldStop(131072);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuListSiblings"))));
 BA.debugLineNum = 275;BA.debugLine="listMainOn.Add(\"mmnuListSiblings\")";
Debug.ShouldStop(262144);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuListSiblings"))));
 }else {
 BA.debugLineNum = 277;BA.debugLine="listOff.Add(\"cmnuListSiblings\")";
Debug.ShouldStop(1048576);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuListSiblings"))));
 BA.debugLineNum = 278;BA.debugLine="listMainOff.Add(\"mmnuListSiblings\")";
Debug.ShouldStop(2097152);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuListSiblings"))));
 };
 BA.debugLineNum = 280;BA.debugLine="If tvm.HasChildren(thisNode) = True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_haschildren",(Object)(_thisnode)),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 282;BA.debugLine="listOff.Add(\"cmnuEditContent\")";
Debug.ShouldStop(33554432);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuEditContent"))));
 BA.debugLineNum = 283;BA.debugLine="listMainOff.Add(\"mcmnuEditContent\")";
Debug.ShouldStop(67108864);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mcmnuEditContent"))));
 BA.debugLineNum = 284;BA.debugLine="listOn.Add(\"cmnuListChildren\")";
Debug.ShouldStop(134217728);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuListChildren"))));
 BA.debugLineNum = 285;BA.debugLine="listMainOn.Add(\"mmnuListChildren\")";
Debug.ShouldStop(268435456);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuListChildren"))));
 }else {
 BA.debugLineNum = 287;BA.debugLine="listOn.Add(\"cmnuEditContent\")";
Debug.ShouldStop(1073741824);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuEditContent"))));
 BA.debugLineNum = 288;BA.debugLine="listMainOn.Add(\"mmnuEditContent\")";
Debug.ShouldStop(-2147483648);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuEditContent"))));
 BA.debugLineNum = 289;BA.debugLine="listOff.Add(\"cmnuListChildren\")";
Debug.ShouldStop(1);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuListChildren"))));
 BA.debugLineNum = 290;BA.debugLine="listMainOff.Add(\"mmnuListChildren\")";
Debug.ShouldStop(2);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuListChildren"))));
 };
 BA.debugLineNum = 292;BA.debugLine="If tvm.IsFirstChild(thisNode) = True Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_isfirstchild",(Object)(_thisnode)),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 294;BA.debugLine="listOn.Add(\"cmnuMoveDown\")";
Debug.ShouldStop(32);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMoveDown"))));
 BA.debugLineNum = 295;BA.debugLine="listOff.Add(\"cmnuMoveUp\")";
Debug.ShouldStop(64);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMoveUp"))));
 BA.debugLineNum = 296;BA.debugLine="listMainOn.Add(\"mmnuMoveDown\")";
Debug.ShouldStop(128);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMoveDown"))));
 BA.debugLineNum = 297;BA.debugLine="listMainOff.Add(\"mmnuMoveUp\")";
Debug.ShouldStop(256);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMoveUp"))));
 }else 
{ BA.debugLineNum = 298;BA.debugLine="else If tvm.IsLastChild(thisNode) = True Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_islastchild",(Object)(_thisnode)),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 300;BA.debugLine="listOff.Add(\"cmnuMoveDown\")";
Debug.ShouldStop(2048);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMoveDown"))));
 BA.debugLineNum = 301;BA.debugLine="listOn.Add(\"cmnuMoveUp\")";
Debug.ShouldStop(4096);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMoveUp"))));
 BA.debugLineNum = 302;BA.debugLine="listMainOff.Add(\"mmnuMoveDown\")";
Debug.ShouldStop(8192);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMoveDown"))));
 BA.debugLineNum = 303;BA.debugLine="listMainOn.Add(\"mmnuMoveUp\")";
Debug.ShouldStop(16384);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMoveUp"))));
 }else {
 BA.debugLineNum = 305;BA.debugLine="listOn.Add(\"cmnuMoveDown\")";
Debug.ShouldStop(65536);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMoveDown"))));
 BA.debugLineNum = 306;BA.debugLine="listOn.Add(\"cmnuMoveUp\")";
Debug.ShouldStop(131072);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMoveUp"))));
 BA.debugLineNum = 307;BA.debugLine="listMainOn.Add(\"mmnuMoveDown\")";
Debug.ShouldStop(262144);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMoveDown"))));
 BA.debugLineNum = 308;BA.debugLine="listMainOn.Add(\"mmnuMoveUp\")";
Debug.ShouldStop(524288);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMoveUp"))));
 }};
 BA.debugLineNum = 310;BA.debugLine="If tvm.IsRoot(thisNode) = True Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_isroot",(Object)(_thisnode)),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 311;BA.debugLine="listOff.Add(\"cmnuMakeParent\")";
Debug.ShouldStop(4194304);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMakeParent"))));
 BA.debugLineNum = 312;BA.debugLine="listMainOff.Add(\"mmnuMakeParent\")";
Debug.ShouldStop(8388608);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMakeParent"))));
 BA.debugLineNum = 313;BA.debugLine="listOff.Add(\"cmnuListAntecedents\")";
Debug.ShouldStop(16777216);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuListAntecedents"))));
 BA.debugLineNum = 314;BA.debugLine="listMainOff.Add(\"mmnuListAntecedents\")";
Debug.ShouldStop(33554432);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuListAntecedents"))));
 }else {
 BA.debugLineNum = 316;BA.debugLine="listOn.Add(\"cmnuMakeParent\")";
Debug.ShouldStop(134217728);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMakeParent"))));
 BA.debugLineNum = 317;BA.debugLine="listMainOn.Add(\"mmnuMakeParent\")";
Debug.ShouldStop(268435456);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMakeParent"))));
 BA.debugLineNum = 318;BA.debugLine="listOn.Add(\"cmnuListAntecedents\")";
Debug.ShouldStop(536870912);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuListAntecedents"))));
 BA.debugLineNum = 319;BA.debugLine="listMainOn.Add(\"mmnuListAntecedents\")";
Debug.ShouldStop(1073741824);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuListAntecedents"))));
 };
 BA.debugLineNum = 321;BA.debugLine="If tvm.IsPickup = True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_ispickup"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 322;BA.debugLine="listOn.Add(\"cmnuDrop\")";
Debug.ShouldStop(2);
_liston.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuDrop"))));
 BA.debugLineNum = 323;BA.debugLine="listMainOn.Add(\"mmnuDrop\")";
Debug.ShouldStop(4);
_listmainon.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuDrop"))));
 }else {
 BA.debugLineNum = 325;BA.debugLine="listOff.Add(\"cmnuDrop\")";
Debug.ShouldStop(16);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuDrop"))));
 BA.debugLineNum = 326;BA.debugLine="listMainOff.Add(\"mmnuDrop\")";
Debug.ShouldStop(32);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuDrop"))));
 };
 }else {
 BA.debugLineNum = 334;BA.debugLine="txtField1.Enabled = False";
Debug.ShouldStop(8192);
main._txtfield1.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 335;BA.debugLine="txtField2.Enabled = False";
Debug.ShouldStop(16384);
main._txtfield2.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 336;BA.debugLine="txtField3.Enabled = False";
Debug.ShouldStop(32768);
main._txtfield3.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 337;BA.debugLine="listOff.Add(\"cmnuAddSubLevel\")";
Debug.ShouldStop(65536);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuAddSubLevel"))));
 BA.debugLineNum = 338;BA.debugLine="listOff.Add(\"cmnuRemove\")";
Debug.ShouldStop(131072);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuRemove"))));
 BA.debugLineNum = 339;BA.debugLine="listOff.Add(\"cmnuRelateTopic\")";
Debug.ShouldStop(262144);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuRelateTopic"))));
 BA.debugLineNum = 340;BA.debugLine="listOff.Add(\"cmnuRename\")";
Debug.ShouldStop(524288);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuRename"))));
 BA.debugLineNum = 341;BA.debugLine="listOff.Add(\"cmnuMoveDown\")";
Debug.ShouldStop(1048576);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMoveDown"))));
 BA.debugLineNum = 342;BA.debugLine="listOff.Add(\"cmnuMoveUp\")";
Debug.ShouldStop(2097152);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMoveUp"))));
 BA.debugLineNum = 343;BA.debugLine="listOff.Add(\"cmnuMakeParent\")";
Debug.ShouldStop(4194304);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMakeParent"))));
 BA.debugLineNum = 344;BA.debugLine="listOff.Add(\"cmnuMakeParent\")";
Debug.ShouldStop(8388608);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuMakeParent"))));
 BA.debugLineNum = 345;BA.debugLine="listOff.Add(\"cmnuListSiblings\")";
Debug.ShouldStop(16777216);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuListSiblings"))));
 BA.debugLineNum = 346;BA.debugLine="listOff.Add(\"cmnuListChildren\")";
Debug.ShouldStop(33554432);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuListChildren"))));
 BA.debugLineNum = 347;BA.debugLine="listOff.Add(\"cmnuListAntecedents\")";
Debug.ShouldStop(67108864);
_listoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cmnuListAntecedents"))));
 BA.debugLineNum = 348;BA.debugLine="listMainOff.Add(\"mmnuAddSubLevel\")";
Debug.ShouldStop(134217728);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuAddSubLevel"))));
 BA.debugLineNum = 349;BA.debugLine="listMainOff.Add(\"mmnuAddSibling\")";
Debug.ShouldStop(268435456);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuAddSibling"))));
 BA.debugLineNum = 350;BA.debugLine="listMainOff.Add(\"mmnuRemove\")";
Debug.ShouldStop(536870912);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuRemove"))));
 BA.debugLineNum = 351;BA.debugLine="listMainOff.Add(\"mmnuRelateTopic\")";
Debug.ShouldStop(1073741824);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuRelateTopic"))));
 BA.debugLineNum = 352;BA.debugLine="listMainOff.Add(\"mmnuRename\")";
Debug.ShouldStop(-2147483648);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuRename"))));
 BA.debugLineNum = 353;BA.debugLine="listMainOff.Add(\"mmnuMoveDown\")";
Debug.ShouldStop(1);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMoveDown"))));
 BA.debugLineNum = 354;BA.debugLine="listMainOff.Add(\"mmnuMoveUp\")";
Debug.ShouldStop(2);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMoveUp"))));
 BA.debugLineNum = 355;BA.debugLine="listMainOff.Add(\"mmnuMakeParent\")";
Debug.ShouldStop(4);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuMakeParent"))));
 BA.debugLineNum = 356;BA.debugLine="listMainOff.Add(\"mmnuListSiblings\")";
Debug.ShouldStop(8);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuListSiblings"))));
 BA.debugLineNum = 357;BA.debugLine="listMainOff.Add(\"mmnuListChildren\")";
Debug.ShouldStop(16);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuListChildren"))));
 BA.debugLineNum = 358;BA.debugLine="listMainOff.Add(\"mmnuListAntecedents\")";
Debug.ShouldStop(32);
_listmainoff.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("mmnuListAntecedents"))));
 };
 BA.debugLineNum = 360;BA.debugLine="For i = 0 To mapContextMenus.Size - 1";
Debug.ShouldStop(128);
{
final int step102 = 1;
final int limit102 = RemoteObject.solve(new RemoteObject[] {main._mapcontextmenus.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step102 > 0 && _i <= limit102) || (step102 < 0 && _i >= limit102); _i = ((int)(0 + _i + step102)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 362;BA.debugLine="For i2 = 0 To listOn.Size - 1";
Debug.ShouldStop(512);
{
final int step103 = 1;
final int limit103 = RemoteObject.solve(new RemoteObject[] {_liston.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i2 = 0 ; (step103 > 0 && _i2 <= limit103) || (step103 < 0 && _i2 >= limit103); _i2 = ((int)(0 + _i2 + step103)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 363;BA.debugLine="If mapContextMenus.GetKeyAt(i) = listOn.Get(i2)";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",main._mapcontextmenus.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))),_liston.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))) { 
 BA.debugLineNum = 364;BA.debugLine="Dim mi As MenuItem = mapContextMenus.Get(listO";
Debug.ShouldStop(2048);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_mi.setObject(main._mapcontextmenus.runMethod(false,"Get",(Object)(_liston.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))));Debug.locals.put("mi", _mi);
 BA.debugLineNum = 365;BA.debugLine="mi.Enabled = True";
Debug.ShouldStop(4096);
_mi.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 366;BA.debugLine="Exit";
Debug.ShouldStop(8192);
if (true) break;
 };
 }
}Debug.locals.put("i2", _i2);
;
 BA.debugLineNum = 370;BA.debugLine="For i2 = 0 To listOff.Size - 1";
Debug.ShouldStop(131072);
{
final int step110 = 1;
final int limit110 = RemoteObject.solve(new RemoteObject[] {_listoff.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i2 = 0 ; (step110 > 0 && _i2 <= limit110) || (step110 < 0 && _i2 >= limit110); _i2 = ((int)(0 + _i2 + step110)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 371;BA.debugLine="If mapContextMenus.GetKeyAt(i) = listOff.Get(i2";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main._mapcontextmenus.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))),_listoff.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))) { 
 BA.debugLineNum = 372;BA.debugLine="Dim mi As MenuItem = mapContextMenus.Get(listO";
Debug.ShouldStop(524288);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_mi.setObject(main._mapcontextmenus.runMethod(false,"Get",(Object)(_listoff.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))));Debug.locals.put("mi", _mi);
 BA.debugLineNum = 373;BA.debugLine="mi.Enabled = False";
Debug.ShouldStop(1048576);
_mi.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 374;BA.debugLine="Exit";
Debug.ShouldStop(2097152);
if (true) break;
 };
 }
}Debug.locals.put("i2", _i2);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 378;BA.debugLine="For i = 0 To mapMainMenus.Size - 1";
Debug.ShouldStop(33554432);
{
final int step118 = 1;
final int limit118 = RemoteObject.solve(new RemoteObject[] {main._mapmainmenus.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step118 > 0 && _i <= limit118) || (step118 < 0 && _i >= limit118); _i = ((int)(0 + _i + step118)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 380;BA.debugLine="For i2 = 0 To listOn.Size - 1";
Debug.ShouldStop(134217728);
{
final int step119 = 1;
final int limit119 = RemoteObject.solve(new RemoteObject[] {_liston.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i2 = 0 ; (step119 > 0 && _i2 <= limit119) || (step119 < 0 && _i2 >= limit119); _i2 = ((int)(0 + _i2 + step119)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 381;BA.debugLine="If mapMainMenus.GetKeyAt(i) = listMainOn.Get(i2";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",main._mapmainmenus.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))),_listmainon.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))) { 
 BA.debugLineNum = 382;BA.debugLine="Dim mi As MenuItem = mapMainMenus.Get(listMain";
Debug.ShouldStop(536870912);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_mi.setObject(main._mapmainmenus.runMethod(false,"Get",(Object)(_listmainon.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))));Debug.locals.put("mi", _mi);
 BA.debugLineNum = 383;BA.debugLine="mi.Enabled = True";
Debug.ShouldStop(1073741824);
_mi.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 384;BA.debugLine="Exit";
Debug.ShouldStop(-2147483648);
if (true) break;
 };
 }
}Debug.locals.put("i2", _i2);
;
 BA.debugLineNum = 388;BA.debugLine="For i2 = 0 To listOff.Size - 1";
Debug.ShouldStop(8);
{
final int step126 = 1;
final int limit126 = RemoteObject.solve(new RemoteObject[] {_listoff.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i2 = 0 ; (step126 > 0 && _i2 <= limit126) || (step126 < 0 && _i2 >= limit126); _i2 = ((int)(0 + _i2 + step126)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 389;BA.debugLine="If mapMainMenus.GetKeyAt(i) = listMainOff.Get(i";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main._mapmainmenus.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))),_listmainoff.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))) { 
 BA.debugLineNum = 390;BA.debugLine="Dim mi As MenuItem = mapMainMenus.Get(listMain";
Debug.ShouldStop(32);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_mi.setObject(main._mapmainmenus.runMethod(false,"Get",(Object)(_listmainoff.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))));Debug.locals.put("mi", _mi);
 BA.debugLineNum = 391;BA.debugLine="mi.Enabled = False";
Debug.ShouldStop(64);
_mi.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 392;BA.debugLine="Exit";
Debug.ShouldStop(128);
if (true) break;
 };
 }
}Debug.locals.put("i2", _i2);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _treeview1_mousepressed(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("TreeView1_MousePressed (main) ","main",0,main.ba,main.mostCurrent,659);
if (RapidSub.canDelegate("treeview1_mousepressed")) return main.remoteMe.runUserSub(false, "main","treeview1_mousepressed", _eventdata);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 659;BA.debugLine="Sub TreeView1_MousePressed (EventData As MouseEven";
Debug.ShouldStop(262144);
 BA.debugLineNum = 660;BA.debugLine="boolHandlingMouseClick = True";
Debug.ShouldStop(524288);
main._boolhandlingmouseclick = main.__c.getField(true,"True");
 BA.debugLineNum = 661;BA.debugLine="lastTreeItemSelected = Null";
Debug.ShouldStop(1048576);
main._lasttreeitemselected.setObject(main.__c.getField(false,"Null"));
 BA.debugLineNum = 662;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _treeview1_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("TreeView1_MouseReleased (main) ","main",0,main.ba,main.mostCurrent,664);
if (RapidSub.canDelegate("treeview1_mousereleased")) return main.remoteMe.runUserSub(false, "main","treeview1_mousereleased", _eventdata);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _target = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _mapstored = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 664;BA.debugLine="Sub TreeView1_MouseReleased (EventData As MouseEve";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 665;BA.debugLine="TreeContextAllOff";
Debug.ShouldStop(16777216);
_treecontextalloff();
 BA.debugLineNum = 666;BA.debugLine="taResults.Text = \"\"";
Debug.ShouldStop(33554432);
main._taresults.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 667;BA.debugLine="Dim jo As JavaObject = EventData";
Debug.ShouldStop(67108864);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_eventdata.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 668;BA.debugLine="Dim target As JavaObject = jo.RunMethodJO(\"get";
Debug.ShouldStop(134217728);
_target = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_target = _jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getTarget")),(Object)((main.__c.getField(false,"Null"))));Debug.locals.put("target", _target);Debug.locals.put("target", _target);
 BA.debugLineNum = 669;BA.debugLine="Do Until target Is TreeView";
Debug.ShouldStop(268435456);
while (!(RemoteObject.solveBoolean("i",_target.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.control.TreeView")))) {
 BA.debugLineNum = 670;BA.debugLine="If GetType(target) = \"com.sun.javafx.scene";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",main.__c.runMethod(true,"GetType",(Object)((_target.getObject()))),BA.ObjectToString("com.sun.javafx.scene.control.skin.TreeViewSkin$1"))) { 
 BA.debugLineNum = 671;BA.debugLine="lastTreeItemSelected = target.RunMetho";
Debug.ShouldStop(1073741824);
main._lasttreeitemselected.setObject(_target.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTreeItem")),(Object)((main.__c.getField(false,"Null")))));
 BA.debugLineNum = 672;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Th";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 673;BA.debugLine="TreeContextSet(lastTreeItemSelected)";
Debug.ShouldStop(1);
_treecontextset(main._lasttreeitemselected);
 BA.debugLineNum = 674;BA.debugLine="taResults.Text = \"MouseUp on node Name: \" & la";
Debug.ShouldStop(2);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("MouseUp on node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 BA.debugLineNum = 675;BA.debugLine="boolHandlingMouseClick = False";
Debug.ShouldStop(4);
main._boolhandlingmouseclick = main.__c.getField(true,"False");
 BA.debugLineNum = 676;BA.debugLine="txtField1.Text = \"\"";
Debug.ShouldStop(8);
main._txtfield1.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 677;BA.debugLine="txtField2.Text = \"\"";
Debug.ShouldStop(16);
main._txtfield2.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 678;BA.debugLine="txtField3.Text = \"\"";
Debug.ShouldStop(32);
main._txtfield3.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 679;BA.debugLine="If mapDataStore.ContainsKey(tvm.UniquNodeIdent";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main._mapdatastore.runMethod(true,"ContainsKey",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))))),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 680;BA.debugLine="taResults.Text = taResults.Text & CRLF & \"The";
Debug.ShouldStop(128);
main._taresults.runMethod(true,"setText",RemoteObject.concat(main._taresults.runMethod(true,"getText"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("The in-memory map has stored text field values for the selected item using tvm.UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 BA.debugLineNum = 681;BA.debugLine="Dim mapStored As Map";
Debug.ShouldStop(256);
_mapstored = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapStored", _mapstored);
 BA.debugLineNum = 682;BA.debugLine="mapStored.Initialize";
Debug.ShouldStop(512);
_mapstored.runVoidMethod ("Initialize");
 BA.debugLineNum = 683;BA.debugLine="mapStored = mapDataStore.Get(tvm.UniquNodeIde";
Debug.ShouldStop(1024);
_mapstored.setObject(main._mapdatastore.runMethod(false,"Get",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))))));
 BA.debugLineNum = 684;BA.debugLine="If mapStored.ContainsKey(\"txtField1\") = True";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_mapstored.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("txtField1")))),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 685;BA.debugLine="txtField1.Text = mapStored.Get(\"txtField1\")";
Debug.ShouldStop(4096);
main._txtfield1.runMethod(true,"setText",BA.ObjectToString(_mapstored.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("txtField1"))))));
 };
 BA.debugLineNum = 687;BA.debugLine="If mapStored.ContainsKey(\"txtField2\") = True";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_mapstored.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("txtField2")))),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 688;BA.debugLine="txtField2.Text = mapStored.Get(\"txtField2\")";
Debug.ShouldStop(32768);
main._txtfield2.runMethod(true,"setText",BA.ObjectToString(_mapstored.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("txtField2"))))));
 };
 BA.debugLineNum = 690;BA.debugLine="If mapStored.ContainsKey(\"txtField3\") = True";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_mapstored.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("txtField3")))),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 691;BA.debugLine="txtField3.Text = mapStored.Get(\"txtField3\")";
Debug.ShouldStop(262144);
main._txtfield3.runMethod(true,"setText",BA.ObjectToString(_mapstored.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("txtField3"))))));
 };
 };
 };
 BA.debugLineNum = 695;BA.debugLine="Exit";
Debug.ShouldStop(4194304);
if (true) break;
 };
 BA.debugLineNum = 697;BA.debugLine="Dim n As Node = target";
Debug.ShouldStop(16777216);
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
_n.setObject(_target.getObject());Debug.locals.put("n", _n);
 BA.debugLineNum = 698;BA.debugLine="target = n.Parent";
Debug.ShouldStop(33554432);
_target.setObject(_n.runMethod(false,"getParent").getObject());
 }
;
 BA.debugLineNum = 700;BA.debugLine="If taResults.Text = \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",main._taresults.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 701;BA.debugLine="taResults.Text = \"Root Focus\"";
Debug.ShouldStop(268435456);
main._taresults.runMethod(true,"setText",BA.ObjectToString("Root Focus"));
 };
 BA.debugLineNum = 703;BA.debugLine="boolHandlingMouseClick = False";
Debug.ShouldStop(1073741824);
main._boolhandlingmouseclick = main.__c.getField(true,"False");
 BA.debugLineNum = 704;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _treeview1_selecteditemchanged(RemoteObject _selecteditem) throws Exception{
try {
		Debug.PushSubsStack("TreeView1_SelectedItemChanged (main) ","main",0,main.ba,main.mostCurrent,402);
if (RapidSub.canDelegate("treeview1_selecteditemchanged")) return main.remoteMe.runUserSub(false, "main","treeview1_selecteditemchanged", _selecteditem);
Debug.locals.put("SelectedItem", _selecteditem);
 BA.debugLineNum = 402;BA.debugLine="Sub TreeView1_SelectedItemChanged(SelectedItem As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 403;BA.debugLine="If boolHandlingMouseClick = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main._boolhandlingmouseclick,main.__c.getField(true,"False"))) { 
 BA.debugLineNum = 404;BA.debugLine="If SelectedItem.IsInitialized = True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_selecteditem.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 405;BA.debugLine="lastTreeItemSelected = SelectedItem";
Debug.ShouldStop(1048576);
main._lasttreeitemselected = _selecteditem;
 BA.debugLineNum = 406;BA.debugLine="taResults.text = \"Focussed Node Name: \" & lastT";
Debug.ShouldStop(2097152);
main._taresults.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Focussed Node Name: "),main._lasttreeitemselected.runMethod(true,"getText"),RemoteObject.createImmutable("; Generation: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(main._lasttreeitemselected)),RemoteObject.createImmutable("; UniqueID: "),main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))));
 };
 };
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtfield1_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("txtField1_FocusChanged (main) ","main",0,main.ba,main.mostCurrent,776);
if (RapidSub.canDelegate("txtfield1_focuschanged")) return main.remoteMe.runUserSub(false, "main","txtfield1_focuschanged", _hasfocus);
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 776;BA.debugLine="Sub txtField1_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 777;BA.debugLine="If HasFocus = False Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_hasfocus,main.__c.getField(true,"False"))) { 
 BA.debugLineNum = 778;BA.debugLine="If lastTreeItemSelected <> Null Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("N",main._lasttreeitemselected)) { 
 BA.debugLineNum = 779;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Th";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 780;BA.debugLine="If txtField1.Text <> \"\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",main._txtfield1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 781;BA.debugLine="mapDataStore.Put(tvm.UniquNodeIdentifier(last";
Debug.ShouldStop(4096);
main._mapdatastore.runVoidMethod ("Put",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected)))),(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("txtField3")),(main._txtfield3.runMethod(true,"getText")),RemoteObject.createImmutable(("txtField2")),(main._txtfield2.runMethod(true,"getText")),RemoteObject.createImmutable(("txtField1")),(main._txtfield1.runMethod(true,"getText"))})).getObject())));
 }else {
 BA.debugLineNum = 783;BA.debugLine="If mapDataStore.ContainsKey(tvm.UniquNodeIden";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",main._mapdatastore.runMethod(true,"ContainsKey",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))))),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 784;BA.debugLine="If txtField3.Text <> \"\" Or txtField2.Text <>";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",main._txtfield3.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("!",main._txtfield2.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 785;BA.debugLine="mapDataStore.Put(tvm.UniquNodeIdentifier(la";
Debug.ShouldStop(65536);
main._mapdatastore.runVoidMethod ("Put",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected)))),(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("txtField3")),(main._txtfield3.runMethod(true,"getText")),RemoteObject.createImmutable(("txtField2")),(main._txtfield2.runMethod(true,"getText")),RemoteObject.createImmutable(("txtField1")),(main._txtfield1.runMethod(true,"getText"))})).getObject())));
 }else 
{ BA.debugLineNum = 786;BA.debugLine="else IF txtField3.Text = \"\" And txtField2.Te";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",main._txtfield3.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",main._txtfield2.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 787;BA.debugLine="mapDataStore.Remove(tvm.UniquNodeIdentifier";
Debug.ShouldStop(262144);
main._mapdatastore.runVoidMethod ("Remove",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected)))));
 }};
 };
 };
 };
 };
 };
 BA.debugLineNum = 794;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtfield2_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("txtField2_FocusChanged (main) ","main",0,main.ba,main.mostCurrent,756);
if (RapidSub.canDelegate("txtfield2_focuschanged")) return main.remoteMe.runUserSub(false, "main","txtfield2_focuschanged", _hasfocus);
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 756;BA.debugLine="Sub txtField2_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 757;BA.debugLine="If HasFocus = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_hasfocus,main.__c.getField(true,"False"))) { 
 BA.debugLineNum = 758;BA.debugLine="If lastTreeItemSelected <> Null Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("N",main._lasttreeitemselected)) { 
 BA.debugLineNum = 759;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Th";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 760;BA.debugLine="If txtField2.Text <> \"\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("!",main._txtfield2.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 761;BA.debugLine="mapDataStore.Put(tvm.UniquNodeIdentifier(last";
Debug.ShouldStop(16777216);
main._mapdatastore.runVoidMethod ("Put",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected)))),(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("txtField3")),(main._txtfield3.runMethod(true,"getText")),RemoteObject.createImmutable(("txtField2")),(main._txtfield2.runMethod(true,"getText")),RemoteObject.createImmutable(("txtField1")),(main._txtfield1.runMethod(true,"getText"))})).getObject())));
 }else {
 BA.debugLineNum = 763;BA.debugLine="If mapDataStore.ContainsKey(tvm.UniquNodeIden";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",main._mapdatastore.runMethod(true,"ContainsKey",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))))),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 764;BA.debugLine="If txtField1.Text <> \"\" Or txtField3.Text <>";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("!",main._txtfield1.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("!",main._txtfield3.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 765;BA.debugLine="mapDataStore.Put(tvm.UniquNodeIdentifier(la";
Debug.ShouldStop(268435456);
main._mapdatastore.runVoidMethod ("Put",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected)))),(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("txtField3")),(main._txtfield3.runMethod(true,"getText")),RemoteObject.createImmutable(("txtField2")),(main._txtfield2.runMethod(true,"getText")),RemoteObject.createImmutable(("txtField1")),(main._txtfield1.runMethod(true,"getText"))})).getObject())));
 }else 
{ BA.debugLineNum = 766;BA.debugLine="Else IF txtField1.Text = \"\" And txtField3.Te";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",main._txtfield1.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",main._txtfield3.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 767;BA.debugLine="mapDataStore.Remove(tvm.UniquNodeIdentifier";
Debug.ShouldStop(1073741824);
main._mapdatastore.runVoidMethod ("Remove",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected)))));
 }};
 };
 };
 };
 };
 };
 BA.debugLineNum = 774;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtfield3_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("txtField3_FocusChanged (main) ","main",0,main.ba,main.mostCurrent,736);
if (RapidSub.canDelegate("txtfield3_focuschanged")) return main.remoteMe.runUserSub(false, "main","txtfield3_focuschanged", _hasfocus);
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 736;BA.debugLine="Sub txtField3_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 737;BA.debugLine="If HasFocus = False Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_hasfocus,main.__c.getField(true,"False"))) { 
 BA.debugLineNum = 738;BA.debugLine="If lastTreeItemSelected <> Null Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("N",main._lasttreeitemselected)) { 
 BA.debugLineNum = 739;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Th";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",main._lasttreeitemselected.runMethod(true,"IsInitialized"),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 740;BA.debugLine="If txtField3.Text <> \"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("!",main._txtfield3.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 741;BA.debugLine="mapDataStore.Put(tvm.UniquNodeIdentifier(last";
Debug.ShouldStop(16);
main._mapdatastore.runVoidMethod ("Put",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected)))),(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("txtField3")),(main._txtfield3.runMethod(true,"getText")),RemoteObject.createImmutable(("txtField2")),(main._txtfield2.runMethod(true,"getText")),RemoteObject.createImmutable(("txtField1")),(main._txtfield1.runMethod(true,"getText"))})).getObject())));
 }else {
 BA.debugLineNum = 743;BA.debugLine="If mapDataStore.ContainsKey(tvm.UniquNodeIden";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main._mapdatastore.runMethod(true,"ContainsKey",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected))))),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 744;BA.debugLine="If txtField1.Text <> \"\" Or txtField2.Text <>";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",main._txtfield1.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("!",main._txtfield2.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 745;BA.debugLine="mapDataStore.Put(tvm.UniquNodeIdentifier(la";
Debug.ShouldStop(256);
main._mapdatastore.runVoidMethod ("Put",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected)))),(Object)((main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("txtField3")),(main._txtfield3.runMethod(true,"getText")),RemoteObject.createImmutable(("txtField2")),(main._txtfield2.runMethod(true,"getText")),RemoteObject.createImmutable(("txtField1")),(main._txtfield1.runMethod(true,"getText"))})).getObject())));
 }else 
{ BA.debugLineNum = 746;BA.debugLine="else IF txtField1.Text = \"\" And txtField2.Te";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",main._txtfield1.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",main._txtfield2.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 747;BA.debugLine="mapDataStore.Remove(tvm.UniquNodeIdentifier";
Debug.ShouldStop(1024);
main._mapdatastore.runVoidMethod ("Remove",(Object)((main._tvm.runClassMethod (b4j.example.treeviewmanager.class, "_uniqunodeidentifier",(Object)(main._lasttreeitemselected)))));
 }};
 };
 };
 };
 };
 };
 BA.debugLineNum = 754;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}