package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            BA.Log("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 800, 595);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.TreeViewWrapper _treeview1 = null;
public static b4j.example.dialogs8 _dialogue8 = null;
public static boolean _boolhandlingmouseclick = false;
public static anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _lasttreeitemselected = null;
public static b4j.example.treeviewmanager _tvm = null;
public static anywheresoftware.b4a.objects.collections.Map _mapcontextmenus = null;
public static anywheresoftware.b4a.objects.collections.Map _mapmainmenus = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _taresults = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btntoxml = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btntojson = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfield1 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfield2 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfield3 = null;
public static anywheresoftware.b4a.objects.collections.Map _mapdatastore = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _book_closed = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _book_open = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart"))
	return (String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args});
anywheresoftware.b4j.agraham.reflection.Reflection _r = null;
boolean _debug = false;
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.SetFormStyle(\"UNIFIED\")";
_mainform.SetFormStyle("UNIFIED");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.RootPane.LoadLayout(\"main_form\") 'Load t";
_mainform.getRootPane().LoadLayout(ba,"main_form");
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="tvm.Initialize(TreeView1)";
_tvm._initialize(null,ba,_treeview1);
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="dialogue8.Initialize";
_dialogue8._initialize(ba);
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="mapDataStore.Initialize";
_mapdatastore.Initialize();
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="book_closed.Initialize(File.DirAssets,\"book.png\")";
_book_closed.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"book.png");
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="book_open.Initialize(File.DirAssets,\"book_open.pn";
_book_open.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"book_open.png");
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="BuildTree_Option4 ' Four Levels";
_buildtree_option4();
RDebugUtils.currentLine=65555;
 //BA.debugLineNum = 65555;BA.debugLine="mapContextMenus.Initialize";
_mapcontextmenus.Initialize();
RDebugUtils.currentLine=65556;
 //BA.debugLineNum = 65556;BA.debugLine="CollectContextMenuItems(mapContextMenus, TreeView";
_collectcontextmenuitems(_mapcontextmenus,_treeview1.getContextMenu().getMenuItems());
RDebugUtils.currentLine=65557;
 //BA.debugLineNum = 65557;BA.debugLine="mapMainMenus.Initialize";
_mapmainmenus.Initialize();
RDebugUtils.currentLine=65558;
 //BA.debugLineNum = 65558;BA.debugLine="CollectMenuItems(mapMainMenus, MenuBar1.Menus)";
_collectmenuitems(_mapmainmenus,_menubar1.getMenus());
RDebugUtils.currentLine=65561;
 //BA.debugLineNum = 65561;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=65562;
 //BA.debugLineNum = 65562;BA.debugLine="Dim debug As Boolean = r.GetStaticField(\"anywh";
_debug = BA.ObjectToBoolean(_r.GetStaticField("anywheresoftware.b4a.BA","debugMode"));
RDebugUtils.currentLine=65563;
 //BA.debugLineNum = 65563;BA.debugLine="Log(debug)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_debug));
RDebugUtils.currentLine=65565;
 //BA.debugLineNum = 65565;BA.debugLine="End Sub";
return "";
}
public static String  _buildtree_option4() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "buildtree_option4"))
	return (String) Debug.delegate(ba, "buildtree_option4", null);
int _i = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti = null;
int _i2 = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _cti = null;
int _i3 = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _gcti = null;
int _i4 = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ggcti = null;
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub BuildTree_Option4";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="For i = 1 To 10";
{
final int step1 = 1;
final int limit1 = (int) (10);
for (_i = (int) (1) ; (step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1); _i = ((int)(0 + _i + step1)) ) {
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Dim ti As TreeItem";
_ti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="ti.Initialize(\"ti\", \"Item #\" & i)";
_ti.Initialize(ba,"ti","Item #"+BA.NumberToString(_i));
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="For i2 = 1 To 5";
{
final int step4 = 1;
final int limit4 = (int) (5);
for (_i2 = (int) (1) ; (step4 > 0 && _i2 <= limit4) || (step4 < 0 && _i2 >= limit4); _i2 = ((int)(0 + _i2 + step4)) ) {
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="Dim cti As TreeItem";
_cti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="cti.Initialize(\"ti\", \"Child #\" & i2)";
_cti.Initialize(ba,"ti","Child #"+BA.NumberToString(_i2));
RDebugUtils.currentLine=262155;
 //BA.debugLineNum = 262155;BA.debugLine="For i3 = 1 To 4";
{
final int step7 = 1;
final int limit7 = (int) (4);
for (_i3 = (int) (1) ; (step7 > 0 && _i3 <= limit7) || (step7 < 0 && _i3 >= limit7); _i3 = ((int)(0 + _i3 + step7)) ) {
RDebugUtils.currentLine=262157;
 //BA.debugLineNum = 262157;BA.debugLine="Dim gcti As TreeItem";
_gcti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=262159;
 //BA.debugLineNum = 262159;BA.debugLine="gcti.Initialize(\"ti\", \"Grandhild Item #\" &";
_gcti.Initialize(ba,"ti","Grandhild Item #"+BA.NumberToString(_i3));
RDebugUtils.currentLine=262160;
 //BA.debugLineNum = 262160;BA.debugLine="For i4 = 1 To 3";
{
final int step10 = 1;
final int limit10 = (int) (3);
for (_i4 = (int) (1) ; (step10 > 0 && _i4 <= limit10) || (step10 < 0 && _i4 >= limit10); _i4 = ((int)(0 + _i4 + step10)) ) {
RDebugUtils.currentLine=262162;
 //BA.debugLineNum = 262162;BA.debugLine="Dim ggcti As TreeItem";
_ggcti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=262164;
 //BA.debugLineNum = 262164;BA.debugLine="ggcti.Initialize(\"ti\", \"Great Grandchild i";
_ggcti.Initialize(ba,"ti","Great Grandchild is Item #"+BA.NumberToString(_i4));
RDebugUtils.currentLine=262166;
 //BA.debugLineNum = 262166;BA.debugLine="gcti.Children.Add(ggcti) 'add the child";
_gcti.getChildren().Add((Object)(_ggcti.getObject()));
 }
};
RDebugUtils.currentLine=262169;
 //BA.debugLineNum = 262169;BA.debugLine="cti.Children.Add(gcti) 'add the child";
_cti.getChildren().Add((Object)(_gcti.getObject()));
 }
};
RDebugUtils.currentLine=262172;
 //BA.debugLineNum = 262172;BA.debugLine="ti.Children.Add(cti) 'add the child";
_ti.getChildren().Add((Object)(_cti.getObject()));
 }
};
RDebugUtils.currentLine=262175;
 //BA.debugLineNum = 262175;BA.debugLine="TreeView1.Root.Children.Add(ti) 'add the fath";
_treeview1.getRoot().getChildren().Add((Object)(_ti.getObject()));
 }
};
RDebugUtils.currentLine=262177;
 //BA.debugLineNum = 262177;BA.debugLine="End Sub";
return "";
}
public static String  _collectcontextmenuitems(anywheresoftware.b4a.objects.collections.Map _contextmenus,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "collectcontextmenuitems"))
	return (String) Debug.delegate(ba, "collectcontextmenuitems", new Object[] {_contextmenus,_items});
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper _mn = null;
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub CollectContextMenuItems(ContextMenus A";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="For Each mi As MenuItem In Items";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize();
for (int index1 = 0;index1 < groupLen1 ;index1++){
_mi.setObject((javafx.scene.control.MenuItem)(group1.Get(index1)));
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="If mi.Tag <> Null And mi.Tag <> \"\" Then Conte";
if (_mi.getTag()!= null && (_mi.getTag()).equals((Object)("")) == false) { 
_contextmenus.Put(_mi.getTag(),(Object)(_mi.getObject()));};
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="If mi Is Menu Then";
if (_mi.getObjectOrNull() instanceof javafx.scene.control.Menu) { 
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Dim mn As Menu = mi";
_mn = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper();
_mn.setObject((javafx.scene.control.Menu)(_mi.getObject()));
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="CollectContextMenuItems(ContextMenus, mn.Me";
_collectcontextmenuitems(_contextmenus,_mn.getMenuItems());
 };
 }
;
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="End Sub";
return "";
}
public static String  _collectmenuitems(anywheresoftware.b4a.objects.collections.Map _menus,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "collectmenuitems"))
	return (String) Debug.delegate(ba, "collectmenuitems", new Object[] {_menus,_items});
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper _mn = null;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub CollectMenuItems(Menus As Map, Items A";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="For Each mi As MenuItem In Items";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize();
for (int index1 = 0;index1 < groupLen1 ;index1++){
_mi.setObject((javafx.scene.control.MenuItem)(group1.Get(index1)));
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="If mi.Tag <> Null And mi.Tag <> \"\" Then Menus";
if (_mi.getTag()!= null && (_mi.getTag()).equals((Object)("")) == false) { 
_menus.Put(_mi.getTag(),(Object)(_mi.getObject()));};
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="If mi Is Menu Then";
if (_mi.getObjectOrNull() instanceof javafx.scene.control.Menu) { 
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Dim mn As Menu = mi";
_mn = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper();
_mn.setObject((javafx.scene.control.Menu)(_mi.getObject()));
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="CollectMenuItems(Menus, mn.MenuItems)";
_collectmenuitems(_menus,_mn.getMenuItems());
 };
 }
;
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="End Sub";
return "";
}
public static String  _btntojson_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btntojson_action"))
	return (String) Debug.delegate(ba, "btntojson_action", null);
String _strfromjson = "";
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub btnToJson_Action";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim strFromJSON As String = tvm.ToJSON(TreeView1)";
_strfromjson = _tvm._tojson(null,_treeview1);
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="File.WriteString(File.DirApp, \"treeview_json.txt\"";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"treeview_json.txt",_strfromjson);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="If strFromJSON <> \"\" Then";
if ((_strfromjson).equals("") == false) { 
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="taResults.Text = strFromJSON";
_taresults.setText(_strfromjson);
 }else {
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="taResults.Text = \"JSON string was empty\"";
_taresults.setText("JSON string was empty");
 };
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="fx.ShowExternalDocument(File.GetUri(File.DirAp";
_fx.ShowExternalDocument(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"treeview_json.txt"));
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="End Sub";
return "";
}
public static String  _btntoxml_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btntoxml_action"))
	return (String) Debug.delegate(ba, "btntoxml_action", null);
String _strfromxml = "";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub btnToXML_Action";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim strFromXML As String = tvm.ToXML(TreeView1)";
_strfromxml = _tvm._toxml(null,_treeview1);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="File.WriteString(File.DirApp, \"treeview_xml.xml\",";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"treeview_xml.xml",_strfromxml);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="If strFromXML <> \"\" Then";
if ((_strfromxml).equals("") == false) { 
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="taResults.Text = strFromXML";
_taresults.setText(_strfromxml);
 }else {
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="taResults.Text = \"XML string was empty\"";
_taresults.setText("XML string was empty");
 };
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="fx.ShowExternalDocument(File.GetUri(File.DirAp";
_fx.ShowExternalDocument(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"treeview_xml.xml"));
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="End Sub";
return "";
}
public static String  _buildtree_option2() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "buildtree_option2"))
	return (String) Debug.delegate(ba, "buildtree_option2", null);
int _i = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti = null;
int _i2 = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _cti = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub BuildTree_Option2";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="For i = 1 To 3";
{
final int step1 = 1;
final int limit1 = (int) (3);
for (_i = (int) (1) ; (step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1); _i = ((int)(0 + _i + step1)) ) {
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="Dim ti As TreeItem";
_ti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="ti.Initialize(\"ti\", \"Item #\" & i)";
_ti.Initialize(ba,"ti","Item #"+BA.NumberToString(_i));
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="For i2 = 1 To 10";
{
final int step4 = 1;
final int limit4 = (int) (10);
for (_i2 = (int) (1) ; (step4 > 0 && _i2 <= limit4) || (step4 < 0 && _i2 >= limit4); _i2 = ((int)(0 + _i2 + step4)) ) {
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="Dim cti As TreeItem";
_cti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="cti.Initialize(\"ti\", \"My father is Item #\" &";
_cti.Initialize(ba,"ti","My father is Item #"+BA.NumberToString(_i));
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="ti.Children.Add(cti) 'add the child";
_ti.getChildren().Add((Object)(_cti.getObject()));
 }
};
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="TreeView1.Root.Children.Add(ti) 'add the fath";
_treeview1.getRoot().getChildren().Add((Object)(_ti.getObject()));
 }
};
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="End Sub";
return "";
}
public static String  _buildtree_option3() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "buildtree_option3"))
	return (String) Debug.delegate(ba, "buildtree_option3", null);
int _i = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti = null;
int _i2 = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _cti = null;
int _i3 = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _gcti = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub BuildTree_Option3";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="For i = 1 To 10";
{
final int step1 = 1;
final int limit1 = (int) (10);
for (_i = (int) (1) ; (step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1); _i = ((int)(0 + _i + step1)) ) {
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Dim ti As TreeItem";
_ti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="ti.Initialize(\"ti\", \"Item #\" & i)";
_ti.Initialize(ba,"ti","Item #"+BA.NumberToString(_i));
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="For i2 = 1 To 10";
{
final int step4 = 1;
final int limit4 = (int) (10);
for (_i2 = (int) (1) ; (step4 > 0 && _i2 <= limit4) || (step4 < 0 && _i2 >= limit4); _i2 = ((int)(0 + _i2 + step4)) ) {
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="Dim cti As TreeItem";
_cti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="cti.Initialize(\"ti\", \"My father is Item #\" &";
_cti.Initialize(ba,"ti","My father is Item #"+BA.NumberToString(_i));
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="For i3 = 1 To 5";
{
final int step7 = 1;
final int limit7 = (int) (5);
for (_i3 = (int) (1) ; (step7 > 0 && _i3 <= limit7) || (step7 < 0 && _i3 >= limit7); _i3 = ((int)(0 + _i3 + step7)) ) {
RDebugUtils.currentLine=196621;
 //BA.debugLineNum = 196621;BA.debugLine="Dim gcti As TreeItem";
_gcti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="gcti.Initialize(\"ti\", \"My grand-father is I";
_gcti.Initialize(ba,"ti","My grand-father is Item #"+BA.NumberToString(_i));
RDebugUtils.currentLine=196625;
 //BA.debugLineNum = 196625;BA.debugLine="cti.Children.Add(gcti) 'add the child";
_cti.getChildren().Add((Object)(_gcti.getObject()));
 }
};
RDebugUtils.currentLine=196628;
 //BA.debugLineNum = 196628;BA.debugLine="ti.Children.Add(cti) 'add the child";
_ti.getChildren().Add((Object)(_cti.getObject()));
 }
};
RDebugUtils.currentLine=196631;
 //BA.debugLineNum = 196631;BA.debugLine="TreeView1.Root.Children.Add(ti) 'add the fath";
_treeview1.getRoot().getChildren().Add((Object)(_ti.getObject()));
 }
};
RDebugUtils.currentLine=196633;
 //BA.debugLineNum = 196633;BA.debugLine="End Sub";
return "";
}
public static String  _buildtree_option5() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "buildtree_option5"))
	return (String) Debug.delegate(ba, "buildtree_option5", null);
int _i = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti = null;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub BuildTree_Option5";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="For i = 1 To 10";
{
final int step1 = 1;
final int limit1 = (int) (10);
for (_i = (int) (1) ; (step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1); _i = ((int)(0 + _i + step1)) ) {
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Dim ti As TreeItem";
_ti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="ti.Initialize(\"ti\", \"Item #\" & i)";
_ti.Initialize(ba,"ti","Item #"+BA.NumberToString(_i));
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="TreeView1.Root.Children.Add(ti) 'add the fath";
_treeview1.getRoot().getChildren().Add((Object)(_ti.getObject()));
 }
};
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="End Sub";
return "";
}
public static String  _buildtree_option6() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "buildtree_option6"))
	return (String) Debug.delegate(ba, "buildtree_option6", null);
int _i = 0;
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub BuildTree_Option6";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="For i = 1 To 10";
{
final int step1 = 1;
final int limit1 = (int) (10);
for (_i = (int) (1) ; (step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1); _i = ((int)(0 + _i + step1)) ) {
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="tvm.AddRoot(TreeView1, \"Item #\" & i)";
_tvm._addroot(null,_treeview1,"Item #"+BA.NumberToString(_i));
 }
};
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="End Sub";
return "";
}
public static String  _cmenuaddsibling_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenuaddsibling_action"))
	return (String) Debug.delegate(ba, "cmenuaddsibling_action", null);
String _strnewname = "";
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub cmenuAddSibling_Action";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="taResults.Text = \"Adding same level sibling\"";
_taresults.setText("Adding same level sibling");
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="Dim strNewName As String";
_strnewname = "";
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="strNewName = dialogue8.TextInputDialog(\"Topic Li";
_strnewname = _dialogue8._textinputdialog("Topic List Management","New Topic","Enter topic name:","");
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="If strNewName <> \"\" Then";
if ((_strnewname).equals("") == false) { 
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="tvm.AddSibling(lastTreeItemSelected, strNewName";
_tvm._addsibling(null,_lasttreeitemselected,_strnewname);
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="taResults.Text = \"Adding New Node Name: \" & str";
_taresults.setText("Adding New Node Name: "+_strnewname);
 };
 }else {
RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="taResults.Text = \"Adding root item\"";
_taresults.setText("Adding root item");
RDebugUtils.currentLine=6488075;
 //BA.debugLineNum = 6488075;BA.debugLine="Dim strNewName As String";
_strnewname = "";
RDebugUtils.currentLine=6488076;
 //BA.debugLineNum = 6488076;BA.debugLine="strNewName = dialogue8.TextInputDialog(\"Topic Li";
_strnewname = _dialogue8._textinputdialog("Topic List Management","New Root Topic","Enter root topic name:","");
RDebugUtils.currentLine=6488077;
 //BA.debugLineNum = 6488077;BA.debugLine="If strNewName <> \"\" Then";
if ((_strnewname).equals("") == false) { 
RDebugUtils.currentLine=6488078;
 //BA.debugLineNum = 6488078;BA.debugLine="lastTreeItemSelected = tvm.AddRoot(TreeView1, s";
_lasttreeitemselected = _tvm._addroot(null,_treeview1,_strnewname);
RDebugUtils.currentLine=6488079;
 //BA.debugLineNum = 6488079;BA.debugLine="taResults.Text = \"Adding New Node Name: \" & str";
_taresults.setText("Adding New Node Name: "+_strnewname);
 };
 };
RDebugUtils.currentLine=6488082;
 //BA.debugLineNum = 6488082;BA.debugLine="End Sub";
return "";
}
public static String  _cmenuaddsublevel_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenuaddsublevel_action"))
	return (String) Debug.delegate(ba, "cmenuaddsublevel_action", null);
String _strnewname = "";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub cmenuAddSubLevel_Action";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="taResults.Text = \"New child is being added to th";
_taresults.setText("New child is being added to the selected node "+_lasttreeitemselected.getText());
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Selected node Name: "+_lasttreeitemselected.getText()+"; Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+"; UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Dim strNewName As String";
_strnewname = "";
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="strNewName = dialogue8.TextInputDialog(\"Topic Li";
_strnewname = _dialogue8._textinputdialog("Topic List Management","New Topic","Enter topic name:","");
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="If strNewName <> \"\" Then";
if ((_strnewname).equals("") == false) { 
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="tvm.AddChild(lastTreeItemSelected, strNewName)";
_tvm._addchild(null,_lasttreeitemselected,_strnewname);
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="taResults.Text = taResults.Text & CRLF & \"Child";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+"Child name "+_strnewname+" has been added.");
 };
 };
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="End Sub";
return "";
}
public static String  _cmenudrop_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenudrop_action"))
	return (String) Debug.delegate(ba, "cmenudrop_action", null);
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub cmenuDrop_Action";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="taResults.text = \"The node \" & lastTreeItemSelect";
_taresults.setText("The node "+_lasttreeitemselected.getText()+" has been moved to a new location.");
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="tvm.Drop(lastTreeItemSelected)";
_tvm._drop(null,_lasttreeitemselected);
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="End Sub";
return "";
}
public static String  _cmenuedit_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenuedit_action"))
	return (String) Debug.delegate(ba, "cmenuedit_action", null);
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub cmenuEdit_Action";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Selected node Name: "+_lasttreeitemselected.getText()+"; Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+"; UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
 };
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="End Sub";
return "";
}
public static String  _cmenulistantecedents_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenulistantecedents_action"))
	return (String) Debug.delegate(ba, "cmenulistantecedents_action", null);
anywheresoftware.b4a.objects.collections.List _listshownames = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.List _listshownodes = null;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub cmenuListAntecedents_Action";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="taResults.Text = \"Antecedent's Names:\" & CRLF";
_taresults.setText("Antecedent's Names:"+anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Dim listShowNames As List";
_listshownames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="listShowNames.Initialize";
_listshownames.Initialize();
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="listShowNames.AddAll(tvm.ListAntecedentNames(las";
_listshownames.AddAll(_tvm._listantecedentnames(null,_lasttreeitemselected));
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="If listShowNames.Size > 0 Then";
if (_listshownames.getSize()>0) { 
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="For i = 0 To listShowNames.Size -1";
{
final int step7 = 1;
final int limit7 = (int) (_listshownames.getSize()-1);
for (_i = (int) (0) ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="taResults.Text = taResults.Text & listShowName";
_taresults.setText(_taresults.getText()+BA.ObjectToString(_listshownames.Get(_i))+"; ");
 }
};
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Antecedent's Nodes:"+anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="Dim listShowNodes As List";
_listshownodes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="listShowNodes.Initialize";
_listshownodes.Initialize();
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="listShowNodes.AddAll(tvm.ListAntecedentNodes(la";
_listshownodes.AddAll(_tvm._listantecedentnodes(null,_lasttreeitemselected));
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="For i = 0 To listShowNodes.Size -1";
{
final int step14 = 1;
final int limit14 = (int) (_listshownodes.getSize()-1);
for (_i = (int) (0) ; (step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14); _i = ((int)(0 + _i + step14)) ) {
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="taResults.Text = taResults.Text & listShowNode";
_taresults.setText(_taresults.getText()+BA.ObjectToString(_listshownodes.Get(_i))+"; ");
 }
};
 }else {
RDebugUtils.currentLine=1507346;
 //BA.debugLineNum = 1507346;BA.debugLine="taResults.Text = taResults.Text & \"The selected";
_taresults.setText(_taresults.getText()+"The selected node is root.");
 };
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Selected node Name: "+_lasttreeitemselected.getText()+"; Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+"; UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
 };
RDebugUtils.currentLine=1507350;
 //BA.debugLineNum = 1507350;BA.debugLine="End Sub";
return "";
}
public static String  _cmenulistchildren_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenulistchildren_action"))
	return (String) Debug.delegate(ba, "cmenulistchildren_action", null);
anywheresoftware.b4a.objects.collections.List _listshownames = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.List _listshownodes = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub cmenuListChildren_Action";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="taResults.Text = \"Children's Names:\" & CRLF";
_taresults.setText("Children's Names:"+anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Dim listShowNames As List";
_listshownames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="listShowNames.Initialize";
_listshownames.Initialize();
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="listShowNames.AddAll(tvm.ListChildrenNames(lastT";
_listshownames.AddAll(_tvm._listchildrennames(null,_lasttreeitemselected));
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="If listShowNames.Size > 0 Then";
if (_listshownames.getSize()>0) { 
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="For i = 0 To listShowNames.Size -1";
{
final int step7 = 1;
final int limit7 = (int) (_listshownames.getSize()-1);
for (_i = (int) (0) ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="taResults.Text = taResults.Text & listShowName";
_taresults.setText(_taresults.getText()+BA.ObjectToString(_listshownames.Get(_i))+"; ");
 }
};
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Children's Nodes:"+anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="Dim listShowNodes As List";
_listshownodes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="listShowNodes.Initialize";
_listshownodes.Initialize();
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="listShowNodes.AddAll(tvm.ListChildrenNodes(last";
_listshownodes.AddAll(_tvm._listchildrennodes(null,_lasttreeitemselected));
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="For i = 0 To listShowNodes.Size -1";
{
final int step14 = 1;
final int limit14 = (int) (_listshownodes.getSize()-1);
for (_i = (int) (0) ; (step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14); _i = ((int)(0 + _i + step14)) ) {
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="taResults.Text = taResults.Text & listShowNode";
_taresults.setText(_taresults.getText()+BA.ObjectToString(_listshownodes.Get(_i))+"; ");
 }
};
 }else {
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="taResults.Text = taResults.Text & \"The selected";
_taresults.setText(_taresults.getText()+"The selected node has no children.");
 };
RDebugUtils.currentLine=1376276;
 //BA.debugLineNum = 1376276;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Selected node Name: "+_lasttreeitemselected.getText()+"; Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+"; UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
 };
RDebugUtils.currentLine=1376278;
 //BA.debugLineNum = 1376278;BA.debugLine="End Sub";
return "";
}
public static String  _cmenulistsiblings_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenulistsiblings_action"))
	return (String) Debug.delegate(ba, "cmenulistsiblings_action", null);
anywheresoftware.b4a.objects.collections.List _listshownames = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.List _listshownodes = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub cmenuListSiblings_Action";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="taResults.Text = \"Sibling's Names:\" & CRLF";
_taresults.setText("Sibling's Names:"+anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Dim listShowNames As List";
_listshownames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="listShowNames.Initialize";
_listshownames.Initialize();
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="listShowNames.AddAll(tvm.ListSiblingNames(lastTr";
_listshownames.AddAll(_tvm._listsiblingnames(null,_lasttreeitemselected));
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="If listShowNames.Size > 0 Then";
if (_listshownames.getSize()>0) { 
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="For i = 0 To listShowNames.Size -1";
{
final int step7 = 1;
final int limit7 = (int) (_listshownames.getSize()-1);
for (_i = (int) (0) ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="taResults.Text = taResults.Text & listShowName";
_taresults.setText(_taresults.getText()+BA.ObjectToString(_listshownames.Get(_i))+"; ");
 }
};
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Sibling's Nodes:"+anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="Dim listShowNodes As List";
_listshownodes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="listShowNodes.Initialize";
_listshownodes.Initialize();
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="listShowNodes.AddAll(tvm.ListSiblingNodes(lastT";
_listshownodes.AddAll(_tvm._listsiblingnodes(null,_lasttreeitemselected));
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="For i = 0 To listShowNodes.Size -1";
{
final int step14 = 1;
final int limit14 = (int) (_listshownodes.getSize()-1);
for (_i = (int) (0) ; (step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14); _i = ((int)(0 + _i + step14)) ) {
RDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="taResults.Text = taResults.Text & listShowNode";
_taresults.setText(_taresults.getText()+BA.ObjectToString(_listshownodes.Get(_i))+"; ");
 }
};
 }else {
RDebugUtils.currentLine=1441810;
 //BA.debugLineNum = 1441810;BA.debugLine="taResults.Text = taResults.Text & \"The selected";
_taresults.setText(_taresults.getText()+"The selected node has no siblings.");
 };
RDebugUtils.currentLine=1441812;
 //BA.debugLineNum = 1441812;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Selected node Name: "+_lasttreeitemselected.getText()+"; Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+"; UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
 };
RDebugUtils.currentLine=1441814;
 //BA.debugLineNum = 1441814;BA.debugLine="End Sub";
return "";
}
public static String  _cmenumakeparent_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenumakeparent_action"))
	return (String) Debug.delegate(ba, "cmenumakeparent_action", null);
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub cmenuMakeParent_Action";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="taResults.Text = \"Moving the node \" & lastTreeIt";
_taresults.setText("Moving the node "+_lasttreeitemselected.getText()+" to the parent level (left).");
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Selected node Name: "+_lasttreeitemselected.getText()+"; Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+"; UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="tvm.MakeParent(lastTreeItemSelected)";
_tvm._makeparent(null,_lasttreeitemselected);
 };
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="End Sub";
return "";
}
public static String  _cmenumovedown_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenumovedown_action"))
	return (String) Debug.delegate(ba, "cmenumovedown_action", null);
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub cmenuMoveDown_Action";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="taResults.Text = \"Moving node named \" & lastTree";
_taresults.setText("Moving node named "+_lasttreeitemselected.getText()+" down one level in the list the parents children.");
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Selected node Name: "+_lasttreeitemselected.getText()+"; Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+"; UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="tvm.MoveDown(lastTreeItemSelected)";
_tvm._movedown(null,_lasttreeitemselected);
 };
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="End Sub";
return "";
}
public static String  _cmenumoveup_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenumoveup_action"))
	return (String) Debug.delegate(ba, "cmenumoveup_action", null);
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub cmenuMoveUp_Action";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="taResults.Text = \"Moving node named \" & lastTree";
_taresults.setText("Moving node named "+_lasttreeitemselected.getText()+" up one level in the list the parents children.");
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Selected node Name: "+_lasttreeitemselected.getText()+"; Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+"; UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="tvm.MoveUp(lastTreeItemSelected)";
_tvm._moveup(null,_lasttreeitemselected);
 };
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="End Sub";
return "";
}
public static String  _cmenupickup_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenupickup_action"))
	return (String) Debug.delegate(ba, "cmenupickup_action", null);
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub cmenuPickup_Action";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="taResults.Text = \"\"";
_taresults.setText("");
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="tvm.Pickup(lastTreeItemSelected)";
_tvm._pickup(null,_lasttreeitemselected);
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="taResults.text = \"The node \" & lastTreeItemSelect";
_taresults.setText("The node "+_lasttreeitemselected.getText()+" has been marked for movement to a new location.");
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF & \"";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Node Name: "+_lasttreeitemselected.getText()+"; Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+"; UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected)+"; IsSibling: ");
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="End Sub";
return "";
}
public static String  _cmenurelatetopic_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenurelatetopic_action"))
	return (String) Debug.delegate(ba, "cmenurelatetopic_action", null);
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub cmenuRelateTopic_Action";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="taResults.Text = \"\"";
_taresults.setText("");
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Selected node Name: "+_lasttreeitemselected.getText()+"; Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+"; UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
 };
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="End Sub";
return "";
}
public static String  _cmenuremove_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenuremove_action"))
	return (String) Debug.delegate(ba, "cmenuremove_action", null);
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub cmenuRemove_Action";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="taResults.Text = \"Selected to remove the node na";
_taresults.setText("Selected to remove the node named "+_lasttreeitemselected.getText());
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Selected node Name: "+_lasttreeitemselected.getText()+"; Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+"; UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="If dialogue8.ConfirmationDialog(\"Topic List Mana";
if (_dialogue8._confirmationdialog("Topic List Management","Remove Topic","Confirm you want to delete this item.")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="tvm.Remove(lastTreeItemSelected)";
_tvm._remove(null,_lasttreeitemselected);
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="taResults.Text = taResults.Text & CRLF & \"Node";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+"Node removed.");
 };
 };
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="End Sub";
return "";
}
public static String  _cmenurename_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenurename_action"))
	return (String) Debug.delegate(ba, "cmenurename_action", null);
String _strnewname = "";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub cmenuRename_Action";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="taResults.Text = \"\"";
_taresults.setText("");
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Dim strNewName As String";
_strnewname = "";
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="strNewName = dialogue8.TextInputDialog(\"Topic Li";
_strnewname = _dialogue8._textinputdialog("Topic List Management","Rename Topic","Enter new topic name:",_lasttreeitemselected.getText());
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="If strNewName <> \"\" Then";
if ((_strnewname).equals("") == false) { 
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="taResults.Text = \"Renaming \" & lastTreeItemSele";
_taresults.setText("Renaming "+_lasttreeitemselected.getText()+" to "+_strnewname);
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="tvm.Rename(lastTreeItemSelected, strNewName)";
_tvm._rename(null,_lasttreeitemselected,_strnewname);
 };
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="taResults.Text = taResults.Text & CRLF & CRLF &";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Node Name: "+_lasttreeitemselected.getText()+"; Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+"; UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
 };
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="End Sub";
return "";
}
public static String  _menubar1_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "menubar1_action"))
	return (String) Debug.delegate(ba, "menubar1_action", null);
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub MenuBar1_Action";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Then";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Dim mi As MenuItem = Sender";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Select Case mi.Text";
switch (BA.switchObjectToInt(_mi.getText(),"Add Same Level Topic","Make this a Parent Topic","Move UP","Pick-up","Drop","Rename","Move DOWN","Add Sub Topic","List Siblings","List Children","List Antecedents","Remove")) {
case 0: {
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="cmenuAddSibling_Action";
_cmenuaddsibling_action();
 break; }
case 1: {
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="cmenuMakeParent_Action";
_cmenumakeparent_action();
 break; }
case 2: {
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="cmenuMoveUp_Action";
_cmenumoveup_action();
 break; }
case 3: {
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="cmenuPickup_Action";
_cmenupickup_action();
 break; }
case 4: {
RDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="cmenuDrop_Action";
_cmenudrop_action();
 break; }
case 5: {
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="cmenuRename_Action";
_cmenurename_action();
 break; }
case 6: {
RDebugUtils.currentLine=1703953;
 //BA.debugLineNum = 1703953;BA.debugLine="cmenuMoveDown_Action";
_cmenumovedown_action();
 break; }
case 7: {
RDebugUtils.currentLine=1703955;
 //BA.debugLineNum = 1703955;BA.debugLine="cmenuAddSubLevel_Action";
_cmenuaddsublevel_action();
 break; }
case 8: {
RDebugUtils.currentLine=1703957;
 //BA.debugLineNum = 1703957;BA.debugLine="cmenuListSiblings_Action";
_cmenulistsiblings_action();
 break; }
case 9: {
RDebugUtils.currentLine=1703959;
 //BA.debugLineNum = 1703959;BA.debugLine="cmenuListChildren_Action";
_cmenulistchildren_action();
 break; }
case 10: {
RDebugUtils.currentLine=1703961;
 //BA.debugLineNum = 1703961;BA.debugLine="cmenuListAntecedents_Action";
_cmenulistantecedents_action();
 break; }
case 11: {
RDebugUtils.currentLine=1703963;
 //BA.debugLineNum = 1703963;BA.debugLine="cmenuRemove_Action";
_cmenuremove_action();
 break; }
}
;
 };
RDebugUtils.currentLine=1703966;
 //BA.debugLineNum = 1703966;BA.debugLine="End Sub";
return "";
}
public static String  _mmenuexit_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mmenuexit_action"))
	return (String) Debug.delegate(ba, "mmenuexit_action", null);
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub mmenuExit_Action";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public static String  _mmenuexportjson_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mmenuexportjson_action"))
	return (String) Debug.delegate(ba, "mmenuexportjson_action", null);
String _strfromjson = "";
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub mmenuExportJSON_Action";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim strFromJSON As String = tvm.ToJSON(TreeView1)";
_strfromjson = _tvm._tojson(null,_treeview1);
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="File.WriteString(File.DirApp, \"treeview_json.txt\"";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"treeview_json.txt",_strfromjson);
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="fx.ShowExternalDocument(File.GetUri(File.DirAp";
_fx.ShowExternalDocument(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"treeview_json.txt"));
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="End Sub";
return "";
}
public static String  _mmenuexportxml_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mmenuexportxml_action"))
	return (String) Debug.delegate(ba, "mmenuexportxml_action", null);
String _strfromxml = "";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub mmenuExportXML_Action";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim strFromXML As String = tvm.ToXML(TreeView1)";
_strfromxml = _tvm._toxml(null,_treeview1);
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="File.WriteString(File.DirApp, \"treeview_xml.xml\",";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"treeview_xml.xml",_strfromxml);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="fx.ShowExternalDocument(File.GetUri(File.DirAp";
_fx.ShowExternalDocument(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"treeview_xml.xml"));
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="End Sub";
return "";
}
public static String  _mmenuimportjson_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mmenuimportjson_action"))
	return (String) Debug.delegate(ba, "mmenuimportjson_action", null);
String _strjson = "";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub mmenuImportJSON_Action";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim strJSON As String = File.ReadString(File.DirA";
_strjson = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"treeview_json.txt");
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="tvm.BuildTreeFromJSON(TreeView1, strJSON)";
_tvm._buildtreefromjson(null,_treeview1,_strjson);
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="End Sub";
return "";
}
public static String  _treecontextalloff() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "treecontextalloff"))
	return (String) Debug.delegate(ba, "treecontextalloff", null);
anywheresoftware.b4a.objects.collections.List _listoff = null;
anywheresoftware.b4a.objects.collections.List _listmainoff = null;
int _i = 0;
int _i2 = 0;
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub TreeContextAllOff";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim listOff As List";
_listoff = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="listOff.Initialize";
_listoff.Initialize();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="listOff.Add(\"cmnuAdd\")";
_listoff.Add((Object)("cmnuAdd"));
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="listOff.Add(\"cmnuMakeParent\")";
_listoff.Add((Object)("cmnuMakeParent"));
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="listOff.Add(\"cmnuMoveUp\")";
_listoff.Add((Object)("cmnuMoveUp"));
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="listOff.Add(\"cmnuRename\")";
_listoff.Add((Object)("cmnuRename"));
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="listOff.Add(\"cmnuEditContent\")";
_listoff.Add((Object)("cmnuEditContent"));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="listOff.Add(\"cmnuRelateTopic\")";
_listoff.Add((Object)("cmnuRelateTopic"));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="listOff.Add(\"cmnuMoveDown\")";
_listoff.Add((Object)("cmnuMoveDown"));
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="listOff.Add(\"cmnuAddSubLevel\")";
_listoff.Add((Object)("cmnuAddSubLevel"));
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="listOff.Add(\"cmnuRemove\")";
_listoff.Add((Object)("cmnuRemove"));
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="listOff.Add(\"cmnuPickup\")";
_listoff.Add((Object)("cmnuPickup"));
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="listOff.Add(\"cmnuDrop\")";
_listoff.Add((Object)("cmnuDrop"));
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="listOff.Add(\"cmnuListSiblings\")";
_listoff.Add((Object)("cmnuListSiblings"));
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="listOff.Add(\"cmnuListChildren\")";
_listoff.Add((Object)("cmnuListChildren"));
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="listOff.Add(\"cmnuListAntecedents\")";
_listoff.Add((Object)("cmnuListAntecedents"));
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="Dim listMainOff As List";
_listmainoff = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="listMainOff.Initialize";
_listmainoff.Initialize();
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="listMainOff.Add(\"mmnuAddSibling\")";
_listmainoff.Add((Object)("mmnuAddSibling"));
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="listMainOff.Add(\"mmnuMakeParent\")";
_listmainoff.Add((Object)("mmnuMakeParent"));
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="listMainOff.Add(\"mmnuMoveUp\")";
_listmainoff.Add((Object)("mmnuMoveUp"));
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="listMainOff.Add(\"mmnuRename\")";
_listmainoff.Add((Object)("mmnuRename"));
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="listMainOff.Add(\"mmnuEditContent\")";
_listmainoff.Add((Object)("mmnuEditContent"));
RDebugUtils.currentLine=589849;
 //BA.debugLineNum = 589849;BA.debugLine="listMainOff.Add(\"mmnuRelateTopic\")";
_listmainoff.Add((Object)("mmnuRelateTopic"));
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="listMainOff.Add(\"mmnuMoveDown\")";
_listmainoff.Add((Object)("mmnuMoveDown"));
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="listMainOff.Add(\"mmnuAddSubLevel\")";
_listmainoff.Add((Object)("mmnuAddSubLevel"));
RDebugUtils.currentLine=589852;
 //BA.debugLineNum = 589852;BA.debugLine="listMainOff.Add(\"mmnuRemove\")";
_listmainoff.Add((Object)("mmnuRemove"));
RDebugUtils.currentLine=589853;
 //BA.debugLineNum = 589853;BA.debugLine="listMainOff.Add(\"mmnuPickup\")";
_listmainoff.Add((Object)("mmnuPickup"));
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="listMainOff.Add(\"mmnuDrop\")";
_listmainoff.Add((Object)("mmnuDrop"));
RDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="listMainOff.Add(\"mmnuListSiblings\")";
_listmainoff.Add((Object)("mmnuListSiblings"));
RDebugUtils.currentLine=589856;
 //BA.debugLineNum = 589856;BA.debugLine="listMainOff.Add(\"mmnuListChildren\")";
_listmainoff.Add((Object)("mmnuListChildren"));
RDebugUtils.currentLine=589857;
 //BA.debugLineNum = 589857;BA.debugLine="listMainOff.Add(\"mmnuListAntecedents\")";
_listmainoff.Add((Object)("mmnuListAntecedents"));
RDebugUtils.currentLine=589859;
 //BA.debugLineNum = 589859;BA.debugLine="For i = 0 To mapContextMenus.Size - 1";
{
final int step33 = 1;
final int limit33 = (int) (_mapcontextmenus.getSize()-1);
for (_i = (int) (0) ; (step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33); _i = ((int)(0 + _i + step33)) ) {
RDebugUtils.currentLine=589860;
 //BA.debugLineNum = 589860;BA.debugLine="For i2 = 0 To listOff.Size - 1";
{
final int step34 = 1;
final int limit34 = (int) (_listoff.getSize()-1);
for (_i2 = (int) (0) ; (step34 > 0 && _i2 <= limit34) || (step34 < 0 && _i2 >= limit34); _i2 = ((int)(0 + _i2 + step34)) ) {
RDebugUtils.currentLine=589861;
 //BA.debugLineNum = 589861;BA.debugLine="If mapContextMenus.GetKeyAt(i) = listOff.Get(i2";
if ((_mapcontextmenus.GetKeyAt(_i)).equals(_listoff.Get(_i2))) { 
RDebugUtils.currentLine=589862;
 //BA.debugLineNum = 589862;BA.debugLine="Dim mi As MenuItem = mapContextMenus.Get(listO";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapcontextmenus.Get(_listoff.Get(_i2))));
RDebugUtils.currentLine=589863;
 //BA.debugLineNum = 589863;BA.debugLine="mi.Enabled = False";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=589864;
 //BA.debugLineNum = 589864;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
RDebugUtils.currentLine=589868;
 //BA.debugLineNum = 589868;BA.debugLine="For i = 0 To mapMainMenus.Size - 1";
{
final int step42 = 1;
final int limit42 = (int) (_mapmainmenus.getSize()-1);
for (_i = (int) (0) ; (step42 > 0 && _i <= limit42) || (step42 < 0 && _i >= limit42); _i = ((int)(0 + _i + step42)) ) {
RDebugUtils.currentLine=589869;
 //BA.debugLineNum = 589869;BA.debugLine="For i2 = 0 To listOff.Size - 1";
{
final int step43 = 1;
final int limit43 = (int) (_listoff.getSize()-1);
for (_i2 = (int) (0) ; (step43 > 0 && _i2 <= limit43) || (step43 < 0 && _i2 >= limit43); _i2 = ((int)(0 + _i2 + step43)) ) {
RDebugUtils.currentLine=589870;
 //BA.debugLineNum = 589870;BA.debugLine="If mapMainMenus.GetKeyAt(i) = listMainOff.Get(i";
if ((_mapmainmenus.GetKeyAt(_i)).equals(_listmainoff.Get(_i2))) { 
RDebugUtils.currentLine=589871;
 //BA.debugLineNum = 589871;BA.debugLine="Dim mi As MenuItem = mapMainMenus.Get(listMain";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapmainmenus.Get(_listmainoff.Get(_i2))));
RDebugUtils.currentLine=589872;
 //BA.debugLineNum = 589872;BA.debugLine="mi.Enabled = False";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=589873;
 //BA.debugLineNum = 589873;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
RDebugUtils.currentLine=589877;
 //BA.debugLineNum = 589877;BA.debugLine="txtField1.Enabled = False";
_txtfield1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=589878;
 //BA.debugLineNum = 589878;BA.debugLine="txtField2.Enabled = False";
_txtfield2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=589879;
 //BA.debugLineNum = 589879;BA.debugLine="txtField3.Enabled = False";
_txtfield3.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=589880;
 //BA.debugLineNum = 589880;BA.debugLine="End Sub";
return "";
}
public static String  _treecontextset(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisnode) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "treecontextset"))
	return (String) Debug.delegate(ba, "treecontextset", new Object[] {_thisnode});
anywheresoftware.b4a.objects.collections.List _liston = null;
anywheresoftware.b4a.objects.collections.List _listmainon = null;
anywheresoftware.b4a.objects.collections.List _listoff = null;
anywheresoftware.b4a.objects.collections.List _listmainoff = null;
int _i = 0;
int _i2 = 0;
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub TreeContextSet(thisNode As TreeItem)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim listOn As List";
_liston = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="listOn.Initialize";
_liston.Initialize();
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="listOn.Add(\"cmnuAddSibling\")";
_liston.Add((Object)("cmnuAddSibling"));
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Dim listMainOn As List";
_listmainon = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="listMainOn.Initialize";
_listmainon.Initialize();
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Dim listOff As List";
_listoff = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="listOff.Initialize";
_listoff.Initialize();
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="Dim listMainOff As List";
_listmainoff = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="listMainOff.Initialize";
_listmainoff.Initialize();
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="If thisNode.IsInitialized = True Then";
if (_thisnode.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="txtField1.Enabled = True";
_txtfield1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="txtField2.Enabled = True";
_txtfield2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="txtField3.Enabled = True";
_txtfield3.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="listOn.Add(\"cmnuAddSubLevel\")";
_liston.Add((Object)("cmnuAddSubLevel"));
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="listOn.Add(\"cmnuRemove\")";
_liston.Add((Object)("cmnuRemove"));
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="listOn.Add(\"cmnuRename\")";
_liston.Add((Object)("cmnuRename"));
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="listOn.Add(\"cmnuPickup\")";
_liston.Add((Object)("cmnuPickup"));
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="listMainOn.Add(\"mmnuAddSibling\")";
_listmainon.Add((Object)("mmnuAddSibling"));
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="listMainOn.Add(\"mmnuAddSubLevel\")";
_listmainon.Add((Object)("mmnuAddSubLevel"));
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="listMainOn.Add(\"mmnuRemove\")";
_listmainon.Add((Object)("mmnuRemove"));
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="listMainOn.Add(\"mmnuRename\")";
_listmainon.Add((Object)("mmnuRename"));
RDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="listMainOn.Add(\"mmnuPickup\")";
_listmainon.Add((Object)("mmnuPickup"));
RDebugUtils.currentLine=655383;
 //BA.debugLineNum = 655383;BA.debugLine="If tvm.HasSiblings(thisNode) = True Then";
if (_tvm._hassiblings(null,_thisnode)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=655384;
 //BA.debugLineNum = 655384;BA.debugLine="listOn.Add(\"cmnuListSiblings\")";
_liston.Add((Object)("cmnuListSiblings"));
RDebugUtils.currentLine=655385;
 //BA.debugLineNum = 655385;BA.debugLine="listMainOn.Add(\"mmnuListSiblings\")";
_listmainon.Add((Object)("mmnuListSiblings"));
 }else {
RDebugUtils.currentLine=655387;
 //BA.debugLineNum = 655387;BA.debugLine="listOff.Add(\"cmnuListSiblings\")";
_listoff.Add((Object)("cmnuListSiblings"));
RDebugUtils.currentLine=655388;
 //BA.debugLineNum = 655388;BA.debugLine="listMainOff.Add(\"mmnuListSiblings\")";
_listmainoff.Add((Object)("mmnuListSiblings"));
 };
RDebugUtils.currentLine=655390;
 //BA.debugLineNum = 655390;BA.debugLine="If tvm.HasChildren(thisNode) = True Then";
if (_tvm._haschildren(null,_thisnode)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=655392;
 //BA.debugLineNum = 655392;BA.debugLine="listOff.Add(\"cmnuEditContent\")";
_listoff.Add((Object)("cmnuEditContent"));
RDebugUtils.currentLine=655393;
 //BA.debugLineNum = 655393;BA.debugLine="listMainOff.Add(\"mcmnuEditContent\")";
_listmainoff.Add((Object)("mcmnuEditContent"));
RDebugUtils.currentLine=655394;
 //BA.debugLineNum = 655394;BA.debugLine="listOn.Add(\"cmnuListChildren\")";
_liston.Add((Object)("cmnuListChildren"));
RDebugUtils.currentLine=655395;
 //BA.debugLineNum = 655395;BA.debugLine="listMainOn.Add(\"mmnuListChildren\")";
_listmainon.Add((Object)("mmnuListChildren"));
 }else {
RDebugUtils.currentLine=655397;
 //BA.debugLineNum = 655397;BA.debugLine="listOn.Add(\"cmnuEditContent\")";
_liston.Add((Object)("cmnuEditContent"));
RDebugUtils.currentLine=655398;
 //BA.debugLineNum = 655398;BA.debugLine="listMainOn.Add(\"mmnuEditContent\")";
_listmainon.Add((Object)("mmnuEditContent"));
RDebugUtils.currentLine=655399;
 //BA.debugLineNum = 655399;BA.debugLine="listOff.Add(\"cmnuListChildren\")";
_listoff.Add((Object)("cmnuListChildren"));
RDebugUtils.currentLine=655400;
 //BA.debugLineNum = 655400;BA.debugLine="listMainOff.Add(\"mmnuListChildren\")";
_listmainoff.Add((Object)("mmnuListChildren"));
 };
RDebugUtils.currentLine=655402;
 //BA.debugLineNum = 655402;BA.debugLine="If tvm.IsFirstChild(thisNode) = True Then";
if (_tvm._isfirstchild(null,_thisnode)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=655404;
 //BA.debugLineNum = 655404;BA.debugLine="listOn.Add(\"cmnuMoveDown\")";
_liston.Add((Object)("cmnuMoveDown"));
RDebugUtils.currentLine=655405;
 //BA.debugLineNum = 655405;BA.debugLine="listOff.Add(\"cmnuMoveUp\")";
_listoff.Add((Object)("cmnuMoveUp"));
RDebugUtils.currentLine=655406;
 //BA.debugLineNum = 655406;BA.debugLine="listMainOn.Add(\"mmnuMoveDown\")";
_listmainon.Add((Object)("mmnuMoveDown"));
RDebugUtils.currentLine=655407;
 //BA.debugLineNum = 655407;BA.debugLine="listMainOff.Add(\"mmnuMoveUp\")";
_listmainoff.Add((Object)("mmnuMoveUp"));
 }else 
{RDebugUtils.currentLine=655408;
 //BA.debugLineNum = 655408;BA.debugLine="else If tvm.IsLastChild(thisNode) = True Then";
if (_tvm._islastchild(null,_thisnode)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=655410;
 //BA.debugLineNum = 655410;BA.debugLine="listOff.Add(\"cmnuMoveDown\")";
_listoff.Add((Object)("cmnuMoveDown"));
RDebugUtils.currentLine=655411;
 //BA.debugLineNum = 655411;BA.debugLine="listOn.Add(\"cmnuMoveUp\")";
_liston.Add((Object)("cmnuMoveUp"));
RDebugUtils.currentLine=655412;
 //BA.debugLineNum = 655412;BA.debugLine="listMainOff.Add(\"mmnuMoveDown\")";
_listmainoff.Add((Object)("mmnuMoveDown"));
RDebugUtils.currentLine=655413;
 //BA.debugLineNum = 655413;BA.debugLine="listMainOn.Add(\"mmnuMoveUp\")";
_listmainon.Add((Object)("mmnuMoveUp"));
 }else {
RDebugUtils.currentLine=655415;
 //BA.debugLineNum = 655415;BA.debugLine="listOn.Add(\"cmnuMoveDown\")";
_liston.Add((Object)("cmnuMoveDown"));
RDebugUtils.currentLine=655416;
 //BA.debugLineNum = 655416;BA.debugLine="listOn.Add(\"cmnuMoveUp\")";
_liston.Add((Object)("cmnuMoveUp"));
RDebugUtils.currentLine=655417;
 //BA.debugLineNum = 655417;BA.debugLine="listMainOn.Add(\"mmnuMoveDown\")";
_listmainon.Add((Object)("mmnuMoveDown"));
RDebugUtils.currentLine=655418;
 //BA.debugLineNum = 655418;BA.debugLine="listMainOn.Add(\"mmnuMoveUp\")";
_listmainon.Add((Object)("mmnuMoveUp"));
 }};
RDebugUtils.currentLine=655420;
 //BA.debugLineNum = 655420;BA.debugLine="If tvm.IsRoot(thisNode) = True Then";
if (_tvm._isroot(null,_thisnode)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=655421;
 //BA.debugLineNum = 655421;BA.debugLine="listOff.Add(\"cmnuMakeParent\")";
_listoff.Add((Object)("cmnuMakeParent"));
RDebugUtils.currentLine=655422;
 //BA.debugLineNum = 655422;BA.debugLine="listMainOff.Add(\"mmnuMakeParent\")";
_listmainoff.Add((Object)("mmnuMakeParent"));
RDebugUtils.currentLine=655423;
 //BA.debugLineNum = 655423;BA.debugLine="listOff.Add(\"cmnuListAntecedents\")";
_listoff.Add((Object)("cmnuListAntecedents"));
RDebugUtils.currentLine=655424;
 //BA.debugLineNum = 655424;BA.debugLine="listMainOff.Add(\"mmnuListAntecedents\")";
_listmainoff.Add((Object)("mmnuListAntecedents"));
 }else {
RDebugUtils.currentLine=655426;
 //BA.debugLineNum = 655426;BA.debugLine="listOn.Add(\"cmnuMakeParent\")";
_liston.Add((Object)("cmnuMakeParent"));
RDebugUtils.currentLine=655427;
 //BA.debugLineNum = 655427;BA.debugLine="listMainOn.Add(\"mmnuMakeParent\")";
_listmainon.Add((Object)("mmnuMakeParent"));
RDebugUtils.currentLine=655428;
 //BA.debugLineNum = 655428;BA.debugLine="listOn.Add(\"cmnuListAntecedents\")";
_liston.Add((Object)("cmnuListAntecedents"));
RDebugUtils.currentLine=655429;
 //BA.debugLineNum = 655429;BA.debugLine="listMainOn.Add(\"mmnuListAntecedents\")";
_listmainon.Add((Object)("mmnuListAntecedents"));
 };
RDebugUtils.currentLine=655431;
 //BA.debugLineNum = 655431;BA.debugLine="If tvm.IsPickup = True Then";
if (_tvm._ispickup(null)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=655432;
 //BA.debugLineNum = 655432;BA.debugLine="listOn.Add(\"cmnuDrop\")";
_liston.Add((Object)("cmnuDrop"));
RDebugUtils.currentLine=655433;
 //BA.debugLineNum = 655433;BA.debugLine="listMainOn.Add(\"mmnuDrop\")";
_listmainon.Add((Object)("mmnuDrop"));
 }else {
RDebugUtils.currentLine=655435;
 //BA.debugLineNum = 655435;BA.debugLine="listOff.Add(\"cmnuDrop\")";
_listoff.Add((Object)("cmnuDrop"));
RDebugUtils.currentLine=655436;
 //BA.debugLineNum = 655436;BA.debugLine="listMainOff.Add(\"mmnuDrop\")";
_listmainoff.Add((Object)("mmnuDrop"));
 };
 }else {
RDebugUtils.currentLine=655444;
 //BA.debugLineNum = 655444;BA.debugLine="txtField1.Enabled = False";
_txtfield1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655445;
 //BA.debugLineNum = 655445;BA.debugLine="txtField2.Enabled = False";
_txtfield2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655446;
 //BA.debugLineNum = 655446;BA.debugLine="txtField3.Enabled = False";
_txtfield3.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655447;
 //BA.debugLineNum = 655447;BA.debugLine="listOff.Add(\"cmnuAddSubLevel\")";
_listoff.Add((Object)("cmnuAddSubLevel"));
RDebugUtils.currentLine=655448;
 //BA.debugLineNum = 655448;BA.debugLine="listOff.Add(\"cmnuRemove\")";
_listoff.Add((Object)("cmnuRemove"));
RDebugUtils.currentLine=655449;
 //BA.debugLineNum = 655449;BA.debugLine="listOff.Add(\"cmnuRelateTopic\")";
_listoff.Add((Object)("cmnuRelateTopic"));
RDebugUtils.currentLine=655450;
 //BA.debugLineNum = 655450;BA.debugLine="listOff.Add(\"cmnuRename\")";
_listoff.Add((Object)("cmnuRename"));
RDebugUtils.currentLine=655451;
 //BA.debugLineNum = 655451;BA.debugLine="listOff.Add(\"cmnuMoveDown\")";
_listoff.Add((Object)("cmnuMoveDown"));
RDebugUtils.currentLine=655452;
 //BA.debugLineNum = 655452;BA.debugLine="listOff.Add(\"cmnuMoveUp\")";
_listoff.Add((Object)("cmnuMoveUp"));
RDebugUtils.currentLine=655453;
 //BA.debugLineNum = 655453;BA.debugLine="listOff.Add(\"cmnuMakeParent\")";
_listoff.Add((Object)("cmnuMakeParent"));
RDebugUtils.currentLine=655454;
 //BA.debugLineNum = 655454;BA.debugLine="listOff.Add(\"cmnuMakeParent\")";
_listoff.Add((Object)("cmnuMakeParent"));
RDebugUtils.currentLine=655455;
 //BA.debugLineNum = 655455;BA.debugLine="listOff.Add(\"cmnuListSiblings\")";
_listoff.Add((Object)("cmnuListSiblings"));
RDebugUtils.currentLine=655456;
 //BA.debugLineNum = 655456;BA.debugLine="listOff.Add(\"cmnuListChildren\")";
_listoff.Add((Object)("cmnuListChildren"));
RDebugUtils.currentLine=655457;
 //BA.debugLineNum = 655457;BA.debugLine="listOff.Add(\"cmnuListAntecedents\")";
_listoff.Add((Object)("cmnuListAntecedents"));
RDebugUtils.currentLine=655458;
 //BA.debugLineNum = 655458;BA.debugLine="listMainOff.Add(\"mmnuAddSubLevel\")";
_listmainoff.Add((Object)("mmnuAddSubLevel"));
RDebugUtils.currentLine=655459;
 //BA.debugLineNum = 655459;BA.debugLine="listMainOff.Add(\"mmnuAddSibling\")";
_listmainoff.Add((Object)("mmnuAddSibling"));
RDebugUtils.currentLine=655460;
 //BA.debugLineNum = 655460;BA.debugLine="listMainOff.Add(\"mmnuRemove\")";
_listmainoff.Add((Object)("mmnuRemove"));
RDebugUtils.currentLine=655461;
 //BA.debugLineNum = 655461;BA.debugLine="listMainOff.Add(\"mmnuRelateTopic\")";
_listmainoff.Add((Object)("mmnuRelateTopic"));
RDebugUtils.currentLine=655462;
 //BA.debugLineNum = 655462;BA.debugLine="listMainOff.Add(\"mmnuRename\")";
_listmainoff.Add((Object)("mmnuRename"));
RDebugUtils.currentLine=655463;
 //BA.debugLineNum = 655463;BA.debugLine="listMainOff.Add(\"mmnuMoveDown\")";
_listmainoff.Add((Object)("mmnuMoveDown"));
RDebugUtils.currentLine=655464;
 //BA.debugLineNum = 655464;BA.debugLine="listMainOff.Add(\"mmnuMoveUp\")";
_listmainoff.Add((Object)("mmnuMoveUp"));
RDebugUtils.currentLine=655465;
 //BA.debugLineNum = 655465;BA.debugLine="listMainOff.Add(\"mmnuMakeParent\")";
_listmainoff.Add((Object)("mmnuMakeParent"));
RDebugUtils.currentLine=655466;
 //BA.debugLineNum = 655466;BA.debugLine="listMainOff.Add(\"mmnuListSiblings\")";
_listmainoff.Add((Object)("mmnuListSiblings"));
RDebugUtils.currentLine=655467;
 //BA.debugLineNum = 655467;BA.debugLine="listMainOff.Add(\"mmnuListChildren\")";
_listmainoff.Add((Object)("mmnuListChildren"));
RDebugUtils.currentLine=655468;
 //BA.debugLineNum = 655468;BA.debugLine="listMainOff.Add(\"mmnuListAntecedents\")";
_listmainoff.Add((Object)("mmnuListAntecedents"));
 };
RDebugUtils.currentLine=655470;
 //BA.debugLineNum = 655470;BA.debugLine="For i = 0 To mapContextMenus.Size - 1";
{
final int step102 = 1;
final int limit102 = (int) (_mapcontextmenus.getSize()-1);
for (_i = (int) (0) ; (step102 > 0 && _i <= limit102) || (step102 < 0 && _i >= limit102); _i = ((int)(0 + _i + step102)) ) {
RDebugUtils.currentLine=655472;
 //BA.debugLineNum = 655472;BA.debugLine="For i2 = 0 To listOn.Size - 1";
{
final int step103 = 1;
final int limit103 = (int) (_liston.getSize()-1);
for (_i2 = (int) (0) ; (step103 > 0 && _i2 <= limit103) || (step103 < 0 && _i2 >= limit103); _i2 = ((int)(0 + _i2 + step103)) ) {
RDebugUtils.currentLine=655473;
 //BA.debugLineNum = 655473;BA.debugLine="If mapContextMenus.GetKeyAt(i) = listOn.Get(i2)";
if ((_mapcontextmenus.GetKeyAt(_i)).equals(_liston.Get(_i2))) { 
RDebugUtils.currentLine=655474;
 //BA.debugLineNum = 655474;BA.debugLine="Dim mi As MenuItem = mapContextMenus.Get(listO";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapcontextmenus.Get(_liston.Get(_i2))));
RDebugUtils.currentLine=655475;
 //BA.debugLineNum = 655475;BA.debugLine="mi.Enabled = True";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655476;
 //BA.debugLineNum = 655476;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=655480;
 //BA.debugLineNum = 655480;BA.debugLine="For i2 = 0 To listOff.Size - 1";
{
final int step110 = 1;
final int limit110 = (int) (_listoff.getSize()-1);
for (_i2 = (int) (0) ; (step110 > 0 && _i2 <= limit110) || (step110 < 0 && _i2 >= limit110); _i2 = ((int)(0 + _i2 + step110)) ) {
RDebugUtils.currentLine=655481;
 //BA.debugLineNum = 655481;BA.debugLine="If mapContextMenus.GetKeyAt(i) = listOff.Get(i2";
if ((_mapcontextmenus.GetKeyAt(_i)).equals(_listoff.Get(_i2))) { 
RDebugUtils.currentLine=655482;
 //BA.debugLineNum = 655482;BA.debugLine="Dim mi As MenuItem = mapContextMenus.Get(listO";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapcontextmenus.Get(_listoff.Get(_i2))));
RDebugUtils.currentLine=655483;
 //BA.debugLineNum = 655483;BA.debugLine="mi.Enabled = False";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655484;
 //BA.debugLineNum = 655484;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
RDebugUtils.currentLine=655488;
 //BA.debugLineNum = 655488;BA.debugLine="For i = 0 To mapMainMenus.Size - 1";
{
final int step118 = 1;
final int limit118 = (int) (_mapmainmenus.getSize()-1);
for (_i = (int) (0) ; (step118 > 0 && _i <= limit118) || (step118 < 0 && _i >= limit118); _i = ((int)(0 + _i + step118)) ) {
RDebugUtils.currentLine=655490;
 //BA.debugLineNum = 655490;BA.debugLine="For i2 = 0 To listOn.Size - 1";
{
final int step119 = 1;
final int limit119 = (int) (_liston.getSize()-1);
for (_i2 = (int) (0) ; (step119 > 0 && _i2 <= limit119) || (step119 < 0 && _i2 >= limit119); _i2 = ((int)(0 + _i2 + step119)) ) {
RDebugUtils.currentLine=655491;
 //BA.debugLineNum = 655491;BA.debugLine="If mapMainMenus.GetKeyAt(i) = listMainOn.Get(i2";
if ((_mapmainmenus.GetKeyAt(_i)).equals(_listmainon.Get(_i2))) { 
RDebugUtils.currentLine=655492;
 //BA.debugLineNum = 655492;BA.debugLine="Dim mi As MenuItem = mapMainMenus.Get(listMain";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapmainmenus.Get(_listmainon.Get(_i2))));
RDebugUtils.currentLine=655493;
 //BA.debugLineNum = 655493;BA.debugLine="mi.Enabled = True";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655494;
 //BA.debugLineNum = 655494;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=655498;
 //BA.debugLineNum = 655498;BA.debugLine="For i2 = 0 To listOff.Size - 1";
{
final int step126 = 1;
final int limit126 = (int) (_listoff.getSize()-1);
for (_i2 = (int) (0) ; (step126 > 0 && _i2 <= limit126) || (step126 < 0 && _i2 >= limit126); _i2 = ((int)(0 + _i2 + step126)) ) {
RDebugUtils.currentLine=655499;
 //BA.debugLineNum = 655499;BA.debugLine="If mapMainMenus.GetKeyAt(i) = listMainOff.Get(i";
if ((_mapmainmenus.GetKeyAt(_i)).equals(_listmainoff.Get(_i2))) { 
RDebugUtils.currentLine=655500;
 //BA.debugLineNum = 655500;BA.debugLine="Dim mi As MenuItem = mapMainMenus.Get(listMain";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapmainmenus.Get(_listmainoff.Get(_i2))));
RDebugUtils.currentLine=655501;
 //BA.debugLineNum = 655501;BA.debugLine="mi.Enabled = False";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655502;
 //BA.debugLineNum = 655502;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
RDebugUtils.currentLine=655506;
 //BA.debugLineNum = 655506;BA.debugLine="End Sub";
return "";
}
public static String  _treeview1_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "treeview1_mousepressed"))
	return (String) Debug.delegate(ba, "treeview1_mousepressed", new Object[] {_eventdata});
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub TreeView1_MousePressed (EventData As MouseEven";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="boolHandlingMouseClick = True";
_boolhandlingmouseclick = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="lastTreeItemSelected = Null";
_lasttreeitemselected.setObject((javafx.scene.control.TreeItem)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="End Sub";
return "";
}
public static String  _treeview1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "treeview1_mousereleased"))
	return (String) Debug.delegate(ba, "treeview1_mousereleased", new Object[] {_eventdata});
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _target = null;
anywheresoftware.b4a.objects.collections.Map _mapstored = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub TreeView1_MouseReleased (EventData As MouseEve";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="TreeContextAllOff";
_treecontextalloff();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="taResults.Text = \"\"";
_taresults.setText("");
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Dim jo As JavaObject = EventData";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_eventdata.getObject()));
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Dim target As JavaObject = jo.RunMethodJO(\"get";
_target = new anywheresoftware.b4j.object.JavaObject();
_target = _jo.RunMethodJO("getTarget",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Do Until target Is TreeView";
while (!(_target.getObjectOrNull() instanceof javafx.scene.control.TreeView)) {
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="If GetType(target) = \"com.sun.javafx.scene";
if ((anywheresoftware.b4a.keywords.Common.GetType((Object)(_target.getObject()))).equals("com.sun.javafx.scene.control.skin.TreeViewSkin$1")) { 
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="lastTreeItemSelected = target.RunMetho";
_lasttreeitemselected.setObject((javafx.scene.control.TreeItem)(_target.RunMethod("getTreeItem",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Th";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="TreeContextSet(lastTreeItemSelected)";
_treecontextset(_lasttreeitemselected);
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="taResults.Text = \"MouseUp on node Name: \" & la";
_taresults.setText("MouseUp on node Name: "+_lasttreeitemselected.getText()+anywheresoftware.b4a.keywords.Common.CRLF+"Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+anywheresoftware.b4a.keywords.Common.CRLF+"UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="boolHandlingMouseClick = False";
_boolhandlingmouseclick = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="txtField1.Text = \"\"";
_txtfield1.setText("");
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="txtField2.Text = \"\"";
_txtfield2.setText("");
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="txtField3.Text = \"\"";
_txtfield3.setText("");
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="If mapDataStore.ContainsKey(tvm.UniquNodeIdent";
if (_mapdatastore.ContainsKey((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)))==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="taResults.Text = taResults.Text & CRLF & \"The";
_taresults.setText(_taresults.getText()+anywheresoftware.b4a.keywords.Common.CRLF+"The in-memory map has stored text field values for the selected item using tvm.UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
RDebugUtils.currentLine=2162705;
 //BA.debugLineNum = 2162705;BA.debugLine="Dim mapStored As Map";
_mapstored = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="mapStored.Initialize";
_mapstored.Initialize();
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="mapStored = mapDataStore.Get(tvm.UniquNodeIde";
_mapstored.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_mapdatastore.Get((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)))));
RDebugUtils.currentLine=2162708;
 //BA.debugLineNum = 2162708;BA.debugLine="If mapStored.ContainsKey(\"txtField1\") = True";
if (_mapstored.ContainsKey((Object)("txtField1"))==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2162709;
 //BA.debugLineNum = 2162709;BA.debugLine="txtField1.Text = mapStored.Get(\"txtField1\")";
_txtfield1.setText(BA.ObjectToString(_mapstored.Get((Object)("txtField1"))));
 };
RDebugUtils.currentLine=2162711;
 //BA.debugLineNum = 2162711;BA.debugLine="If mapStored.ContainsKey(\"txtField2\") = True";
if (_mapstored.ContainsKey((Object)("txtField2"))==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2162712;
 //BA.debugLineNum = 2162712;BA.debugLine="txtField2.Text = mapStored.Get(\"txtField2\")";
_txtfield2.setText(BA.ObjectToString(_mapstored.Get((Object)("txtField2"))));
 };
RDebugUtils.currentLine=2162714;
 //BA.debugLineNum = 2162714;BA.debugLine="If mapStored.ContainsKey(\"txtField3\") = True";
if (_mapstored.ContainsKey((Object)("txtField3"))==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2162715;
 //BA.debugLineNum = 2162715;BA.debugLine="txtField3.Text = mapStored.Get(\"txtField3\")";
_txtfield3.setText(BA.ObjectToString(_mapstored.Get((Object)("txtField3"))));
 };
 };
 };
RDebugUtils.currentLine=2162719;
 //BA.debugLineNum = 2162719;BA.debugLine="Exit";
if (true) break;
 };
RDebugUtils.currentLine=2162721;
 //BA.debugLineNum = 2162721;BA.debugLine="Dim n As Node = target";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_n.setObject((javafx.scene.Node)(_target.getObject()));
RDebugUtils.currentLine=2162722;
 //BA.debugLineNum = 2162722;BA.debugLine="target = n.Parent";
_target.setObject((java.lang.Object)(_n.getParent().getObject()));
 }
;
RDebugUtils.currentLine=2162724;
 //BA.debugLineNum = 2162724;BA.debugLine="If taResults.Text = \"\" Then";
if ((_taresults.getText()).equals("")) { 
RDebugUtils.currentLine=2162725;
 //BA.debugLineNum = 2162725;BA.debugLine="taResults.Text = \"Root Focus\"";
_taresults.setText("Root Focus");
 };
RDebugUtils.currentLine=2162727;
 //BA.debugLineNum = 2162727;BA.debugLine="boolHandlingMouseClick = False";
_boolhandlingmouseclick = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2162728;
 //BA.debugLineNum = 2162728;BA.debugLine="End Sub";
return "";
}
public static String  _treeview1_selecteditemchanged(anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _selecteditem) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "treeview1_selecteditemchanged"))
	return (String) Debug.delegate(ba, "treeview1_selecteditemchanged", new Object[] {_selecteditem});
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub TreeView1_SelectedItemChanged(SelectedItem As";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="If boolHandlingMouseClick = False Then";
if (_boolhandlingmouseclick==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="If SelectedItem.IsInitialized = True Then";
if (_selecteditem.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="lastTreeItemSelected = SelectedItem";
_lasttreeitemselected = _selecteditem;
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="taResults.text = \"Focussed Node Name: \" & lastT";
_taresults.setText("Focussed Node Name: "+_lasttreeitemselected.getText()+"; Generation: "+BA.NumberToString(_tvm._generation(null,_lasttreeitemselected))+"; UniqueID: "+_tvm._uniqunodeidentifier(null,_lasttreeitemselected));
 };
 };
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="End Sub";
return "";
}
public static String  _txtfield1_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "txtfield1_focuschanged"))
	return (String) Debug.delegate(ba, "txtfield1_focuschanged", new Object[] {_hasfocus});
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub txtField1_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="If HasFocus = False Then";
if (_hasfocus==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="If lastTreeItemSelected <> Null Then";
if (_lasttreeitemselected!= null) { 
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Th";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="If txtField1.Text <> \"\" Then";
if ((_txtfield1.getText()).equals("") == false) { 
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="mapDataStore.Put(tvm.UniquNodeIdentifier(last";
_mapdatastore.Put((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("txtField3"),(Object)(_txtfield3.getText()),(Object)("txtField2"),(Object)(_txtfield2.getText()),(Object)("txtField1"),(Object)(_txtfield1.getText())}).getObject()));
 }else {
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="If mapDataStore.ContainsKey(tvm.UniquNodeIden";
if (_mapdatastore.ContainsKey((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)))==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="If txtField3.Text <> \"\" Or txtField2.Text <>";
if ((_txtfield3.getText()).equals("") == false || (_txtfield2.getText()).equals("") == false) { 
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="mapDataStore.Put(tvm.UniquNodeIdentifier(la";
_mapdatastore.Put((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("txtField3"),(Object)(_txtfield3.getText()),(Object)("txtField2"),(Object)(_txtfield2.getText()),(Object)("txtField1"),(Object)(_txtfield1.getText())}).getObject()));
 }else 
{RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="else IF txtField3.Text = \"\" And txtField2.Te";
if ((_txtfield3.getText()).equals("") && (_txtfield2.getText()).equals("")) { 
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="mapDataStore.Remove(tvm.UniquNodeIdentifier";
_mapdatastore.Remove((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)));
 }};
 };
 };
 };
 };
 };
RDebugUtils.currentLine=2490386;
 //BA.debugLineNum = 2490386;BA.debugLine="End Sub";
return "";
}
public static String  _txtfield2_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "txtfield2_focuschanged"))
	return (String) Debug.delegate(ba, "txtfield2_focuschanged", new Object[] {_hasfocus});
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub txtField2_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If HasFocus = False Then";
if (_hasfocus==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="If lastTreeItemSelected <> Null Then";
if (_lasttreeitemselected!= null) { 
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Th";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="If txtField2.Text <> \"\" Then";
if ((_txtfield2.getText()).equals("") == false) { 
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="mapDataStore.Put(tvm.UniquNodeIdentifier(last";
_mapdatastore.Put((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("txtField3"),(Object)(_txtfield3.getText()),(Object)("txtField2"),(Object)(_txtfield2.getText()),(Object)("txtField1"),(Object)(_txtfield1.getText())}).getObject()));
 }else {
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="If mapDataStore.ContainsKey(tvm.UniquNodeIden";
if (_mapdatastore.ContainsKey((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)))==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="If txtField1.Text <> \"\" Or txtField3.Text <>";
if ((_txtfield1.getText()).equals("") == false || (_txtfield3.getText()).equals("") == false) { 
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="mapDataStore.Put(tvm.UniquNodeIdentifier(la";
_mapdatastore.Put((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("txtField3"),(Object)(_txtfield3.getText()),(Object)("txtField2"),(Object)(_txtfield2.getText()),(Object)("txtField1"),(Object)(_txtfield1.getText())}).getObject()));
 }else 
{RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="Else IF txtField1.Text = \"\" And txtField3.Te";
if ((_txtfield1.getText()).equals("") && (_txtfield3.getText()).equals("")) { 
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="mapDataStore.Remove(tvm.UniquNodeIdentifier";
_mapdatastore.Remove((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)));
 }};
 };
 };
 };
 };
 };
RDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="End Sub";
return "";
}
public static String  _txtfield3_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "txtfield3_focuschanged"))
	return (String) Debug.delegate(ba, "txtfield3_focuschanged", new Object[] {_hasfocus});
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub txtField3_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="If HasFocus = False Then";
if (_hasfocus==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="If lastTreeItemSelected <> Null Then";
if (_lasttreeitemselected!= null) { 
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="If lastTreeItemSelected.IsInitialized = True Th";
if (_lasttreeitemselected.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="If txtField3.Text <> \"\" Then";
if ((_txtfield3.getText()).equals("") == false) { 
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="mapDataStore.Put(tvm.UniquNodeIdentifier(last";
_mapdatastore.Put((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("txtField3"),(Object)(_txtfield3.getText()),(Object)("txtField2"),(Object)(_txtfield2.getText()),(Object)("txtField1"),(Object)(_txtfield1.getText())}).getObject()));
 }else {
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="If mapDataStore.ContainsKey(tvm.UniquNodeIden";
if (_mapdatastore.ContainsKey((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)))==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="If txtField1.Text <> \"\" Or txtField2.Text <>";
if ((_txtfield1.getText()).equals("") == false || (_txtfield2.getText()).equals("") == false) { 
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="mapDataStore.Put(tvm.UniquNodeIdentifier(la";
_mapdatastore.Put((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("txtField3"),(Object)(_txtfield3.getText()),(Object)("txtField2"),(Object)(_txtfield2.getText()),(Object)("txtField1"),(Object)(_txtfield1.getText())}).getObject()));
 }else 
{RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="else IF txtField1.Text = \"\" And txtField2.Te";
if ((_txtfield1.getText()).equals("") && (_txtfield2.getText()).equals("")) { 
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="mapDataStore.Remove(tvm.UniquNodeIdentifier";
_mapdatastore.Remove((Object)(_tvm._uniqunodeidentifier(null,_lasttreeitemselected)));
 }};
 };
 };
 };
 };
 };
RDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="End Sub";
return "";
}
}