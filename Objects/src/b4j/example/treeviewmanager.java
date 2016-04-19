package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class treeviewmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.treeviewmanager", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.treeviewmanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public int _familyerrornode = 0;
public anywheresoftware.b4a.objects.collections.List _listglobal = null;
public anywheresoftware.b4a.objects.collections.Map _mappickup = null;
public b4j.example.main _main = null;
public String  _initialize(b4j.example.treeviewmanager __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.TreeViewWrapper _objtreeview) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_objtreeview});
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub Initialize(objTreeView As TreeView)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="FamilyErrorNode = -1";
__ref._familyerrornode = (int) (-1);
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="listGlobal.Initialize";
__ref._listglobal.Initialize();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="mapPickup.Initialize";
__ref._mappickup.Initialize();
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="End Sub";
return "";
}
public String  _tojson(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper _objtreeview) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "tojson"))
	return (String) Debug.delegate(ba, "tojson", new Object[] {_objtreeview});
anywheresoftware.b4a.objects.collections.List _listjson = null;
anywheresoftware.b4a.objects.collections.List _templist = null;
int _i2 = 0;
String _strthis = "";
String _strthis2 = "";
String _jsonoutput = "";
int _i = 0;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub ToJSON(objTreeView As TreeView) As Stri";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim listJSON As List";
_listjson = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="listJSON.Initialize";
_listjson.Initialize();
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="If objTreeView <> Null Then";
if (_objtreeview!= null) { 
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="If objTreeView.IsInitialized = True Then";
if (_objtreeview.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="If objTreeView.Root.Children.Size > 0 Then";
if (_objtreeview.getRoot().getChildren().getSize()>0) { 
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Dim tempList As List = recurse_tree_for_json(o";
_templist = new anywheresoftware.b4a.objects.collections.List();
_templist = __ref._recurse_tree_for_json(null,_objtreeview.getRoot());
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="If tempList <> Null Then";
if (_templist!= null) { 
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="If tempList.IsInitialized = True Then";
if (_templist.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="For i2 = 0 To tempList.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_templist.getSize()-1);
for (_i2 = (int) (0) ; (step9 > 0 && _i2 <= limit9) || (step9 < 0 && _i2 >= limit9); _i2 = ((int)(0 + _i2 + step9)) ) {
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="Dim strThis As String = tempList.Get(i2)";
_strthis = BA.ObjectToString(_templist.Get(_i2));
RDebugUtils.currentLine=4980748;
 //BA.debugLineNum = 4980748;BA.debugLine="If strThis.CharAt(0) = \"{\" Then";
if (_strthis.charAt((int) (0))==BA.ObjectToChar("{")) { 
RDebugUtils.currentLine=4980749;
 //BA.debugLineNum = 4980749;BA.debugLine="listJSON.Add(tempList.Get(i2))";
_listjson.Add(_templist.Get(_i2));
 }else {
RDebugUtils.currentLine=4980751;
 //BA.debugLineNum = 4980751;BA.debugLine="Dim strThis2 As String = $\"{ \"Text\" : \"${t";
_strthis2 = ("{ \"Text\" : \""+__c.SmartStringFormatter("",_templist.Get(_i2))+"\" }");
RDebugUtils.currentLine=4980752;
 //BA.debugLineNum = 4980752;BA.debugLine="If i2 < (tempList.Size - 1) Then";
if (_i2<(_templist.getSize()-1)) { 
RDebugUtils.currentLine=4980753;
 //BA.debugLineNum = 4980753;BA.debugLine="If strThis2.CharAt(strThis2.Length - 1) <";
if (_strthis2.charAt((int) (_strthis2.length()-1))!=BA.ObjectToChar(",")) { 
RDebugUtils.currentLine=4980754;
 //BA.debugLineNum = 4980754;BA.debugLine="strThis2 = strThis2 & \",\"";
_strthis2 = _strthis2+",";
 };
 };
RDebugUtils.currentLine=4980757;
 //BA.debugLineNum = 4980757;BA.debugLine="strThis2 = strThis2.Replace(\",,\", \",\")";
_strthis2 = _strthis2.replace(",,",",");
RDebugUtils.currentLine=4980758;
 //BA.debugLineNum = 4980758;BA.debugLine="listJSON.Add(strThis2)";
_listjson.Add((Object)(_strthis2));
 };
 }
};
 };
 };
 };
 };
 };
RDebugUtils.currentLine=4980766;
 //BA.debugLineNum = 4980766;BA.debugLine="Dim jsonOutput As String";
_jsonoutput = "";
RDebugUtils.currentLine=4980767;
 //BA.debugLineNum = 4980767;BA.debugLine="jsonOutput = $\"{\"TreeView\": [\"$";
_jsonoutput = ("{\"TreeView\": [");
RDebugUtils.currentLine=4980768;
 //BA.debugLineNum = 4980768;BA.debugLine="For i = 0 To listJSON.Size - 1";
{
final int step31 = 1;
final int limit31 = (int) (_listjson.getSize()-1);
for (_i = (int) (0) ; (step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31); _i = ((int)(0 + _i + step31)) ) {
RDebugUtils.currentLine=4980769;
 //BA.debugLineNum = 4980769;BA.debugLine="jsonOutput = jsonOutput & listJSON.Get(i)";
_jsonoutput = _jsonoutput+BA.ObjectToString(_listjson.Get(_i));
 }
};
RDebugUtils.currentLine=4980771;
 //BA.debugLineNum = 4980771;BA.debugLine="jsonOutput = jsonOutput & $\"]}\"$";
_jsonoutput = _jsonoutput+("]}");
RDebugUtils.currentLine=4980772;
 //BA.debugLineNum = 4980772;BA.debugLine="Return jsonOutput";
if (true) return _jsonoutput;
RDebugUtils.currentLine=4980773;
 //BA.debugLineNum = 4980773;BA.debugLine="End Sub";
return "";
}
public String  _toxml(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper _objtreeview) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "toxml"))
	return (String) Debug.delegate(ba, "toxml", new Object[] {_objtreeview});
anywheresoftware.b4a.objects.collections.List _listxml = null;
anywheresoftware.b4a.objects.collections.List _templist = null;
int _i2 = 0;
String _strthis = "";
String _strthis2 = "";
String _xmloutput = "";
int _i = 0;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub ToXML(objTreeView As TreeView) As Strin";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Dim listXML As List";
_listxml = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="listXML.Initialize";
_listxml.Initialize();
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="If objTreeView <> Null Then";
if (_objtreeview!= null) { 
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="If objTreeView.IsInitialized = True Then";
if (_objtreeview.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="If objTreeView.Root.Children.Size > 0 Then";
if (_objtreeview.getRoot().getChildren().getSize()>0) { 
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="Dim tempList As List = recurse_tree_for_xml(ob";
_templist = new anywheresoftware.b4a.objects.collections.List();
_templist = __ref._recurse_tree_for_xml(null,_objtreeview.getRoot());
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="If tempList <> Null Then";
if (_templist!= null) { 
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="If tempList.IsInitialized = True Then";
if (_templist.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="For i2 = 0 To tempList.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_templist.getSize()-1);
for (_i2 = (int) (0) ; (step9 > 0 && _i2 <= limit9) || (step9 < 0 && _i2 >= limit9); _i2 = ((int)(0 + _i2 + step9)) ) {
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="Dim strThis As String = tempList.Get(i2)";
_strthis = BA.ObjectToString(_templist.Get(_i2));
RDebugUtils.currentLine=5242892;
 //BA.debugLineNum = 5242892;BA.debugLine="If strThis.CharAt(0) = \"{\" Then";
if (_strthis.charAt((int) (0))==BA.ObjectToChar("{")) { 
RDebugUtils.currentLine=5242893;
 //BA.debugLineNum = 5242893;BA.debugLine="listXML.Add(tempList.Get(i2))";
_listxml.Add(_templist.Get(_i2));
 }else {
RDebugUtils.currentLine=5242896;
 //BA.debugLineNum = 5242896;BA.debugLine="Dim strThis2 As String = tempList.Get(i2)";
_strthis2 = BA.ObjectToString(_templist.Get(_i2));
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="listXML.Add(strThis2)";
_listxml.Add((Object)(_strthis2));
 };
 }
};
 };
 };
 };
 };
 };
RDebugUtils.currentLine=5242905;
 //BA.debugLineNum = 5242905;BA.debugLine="Dim xmlOutput As String";
_xmloutput = "";
RDebugUtils.currentLine=5242906;
 //BA.debugLineNum = 5242906;BA.debugLine="xmlOutput = $\"<?xml version=\"1.0\" encoding=\"UTF-8";
_xmloutput = ("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")+__c.CRLF+("<root>")+__c.CRLF;
RDebugUtils.currentLine=5242907;
 //BA.debugLineNum = 5242907;BA.debugLine="For i = 0 To listXML.Size - 1";
{
final int step25 = 1;
final int limit25 = (int) (_listxml.getSize()-1);
for (_i = (int) (0) ; (step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25); _i = ((int)(0 + _i + step25)) ) {
RDebugUtils.currentLine=5242908;
 //BA.debugLineNum = 5242908;BA.debugLine="xmlOutput = xmlOutput & listXML.Get(i) & CRLF";
_xmloutput = _xmloutput+BA.ObjectToString(_listxml.Get(_i))+__c.CRLF;
 }
};
RDebugUtils.currentLine=5242910;
 //BA.debugLineNum = 5242910;BA.debugLine="xmlOutput = xmlOutput & $\"</root>\"$ & CRLF";
_xmloutput = _xmloutput+("</root>")+__c.CRLF;
RDebugUtils.currentLine=5242912;
 //BA.debugLineNum = 5242912;BA.debugLine="Return xmlOutput";
if (true) return _xmloutput;
RDebugUtils.currentLine=5242913;
 //BA.debugLineNum = 5242913;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper  _addroot(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper _tv,String _strnewname) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "addroot"))
	return (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) Debug.delegate(ba, "addroot", new Object[] {_tv,_strnewname});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _newnode = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub AddRoot(tv As TreeView, strNewName As S";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="pickup_and_drop_clear";
__ref._pickup_and_drop_clear(null);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="If tv <> Null Then";
if (_tv!= null) { 
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="If tv.IsInitialized = True Then";
if (_tv.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="If strNewName <> \"\" Then";
if ((_strnewname).equals("") == false) { 
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="If unique_name(tv.Root, strNewName) = False Th";
if (__ref._unique_name(null,_tv.getRoot(),_strnewname)==__c.False) { 
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="If strNewName.EqualsIgnoreCase(Null) = False";
if (_strnewname.equalsIgnoreCase(BA.ObjectToString(__c.Null))==__c.False) { 
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="strNewName = strNewName.Replace(\"{\", \"\")";
_strnewname = _strnewname.replace("{","");
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="strNewName = strNewName.Replace(\"}\", \"\")";
_strnewname = _strnewname.replace("}","");
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="strNewName = strNewName.Replace(\"[\", \"\")";
_strnewname = _strnewname.replace("[","");
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="strNewName = strNewName.Replace(\"]\", \"\")";
_strnewname = _strnewname.replace("]","");
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="strNewName = strNewName.Replace(\",\", \" \")";
_strnewname = _strnewname.replace(","," ");
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="strNewName = strNewName.Replace(\":\", \" \")";
_strnewname = _strnewname.replace(":"," ");
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="strNewName = strNewName.Replace($\"\"\"$, \"\")";
_strnewname = _strnewname.replace(("\""),"");
RDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="Dim newNode As TreeItem";
_newnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="newNode.Initialize(\"ti\",strNewName)";
_newnode.Initialize(ba,"ti",_strnewname);
RDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="tv.root.Children.Add(newNode)";
_tv.getRoot().getChildren().Add((Object)(_newnode.getObject()));
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="Return newNode";
if (true) return _newnode;
 };
 };
 };
 };
 };
RDebugUtils.currentLine=2883610;
 //BA.debugLineNum = 2883610;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper  _addsibling(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnodeselected,String _strnewname) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "addsibling"))
	return (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) Debug.delegate(ba, "addsibling", new Object[] {_objnodeselected,_strnewname});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _newnode = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub AddSibling(objNodeSelected As TreeItem,";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="pickup_and_drop_clear";
__ref._pickup_and_drop_clear(null);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="If objNodeSelected <> Null Then";
if (_objnodeselected!= null) { 
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
if (_objnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="If strNewName <> \"\" Then";
if ((_strnewname).equals("") == false) { 
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="If unique_name(objNodeSelected.Parent, strNewN";
if (__ref._unique_name(null,_objnodeselected.getParent(),_strnewname)==__c.False) { 
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="strNewName = strNewName.Replace(\"{\", \"\")";
_strnewname = _strnewname.replace("{","");
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="strNewName = strNewName.Replace(\"}\", \"\")";
_strnewname = _strnewname.replace("}","");
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="strNewName = strNewName.Replace(\"[\", \"\")";
_strnewname = _strnewname.replace("[","");
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="strNewName = strNewName.Replace(\"]\", \"\")";
_strnewname = _strnewname.replace("]","");
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="strNewName = strNewName.Replace(\",\", \" \")";
_strnewname = _strnewname.replace(","," ");
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="strNewName = strNewName.Replace(\":\", \" \")";
_strnewname = _strnewname.replace(":"," ");
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="strNewName = strNewName.Replace($\"\"\"$, \"\")";
_strnewname = _strnewname.replace(("\""),"");
RDebugUtils.currentLine=2818063;
 //BA.debugLineNum = 2818063;BA.debugLine="If strNewName.EqualsIgnoreCase(Null) = False";
if (_strnewname.equalsIgnoreCase(BA.ObjectToString(__c.Null))==__c.False) { 
RDebugUtils.currentLine=2818064;
 //BA.debugLineNum = 2818064;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected";
_parentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_parentnode = _objnodeselected.getParent();
RDebugUtils.currentLine=2818065;
 //BA.debugLineNum = 2818065;BA.debugLine="If parentNode.IsInitialized = True Then";
if (_parentnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=2818066;
 //BA.debugLineNum = 2818066;BA.debugLine="Dim newNode As TreeItem";
_newnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=2818067;
 //BA.debugLineNum = 2818067;BA.debugLine="newNode.Initialize(\"ti\", strNewName)";
_newnode.Initialize(ba,"ti",_strnewname);
RDebugUtils.currentLine=2818068;
 //BA.debugLineNum = 2818068;BA.debugLine="If parentNode.Children.IndexOf(objNodeSelec";
if (_parentnode.getChildren().IndexOf((Object)(_objnodeselected.getObject()))==_parentnode.getChildren().getSize()-1) { 
RDebugUtils.currentLine=2818069;
 //BA.debugLineNum = 2818069;BA.debugLine="parentNode.Children.Add(newNode)";
_parentnode.getChildren().Add((Object)(_newnode.getObject()));
 }else {
RDebugUtils.currentLine=2818071;
 //BA.debugLineNum = 2818071;BA.debugLine="parentNode.Children.InsertAt((parentNode.C";
_parentnode.getChildren().InsertAt((int) ((_parentnode.getChildren().IndexOf((Object)(_objnodeselected.getObject()))+1)),(Object)(_newnode.getObject()));
 };
 };
 };
 };
 };
 };
 };
RDebugUtils.currentLine=2818079;
 //BA.debugLineNum = 2818079;BA.debugLine="End Sub";
return null;
}
public int  _generation(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnodeselected) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "generation"))
	return (Integer) Debug.delegate(ba, "generation", new Object[] {_objnodeselected});
int _intgenerationcounter = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _testnode = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub Generation(objNodeSelected As TreeItem) As Int";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="If objNodeSelected <> Null Then";
if (_objnodeselected!= null) { 
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
if (_objnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Dim intGenerationCounter As Int = 1";
_intgenerationcounter = (int) (1);
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Dim testNode As TreeItem = objNodeSelected";
_testnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_testnode = _objnodeselected;
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="Do While testNode.Parent.Root = False";
while (_testnode.getParent().getRoot()==__c.False) {
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="testNode = testNode.Parent";
_testnode = _testnode.getParent();
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="intGenerationCounter = intGenerationCounter +";
_intgenerationcounter = (int) (_intgenerationcounter+1);
 }
;
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="Return intGenerationCounter";
if (true) return _intgenerationcounter;
 };
 };
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="End Sub";
return 0;
}
public String  _uniqunodeidentifier(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisnode) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "uniqunodeidentifier"))
	return (String) Debug.delegate(ba, "uniqunodeidentifier", new Object[] {_thisnode});
String _strreturn = "";
anywheresoftware.b4a.objects.collections.List _listantecedents = null;
int _i = 0;
String _strthisnodename = "";
String _strnewthisnodename = "";
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub UniquNodeIdentifier(thisNode As TreeIte";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Dim strReturn As String = \"\"";
_strreturn = "";
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="If thisNode <> Null Then";
if (_thisnode!= null) { 
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="If thisNode.IsInitialized = True Then";
if (_thisnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="Dim listAntecedents As List";
_listantecedents = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="listAntecedents.Initialize";
_listantecedents.Initialize();
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="listAntecedents = ListAntecedentNames(thisNode)";
_listantecedents = __ref._listantecedentnames(null,_thisnode);
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="If listAntecedents.Size > 0 Then";
if (_listantecedents.getSize()>0) { 
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="For i = 0 To listAntecedents.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_listantecedents.getSize()-1);
for (_i = (int) (0) ; (step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8); _i = ((int)(0 + _i + step8)) ) {
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="If strReturn <> \"\" Then";
if ((_strreturn).equals("") == false) { 
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="strReturn = strReturn & \"->\"";
_strreturn = _strreturn+"->";
 };
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="Dim strThisNodeName As String = listAnteceden";
_strthisnodename = BA.ObjectToString(_listantecedents.Get(_i));
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="Dim strNewThisNodeName As String = strThisNod";
_strnewthisnodename = _strthisnodename.replace(" ","_");
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="strReturn = strReturn & strNewThisNodeName";
_strreturn = _strreturn+_strnewthisnodename;
 }
};
RDebugUtils.currentLine=4784144;
 //BA.debugLineNum = 4784144;BA.debugLine="strReturn = strReturn & \"|\" & Generation(thisN";
_strreturn = _strreturn+"|"+BA.NumberToString(__ref._generation(null,_thisnode));
 };
 };
 };
RDebugUtils.currentLine=4784148;
 //BA.debugLineNum = 4784148;BA.debugLine="Return strReturn";
if (true) return _strreturn;
RDebugUtils.currentLine=4784149;
 //BA.debugLineNum = 4784149;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper  _addchild(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnodeselected,String _strnewname) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "addchild"))
	return (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) Debug.delegate(ba, "addchild", new Object[] {_objnodeselected,_strnewname});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _newnode = null;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub AddChild(objNodeSelected As TreeItem, s";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="pickup_and_drop_clear";
__ref._pickup_and_drop_clear(null);
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="If objNodeSelected <> Null Then";
if (_objnodeselected!= null) { 
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
if (_objnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="If strNewName <> \"\" Then";
if ((_strnewname).equals("") == false) { 
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="If unique_name(objNodeSelected, strNewName) =";
if (__ref._unique_name(null,_objnodeselected,_strnewname)==__c.False) { 
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="If strNewName.EqualsIgnoreCase(Null) = False";
if (_strnewname.equalsIgnoreCase(BA.ObjectToString(__c.Null))==__c.False) { 
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="strNewName = strNewName.Replace(\"{\", \"\")";
_strnewname = _strnewname.replace("{","");
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="strNewName = strNewName.Replace(\"}\", \"\")";
_strnewname = _strnewname.replace("}","");
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="strNewName = strNewName.Replace(\"[\", \"\")";
_strnewname = _strnewname.replace("[","");
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="strNewName = strNewName.Replace(\"]\", \"\")";
_strnewname = _strnewname.replace("]","");
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="strNewName = strNewName.Replace(\",\", \" \")";
_strnewname = _strnewname.replace(","," ");
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="strNewName = strNewName.Replace(\":\", \" \")";
_strnewname = _strnewname.replace(":"," ");
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="strNewName = strNewName.Replace($\"\"\"$, \"\")";
_strnewname = _strnewname.replace(("\""),"");
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="Dim newNode As TreeItem";
_newnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="newNode.Initialize(\"ti\", strNewName)";
_newnode.Initialize(ba,"ti",_strnewname);
RDebugUtils.currentLine=2949139;
 //BA.debugLineNum = 2949139;BA.debugLine="objNodeSelected.Children.Add(newNode)";
_objnodeselected.getChildren().Add((Object)(_newnode.getObject()));
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="Return newNode";
if (true) return _newnode;
 };
 };
 };
 };
 };
RDebugUtils.currentLine=2949146;
 //BA.debugLineNum = 2949146;BA.debugLine="End Sub";
return null;
}
public String  _drop(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objdropatnodeselected) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "drop"))
	return (String) Debug.delegate(ba, "drop", new Object[] {_objdropatnodeselected});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _pickupparentnode = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _dropparentnode = null;
int _intdropindex = 0;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub Drop(objDropAtNodeSelected As TreeItem)";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="If objDropAtNodeSelected <> Null Then";
if (_objdropatnodeselected!= null) { 
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="If objDropAtNodeSelected.IsInitialized = True Th";
if (_objdropatnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="If mapPickup.ContainsKey(\"Text\") = True And map";
if (__ref._mappickup.ContainsKey((Object)("Text"))==__c.True && __ref._mappickup.ContainsKey((Object)("IndexOf"))==__c.True && __ref._mappickup.ContainsKey((Object)("Children"))==__c.True) { 
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="Dim pickupParentNode As TreeItem = mapPickup.G";
_pickupparentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_pickupparentnode.setObject((javafx.scene.control.TreeItem)(__ref._mappickup.Get((Object)("ParentNode"))));
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="Dim dropParentNode As TreeItem = objDropAtNode";
_dropparentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_dropparentnode = _objdropatnodeselected.getParent();
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="Dim intDropIndex As Int = dropParentNode.Child";
_intdropindex = _dropparentnode.getChildren().IndexOf((Object)(_objdropatnodeselected.getObject()));
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="If intDropIndex = dropParentNode.Children.Size";
if (_intdropindex==_dropparentnode.getChildren().getSize()-1) { 
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="pickupParentNode.Children.RemoveAt(mapPickup.";
_pickupparentnode.getChildren().RemoveAt((int)(BA.ObjectToNumber(__ref._mappickup.Get((Object)("IndexOf")))));
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="CallSubDelayed2(Me, \"drop_add\", dropParentNod";
__c.CallSubDelayed2(ba,this,"drop_add",(Object)(_dropparentnode));
 }else {
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="pickupParentNode.Children.RemoveAt(mapPickup.";
_pickupparentnode.getChildren().RemoveAt((int)(BA.ObjectToNumber(__ref._mappickup.Get((Object)("IndexOf")))));
RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="CallSubDelayed3(Me, \"drop_insert\", dropParent";
__c.CallSubDelayed3(ba,this,"drop_insert",(Object)(_dropparentnode),(Object)((_dropparentnode.getChildren().IndexOf((Object)(_objdropatnodeselected.getObject()))+1)));
 };
 };
 };
 };
RDebugUtils.currentLine=3932177;
 //BA.debugLineNum = 3932177;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _listantecedentnames(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisnode) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "listantecedentnames"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listantecedentnames", new Object[] {_thisnode});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _testnode = null;
anywheresoftware.b4a.objects.collections.List _listtemp = null;
int _i = 0;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub ListAntecedentNames(thisNode As TreeIte";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="listGlobal.Clear";
__ref._listglobal.Clear();
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="If thisNode <> Null Then";
if (_thisnode!= null) { 
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="If thisNode.IsInitialized = True Then";
if (_thisnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="Dim testNode As TreeItem";
_testnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="testNode = thisNode";
_testnode = _thisnode;
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="Do Until testNode.Root = True";
while (!(_testnode.getRoot()==__c.True)) {
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="listGlobal.Add(testNode.Text)";
__ref._listglobal.Add((Object)(_testnode.getText()));
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="testNode = testNode.Parent";
_testnode = _testnode.getParent();
 }
;
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="If listGlobal.Size > 0 Then";
if (__ref._listglobal.getSize()>0) { 
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="Dim listTemp As List";
_listtemp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="listTemp.Initialize";
_listtemp.Initialize();
RDebugUtils.currentLine=4653069;
 //BA.debugLineNum = 4653069;BA.debugLine="listTemp.AddAll(listGlobal)";
_listtemp.AddAll(__ref._listglobal);
RDebugUtils.currentLine=4653070;
 //BA.debugLineNum = 4653070;BA.debugLine="listGlobal.Clear";
__ref._listglobal.Clear();
RDebugUtils.currentLine=4653071;
 //BA.debugLineNum = 4653071;BA.debugLine="For i = listTemp.Size - 1 To 0 Step -1";
{
final int step15 = (int) (-1);
final int limit15 = (int) (0);
for (_i = (int) (_listtemp.getSize()-1) ; (step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15); _i = ((int)(0 + _i + step15)) ) {
RDebugUtils.currentLine=4653072;
 //BA.debugLineNum = 4653072;BA.debugLine="listGlobal.Add(listTemp.Get(i))";
__ref._listglobal.Add(_listtemp.Get(_i));
 }
};
 };
 };
 };
RDebugUtils.currentLine=4653077;
 //BA.debugLineNum = 4653077;BA.debugLine="Return listGlobal";
if (true) return __ref._listglobal;
RDebugUtils.currentLine=4653078;
 //BA.debugLineNum = 4653078;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _listantecedentnodes(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisnode) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "listantecedentnodes"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listantecedentnodes", new Object[] {_thisnode});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _testnode = null;
anywheresoftware.b4a.objects.collections.List _listtemp = null;
int _i = 0;
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub ListAntecedentNodes(thisNode As TreeIte";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="listGlobal.Clear";
__ref._listglobal.Clear();
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="If thisNode <> Null Then";
if (_thisnode!= null) { 
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="If thisNode.IsInitialized = True Then";
if (_thisnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="Dim testNode As TreeItem";
_testnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="testNode = thisNode";
_testnode = _thisnode;
RDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="Do Until testNode.Root = True";
while (!(_testnode.getRoot()==__c.True)) {
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="listGlobal.Add(testNode)";
__ref._listglobal.Add((Object)(_testnode.getObject()));
RDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="testNode = testNode.Parent";
_testnode = _testnode.getParent();
 }
;
RDebugUtils.currentLine=4718602;
 //BA.debugLineNum = 4718602;BA.debugLine="If listGlobal.Size > 0 Then";
if (__ref._listglobal.getSize()>0) { 
RDebugUtils.currentLine=4718603;
 //BA.debugLineNum = 4718603;BA.debugLine="Dim listTemp As List";
_listtemp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4718604;
 //BA.debugLineNum = 4718604;BA.debugLine="listTemp.Initialize";
_listtemp.Initialize();
RDebugUtils.currentLine=4718605;
 //BA.debugLineNum = 4718605;BA.debugLine="listTemp.AddAll(listGlobal)";
_listtemp.AddAll(__ref._listglobal);
RDebugUtils.currentLine=4718606;
 //BA.debugLineNum = 4718606;BA.debugLine="listGlobal.Clear";
__ref._listglobal.Clear();
RDebugUtils.currentLine=4718607;
 //BA.debugLineNum = 4718607;BA.debugLine="For i = listTemp.Size - 1 To 0 Step -1";
{
final int step15 = (int) (-1);
final int limit15 = (int) (0);
for (_i = (int) (_listtemp.getSize()-1) ; (step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15); _i = ((int)(0 + _i + step15)) ) {
RDebugUtils.currentLine=4718608;
 //BA.debugLineNum = 4718608;BA.debugLine="listGlobal.Add(listTemp.Get(i))";
__ref._listglobal.Add(_listtemp.Get(_i));
 }
};
 };
 };
 };
RDebugUtils.currentLine=4718613;
 //BA.debugLineNum = 4718613;BA.debugLine="Return listGlobal";
if (true) return __ref._listglobal;
RDebugUtils.currentLine=4718614;
 //BA.debugLineNum = 4718614;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _listchildrennames(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisnode) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "listchildrennames"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listchildrennames", new Object[] {_thisnode});
int _i = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisitem = null;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub ListChildrenNames(thisNode As TreeItem)";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="listGlobal.Clear";
__ref._listglobal.Clear();
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="If thisNode <> Null Then";
if (_thisnode!= null) { 
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="If thisNode.IsInitialized = True Then";
if (_thisnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="If thisNode.Children.Size > 0 Then";
if (_thisnode.getChildren().getSize()>0) { 
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="For i = 0 To thisNode.Children.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_thisnode.getChildren().getSize()-1);
for (_i = (int) (0) ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="Dim thisItem As TreeItem";
_thisitem = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="thisItem = thisNode.children.get(i)";
_thisitem.setObject((javafx.scene.control.TreeItem)(_thisnode.getChildren().Get(_i)));
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="listGlobal.Add(thisItem.Text)";
__ref._listglobal.Add((Object)(_thisitem.getText()));
 }
};
 };
 };
 };
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="Return listGlobal";
if (true) return __ref._listglobal;
RDebugUtils.currentLine=4390926;
 //BA.debugLineNum = 4390926;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _listchildrennodes(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisnode) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "listchildrennodes"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listchildrennodes", new Object[] {_thisnode});
int _i = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisitem = null;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub ListChildrenNodes(thisNode As TreeItem)";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="listGlobal.Clear";
__ref._listglobal.Clear();
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="If thisNode <> Null Then";
if (_thisnode!= null) { 
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="If thisNode.IsInitialized = True Then";
if (_thisnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="If thisNode.Children.Size > 0 Then";
if (_thisnode.getChildren().getSize()>0) { 
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="For i = 0 To thisNode.Children.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_thisnode.getChildren().getSize()-1);
for (_i = (int) (0) ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="Dim thisItem As TreeItem";
_thisitem = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="thisItem = thisNode.children.get(i)";
_thisitem.setObject((javafx.scene.control.TreeItem)(_thisnode.getChildren().Get(_i)));
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="listGlobal.Add(thisItem)";
__ref._listglobal.Add((Object)(_thisitem.getObject()));
 }
};
 };
 };
 };
RDebugUtils.currentLine=4456461;
 //BA.debugLineNum = 4456461;BA.debugLine="Return listGlobal";
if (true) return __ref._listglobal;
RDebugUtils.currentLine=4456462;
 //BA.debugLineNum = 4456462;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _listsiblingnames(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisnode) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "listsiblingnames"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listsiblingnames", new Object[] {_thisnode});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode = null;
int _i = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisitem = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub ListSiblingNames(thisNode As TreeItem)";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="listGlobal.Clear";
__ref._listglobal.Clear();
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="If thisNode <> Null Then";
if (_thisnode!= null) { 
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="If thisNode.IsInitialized = True Then";
if (_thisnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="Dim parentNode As TreeItem = thisNode.Parent";
_parentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_parentnode = _thisnode.getParent();
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="If parentNode.IsInitialized = True Then";
if (_parentnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="If parentNode.Children.Size > 0 Then";
if (_parentnode.getChildren().getSize()>0) { 
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="For i = 0 To parentNode.Children.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_parentnode.getChildren().getSize()-1);
for (_i = (int) (0) ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="Dim thisItem As TreeItem";
_thisitem = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="thisItem = parentNode.children.get(i)";
_thisitem.setObject((javafx.scene.control.TreeItem)(_parentnode.getChildren().Get(_i)));
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="If thisItem.Text <> thisNode.Text Then";
if ((_thisitem.getText()).equals(_thisnode.getText()) == false) { 
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="listGlobal.Add(thisItem.Text)";
__ref._listglobal.Add((Object)(_thisitem.getText()));
 };
 }
};
 };
 };
 };
 };
RDebugUtils.currentLine=4522002;
 //BA.debugLineNum = 4522002;BA.debugLine="Return listGlobal";
if (true) return __ref._listglobal;
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _listsiblingnodes(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisnode) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "listsiblingnodes"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listsiblingnodes", new Object[] {_thisnode});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode = null;
int _i = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisitem = null;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub ListSiblingNodes(thisNode As TreeItem)";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="listGlobal.Clear";
__ref._listglobal.Clear();
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="If thisNode <> Null Then";
if (_thisnode!= null) { 
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="If thisNode.IsInitialized = True Then";
if (_thisnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="Dim parentNode As TreeItem = thisNode.Parent";
_parentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_parentnode = _thisnode.getParent();
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="If parentNode.IsInitialized = True Then";
if (_parentnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="If parentNode.Children.Size > 0 Then";
if (_parentnode.getChildren().getSize()>0) { 
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="For i = 0 To parentNode.Children.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_parentnode.getChildren().getSize()-1);
for (_i = (int) (0) ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="Dim thisItem As TreeItem";
_thisitem = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="thisItem = parentNode.children.get(i)";
_thisitem.setObject((javafx.scene.control.TreeItem)(_parentnode.getChildren().Get(_i)));
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="If thisItem.Text <> thisNode.Text Then";
if ((_thisitem.getText()).equals(_thisnode.getText()) == false) { 
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="listGlobal.Add(thisItem)";
__ref._listglobal.Add((Object)(_thisitem.getObject()));
 };
 }
};
 };
 };
 };
 };
RDebugUtils.currentLine=4587538;
 //BA.debugLineNum = 4587538;BA.debugLine="Return listGlobal";
if (true) return __ref._listglobal;
RDebugUtils.currentLine=4587539;
 //BA.debugLineNum = 4587539;BA.debugLine="End Sub";
return null;
}
public String  _makeparent(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnodeselected) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "makeparent"))
	return (String) Debug.delegate(ba, "makeparent", new Object[] {_objnodeselected});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _grandparentnode = null;
int _intindexofparent = 0;
int _intoriginaltreeitemindex = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tempnode = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper[] _args = null;
int _intnewindex = 0;
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub MakeParent(objNodeSelected As TreeItem)";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="pickup_and_drop_clear";
__ref._pickup_and_drop_clear(null);
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="If objNodeSelected <> Null Then";
if (_objnodeselected!= null) { 
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
if (_objnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
_parentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_parentnode = _objnodeselected.getParent();
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="If parentNode.IsInitialized = True Then";
if (_parentnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="Dim grandparentNode As TreeItem = parentNode.P";
_grandparentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_grandparentnode = _parentnode.getParent();
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="If grandparentNode.IsInitialized = True Then";
if (_grandparentnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="If unique_name(grandparentNode, objNodeSelect";
if (__ref._unique_name(null,_grandparentnode,_objnodeselected.getText())==__c.False) { 
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="Dim intIndexOfParent As Int = grandparentNod";
_intindexofparent = _grandparentnode.getChildren().IndexOf((Object)(_parentnode.getObject()));
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="Dim intOriginalTreeItemIndex As Int = parent";
_intoriginaltreeitemindex = _parentnode.getChildren().IndexOf((Object)(_objnodeselected.getObject()));
RDebugUtils.currentLine=4194317;
 //BA.debugLineNum = 4194317;BA.debugLine="If intIndexOfParent = grandparentNode.Childr";
if (_intindexofparent==_grandparentnode.getChildren().getSize()-1) { 
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="Dim tempNode As TreeItem";
_tempnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=4194319;
 //BA.debugLineNum = 4194319;BA.debugLine="tempNode = objNodeSelected";
_tempnode = _objnodeselected;
RDebugUtils.currentLine=4194320;
 //BA.debugLineNum = 4194320;BA.debugLine="parentNode.Children.RemoveAt(intOriginalTre";
_parentnode.getChildren().RemoveAt(_intoriginaltreeitemindex);
RDebugUtils.currentLine=4194321;
 //BA.debugLineNum = 4194321;BA.debugLine="CallSubDelayed3(Me, \"make_parent_add\", gran";
__c.CallSubDelayed3(ba,this,"make_parent_add",(Object)(_grandparentnode),(Object)(_tempnode));
 }else {
RDebugUtils.currentLine=4194323;
 //BA.debugLineNum = 4194323;BA.debugLine="Dim tempNode As TreeItem";
_tempnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=4194324;
 //BA.debugLineNum = 4194324;BA.debugLine="tempNode = objNodeSelected";
_tempnode = _objnodeselected;
RDebugUtils.currentLine=4194325;
 //BA.debugLineNum = 4194325;BA.debugLine="Dim args(3) As TreeItem";
_args = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper[(int) (3)];
{
int d0 = _args.length;
for (int i0 = 0;i0 < d0;i0++) {
_args[i0] = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
}
}
;
RDebugUtils.currentLine=4194326;
 //BA.debugLineNum = 4194326;BA.debugLine="args(0) = grandparentNode";
_args[(int) (0)] = _grandparentnode;
RDebugUtils.currentLine=4194327;
 //BA.debugLineNum = 4194327;BA.debugLine="args(1) = tempNode";
_args[(int) (1)] = _tempnode;
RDebugUtils.currentLine=4194328;
 //BA.debugLineNum = 4194328;BA.debugLine="Dim intNewIndex As Int = (grandparentNode.C";
_intnewindex = (int) ((_grandparentnode.getChildren().IndexOf((Object)(_parentnode.getObject()))+1));
RDebugUtils.currentLine=4194329;
 //BA.debugLineNum = 4194329;BA.debugLine="parentNode.Children.RemoveAt(intOriginalTre";
_parentnode.getChildren().RemoveAt(_intoriginaltreeitemindex);
RDebugUtils.currentLine=4194330;
 //BA.debugLineNum = 4194330;BA.debugLine="CallSubDelayed3(Me, \"make_parent_insert\", a";
__c.CallSubDelayed3(ba,this,"make_parent_insert",(Object)(_args),(Object)(_intnewindex));
 };
 };
 };
 };
 };
 };
RDebugUtils.currentLine=4194337;
 //BA.debugLineNum = 4194337;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper  _movedown(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnodeselected) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "movedown"))
	return (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) Debug.delegate(ba, "movedown", new Object[] {_objnodeselected});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode = null;
int _intoriginalindex = 0;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub MoveDown(objNodeSelected As TreeItem) A";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="pickup_and_drop_clear";
__ref._pickup_and_drop_clear(null);
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="If objNodeSelected <> Null Then";
if (_objnodeselected!= null) { 
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
if (_objnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
_parentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_parentnode = _objnodeselected.getParent();
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="If parentNode.IsInitialized = True Then";
if (_parentnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="If parentNode.Children.IndexOf(objNodeSelected";
if (_parentnode.getChildren().IndexOf((Object)(_objnodeselected.getObject()))<(_parentnode.getChildren().getSize()-1)) { 
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="Dim intOriginalIndex As Int = parentNode.Chil";
_intoriginalindex = _parentnode.getChildren().IndexOf((Object)(_objnodeselected.getObject()));
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="parentNode.Children.RemoveAt(intOriginalIndex";
_parentnode.getChildren().RemoveAt(_intoriginalindex);
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="parentNode.Children.InsertAt((intOriginalInde";
_parentnode.getChildren().InsertAt((int) ((_intoriginalindex+1)),(Object)(_objnodeselected.getObject()));
RDebugUtils.currentLine=3211275;
 //BA.debugLineNum = 3211275;BA.debugLine="Return parentNode.Children.Get(intOriginalInd";
if (true) return (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(_parentnode.getChildren().Get((int) (_intoriginalindex+1))));
 };
 };
 };
 };
RDebugUtils.currentLine=3211280;
 //BA.debugLineNum = 3211280;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper  _moveup(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnodeselected) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "moveup"))
	return (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) Debug.delegate(ba, "moveup", new Object[] {_objnodeselected});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode = null;
int _intoriginalindex = 0;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub MoveUp(objNodeSelected As TreeItem) As";
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="pickup_and_drop_clear";
__ref._pickup_and_drop_clear(null);
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="If objNodeSelected <> Null Then";
if (_objnodeselected!= null) { 
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
if (_objnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
_parentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_parentnode = _objnodeselected.getParent();
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="If parentNode.IsInitialized = True Then";
if (_parentnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="If parentNode.Children.IndexOf(objNodeSelected";
if (_parentnode.getChildren().IndexOf((Object)(_objnodeselected.getObject()))>0) { 
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="Dim intOriginalIndex As Int = parentNode.Chil";
_intoriginalindex = _parentnode.getChildren().IndexOf((Object)(_objnodeselected.getObject()));
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="parentNode.Children.RemoveAt(intOriginalIndex";
_parentnode.getChildren().RemoveAt(_intoriginalindex);
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="parentNode.Children.InsertAt((intOriginalInde";
_parentnode.getChildren().InsertAt((int) ((_intoriginalindex-1)),(Object)(_objnodeselected.getObject()));
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="Return parentNode.Children.Get(intOriginalInd";
if (true) return (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(_parentnode.getChildren().Get((int) (_intoriginalindex-1))));
 };
 };
 };
 };
RDebugUtils.currentLine=3145744;
 //BA.debugLineNum = 3145744;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper(), (javafx.scene.control.TreeItem)(__c.Null));
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="End Sub";
return null;
}
public String  _pickup(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objpickupnodeselected) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "pickup"))
	return (String) Debug.delegate(ba, "pickup", new Object[] {_objpickupnodeselected});
anywheresoftware.b4a.objects.collections.List _templist = null;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub Pickup(objPickupNodeSelected As TreeItem)";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If objPickupNodeSelected <> Null Then";
if (_objpickupnodeselected!= null) { 
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="If objPickupNodeSelected.IsInitialized = True Th";
if (_objpickupnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="pickup_and_drop_clear";
__ref._pickup_and_drop_clear(null);
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="mapPickup.Put(\"Text\", objPickupNodeSelected.Tex";
__ref._mappickup.Put((Object)("Text"),(Object)(_objpickupnodeselected.getText()));
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="mapPickup.Put(\"ParentNode\", objPickupNodeSelect";
__ref._mappickup.Put((Object)("ParentNode"),(Object)(_objpickupnodeselected.getParent().getObject()));
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="mapPickup.Put(\"IndexOf\", objPickupNodeSelected.";
__ref._mappickup.Put((Object)("IndexOf"),(Object)(_objpickupnodeselected.getParent().getChildren().IndexOf((Object)(_objpickupnodeselected.getObject()))));
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="If objPickupNodeSelected.Children.Size > 0 Then";
if (_objpickupnodeselected.getChildren().getSize()>0) { 
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="Dim templist As List";
_templist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="templist.Initialize";
_templist.Initialize();
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="templist.AddAll(objPickupNodeSelected.children";
_templist.AddAll(_objpickupnodeselected.getChildren());
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="mapPickup.Put(\"Children\", templist)";
__ref._mappickup.Put((Object)("Children"),(Object)(_templist.getObject()));
 };
 };
 };
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="End Sub";
return "";
}
public boolean  _remove(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnodeselected) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "remove"))
	return (Boolean) Debug.delegate(ba, "remove", new Object[] {_objnodeselected});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub Remove(objNodeSelected As TreeItem) As";
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="pickup_and_drop_clear";
__ref._pickup_and_drop_clear(null);
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="If objNodeSelected <> Null Then";
if (_objnodeselected!= null) { 
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
if (_objnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
_parentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_parentnode = _objnodeselected.getParent();
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="If parentNode.IsInitialized = True Then";
if (_parentnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="parentNode.Children.RemoveAt(parentNode.Childr";
_parentnode.getChildren().RemoveAt(_parentnode.getChildren().IndexOf((Object)(_objnodeselected.getObject())));
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
 };
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="End Sub";
return false;
}
public boolean  _rename(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnodeselected,String _strnewname) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "rename"))
	return (Boolean) Debug.delegate(ba, "rename", new Object[] {_objnodeselected,_strnewname});
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub Rename(objNodeSelected As TreeItem, str";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="pickup_and_drop_clear";
__ref._pickup_and_drop_clear(null);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="If objNodeSelected <> Null Then";
if (_objnodeselected!= null) { 
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
if (_objnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="If strNewName <> \"\" Then";
if ((_strnewname).equals("") == false) { 
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="If unique_name2(objNodeSelected.Parent, objNod";
if (__ref._unique_name2(null,_objnodeselected.getParent(),_objnodeselected,_strnewname)==__c.True) { 
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="If strNewName.EqualsIgnoreCase(Null) = False";
if (_strnewname.equalsIgnoreCase(BA.ObjectToString(__c.Null))==__c.False) { 
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="strNewName = strNewName.Replace(\"{\", \"\")";
_strnewname = _strnewname.replace("{","");
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="strNewName = strNewName.Replace(\"}\", \"\")";
_strnewname = _strnewname.replace("}","");
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="strNewName = strNewName.Replace(\"[\", \"\")";
_strnewname = _strnewname.replace("[","");
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="strNewName = strNewName.Replace(\"]\", \"\")";
_strnewname = _strnewname.replace("]","");
RDebugUtils.currentLine=3080206;
 //BA.debugLineNum = 3080206;BA.debugLine="strNewName = strNewName.Replace(\",\", \" \")";
_strnewname = _strnewname.replace(","," ");
RDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="strNewName = strNewName.Replace(\":\", \" \")";
_strnewname = _strnewname.replace(":"," ");
RDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="strNewName = strNewName.Replace($\"\"\"$, \"\")";
_strnewname = _strnewname.replace(("\""),"");
RDebugUtils.currentLine=3080209;
 //BA.debugLineNum = 3080209;BA.debugLine="objNodeSelected.Text = strNewName";
_objnodeselected.setText(_strnewname);
RDebugUtils.currentLine=3080210;
 //BA.debugLineNum = 3080210;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
 };
 };
 };
RDebugUtils.currentLine=3080216;
 //BA.debugLineNum = 3080216;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=3080217;
 //BA.debugLineNum = 3080217;BA.debugLine="End Sub";
return false;
}
public String  _buildtreefromjson(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper _tv,String _strjson) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "buildtreefromjson"))
	return (String) Debug.delegate(ba, "buildtreefromjson", new Object[] {_tv,_strjson});
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _tvlist = null;
anywheresoftware.b4a.objects.collections.Map _coltreeview = null;
String _strtext = "";
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _topnode = null;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub BuildTreeFromJSON(tv As TreeView, strJS";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="If tv <> Null Then";
if (_tv!= null) { 
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="If tv.IsInitialized = True Then";
if (_tv.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="If tv.Root.Children.IsInitialized = True The";
if (_tv.getRoot().getChildren().IsInitialized()==__c.True) { 
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="tv.Root.Children.Clear";
_tv.getRoot().getChildren().Clear();
 };
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="If strJSON <> \"\" Then";
if ((_strjson).equals("") == false) { 
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="parser.Initialize(strJSON)";
_parser.Initialize(_strjson);
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="Dim tvList As List = root.Get(\"TreeView\")";
_tvlist = new anywheresoftware.b4a.objects.collections.List();
_tvlist.setObject((java.util.List)(_root.Get((Object)("TreeView"))));
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="For Each colTreeView As Map In tvList";
_coltreeview = new anywheresoftware.b4a.objects.collections.Map();
final anywheresoftware.b4a.BA.IterableList group11 = _tvlist;
final int groupLen11 = group11.getSize();
for (int index11 = 0;index11 < groupLen11 ;index11++){
_coltreeview.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group11.Get(index11)));
RDebugUtils.currentLine=5111820;
 //BA.debugLineNum = 5111820;BA.debugLine="Dim strText As String = colTreeView.Get(\"Text";
_strtext = BA.ObjectToString(_coltreeview.Get((Object)("Text")));
RDebugUtils.currentLine=5111821;
 //BA.debugLineNum = 5111821;BA.debugLine="Dim topNode As TreeItem = AddRoot(tv, strText";
_topnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_topnode = __ref._addroot(null,_tv,_strtext);
RDebugUtils.currentLine=5111822;
 //BA.debugLineNum = 5111822;BA.debugLine="If topNode.IsInitialized = True Then";
if (_topnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=5111823;
 //BA.debugLineNum = 5111823;BA.debugLine="If colTreeView.ContainsKey(\"Children\") = Tru";
if (_coltreeview.ContainsKey((Object)("Children"))==__c.True) { 
RDebugUtils.currentLine=5111824;
 //BA.debugLineNum = 5111824;BA.debugLine="recurse_json_for_tree(topNode, colTreeView.";
__ref._recurse_json_for_tree(null,_topnode,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_coltreeview.Get((Object)("Children")))));
 };
 };
 }
;
 };
 };
 };
RDebugUtils.currentLine=5111831;
 //BA.debugLineNum = 5111831;BA.debugLine="End Sub";
return "";
}
public boolean  _hassiblings(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnodeselected) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "hassiblings"))
	return (Boolean) Debug.delegate(ba, "hassiblings", new Object[] {_objnodeselected});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode = null;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub HasSiblings(objNodeSelected As TreeItem) As Bo";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="If objNodeSelected <> Null Then";
if (_objnodeselected!= null) { 
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
if (_objnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
_parentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_parentnode = _objnodeselected.getParent();
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="If parentNode.IsInitialized = True Then";
if (_parentnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="If parentNode.Children.Size > 1 Then";
if (_parentnode.getChildren().getSize()>1) { 
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="Return True";
if (true) return __c.True;
 }else {
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 };
 };
RDebugUtils.currentLine=7405581;
 //BA.debugLineNum = 7405581;BA.debugLine="End Sub";
return false;
}
public boolean  _haschildren(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnodeselected) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "haschildren"))
	return (Boolean) Debug.delegate(ba, "haschildren", new Object[] {_objnodeselected});
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub HasChildren(objNodeSelected As TreeItem) As Bo";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="If objNodeSelected <> Null Then";
if (_objnodeselected!= null) { 
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
if (_objnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="If objNodeSelected.Children.Size > 0 Then";
if (_objnodeselected.getChildren().getSize()>0) { 
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Return True";
if (true) return __c.True;
 }else {
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 };
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="End Sub";
return false;
}
public boolean  _isfirstchild(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnodeselected) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "isfirstchild"))
	return (Boolean) Debug.delegate(ba, "isfirstchild", new Object[] {_objnodeselected});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode = null;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub IsFirstChild(objNodeSelected As TreeItem) As B";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="If objNodeSelected <> Null Then";
if (_objnodeselected!= null) { 
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
if (_objnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
_parentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_parentnode = _objnodeselected.getParent();
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="If parentNode.IsInitialized = True Then";
if (_parentnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="If parentNode.Children.IndexOf(objNodeSelected";
if (_parentnode.getChildren().IndexOf((Object)(_objnodeselected.getObject()))==0) { 
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
RDebugUtils.currentLine=3538956;
 //BA.debugLineNum = 3538956;BA.debugLine="End Sub";
return false;
}
public boolean  _islastchild(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnodeselected) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "islastchild"))
	return (Boolean) Debug.delegate(ba, "islastchild", new Object[] {_objnodeselected});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode = null;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub IsLastChild(objNodeSelected As TreeItem) As Bo";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="If objNodeSelected <> Null Then";
if (_objnodeselected!= null) { 
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
if (_objnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
_parentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_parentnode = _objnodeselected.getParent();
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="If parentNode.IsInitialized = True Then";
if (_parentnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="If parentNode.Children.IndexOf(objNodeSelected";
if (_parentnode.getChildren().IndexOf((Object)(_objnodeselected.getObject()))==(_parentnode.getChildren().getSize()-1)) { 
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
RDebugUtils.currentLine=3604492;
 //BA.debugLineNum = 3604492;BA.debugLine="End Sub";
return false;
}
public boolean  _isroot(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnodeselected) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "isroot"))
	return (Boolean) Debug.delegate(ba, "isroot", new Object[] {_objnodeselected});
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub IsRoot(objNodeSelected As TreeItem) As Boolean";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="If objNodeSelected <> Null Then";
if (_objnodeselected!= null) { 
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
if (_objnodeselected.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="If objNodeSelected.Parent.IsInitialized = True";
if (_objnodeselected.getParent().IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Return objNodeSelected.Parent.Root";
if (true) return _objnodeselected.getParent().getRoot();
 };
 };
 };
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="End Sub";
return false;
}
public boolean  _ispickup(b4j.example.treeviewmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "ispickup"))
	return (Boolean) Debug.delegate(ba, "ispickup", null);
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub IsPickup As Boolean";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="If mapPickup.ContainsKey(\"Text\") = True Then";
if (__ref._mappickup.ContainsKey((Object)("Text"))==__c.True) { 
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="If mapPickup.Get(\"Text\") <> \"\" Then";
if ((__ref._mappickup.Get((Object)("Text"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="End Sub";
return false;
}
public String  _pickup_and_drop_clear(b4j.example.treeviewmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "pickup_and_drop_clear"))
	return (String) Debug.delegate(ba, "pickup_and_drop_clear", null);
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub pickup_and_drop_clear";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="mapPickup.Clear";
__ref._mappickup.Clear();
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return "";
}
public boolean  _unique_name(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode,String _strname) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "unique_name"))
	return (Boolean) Debug.delegate(ba, "unique_name", new Object[] {_parentnode,_strname});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _childnode = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub unique_name(parentNode As TreeItem, st";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="If parentNode <> Null Then";
if (_parentnode!= null) { 
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="If parentNode.IsInitialized = True Then";
if (_parentnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="If strName <> \"\" Then";
if ((_strname).equals("") == false) { 
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="For Each childNode As TreeItem In parentNode.C";
_childnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
final anywheresoftware.b4a.BA.IterableList group4 = _parentnode.getChildren();
final int groupLen4 = group4.getSize();
for (int index4 = 0;index4 < groupLen4 ;index4++){
_childnode.setObject((javafx.scene.control.TreeItem)(group4.Get(index4)));
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="If childNode.Text = strName Then";
if ((_childnode.getText()).equals(_strname)) { 
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Return True";
if (true) return __c.True;
 };
 }
;
 };
 };
 };
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="End Sub";
return false;
}
public String  _recurse_json_for_tree(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _topnode,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "recurse_json_for_tree"))
	return (String) Debug.delegate(ba, "recurse_json_for_tree", new Object[] {_topnode,_children});
anywheresoftware.b4a.objects.collections.Map _colchildren = null;
String _strtext = "";
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti = null;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub recurse_json_for_tree(topNode As TreeI";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="If topNode <> Null Then";
if (_topnode!= null) { 
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="If topNode.IsInitialized = True Then";
if (_topnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="If children.IsInitialized = True Then";
if (_children.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="If children.Size > 0 Then";
if (_children.getSize()>0) { 
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="For Each colChildren As Map In children";
_colchildren = new anywheresoftware.b4a.objects.collections.Map();
final anywheresoftware.b4a.BA.IterableList group5 = _children;
final int groupLen5 = group5.getSize();
for (int index5 = 0;index5 < groupLen5 ;index5++){
_colchildren.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group5.Get(index5)));
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="Dim strText As String = colChildren.Ge";
_strtext = BA.ObjectToString(_colchildren.Get((Object)("Text")));
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="Dim ti As TreeItem = AddChild(topNode, strTe";
_ti = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_ti = __ref._addchild(null,_topnode,_strtext);
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="If colChildren.ContainsKey(\"Children\")";
if (_colchildren.ContainsKey((Object)("Children"))==__c.True) { 
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="recurse_json_for_tree(ti, colChildren.Get(\"";
__ref._recurse_json_for_tree(null,_ti,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colchildren.Get((Object)("Children")))));
 };
 }
;
 };
 };
 };
 };
RDebugUtils.currentLine=5046288;
 //BA.debugLineNum = 5046288;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.treeviewmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Public FamilyErrorNode As Int";
_familyerrornode = 0;
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Private listGlobal As List";
_listglobal = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Private mapPickup As Map";
_mappickup = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="End Sub";
return "";
}
public String  _drop_add(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "drop_add"))
	return (String) Debug.delegate(ba, "drop_add", new Object[] {_parentnode});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _newnode = null;
anywheresoftware.b4a.objects.collections.List _listtemp = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _child = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Private Sub drop_add(parentNode As TreeItem)";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="If parentNode <> Null Then";
if (_parentnode!= null) { 
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="If mapPickup.ContainsKey(\"Text\") = True Then";
if (__ref._mappickup.ContainsKey((Object)("Text"))==__c.True) { 
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="If parentNode.IsInitialized = True And mapPicku";
if (_parentnode.IsInitialized()==__c.True && (__ref._mappickup.Get((Object)("Text"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="If unique_name(parentNode, mapPickup.Get(\"Text";
if (__ref._unique_name(null,_parentnode,BA.ObjectToString(__ref._mappickup.Get((Object)("Text"))))==__c.False) { 
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="Dim newNode As TreeItem";
_newnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="newNode.Initialize(\"ti\", mapPickup.Get(\"Text\"";
_newnode.Initialize(ba,"ti",BA.ObjectToString(__ref._mappickup.Get((Object)("Text"))));
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="Dim listTemp As List = mapPickup.Get(\"Childre";
_listtemp = new anywheresoftware.b4a.objects.collections.List();
_listtemp.setObject((java.util.List)(__ref._mappickup.Get((Object)("Children"))));
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="If listTemp.IsInitialized = True Then";
if (_listtemp.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="If listTemp.Size > 0 Then";
if (_listtemp.getSize()>0) { 
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="For Each child As TreeItem In listTemp";
_child = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
final anywheresoftware.b4a.BA.IterableList group10 = _listtemp;
final int groupLen10 = group10.getSize();
for (int index10 = 0;index10 < groupLen10 ;index10++){
_child.setObject((javafx.scene.control.TreeItem)(group10.Get(index10)));
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="newNode.Children.Add(child)";
_newnode.getChildren().Add((Object)(_child.getObject()));
 }
;
 };
 };
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="parentNode.Children.Add(newNode)";
_parentnode.getChildren().Add((Object)(_newnode.getObject()));
RDebugUtils.currentLine=4063250;
 //BA.debugLineNum = 4063250;BA.debugLine="pickup_and_drop_clear";
__ref._pickup_and_drop_clear(null);
 };
 };
 };
 };
RDebugUtils.currentLine=4063255;
 //BA.debugLineNum = 4063255;BA.debugLine="End Sub";
return "";
}
public String  _drop_insert(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode,int _intindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "drop_insert"))
	return (String) Debug.delegate(ba, "drop_insert", new Object[] {_parentnode,_intindex});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _newnode = null;
anywheresoftware.b4a.objects.collections.List _listtemp = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _child = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Private Sub drop_insert(parentNode As TreeItem, in";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="If parentNode <> Null Then";
if (_parentnode!= null) { 
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="If mapPickup.ContainsKey(\"Text\") = True And mapP";
if (__ref._mappickup.ContainsKey((Object)("Text"))==__c.True && __ref._mappickup.ContainsKey((Object)("IndexOf"))==__c.True && __ref._mappickup.ContainsKey((Object)("Children"))==__c.True) { 
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="If parentNode.IsInitialized = True And mapPicku";
if (_parentnode.IsInitialized()==__c.True && (__ref._mappickup.Get((Object)("Text"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="If unique_name(parentNode, mapPickup.Get(\"Text";
if (__ref._unique_name(null,_parentnode,BA.ObjectToString(__ref._mappickup.Get((Object)("Text"))))==__c.False) { 
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="Dim newNode As TreeItem";
_newnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="newNode.Initialize(\"ti\", mapPickup.Get(\"Text\"";
_newnode.Initialize(ba,"ti",BA.ObjectToString(__ref._mappickup.Get((Object)("Text"))));
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="parentNode.Children.InsertAt(intIndex, newNod";
_parentnode.getChildren().InsertAt(_intindex,(Object)(_newnode.getObject()));
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="Dim listTemp As List = mapPickup.Get(\"Childre";
_listtemp = new anywheresoftware.b4a.objects.collections.List();
_listtemp.setObject((java.util.List)(__ref._mappickup.Get((Object)("Children"))));
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="If listTemp.IsInitialized = True Then";
if (_listtemp.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3997707;
 //BA.debugLineNum = 3997707;BA.debugLine="If listTemp.Size > 0 Then";
if (_listtemp.getSize()>0) { 
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="For Each child As TreeItem In listTemp";
_child = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
final anywheresoftware.b4a.BA.IterableList group11 = _listtemp;
final int groupLen11 = group11.getSize();
for (int index11 = 0;index11 < groupLen11 ;index11++){
_child.setObject((javafx.scene.control.TreeItem)(group11.Get(index11)));
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="newNode.Children.Add(child)";
_newnode.getChildren().Add((Object)(_child.getObject()));
 }
;
 };
 };
RDebugUtils.currentLine=3997714;
 //BA.debugLineNum = 3997714;BA.debugLine="pickup_and_drop_clear";
__ref._pickup_and_drop_clear(null);
 };
 };
 };
 };
RDebugUtils.currentLine=3997719;
 //BA.debugLineNum = 3997719;BA.debugLine="End Sub";
return "";
}
public boolean  _ischild(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnode1,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnode2) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "ischild"))
	return (Boolean) Debug.delegate(ba, "ischild", new Object[] {_objnode1,_objnode2});
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub IsChild(objNode1 As TreeItem, objNode2 As Tree";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="If objNode1 <> Null And objNode2 <> Null Then";
if (_objnode1!= null && _objnode2!= null) { 
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="If objNode1.IsInitialized = True And objNode2.Is";
if (_objnode1.IsInitialized()==__c.True && _objnode2.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="If objNode1.Parent = objNode2 Or objNode2.Paren";
if ((_objnode1.getParent()).equals(_objnode2) || (_objnode2.getParent()).equals(_objnode1)) { 
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
 };
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="End Sub";
return false;
}
public boolean  _issibling(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnode1,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _objnode2) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "issibling"))
	return (Boolean) Debug.delegate(ba, "issibling", new Object[] {_objnode1,_objnode2});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode = null;
int _i = 0;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub IsSibling(objNode1 As TreeItem, objNode2 As Tr";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="If objNode1 <> Null And objNode2 <> Null Then";
if (_objnode1!= null && _objnode2!= null) { 
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="If objNode1.IsInitialized = True And objNode2.Is";
if (_objnode1.IsInitialized()==__c.True && _objnode2.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Dim parentNode As TreeItem = objNode1.Parent";
_parentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_parentnode = _objnode1.getParent();
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="If parentNode.Children.Size > 0 Then";
if (_parentnode.getChildren().getSize()>0) { 
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="For i = 0 To parentNode.Children.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_parentnode.getChildren().getSize()-1);
for (_i = (int) (0) ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="If parentNode.Children.Get(i) = objNode2 Then";
if ((_parentnode.getChildren().Get(_i)).equals((Object)(_objnode2.getObject()))) { 
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="Return True";
if (true) return __c.True;
 };
 }
};
 };
 };
 };
RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=3407886;
 //BA.debugLineNum = 3407886;BA.debugLine="End Sub";
return false;
}
public String  _make_parent_add(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _grandparentnode,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _newnode) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "make_parent_add"))
	return (String) Debug.delegate(ba, "make_parent_add", new Object[] {_grandparentnode,_newnode});
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub make_parent_add(grandParentNode As Tre";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="If grandParentNode <> Null Then";
if (_grandparentnode!= null) { 
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="grandParentNode.Children.Add(newNode)";
_grandparentnode.getChildren().Add((Object)(_newnode.getObject()));
 };
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="End Sub";
return "";
}
public String  _make_parent_insert(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper[] _args,int _atindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "make_parent_insert"))
	return (String) Debug.delegate(ba, "make_parent_insert", new Object[] {_args,_atindex});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _grandparentnode = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _newnode = null;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Private Sub make_parent_insert(args() As TreeItem,";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim grandparentNode As TreeItem = args(0)";
_grandparentnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_grandparentnode = _args[(int) (0)];
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="If grandparentNode.IsInitialized = True Then";
if (_grandparentnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Dim newNode As TreeItem = args(1)";
_newnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_newnode = _args[(int) (1)];
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="If newNode.IsInitialized = True Then";
if (_newnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="grandparentNode.Children.InsertAt(atIndex, newN";
_grandparentnode.getChildren().InsertAt(_atindex,(Object)(_newnode.getObject()));
 };
 };
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="End Sub";
return "";
}
public String  _parentname(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper _objtreeview,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _childnode) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "parentname"))
	return (String) Debug.delegate(ba, "parentname", new Object[] {_objtreeview,_childnode});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentitem = null;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub ParentName(objTreeView As TreeView, chi";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="If objTreeView <> Null And childNode <> Null Then";
if (_objtreeview!= null && _childnode!= null) { 
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="If objTreeView.IsInitialized = True Then";
if (_objtreeview.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="If childNode.IsInitialized = True Then";
if (_childnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="If childNode.Parent <> Null Then";
if (_childnode.getParent()!= null) { 
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="Dim parentItem As TreeItem = childNode.Parent";
_parentitem = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_parentitem = _childnode.getParent();
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="Return parentItem.Text";
if (true) return _parentitem.getText();
 };
 };
 };
 };
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _recurse_tree_for_json(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisnode) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "recurse_tree_for_json"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "recurse_tree_for_json", new Object[] {_thisnode});
anywheresoftware.b4a.objects.collections.List _thislist = null;
int _i = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _newnode = null;
anywheresoftware.b4a.objects.collections.List _thisnodelist = null;
anywheresoftware.b4a.objects.collections.List _listtemp = null;
int _i2 = 0;
String _thisstring = "";
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub recurse_tree_for_json(thisNode As Tree";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim thisList As List";
_thislist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="thisList.Initialize";
_thislist.Initialize();
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="If thisNode <> Null Then";
if (_thisnode!= null) { 
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="If thisNode.IsInitialized Then";
if (_thisnode.IsInitialized()) { 
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="If thisNode.Children.Size > 0 Then";
if (_thisnode.getChildren().getSize()>0) { 
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="For i = 0 To thisNode.Children.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_thisnode.getChildren().getSize()-1);
for (_i = (int) (0) ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="Dim newNode As TreeItem = thisNode.Ch";
_newnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_newnode.setObject((javafx.scene.control.TreeItem)(_thisnode.getChildren().Get(_i)));
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="If newNode.IsInitialized = True Then";
if (_newnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="Dim thisNodeList As List = recurse_tree_for_j";
_thisnodelist = new anywheresoftware.b4a.objects.collections.List();
_thisnodelist = __ref._recurse_tree_for_json(null,_newnode);
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="If thisNodeList <> Null Then";
if (_thisnodelist!= null) { 
RDebugUtils.currentLine=4915213;
 //BA.debugLineNum = 4915213;BA.debugLine="If thisNodeList.IsInitialized = True Then";
if (_thisnodelist.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="Dim listTemp As List";
_listtemp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="listTemp.Initialize";
_listtemp.Initialize();
RDebugUtils.currentLine=4915216;
 //BA.debugLineNum = 4915216;BA.debugLine="For i2 = 0 To thisNodeList.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (_thisnodelist.getSize()-1);
for (_i2 = (int) (0) ; (step14 > 0 && _i2 <= limit14) || (step14 < 0 && _i2 >= limit14); _i2 = ((int)(0 + _i2 + step14)) ) {
RDebugUtils.currentLine=4915218;
 //BA.debugLineNum = 4915218;BA.debugLine="Dim thisstring As String = thisNodeList.Ge";
_thisstring = BA.ObjectToString(_thisnodelist.Get(_i2));
RDebugUtils.currentLine=4915219;
 //BA.debugLineNum = 4915219;BA.debugLine="If thisstring.IndexOf($\"{ \"Text\" :\"$) = -1";
if (_thisstring.indexOf(("{ \"Text\" :"))==-1) { 
RDebugUtils.currentLine=4915220;
 //BA.debugLineNum = 4915220;BA.debugLine="thisstring = $\"{ \"Text\" : \"${thisNodeList";
_thisstring = ("{ \"Text\" : \""+__c.SmartStringFormatter("",_thisnodelist.Get(_i2))+"\"}");
RDebugUtils.currentLine=4915221;
 //BA.debugLineNum = 4915221;BA.debugLine="If i2 < (thisNodeList.Size - 1) Then";
if (_i2<(_thisnodelist.getSize()-1)) { 
RDebugUtils.currentLine=4915222;
 //BA.debugLineNum = 4915222;BA.debugLine="If thisstring.CharAt(thisstring.Length -";
if (_thisstring.charAt((int) (_thisstring.length()-1))!=BA.ObjectToChar(",")) { 
RDebugUtils.currentLine=4915223;
 //BA.debugLineNum = 4915223;BA.debugLine="thisstring = thisstring & \",\"";
_thisstring = _thisstring+",";
 };
 };
 };
RDebugUtils.currentLine=4915227;
 //BA.debugLineNum = 4915227;BA.debugLine="thisstring = thisstring.Replace(\",,\", \",\")";
_thisstring = _thisstring.replace(",,",",");
RDebugUtils.currentLine=4915228;
 //BA.debugLineNum = 4915228;BA.debugLine="listTemp.Add(thisstring)";
_listtemp.Add((Object)(_thisstring));
 }
};
RDebugUtils.currentLine=4915230;
 //BA.debugLineNum = 4915230;BA.debugLine="If listTemp.Size > 0 Then";
if (_listtemp.getSize()>0) { 
RDebugUtils.currentLine=4915231;
 //BA.debugLineNum = 4915231;BA.debugLine="Dim thisstring As String = $\"{ \"Text\" : \"$";
_thisstring = ("{ \"Text\" : \""+__c.SmartStringFormatter("",(Object)(_newnode.getText()))+"\", \"Children\": "+__c.SmartStringFormatter("",(Object)(_listtemp.getObject()))+" }");
RDebugUtils.currentLine=4915232;
 //BA.debugLineNum = 4915232;BA.debugLine="If i < (thisNode.Children.Size - 1) Then";
if (_i<(_thisnode.getChildren().getSize()-1)) { 
RDebugUtils.currentLine=4915233;
 //BA.debugLineNum = 4915233;BA.debugLine="If thisstring.CharAt(thisstring.Length -";
if (_thisstring.charAt((int) (_thisstring.length()-1))!=BA.ObjectToChar(",")) { 
RDebugUtils.currentLine=4915234;
 //BA.debugLineNum = 4915234;BA.debugLine="thisstring = thisstring & \",\"";
_thisstring = _thisstring+",";
 };
 };
RDebugUtils.currentLine=4915237;
 //BA.debugLineNum = 4915237;BA.debugLine="thisstring = thisstring.Replace(\",,\", \",\")";
_thisstring = _thisstring.replace(",,",",");
RDebugUtils.currentLine=4915238;
 //BA.debugLineNum = 4915238;BA.debugLine="thisList.Add(thisstring)";
_thislist.Add((Object)(_thisstring));
 }else {
RDebugUtils.currentLine=4915240;
 //BA.debugLineNum = 4915240;BA.debugLine="Dim thisstring As String = $\"{ \"Text\" : \"$";
_thisstring = ("{ \"Text\" : \""+__c.SmartStringFormatter("",(Object)(_newnode.getText()))+"\" }");
RDebugUtils.currentLine=4915241;
 //BA.debugLineNum = 4915241;BA.debugLine="If i < (thisNode.Children.Size - 1) Then";
if (_i<(_thisnode.getChildren().getSize()-1)) { 
RDebugUtils.currentLine=4915242;
 //BA.debugLineNum = 4915242;BA.debugLine="If thisstring.CharAt(thisstring.Length -";
if (_thisstring.charAt((int) (_thisstring.length()-1))!=BA.ObjectToChar(",")) { 
RDebugUtils.currentLine=4915243;
 //BA.debugLineNum = 4915243;BA.debugLine="thisstring = thisstring & \",\"";
_thisstring = _thisstring+",";
 };
 };
RDebugUtils.currentLine=4915246;
 //BA.debugLineNum = 4915246;BA.debugLine="thisstring = thisstring.Replace(\",,\", \",\")";
_thisstring = _thisstring.replace(",,",",");
RDebugUtils.currentLine=4915247;
 //BA.debugLineNum = 4915247;BA.debugLine="thisList.Add(thisstring)";
_thislist.Add((Object)(_thisstring));
 };
 };
 }else {
RDebugUtils.currentLine=4915251;
 //BA.debugLineNum = 4915251;BA.debugLine="thisList.Add(newNode.Text)";
_thislist.Add((Object)(_newnode.getText()));
 };
 };
 }
};
 };
 };
 };
RDebugUtils.currentLine=4915258;
 //BA.debugLineNum = 4915258;BA.debugLine="If thisList.Size > 0 Then";
if (_thislist.getSize()>0) { 
RDebugUtils.currentLine=4915259;
 //BA.debugLineNum = 4915259;BA.debugLine="Return thisList";
if (true) return _thislist;
 };
RDebugUtils.currentLine=4915261;
 //BA.debugLineNum = 4915261;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _recurse_tree_for_xml(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _thisnode) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "recurse_tree_for_xml"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "recurse_tree_for_xml", new Object[] {_thisnode});
anywheresoftware.b4a.objects.collections.List _thislist = null;
int _i = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _newnode = null;
anywheresoftware.b4a.objects.collections.List _thisnodelist = null;
anywheresoftware.b4a.objects.collections.List _listtemp = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matchchildtopic = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matchtext = null;
int _i2 = 0;
String _thisstring = "";
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Private Sub recurse_tree_for_xml(thisNode As TreeI";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Dim thisList As List";
_thislist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="thisList.Initialize";
_thislist.Initialize();
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="If thisNode <> Null Then";
if (_thisnode!= null) { 
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="If thisNode.IsInitialized Then";
if (_thisnode.IsInitialized()) { 
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="If thisNode.Children.Size > 0 Then";
if (_thisnode.getChildren().getSize()>0) { 
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="For i = 0 To thisNode.Children.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_thisnode.getChildren().getSize()-1);
for (_i = (int) (0) ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="Dim newNode As TreeItem = thisNode.Ch";
_newnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
_newnode.setObject((javafx.scene.control.TreeItem)(_thisnode.getChildren().Get(_i)));
RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="If newNode.IsInitialized = True Then";
if (_newnode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="Dim thisNodeList As List = recurse_tree_for_x";
_thisnodelist = new anywheresoftware.b4a.objects.collections.List();
_thisnodelist = __ref._recurse_tree_for_xml(null,_newnode);
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="If thisNodeList <> Null Then";
if (_thisnodelist!= null) { 
RDebugUtils.currentLine=5177357;
 //BA.debugLineNum = 5177357;BA.debugLine="If thisNodeList.IsInitialized = True Then";
if (_thisnodelist.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="Dim listTemp As List";
_listtemp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5177359;
 //BA.debugLineNum = 5177359;BA.debugLine="listTemp.Initialize";
_listtemp.Initialize();
RDebugUtils.currentLine=5177360;
 //BA.debugLineNum = 5177360;BA.debugLine="Dim matchChildTopic As Matcher";
_matchchildtopic = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
RDebugUtils.currentLine=5177361;
 //BA.debugLineNum = 5177361;BA.debugLine="Dim matchText As Matcher";
_matchtext = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
RDebugUtils.currentLine=5177362;
 //BA.debugLineNum = 5177362;BA.debugLine="For i2 = 0 To thisNodeList.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_thisnodelist.getSize()-1);
for (_i2 = (int) (0) ; (step16 > 0 && _i2 <= limit16) || (step16 < 0 && _i2 >= limit16); _i2 = ((int)(0 + _i2 + step16)) ) {
RDebugUtils.currentLine=5177364;
 //BA.debugLineNum = 5177364;BA.debugLine="Dim thisstring As String";
_thisstring = "";
RDebugUtils.currentLine=5177365;
 //BA.debugLineNum = 5177365;BA.debugLine="matchChildTopic = Regex.Matcher(\"^\\s*<Chil";
_matchchildtopic = __c.Regex.Matcher("^\\s*<ChildTopic>",BA.ObjectToString(_thisnodelist.Get(_i2)));
RDebugUtils.currentLine=5177366;
 //BA.debugLineNum = 5177366;BA.debugLine="matchText = Regex.Matcher(\"^\\s*<Text>\", th";
_matchtext = __c.Regex.Matcher("^\\s*<Text>",BA.ObjectToString(_thisnodelist.Get(_i2)));
RDebugUtils.currentLine=5177367;
 //BA.debugLineNum = 5177367;BA.debugLine="If matchChildTopic.Find = True Then";
if (_matchchildtopic.Find()==__c.True) { 
RDebugUtils.currentLine=5177368;
 //BA.debugLineNum = 5177368;BA.debugLine="thisstring = thisNodeList.Get(i2)";
_thisstring = BA.ObjectToString(_thisnodelist.Get(_i2));
 }else 
{RDebugUtils.currentLine=5177369;
 //BA.debugLineNum = 5177369;BA.debugLine="Else If matchText.Find = True Then";
if (_matchtext.Find()==__c.True) { 
RDebugUtils.currentLine=5177370;
 //BA.debugLineNum = 5177370;BA.debugLine="thisstring = $\"<ChildTopic>\"$ & CRLF & th";
_thisstring = ("<ChildTopic>")+__c.CRLF+BA.ObjectToString(_thisnodelist.Get(_i2))+__c.CRLF+("</ChildTopic>");
 }else {
RDebugUtils.currentLine=5177372;
 //BA.debugLineNum = 5177372;BA.debugLine="thisstring = $\"<ChildTopic>\"$ & CRLF & $\"";
_thisstring = ("<ChildTopic>")+__c.CRLF+("<Text>"+__c.SmartStringFormatter("",_thisnodelist.Get(_i2))+"</Text>")+__c.CRLF+("</ChildTopic>");
 }};
RDebugUtils.currentLine=5177374;
 //BA.debugLineNum = 5177374;BA.debugLine="listTemp.Add(thisstring)";
_listtemp.Add((Object)(_thisstring));
 }
};
RDebugUtils.currentLine=5177376;
 //BA.debugLineNum = 5177376;BA.debugLine="If listTemp.Size > 0 Then";
if (_listtemp.getSize()>0) { 
RDebugUtils.currentLine=5177377;
 //BA.debugLineNum = 5177377;BA.debugLine="Dim thisstring As String";
_thisstring = "";
RDebugUtils.currentLine=5177378;
 //BA.debugLineNum = 5177378;BA.debugLine="If Generation(newNode) = 1 Then";
if (__ref._generation(null,_newnode)==1) { 
RDebugUtils.currentLine=5177379;
 //BA.debugLineNum = 5177379;BA.debugLine="thisstring = $\"<Topic>\"$ & CRLF & $\"<Text";
_thisstring = ("<Topic>")+__c.CRLF+("<Text>")+_newnode.getText()+("</Text>")+__c.CRLF+("<Children>");
 }else {
RDebugUtils.currentLine=5177381;
 //BA.debugLineNum = 5177381;BA.debugLine="thisstring = $\"<ChildTopic>\"$ & CRLF &";
_thisstring = ("<ChildTopic>")+__c.CRLF+("<Text>")+_newnode.getText()+("</Text>")+__c.CRLF+("<Children>");
 };
RDebugUtils.currentLine=5177383;
 //BA.debugLineNum = 5177383;BA.debugLine="For i2 = 0 To listTemp.Size - 1";
{
final int step36 = 1;
final int limit36 = (int) (_listtemp.getSize()-1);
for (_i2 = (int) (0) ; (step36 > 0 && _i2 <= limit36) || (step36 < 0 && _i2 >= limit36); _i2 = ((int)(0 + _i2 + step36)) ) {
RDebugUtils.currentLine=5177384;
 //BA.debugLineNum = 5177384;BA.debugLine="thisstring = thisstring & CRLF & listTemp";
_thisstring = _thisstring+__c.CRLF+BA.ObjectToString(_listtemp.Get(_i2));
 }
};
RDebugUtils.currentLine=5177387;
 //BA.debugLineNum = 5177387;BA.debugLine="If Generation(newNode) = 1 Then";
if (__ref._generation(null,_newnode)==1) { 
RDebugUtils.currentLine=5177388;
 //BA.debugLineNum = 5177388;BA.debugLine="thisstring = thisstring & CRLF & $\"</Chil";
_thisstring = _thisstring+__c.CRLF+("</Children>")+__c.CRLF+("</Topic>");
 }else {
RDebugUtils.currentLine=5177390;
 //BA.debugLineNum = 5177390;BA.debugLine="thisstring = thisstring & CRLF & $\"</Chil";
_thisstring = _thisstring+__c.CRLF+("</Children></ChildTopic>");
 };
RDebugUtils.currentLine=5177393;
 //BA.debugLineNum = 5177393;BA.debugLine="thisList.Add(thisstring)";
_thislist.Add((Object)(_thisstring));
 }else {
RDebugUtils.currentLine=5177395;
 //BA.debugLineNum = 5177395;BA.debugLine="Dim thisstring As String";
_thisstring = "";
RDebugUtils.currentLine=5177396;
 //BA.debugLineNum = 5177396;BA.debugLine="If Generation(newNode) = 1 Then";
if (__ref._generation(null,_newnode)==1) { 
RDebugUtils.currentLine=5177397;
 //BA.debugLineNum = 5177397;BA.debugLine="thisstring = $\"<Text>\"$ & newNode.Text &";
_thisstring = ("<Text>")+_newnode.getText()+("</Text>")+__c.CRLF;
 }else {
RDebugUtils.currentLine=5177399;
 //BA.debugLineNum = 5177399;BA.debugLine="thisstring = $\"<ChildTopic>\"$ & CRLF &";
_thisstring = ("<ChildTopic>")+__c.CRLF+("<Text>")+_newnode.getText()+("</Text>")+__c.CRLF+("</ChildTopic>");
 };
RDebugUtils.currentLine=5177401;
 //BA.debugLineNum = 5177401;BA.debugLine="thisList.Add(thisstring)";
_thislist.Add((Object)(_thisstring));
 };
 };
 }else {
RDebugUtils.currentLine=5177405;
 //BA.debugLineNum = 5177405;BA.debugLine="thisList.Add(newNode.Text)";
_thislist.Add((Object)(_newnode.getText()));
 };
 };
 }
};
 };
 };
 };
RDebugUtils.currentLine=5177412;
 //BA.debugLineNum = 5177412;BA.debugLine="If thisList.Size > 0 Then";
if (_thislist.getSize()>0) { 
RDebugUtils.currentLine=5177413;
 //BA.debugLineNum = 5177413;BA.debugLine="Return thisList";
if (true) return _thislist;
 };
RDebugUtils.currentLine=5177415;
 //BA.debugLineNum = 5177415;BA.debugLine="End Sub";
return null;
}
public boolean  _unique_name2(b4j.example.treeviewmanager __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _parentnode,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _comparenode,String _strname) throws Exception{
__ref = this;
RDebugUtils.currentModule="treeviewmanager";
if (Debug.shouldDelegate(ba, "unique_name2"))
	return (Boolean) Debug.delegate(ba, "unique_name2", new Object[] {_parentnode,_comparenode,_strname});
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _childnode = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub unique_name2(parentNode As TreeItem, c";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="If parentNode <> Null And compareNode <> Null The";
if (_parentnode!= null && _comparenode!= null) { 
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="If parentNode.IsInitialized = True And compareNo";
if (_parentnode.IsInitialized()==__c.True && _comparenode.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="If strName <> \"\" Then";
if ((_strname).equals("") == false) { 
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="For Each childNode As TreeItem In parentNode.C";
_childnode = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
final anywheresoftware.b4a.BA.IterableList group4 = _parentnode.getChildren();
final int groupLen4 = group4.getSize();
for (int index4 = 0;index4 < groupLen4 ;index4++){
_childnode.setObject((javafx.scene.control.TreeItem)(group4.Get(index4)));
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="If childNode.Text = strName And childNode <>";
if ((_childnode.getText()).equals(_strname) && (_childnode).equals(_comparenode) == false) { 
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Return True";
if (true) return __c.True;
 };
 }
;
 };
 };
 };
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="End Sub";
return false;
}
}