package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class treeviewmanager_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _objnodeselected,RemoteObject _strnewname) throws Exception{
try {
		Debug.PushSubsStack("AddChild (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("addchild")) return __ref.runUserSub(false, "treeviewmanager","addchild", __ref, _objnodeselected, _strnewname);
RemoteObject _newnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("objNodeSelected", _objnodeselected);
Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 88;BA.debugLine="Public Sub AddChild(objNodeSelected As TreeItem, s";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="pickup_and_drop_clear";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.treeviewmanager.class, "_pickup_and_drop_clear");
 BA.debugLineNum = 91;BA.debugLine="If objNodeSelected <> Null Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("N",_objnodeselected)) { 
 BA.debugLineNum = 92;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 93;BA.debugLine="If strNewName <> \"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",_strnewname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 95;BA.debugLine="If unique_name(objNodeSelected, strNewName) =";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.treeviewmanager.class, "_unique_name",(Object)(_objnodeselected),(Object)(_strnewname)),treeviewmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 96;BA.debugLine="If strNewName.EqualsIgnoreCase(Null) = False";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_strnewname.runMethod(true,"equalsIgnoreCase",(Object)(BA.ObjectToString(treeviewmanager.__c.getField(false,"Null")))),treeviewmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 98;BA.debugLine="strNewName = strNewName.Replace(\"{\", \"\")";
Debug.ShouldStop(2);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("{")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 99;BA.debugLine="strNewName = strNewName.Replace(\"}\", \"\")";
Debug.ShouldStop(4);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("}")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 100;BA.debugLine="strNewName = strNewName.Replace(\"[\", \"\")";
Debug.ShouldStop(8);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 101;BA.debugLine="strNewName = strNewName.Replace(\"]\", \"\")";
Debug.ShouldStop(16);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 102;BA.debugLine="strNewName = strNewName.Replace(\",\", \" \")";
Debug.ShouldStop(32);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 103;BA.debugLine="strNewName = strNewName.Replace(\":\", \" \")";
Debug.ShouldStop(64);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString(":")),(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 104;BA.debugLine="strNewName = strNewName.Replace($\"\"\"$, \"\")";
Debug.ShouldStop(128);
_strnewname = _strnewname.runMethod(true,"replace",(Object)((RemoteObject.createImmutable("\""))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 105;BA.debugLine="Dim newNode As TreeItem";
Debug.ShouldStop(256);
_newnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("newNode", _newnode);
 BA.debugLineNum = 106;BA.debugLine="newNode.Initialize(\"ti\", strNewName)";
Debug.ShouldStop(512);
_newnode.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ti")),(Object)(_strnewname));
 BA.debugLineNum = 107;BA.debugLine="objNodeSelected.Children.Add(newNode)";
Debug.ShouldStop(1024);
_objnodeselected.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_newnode.getObject())));
 BA.debugLineNum = 108;BA.debugLine="Return newNode";
Debug.ShouldStop(2048);
if (true) return _newnode;
 };
 };
 };
 };
 };
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addroot(RemoteObject __ref,RemoteObject _tv,RemoteObject _strnewname) throws Exception{
try {
		Debug.PushSubsStack("AddRoot (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("addroot")) return __ref.runUserSub(false, "treeviewmanager","addroot", __ref, _tv, _strnewname);
RemoteObject _newnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("tv", _tv);
Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 59;BA.debugLine="Public Sub AddRoot(tv As TreeView, strNewName As S";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="pickup_and_drop_clear";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.treeviewmanager.class, "_pickup_and_drop_clear");
 BA.debugLineNum = 62;BA.debugLine="If tv <> Null Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("N",_tv)) { 
 BA.debugLineNum = 63;BA.debugLine="If tv.IsInitialized = True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_tv.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 64;BA.debugLine="If strNewName <> \"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",_strnewname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 66;BA.debugLine="If unique_name(tv.Root, strNewName) = False Th";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.treeviewmanager.class, "_unique_name",(Object)(_tv.runMethod(false,"getRoot")),(Object)(_strnewname)),treeviewmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 67;BA.debugLine="If strNewName.EqualsIgnoreCase(Null) = False";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_strnewname.runMethod(true,"equalsIgnoreCase",(Object)(BA.ObjectToString(treeviewmanager.__c.getField(false,"Null")))),treeviewmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 69;BA.debugLine="strNewName = strNewName.Replace(\"{\", \"\")";
Debug.ShouldStop(16);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("{")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 70;BA.debugLine="strNewName = strNewName.Replace(\"}\", \"\")";
Debug.ShouldStop(32);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("}")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 71;BA.debugLine="strNewName = strNewName.Replace(\"[\", \"\")";
Debug.ShouldStop(64);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 72;BA.debugLine="strNewName = strNewName.Replace(\"]\", \"\")";
Debug.ShouldStop(128);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 73;BA.debugLine="strNewName = strNewName.Replace(\",\", \" \")";
Debug.ShouldStop(256);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 74;BA.debugLine="strNewName = strNewName.Replace(\":\", \" \")";
Debug.ShouldStop(512);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString(":")),(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 75;BA.debugLine="strNewName = strNewName.Replace($\"\"\"$, \"\")";
Debug.ShouldStop(1024);
_strnewname = _strnewname.runMethod(true,"replace",(Object)((RemoteObject.createImmutable("\""))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 76;BA.debugLine="Dim newNode As TreeItem";
Debug.ShouldStop(2048);
_newnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("newNode", _newnode);
 BA.debugLineNum = 77;BA.debugLine="newNode.Initialize(\"ti\",strNewName)";
Debug.ShouldStop(4096);
_newnode.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ti")),(Object)(_strnewname));
 BA.debugLineNum = 78;BA.debugLine="tv.root.Children.Add(newNode)";
Debug.ShouldStop(8192);
_tv.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_newnode.getObject())));
 BA.debugLineNum = 79;BA.debugLine="Return newNode";
Debug.ShouldStop(16384);
if (true) return _newnode;
 };
 };
 };
 };
 };
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addsibling(RemoteObject __ref,RemoteObject _objnodeselected,RemoteObject _strnewname) throws Exception{
try {
		Debug.PushSubsStack("AddSibling (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("addsibling")) return __ref.runUserSub(false, "treeviewmanager","addsibling", __ref, _objnodeselected, _strnewname);
RemoteObject _parentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _newnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("objNodeSelected", _objnodeselected);
Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 21;BA.debugLine="Public Sub AddSibling(objNodeSelected As TreeItem,";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="pickup_and_drop_clear";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.treeviewmanager.class, "_pickup_and_drop_clear");
 BA.debugLineNum = 24;BA.debugLine="If objNodeSelected <> Null Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("N",_objnodeselected)) { 
 BA.debugLineNum = 25;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 26;BA.debugLine="If strNewName <> \"\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("!",_strnewname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 27;BA.debugLine="If unique_name(objNodeSelected.Parent, strNewN";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.treeviewmanager.class, "_unique_name",(Object)(_objnodeselected.runMethod(false,"getParent")),(Object)(_strnewname)),treeviewmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 29;BA.debugLine="strNewName = strNewName.Replace(\"{\", \"\")";
Debug.ShouldStop(268435456);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("{")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 30;BA.debugLine="strNewName = strNewName.Replace(\"}\", \"\")";
Debug.ShouldStop(536870912);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("}")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 31;BA.debugLine="strNewName = strNewName.Replace(\"[\", \"\")";
Debug.ShouldStop(1073741824);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 32;BA.debugLine="strNewName = strNewName.Replace(\"]\", \"\")";
Debug.ShouldStop(-2147483648);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 33;BA.debugLine="strNewName = strNewName.Replace(\",\", \" \")";
Debug.ShouldStop(1);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 34;BA.debugLine="strNewName = strNewName.Replace(\":\", \" \")";
Debug.ShouldStop(2);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString(":")),(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 35;BA.debugLine="strNewName = strNewName.Replace($\"\"\"$, \"\")";
Debug.ShouldStop(4);
_strnewname = _strnewname.runMethod(true,"replace",(Object)((RemoteObject.createImmutable("\""))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 36;BA.debugLine="If strNewName.EqualsIgnoreCase(Null) = False";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_strnewname.runMethod(true,"equalsIgnoreCase",(Object)(BA.ObjectToString(treeviewmanager.__c.getField(false,"Null")))),treeviewmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 37;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected";
Debug.ShouldStop(16);
_parentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_parentnode = _objnodeselected.runMethod(false,"getParent");Debug.locals.put("parentNode", _parentnode);Debug.locals.put("parentNode", _parentnode);
 BA.debugLineNum = 38;BA.debugLine="If parentNode.IsInitialized = True Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 39;BA.debugLine="Dim newNode As TreeItem";
Debug.ShouldStop(64);
_newnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("newNode", _newnode);
 BA.debugLineNum = 40;BA.debugLine="newNode.Initialize(\"ti\", strNewName)";
Debug.ShouldStop(128);
_newnode.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ti")),(Object)(_strnewname));
 BA.debugLineNum = 41;BA.debugLine="If parentNode.Children.IndexOf(objNodeSelec";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_objnodeselected.getObject()))),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_parentnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 42;BA.debugLine="parentNode.Children.Add(newNode)";
Debug.ShouldStop(512);
_parentnode.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_newnode.getObject())));
 }else {
 BA.debugLineNum = 44;BA.debugLine="parentNode.Children.InsertAt((parentNode.C";
Debug.ShouldStop(2048);
_parentnode.runMethod(false,"getChildren").runVoidMethod ("InsertAt",(Object)((RemoteObject.solve(new RemoteObject[] {_parentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_objnodeselected.getObject()))),RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)((_newnode.getObject())));
 };
 };
 };
 };
 };
 };
 };
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtreefromjson(RemoteObject __ref,RemoteObject _tv,RemoteObject _strjson) throws Exception{
try {
		Debug.PushSubsStack("BuildTreeFromJSON (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,780);
if (RapidSub.canDelegate("buildtreefromjson")) return __ref.runUserSub(false, "treeviewmanager","buildtreefromjson", __ref, _tv, _strjson);
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tvlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coltreeview = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _strtext = RemoteObject.createImmutable("");
RemoteObject _topnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("tv", _tv);
Debug.locals.put("strJSON", _strjson);
 BA.debugLineNum = 780;BA.debugLine="Public Sub BuildTreeFromJSON(tv As TreeView, strJS";
Debug.ShouldStop(2048);
 BA.debugLineNum = 781;BA.debugLine="If tv <> Null Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("N",_tv)) { 
 BA.debugLineNum = 782;BA.debugLine="If tv.IsInitialized = True Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_tv.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 783;BA.debugLine="If tv.Root.Children.IsInitialized = True The";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_tv.runMethod(false,"getRoot").runMethod(false,"getChildren").runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 784;BA.debugLine="tv.Root.Children.Clear";
Debug.ShouldStop(32768);
_tv.runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Clear");
 };
 BA.debugLineNum = 786;BA.debugLine="If strJSON <> \"\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",_strjson,BA.ObjectToString(""))) { 
 BA.debugLineNum = 787;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(262144);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 788;BA.debugLine="parser.Initialize(strJSON)";
Debug.ShouldStop(524288);
_parser.runVoidMethod ("Initialize",(Object)(_strjson));
 BA.debugLineNum = 789;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1048576);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 790;BA.debugLine="Dim tvList As List = root.Get(\"TreeView\")";
Debug.ShouldStop(2097152);
_tvlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tvlist.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TreeView")))));Debug.locals.put("tvList", _tvlist);
 BA.debugLineNum = 791;BA.debugLine="For Each colTreeView As Map In tvList";
Debug.ShouldStop(4194304);
_coltreeview = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
final RemoteObject group11 = _tvlist;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get();
for (int index11 = 0;index11 < groupLen11 ;index11++){
_coltreeview.setObject(group11.runMethod(false,"Get",index11));
Debug.locals.put("colTreeView", _coltreeview);
 BA.debugLineNum = 792;BA.debugLine="Dim strText As String = colTreeView.Get(\"Text";
Debug.ShouldStop(8388608);
_strtext = BA.ObjectToString(_coltreeview.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text")))));Debug.locals.put("strText", _strtext);Debug.locals.put("strText", _strtext);
 BA.debugLineNum = 793;BA.debugLine="Dim topNode As TreeItem = AddRoot(tv, strText";
Debug.ShouldStop(16777216);
_topnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_topnode = __ref.runClassMethod (b4j.example.treeviewmanager.class, "_addroot",(Object)(_tv),(Object)(_strtext));Debug.locals.put("topNode", _topnode);Debug.locals.put("topNode", _topnode);
 BA.debugLineNum = 794;BA.debugLine="If topNode.IsInitialized = True Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_topnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 795;BA.debugLine="If colTreeView.ContainsKey(\"Children\") = Tru";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_coltreeview.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Children")))),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 796;BA.debugLine="recurse_json_for_tree(topNode, colTreeView.";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.treeviewmanager.class, "_recurse_json_for_tree",(Object)(_topnode),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _coltreeview.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Children"))))));
 };
 };
 }
Debug.locals.put("colTreeView", _coltreeview);
;
 };
 };
 };
 BA.debugLineNum = 803;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
treeviewmanager._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",treeviewmanager._fx);
 //BA.debugLineNum = 4;BA.debugLine="Public FamilyErrorNode As Int";
treeviewmanager._familyerrornode = RemoteObject.createImmutable(0);__ref.setField("_familyerrornode",treeviewmanager._familyerrornode);
 //BA.debugLineNum = 5;BA.debugLine="Private listGlobal As List";
treeviewmanager._listglobal = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_listglobal",treeviewmanager._listglobal);
 //BA.debugLineNum = 6;BA.debugLine="Private mapPickup As Map";
treeviewmanager._mappickup = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mappickup",treeviewmanager._mappickup);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _drop(RemoteObject __ref,RemoteObject _objdropatnodeselected) throws Exception{
try {
		Debug.PushSubsStack("Drop (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("drop")) return __ref.runUserSub(false, "treeviewmanager","drop", __ref, _objdropatnodeselected);
RemoteObject _pickupparentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _dropparentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _intdropindex = RemoteObject.createImmutable(0);
Debug.locals.put("objDropAtNodeSelected", _objdropatnodeselected);
 BA.debugLineNum = 343;BA.debugLine="Sub Drop(objDropAtNodeSelected As TreeItem)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="If objDropAtNodeSelected <> Null Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("N",_objdropatnodeselected)) { 
 BA.debugLineNum = 345;BA.debugLine="If objDropAtNodeSelected.IsInitialized = True Th";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_objdropatnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 346;BA.debugLine="If mapPickup.ContainsKey(\"Text\") = True And map";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mappickup").runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Text")))),treeviewmanager.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_mappickup").runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("IndexOf")))),treeviewmanager.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_mappickup").runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Children")))),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 347;BA.debugLine="Dim pickupParentNode As TreeItem = mapPickup.G";
Debug.ShouldStop(67108864);
_pickupparentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_pickupparentnode.setObject(__ref.getField(false,"_mappickup").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ParentNode")))));Debug.locals.put("pickupParentNode", _pickupparentnode);
 BA.debugLineNum = 348;BA.debugLine="Dim dropParentNode As TreeItem = objDropAtNode";
Debug.ShouldStop(134217728);
_dropparentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_dropparentnode = _objdropatnodeselected.runMethod(false,"getParent");Debug.locals.put("dropParentNode", _dropparentnode);Debug.locals.put("dropParentNode", _dropparentnode);
 BA.debugLineNum = 349;BA.debugLine="Dim intDropIndex As Int = dropParentNode.Child";
Debug.ShouldStop(268435456);
_intdropindex = _dropparentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_objdropatnodeselected.getObject())));Debug.locals.put("intDropIndex", _intdropindex);Debug.locals.put("intDropIndex", _intdropindex);
 BA.debugLineNum = 350;BA.debugLine="If intDropIndex = dropParentNode.Children.Size";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_intdropindex,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_dropparentnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 351;BA.debugLine="pickupParentNode.Children.RemoveAt(mapPickup.";
Debug.ShouldStop(1073741824);
_pickupparentnode.runMethod(false,"getChildren").runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, __ref.getField(false,"_mappickup").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IndexOf")))))));
 BA.debugLineNum = 352;BA.debugLine="CallSubDelayed2(Me, \"drop_add\", dropParentNod";
Debug.ShouldStop(-2147483648);
treeviewmanager.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("drop_add")),(Object)((_dropparentnode)));
 }else {
 BA.debugLineNum = 354;BA.debugLine="pickupParentNode.Children.RemoveAt(mapPickup.";
Debug.ShouldStop(2);
_pickupparentnode.runMethod(false,"getChildren").runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, __ref.getField(false,"_mappickup").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IndexOf")))))));
 BA.debugLineNum = 355;BA.debugLine="CallSubDelayed3(Me, \"drop_insert\", dropParent";
Debug.ShouldStop(4);
treeviewmanager.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("drop_insert")),(Object)((_dropparentnode)),(Object)(((RemoteObject.solve(new RemoteObject[] {_dropparentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_objdropatnodeselected.getObject()))),RemoteObject.createImmutable(1)}, "+",1, 1)))));
 };
 };
 };
 };
 BA.debugLineNum = 360;BA.debugLine="End Sub";
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
public static RemoteObject  _drop_add(RemoteObject __ref,RemoteObject _parentnode) throws Exception{
try {
		Debug.PushSubsStack("drop_add (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,389);
if (RapidSub.canDelegate("drop_add")) return __ref.runUserSub(false, "treeviewmanager","drop_add", __ref, _parentnode);
RemoteObject _newnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _listtemp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _child = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("parentNode", _parentnode);
 BA.debugLineNum = 389;BA.debugLine="Private Sub drop_add(parentNode As TreeItem)";
Debug.ShouldStop(16);
 BA.debugLineNum = 390;BA.debugLine="If parentNode <> Null Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("N",_parentnode)) { 
 BA.debugLineNum = 391;BA.debugLine="If mapPickup.ContainsKey(\"Text\") = True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mappickup").runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Text")))),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 392;BA.debugLine="If parentNode.IsInitialized = True And mapPicku";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",__ref.getField(false,"_mappickup").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 394;BA.debugLine="If unique_name(parentNode, mapPickup.Get(\"Text";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.treeviewmanager.class, "_unique_name",(Object)(_parentnode),(Object)(BA.ObjectToString(__ref.getField(false,"_mappickup").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text"))))))),treeviewmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 395;BA.debugLine="Dim newNode As TreeItem";
Debug.ShouldStop(1024);
_newnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("newNode", _newnode);
 BA.debugLineNum = 396;BA.debugLine="newNode.Initialize(\"ti\", mapPickup.Get(\"Text\"";
Debug.ShouldStop(2048);
_newnode.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ti")),(Object)(BA.ObjectToString(__ref.getField(false,"_mappickup").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text")))))));
 BA.debugLineNum = 397;BA.debugLine="Dim listTemp As List = mapPickup.Get(\"Childre";
Debug.ShouldStop(4096);
_listtemp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listtemp.setObject(__ref.getField(false,"_mappickup").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Children")))));Debug.locals.put("listTemp", _listtemp);
 BA.debugLineNum = 398;BA.debugLine="If listTemp.IsInitialized = True Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_listtemp.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 399;BA.debugLine="If listTemp.Size > 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_listtemp.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 400;BA.debugLine="For Each child As TreeItem In listTemp";
Debug.ShouldStop(32768);
_child = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
final RemoteObject group10 = _listtemp;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
for (int index10 = 0;index10 < groupLen10 ;index10++){
_child.setObject(group10.runMethod(false,"Get",index10));
Debug.locals.put("child", _child);
 BA.debugLineNum = 401;BA.debugLine="newNode.Children.Add(child)";
Debug.ShouldStop(65536);
_newnode.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_child.getObject())));
 }
Debug.locals.put("child", _child);
;
 };
 };
 BA.debugLineNum = 405;BA.debugLine="parentNode.Children.Add(newNode)";
Debug.ShouldStop(1048576);
_parentnode.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_newnode.getObject())));
 BA.debugLineNum = 407;BA.debugLine="pickup_and_drop_clear";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.treeviewmanager.class, "_pickup_and_drop_clear");
 };
 };
 };
 };
 BA.debugLineNum = 412;BA.debugLine="End Sub";
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
public static RemoteObject  _drop_insert(RemoteObject __ref,RemoteObject _parentnode,RemoteObject _intindex) throws Exception{
try {
		Debug.PushSubsStack("drop_insert (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,363);
if (RapidSub.canDelegate("drop_insert")) return __ref.runUserSub(false, "treeviewmanager","drop_insert", __ref, _parentnode, _intindex);
RemoteObject _newnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _listtemp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _child = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("parentNode", _parentnode);
Debug.locals.put("intIndex", _intindex);
 BA.debugLineNum = 363;BA.debugLine="Private Sub drop_insert(parentNode As TreeItem, in";
Debug.ShouldStop(1024);
 BA.debugLineNum = 364;BA.debugLine="If parentNode <> Null Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("N",_parentnode)) { 
 BA.debugLineNum = 365;BA.debugLine="If mapPickup.ContainsKey(\"Text\") = True And mapP";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mappickup").runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Text")))),treeviewmanager.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_mappickup").runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("IndexOf")))),treeviewmanager.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_mappickup").runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Children")))),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 366;BA.debugLine="If parentNode.IsInitialized = True And mapPicku";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",__ref.getField(false,"_mappickup").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 368;BA.debugLine="If unique_name(parentNode, mapPickup.Get(\"Text";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.treeviewmanager.class, "_unique_name",(Object)(_parentnode),(Object)(BA.ObjectToString(__ref.getField(false,"_mappickup").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text"))))))),treeviewmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 369;BA.debugLine="Dim newNode As TreeItem";
Debug.ShouldStop(65536);
_newnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("newNode", _newnode);
 BA.debugLineNum = 370;BA.debugLine="newNode.Initialize(\"ti\", mapPickup.Get(\"Text\"";
Debug.ShouldStop(131072);
_newnode.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ti")),(Object)(BA.ObjectToString(__ref.getField(false,"_mappickup").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text")))))));
 BA.debugLineNum = 371;BA.debugLine="parentNode.Children.InsertAt(intIndex, newNod";
Debug.ShouldStop(262144);
_parentnode.runMethod(false,"getChildren").runVoidMethod ("InsertAt",(Object)(_intindex),(Object)((_newnode.getObject())));
 BA.debugLineNum = 372;BA.debugLine="Dim listTemp As List = mapPickup.Get(\"Childre";
Debug.ShouldStop(524288);
_listtemp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listtemp.setObject(__ref.getField(false,"_mappickup").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Children")))));Debug.locals.put("listTemp", _listtemp);
 BA.debugLineNum = 373;BA.debugLine="If listTemp.IsInitialized = True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_listtemp.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 374;BA.debugLine="If listTemp.Size > 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_listtemp.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 375;BA.debugLine="For Each child As TreeItem In listTemp";
Debug.ShouldStop(4194304);
_child = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
final RemoteObject group11 = _listtemp;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get();
for (int index11 = 0;index11 < groupLen11 ;index11++){
_child.setObject(group11.runMethod(false,"Get",index11));
Debug.locals.put("child", _child);
 BA.debugLineNum = 376;BA.debugLine="newNode.Children.Add(child)";
Debug.ShouldStop(8388608);
_newnode.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_child.getObject())));
 }
Debug.locals.put("child", _child);
;
 };
 };
 BA.debugLineNum = 381;BA.debugLine="pickup_and_drop_clear";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.treeviewmanager.class, "_pickup_and_drop_clear");
 };
 };
 };
 };
 BA.debugLineNum = 386;BA.debugLine="End Sub";
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
public static RemoteObject  _generation(RemoteObject __ref,RemoteObject _objnodeselected) throws Exception{
try {
		Debug.PushSubsStack("Generation (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,310);
if (RapidSub.canDelegate("generation")) return __ref.runUserSub(false, "treeviewmanager","generation", __ref, _objnodeselected);
RemoteObject _intgenerationcounter = RemoteObject.createImmutable(0);
RemoteObject _testnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("objNodeSelected", _objnodeselected);
 BA.debugLineNum = 310;BA.debugLine="Sub Generation(objNodeSelected As TreeItem) As Int";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 311;BA.debugLine="If objNodeSelected <> Null Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("N",_objnodeselected)) { 
 BA.debugLineNum = 312;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 313;BA.debugLine="Dim intGenerationCounter As Int = 1";
Debug.ShouldStop(16777216);
_intgenerationcounter = BA.numberCast(int.class, 1);Debug.locals.put("intGenerationCounter", _intgenerationcounter);Debug.locals.put("intGenerationCounter", _intgenerationcounter);
 BA.debugLineNum = 314;BA.debugLine="Dim testNode As TreeItem = objNodeSelected";
Debug.ShouldStop(33554432);
_testnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_testnode = _objnodeselected;Debug.locals.put("testNode", _testnode);Debug.locals.put("testNode", _testnode);
 BA.debugLineNum = 315;BA.debugLine="Do While testNode.Parent.Root = False";
Debug.ShouldStop(67108864);
while (RemoteObject.solveBoolean("=",_testnode.runMethod(false,"getParent").runMethod(true,"getRoot"),treeviewmanager.__c.getField(true,"False"))) {
 BA.debugLineNum = 316;BA.debugLine="testNode = testNode.Parent";
Debug.ShouldStop(134217728);
_testnode = _testnode.runMethod(false,"getParent");Debug.locals.put("testNode", _testnode);
 BA.debugLineNum = 317;BA.debugLine="intGenerationCounter = intGenerationCounter +";
Debug.ShouldStop(268435456);
_intgenerationcounter = RemoteObject.solve(new RemoteObject[] {_intgenerationcounter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("intGenerationCounter", _intgenerationcounter);
 }
;
 BA.debugLineNum = 319;BA.debugLine="Return intGenerationCounter";
Debug.ShouldStop(1073741824);
if (true) return _intgenerationcounter;
 };
 };
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _haschildren(RemoteObject __ref,RemoteObject _objnodeselected) throws Exception{
try {
		Debug.PushSubsStack("HasChildren (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("haschildren")) return __ref.runUserSub(false, "treeviewmanager","haschildren", __ref, _objnodeselected);
Debug.locals.put("objNodeSelected", _objnodeselected);
 BA.debugLineNum = 200;BA.debugLine="Sub HasChildren(objNodeSelected As TreeItem) As Bo";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="If objNodeSelected <> Null Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("N",_objnodeselected)) { 
 BA.debugLineNum = 202;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 203;BA.debugLine="If objNodeSelected.Children.Size > 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_objnodeselected.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 204;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return treeviewmanager.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 206;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) return treeviewmanager.__c.getField(true,"False");
 };
 };
 };
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hassiblings(RemoteObject __ref,RemoteObject _objnodeselected) throws Exception{
try {
		Debug.PushSubsStack("HasSiblings (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,213);
if (RapidSub.canDelegate("hassiblings")) return __ref.runUserSub(false, "treeviewmanager","hassiblings", __ref, _objnodeselected);
RemoteObject _parentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("objNodeSelected", _objnodeselected);
 BA.debugLineNum = 213;BA.debugLine="Sub HasSiblings(objNodeSelected As TreeItem) As Bo";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 214;BA.debugLine="If objNodeSelected <> Null Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("N",_objnodeselected)) { 
 BA.debugLineNum = 215;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 216;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
Debug.ShouldStop(8388608);
_parentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_parentnode = _objnodeselected.runMethod(false,"getParent");Debug.locals.put("parentNode", _parentnode);Debug.locals.put("parentNode", _parentnode);
 BA.debugLineNum = 217;BA.debugLine="If parentNode.IsInitialized = True Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 218;BA.debugLine="If parentNode.Children.Size > 1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_parentnode.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 219;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) return treeviewmanager.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 221;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) return treeviewmanager.__c.getField(true,"False");
 };
 };
 };
 };
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _objtreeview) throws Exception{
try {
		Debug.PushSubsStack("Initialize (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "treeviewmanager","initialize", __ref, _ba, _objtreeview);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("objTreeView", _objtreeview);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(objTreeView As TreeView)";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="FamilyErrorNode = -1";
Debug.ShouldStop(1024);
__ref.setField ("_familyerrornode",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 12;BA.debugLine="listGlobal.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_listglobal").runVoidMethod ("Initialize");
 BA.debugLineNum = 13;BA.debugLine="mapPickup.Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_mappickup").runVoidMethod ("Initialize");
 BA.debugLineNum = 14;BA.debugLine="End Sub";
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
public static RemoteObject  _ischild(RemoteObject __ref,RemoteObject _objnode1,RemoteObject _objnode2) throws Exception{
try {
		Debug.PushSubsStack("IsChild (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("ischild")) return __ref.runUserSub(false, "treeviewmanager","ischild", __ref, _objnode1, _objnode2);
Debug.locals.put("objNode1", _objnode1);
Debug.locals.put("objNode2", _objnode2);
 BA.debugLineNum = 246;BA.debugLine="Sub IsChild(objNode1 As TreeItem, objNode2 As Tree";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 247;BA.debugLine="If objNode1 <> Null And objNode2 <> Null Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("N",_objnode1) && RemoteObject.solveBoolean("N",_objnode2)) { 
 BA.debugLineNum = 248;BA.debugLine="If objNode1.IsInitialized = True And objNode2.Is";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_objnode1.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_objnode2.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 249;BA.debugLine="If objNode1.Parent = objNode2 Or objNode2.Paren";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_objnode1.runMethod(false,"getParent"),_objnode2) || RemoteObject.solveBoolean("=",_objnode2.runMethod(false,"getParent"),_objnode1)) { 
 BA.debugLineNum = 250;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) return treeviewmanager.__c.getField(true,"True");
 };
 };
 };
 BA.debugLineNum = 254;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) return treeviewmanager.__c.getField(true,"False");
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isfirstchild(RemoteObject __ref,RemoteObject _objnodeselected) throws Exception{
try {
		Debug.PushSubsStack("IsFirstChild (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,258);
if (RapidSub.canDelegate("isfirstchild")) return __ref.runUserSub(false, "treeviewmanager","isfirstchild", __ref, _objnodeselected);
RemoteObject _parentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("objNodeSelected", _objnodeselected);
 BA.debugLineNum = 258;BA.debugLine="Sub IsFirstChild(objNodeSelected As TreeItem) As B";
Debug.ShouldStop(2);
 BA.debugLineNum = 259;BA.debugLine="If objNodeSelected <> Null Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("N",_objnodeselected)) { 
 BA.debugLineNum = 260;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 261;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
Debug.ShouldStop(16);
_parentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_parentnode = _objnodeselected.runMethod(false,"getParent");Debug.locals.put("parentNode", _parentnode);Debug.locals.put("parentNode", _parentnode);
 BA.debugLineNum = 262;BA.debugLine="If parentNode.IsInitialized = True Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 263;BA.debugLine="If parentNode.Children.IndexOf(objNodeSelected";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_objnodeselected.getObject()))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 264;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) return treeviewmanager.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 267;BA.debugLine="Return False";
Debug.ShouldStop(1024);
if (true) return treeviewmanager.__c.getField(true,"False");
 };
 };
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _islastchild(RemoteObject __ref,RemoteObject _objnodeselected) throws Exception{
try {
		Debug.PushSubsStack("IsLastChild (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,273);
if (RapidSub.canDelegate("islastchild")) return __ref.runUserSub(false, "treeviewmanager","islastchild", __ref, _objnodeselected);
RemoteObject _parentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("objNodeSelected", _objnodeselected);
 BA.debugLineNum = 273;BA.debugLine="Sub IsLastChild(objNodeSelected As TreeItem) As Bo";
Debug.ShouldStop(65536);
 BA.debugLineNum = 274;BA.debugLine="If objNodeSelected <> Null Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("N",_objnodeselected)) { 
 BA.debugLineNum = 275;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 276;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
Debug.ShouldStop(524288);
_parentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_parentnode = _objnodeselected.runMethod(false,"getParent");Debug.locals.put("parentNode", _parentnode);Debug.locals.put("parentNode", _parentnode);
 BA.debugLineNum = 277;BA.debugLine="If parentNode.IsInitialized = True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 278;BA.debugLine="If parentNode.Children.IndexOf(objNodeSelected";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_objnodeselected.getObject()))),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {_parentnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 279;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) return treeviewmanager.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 282;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
if (true) return treeviewmanager.__c.getField(true,"False");
 };
 };
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ispickup(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsPickup (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,299);
if (RapidSub.canDelegate("ispickup")) return __ref.runUserSub(false, "treeviewmanager","ispickup", __ref);
 BA.debugLineNum = 299;BA.debugLine="Sub IsPickup As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 300;BA.debugLine="If mapPickup.ContainsKey(\"Text\") = True Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mappickup").runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Text")))),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 301;BA.debugLine="If mapPickup.Get(\"Text\") <> \"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_mappickup").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 302;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) return treeviewmanager.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 305;BA.debugLine="Return False";
Debug.ShouldStop(65536);
if (true) return treeviewmanager.__c.getField(true,"False");
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isroot(RemoteObject __ref,RemoteObject _objnodeselected) throws Exception{
try {
		Debug.PushSubsStack("IsRoot (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("isroot")) return __ref.runUserSub(false, "treeviewmanager","isroot", __ref, _objnodeselected);
Debug.locals.put("objNodeSelected", _objnodeselected);
 BA.debugLineNum = 288;BA.debugLine="Sub IsRoot(objNodeSelected As TreeItem) As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="If objNodeSelected <> Null Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("N",_objnodeselected)) { 
 BA.debugLineNum = 290;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 291;BA.debugLine="If objNodeSelected.Parent.IsInitialized = True";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(false,"getParent").runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 292;BA.debugLine="Return objNodeSelected.Parent.Root";
Debug.ShouldStop(8);
if (true) return _objnodeselected.runMethod(false,"getParent").runMethod(true,"getRoot");
 };
 };
 };
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _issibling(RemoteObject __ref,RemoteObject _objnode1,RemoteObject _objnode2) throws Exception{
try {
		Debug.PushSubsStack("IsSibling (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("issibling")) return __ref.runUserSub(false, "treeviewmanager","issibling", __ref, _objnode1, _objnode2);
RemoteObject _parentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
int _i = 0;
Debug.locals.put("objNode1", _objnode1);
Debug.locals.put("objNode2", _objnode2);
 BA.debugLineNum = 229;BA.debugLine="Sub IsSibling(objNode1 As TreeItem, objNode2 As Tr";
Debug.ShouldStop(16);
 BA.debugLineNum = 230;BA.debugLine="If objNode1 <> Null And objNode2 <> Null Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("N",_objnode1) && RemoteObject.solveBoolean("N",_objnode2)) { 
 BA.debugLineNum = 231;BA.debugLine="If objNode1.IsInitialized = True And objNode2.Is";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_objnode1.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_objnode2.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 232;BA.debugLine="Dim parentNode As TreeItem = objNode1.Parent";
Debug.ShouldStop(128);
_parentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_parentnode = _objnode1.runMethod(false,"getParent");Debug.locals.put("parentNode", _parentnode);Debug.locals.put("parentNode", _parentnode);
 BA.debugLineNum = 233;BA.debugLine="If parentNode.Children.Size > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_parentnode.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 234;BA.debugLine="For i = 0 To parentNode.Children.Size - 1";
Debug.ShouldStop(512);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_parentnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 235;BA.debugLine="If parentNode.Children.Get(i) = objNode2 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(false,"getChildren").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),(_objnode2.getObject()))) { 
 BA.debugLineNum = 236;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return treeviewmanager.__c.getField(true,"True");
 };
 }
}Debug.locals.put("i", _i);
;
 };
 };
 };
 BA.debugLineNum = 242;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) return treeviewmanager.__c.getField(true,"False");
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listantecedentnames(RemoteObject __ref,RemoteObject _thisnode) throws Exception{
try {
		Debug.PushSubsStack("ListAntecedentNames (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,560);
if (RapidSub.canDelegate("listantecedentnames")) return __ref.runUserSub(false, "treeviewmanager","listantecedentnames", __ref, _thisnode);
RemoteObject _testnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _listtemp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
Debug.locals.put("thisNode", _thisnode);
 BA.debugLineNum = 560;BA.debugLine="Public Sub ListAntecedentNames(thisNode As TreeIte";
Debug.ShouldStop(32768);
 BA.debugLineNum = 561;BA.debugLine="listGlobal.Clear";
Debug.ShouldStop(65536);
__ref.getField(false,"_listglobal").runVoidMethod ("Clear");
 BA.debugLineNum = 562;BA.debugLine="If thisNode <> Null Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("N",_thisnode)) { 
 BA.debugLineNum = 563;BA.debugLine="If thisNode.IsInitialized = True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_thisnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 564;BA.debugLine="Dim testNode As TreeItem";
Debug.ShouldStop(524288);
_testnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("testNode", _testnode);
 BA.debugLineNum = 565;BA.debugLine="testNode = thisNode";
Debug.ShouldStop(1048576);
_testnode = _thisnode;Debug.locals.put("testNode", _testnode);
 BA.debugLineNum = 566;BA.debugLine="Do Until testNode.Root = True";
Debug.ShouldStop(2097152);
while (!(RemoteObject.solveBoolean("=",_testnode.runMethod(true,"getRoot"),treeviewmanager.__c.getField(true,"True")))) {
 BA.debugLineNum = 567;BA.debugLine="listGlobal.Add(testNode.Text)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_listglobal").runVoidMethod ("Add",(Object)((_testnode.runMethod(true,"getText"))));
 BA.debugLineNum = 568;BA.debugLine="testNode = testNode.Parent";
Debug.ShouldStop(8388608);
_testnode = _testnode.runMethod(false,"getParent");Debug.locals.put("testNode", _testnode);
 }
;
 BA.debugLineNum = 570;BA.debugLine="If listGlobal.Size > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_listglobal").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 571;BA.debugLine="Dim listTemp As List";
Debug.ShouldStop(67108864);
_listtemp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listTemp", _listtemp);
 BA.debugLineNum = 572;BA.debugLine="listTemp.Initialize";
Debug.ShouldStop(134217728);
_listtemp.runVoidMethod ("Initialize");
 BA.debugLineNum = 573;BA.debugLine="listTemp.AddAll(listGlobal)";
Debug.ShouldStop(268435456);
_listtemp.runVoidMethod ("AddAll",(Object)(__ref.getField(false,"_listglobal")));
 BA.debugLineNum = 574;BA.debugLine="listGlobal.Clear";
Debug.ShouldStop(536870912);
__ref.getField(false,"_listglobal").runVoidMethod ("Clear");
 BA.debugLineNum = 575;BA.debugLine="For i = listTemp.Size - 1 To 0 Step -1";
Debug.ShouldStop(1073741824);
{
final int step15 = (int) (0 + -(double) (0 + 1));
final int limit15 = 0;
for (_i = RemoteObject.solve(new RemoteObject[] {_listtemp.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ; (step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15); _i = ((int)(0 + _i + step15)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 576;BA.debugLine="listGlobal.Add(listTemp.Get(i))";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_listglobal").runVoidMethod ("Add",(Object)(_listtemp.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 };
 BA.debugLineNum = 581;BA.debugLine="Return listGlobal";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_listglobal");
 BA.debugLineNum = 582;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listantecedentnodes(RemoteObject __ref,RemoteObject _thisnode) throws Exception{
try {
		Debug.PushSubsStack("ListAntecedentNodes (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,586);
if (RapidSub.canDelegate("listantecedentnodes")) return __ref.runUserSub(false, "treeviewmanager","listantecedentnodes", __ref, _thisnode);
RemoteObject _testnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _listtemp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
Debug.locals.put("thisNode", _thisnode);
 BA.debugLineNum = 586;BA.debugLine="Public Sub ListAntecedentNodes(thisNode As TreeIte";
Debug.ShouldStop(512);
 BA.debugLineNum = 587;BA.debugLine="listGlobal.Clear";
Debug.ShouldStop(1024);
__ref.getField(false,"_listglobal").runVoidMethod ("Clear");
 BA.debugLineNum = 588;BA.debugLine="If thisNode <> Null Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("N",_thisnode)) { 
 BA.debugLineNum = 589;BA.debugLine="If thisNode.IsInitialized = True Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_thisnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 590;BA.debugLine="Dim testNode As TreeItem";
Debug.ShouldStop(8192);
_testnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("testNode", _testnode);
 BA.debugLineNum = 591;BA.debugLine="testNode = thisNode";
Debug.ShouldStop(16384);
_testnode = _thisnode;Debug.locals.put("testNode", _testnode);
 BA.debugLineNum = 592;BA.debugLine="Do Until testNode.Root = True";
Debug.ShouldStop(32768);
while (!(RemoteObject.solveBoolean("=",_testnode.runMethod(true,"getRoot"),treeviewmanager.__c.getField(true,"True")))) {
 BA.debugLineNum = 593;BA.debugLine="listGlobal.Add(testNode)";
Debug.ShouldStop(65536);
__ref.getField(false,"_listglobal").runVoidMethod ("Add",(Object)((_testnode.getObject())));
 BA.debugLineNum = 594;BA.debugLine="testNode = testNode.Parent";
Debug.ShouldStop(131072);
_testnode = _testnode.runMethod(false,"getParent");Debug.locals.put("testNode", _testnode);
 }
;
 BA.debugLineNum = 596;BA.debugLine="If listGlobal.Size > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_listglobal").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 597;BA.debugLine="Dim listTemp As List";
Debug.ShouldStop(1048576);
_listtemp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listTemp", _listtemp);
 BA.debugLineNum = 598;BA.debugLine="listTemp.Initialize";
Debug.ShouldStop(2097152);
_listtemp.runVoidMethod ("Initialize");
 BA.debugLineNum = 599;BA.debugLine="listTemp.AddAll(listGlobal)";
Debug.ShouldStop(4194304);
_listtemp.runVoidMethod ("AddAll",(Object)(__ref.getField(false,"_listglobal")));
 BA.debugLineNum = 600;BA.debugLine="listGlobal.Clear";
Debug.ShouldStop(8388608);
__ref.getField(false,"_listglobal").runVoidMethod ("Clear");
 BA.debugLineNum = 601;BA.debugLine="For i = listTemp.Size - 1 To 0 Step -1";
Debug.ShouldStop(16777216);
{
final int step15 = (int) (0 + -(double) (0 + 1));
final int limit15 = 0;
for (_i = RemoteObject.solve(new RemoteObject[] {_listtemp.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ; (step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15); _i = ((int)(0 + _i + step15)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 602;BA.debugLine="listGlobal.Add(listTemp.Get(i))";
Debug.ShouldStop(33554432);
__ref.getField(false,"_listglobal").runVoidMethod ("Add",(Object)(_listtemp.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 };
 BA.debugLineNum = 607;BA.debugLine="Return listGlobal";
Debug.ShouldStop(1073741824);
if (true) return __ref.getField(false,"_listglobal");
 BA.debugLineNum = 608;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listchildrennames(RemoteObject __ref,RemoteObject _thisnode) throws Exception{
try {
		Debug.PushSubsStack("ListChildrenNames (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,478);
if (RapidSub.canDelegate("listchildrennames")) return __ref.runUserSub(false, "treeviewmanager","listchildrennames", __ref, _thisnode);
int _i = 0;
RemoteObject _thisitem = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("thisNode", _thisnode);
 BA.debugLineNum = 478;BA.debugLine="Public Sub ListChildrenNames(thisNode As TreeItem)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 479;BA.debugLine="listGlobal.Clear";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_listglobal").runVoidMethod ("Clear");
 BA.debugLineNum = 480;BA.debugLine="If thisNode <> Null Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("N",_thisnode)) { 
 BA.debugLineNum = 481;BA.debugLine="If thisNode.IsInitialized = True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_thisnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 482;BA.debugLine="If thisNode.Children.Size > 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_thisnode.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 483;BA.debugLine="For i = 0 To thisNode.Children.Size - 1";
Debug.ShouldStop(4);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_thisnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 484;BA.debugLine="Dim thisItem As TreeItem";
Debug.ShouldStop(8);
_thisitem = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("thisItem", _thisitem);
 BA.debugLineNum = 485;BA.debugLine="thisItem = thisNode.children.get(i)";
Debug.ShouldStop(16);
_thisitem.setObject(_thisnode.runMethod(false,"getChildren").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 486;BA.debugLine="listGlobal.Add(thisItem.Text)";
Debug.ShouldStop(32);
__ref.getField(false,"_listglobal").runVoidMethod ("Add",(Object)((_thisitem.runMethod(true,"getText"))));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 };
 BA.debugLineNum = 491;BA.debugLine="Return listGlobal";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_listglobal");
 BA.debugLineNum = 492;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listchildrennodes(RemoteObject __ref,RemoteObject _thisnode) throws Exception{
try {
		Debug.PushSubsStack("ListChildrenNodes (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,496);
if (RapidSub.canDelegate("listchildrennodes")) return __ref.runUserSub(false, "treeviewmanager","listchildrennodes", __ref, _thisnode);
int _i = 0;
RemoteObject _thisitem = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("thisNode", _thisnode);
 BA.debugLineNum = 496;BA.debugLine="Public Sub ListChildrenNodes(thisNode As TreeItem)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 497;BA.debugLine="listGlobal.Clear";
Debug.ShouldStop(65536);
__ref.getField(false,"_listglobal").runVoidMethod ("Clear");
 BA.debugLineNum = 498;BA.debugLine="If thisNode <> Null Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("N",_thisnode)) { 
 BA.debugLineNum = 499;BA.debugLine="If thisNode.IsInitialized = True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_thisnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 500;BA.debugLine="If thisNode.Children.Size > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_thisnode.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 501;BA.debugLine="For i = 0 To thisNode.Children.Size - 1";
Debug.ShouldStop(1048576);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_thisnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 502;BA.debugLine="Dim thisItem As TreeItem";
Debug.ShouldStop(2097152);
_thisitem = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("thisItem", _thisitem);
 BA.debugLineNum = 503;BA.debugLine="thisItem = thisNode.children.get(i)";
Debug.ShouldStop(4194304);
_thisitem.setObject(_thisnode.runMethod(false,"getChildren").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 504;BA.debugLine="listGlobal.Add(thisItem)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_listglobal").runVoidMethod ("Add",(Object)((_thisitem.getObject())));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 };
 BA.debugLineNum = 509;BA.debugLine="Return listGlobal";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(false,"_listglobal");
 BA.debugLineNum = 510;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsiblingnames(RemoteObject __ref,RemoteObject _thisnode) throws Exception{
try {
		Debug.PushSubsStack("ListSiblingNames (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,514);
if (RapidSub.canDelegate("listsiblingnames")) return __ref.runUserSub(false, "treeviewmanager","listsiblingnames", __ref, _thisnode);
RemoteObject _parentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
int _i = 0;
RemoteObject _thisitem = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("thisNode", _thisnode);
 BA.debugLineNum = 514;BA.debugLine="Public Sub ListSiblingNames(thisNode As TreeItem)";
Debug.ShouldStop(2);
 BA.debugLineNum = 515;BA.debugLine="listGlobal.Clear";
Debug.ShouldStop(4);
__ref.getField(false,"_listglobal").runVoidMethod ("Clear");
 BA.debugLineNum = 516;BA.debugLine="If thisNode <> Null Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("N",_thisnode)) { 
 BA.debugLineNum = 517;BA.debugLine="If thisNode.IsInitialized = True Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_thisnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 518;BA.debugLine="Dim parentNode As TreeItem = thisNode.Parent";
Debug.ShouldStop(32);
_parentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_parentnode = _thisnode.runMethod(false,"getParent");Debug.locals.put("parentNode", _parentnode);Debug.locals.put("parentNode", _parentnode);
 BA.debugLineNum = 519;BA.debugLine="If parentNode.IsInitialized = True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 520;BA.debugLine="If parentNode.Children.Size > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_parentnode.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 521;BA.debugLine="For i = 0 To parentNode.Children.Size - 1";
Debug.ShouldStop(256);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_parentnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 522;BA.debugLine="Dim thisItem As TreeItem";
Debug.ShouldStop(512);
_thisitem = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("thisItem", _thisitem);
 BA.debugLineNum = 523;BA.debugLine="thisItem = parentNode.children.get(i)";
Debug.ShouldStop(1024);
_thisitem.setObject(_parentnode.runMethod(false,"getChildren").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 524;BA.debugLine="If thisItem.Text <> thisNode.Text Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",_thisitem.runMethod(true,"getText"),_thisnode.runMethod(true,"getText"))) { 
 BA.debugLineNum = 525;BA.debugLine="listGlobal.Add(thisItem.Text)";
Debug.ShouldStop(4096);
__ref.getField(false,"_listglobal").runVoidMethod ("Add",(Object)((_thisitem.runMethod(true,"getText"))));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 };
 };
 };
 BA.debugLineNum = 532;BA.debugLine="Return listGlobal";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_listglobal");
 BA.debugLineNum = 533;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsiblingnodes(RemoteObject __ref,RemoteObject _thisnode) throws Exception{
try {
		Debug.PushSubsStack("ListSiblingNodes (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,537);
if (RapidSub.canDelegate("listsiblingnodes")) return __ref.runUserSub(false, "treeviewmanager","listsiblingnodes", __ref, _thisnode);
RemoteObject _parentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
int _i = 0;
RemoteObject _thisitem = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("thisNode", _thisnode);
 BA.debugLineNum = 537;BA.debugLine="Public Sub ListSiblingNodes(thisNode As TreeItem)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 538;BA.debugLine="listGlobal.Clear";
Debug.ShouldStop(33554432);
__ref.getField(false,"_listglobal").runVoidMethod ("Clear");
 BA.debugLineNum = 539;BA.debugLine="If thisNode <> Null Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("N",_thisnode)) { 
 BA.debugLineNum = 540;BA.debugLine="If thisNode.IsInitialized = True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_thisnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 541;BA.debugLine="Dim parentNode As TreeItem = thisNode.Parent";
Debug.ShouldStop(268435456);
_parentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_parentnode = _thisnode.runMethod(false,"getParent");Debug.locals.put("parentNode", _parentnode);Debug.locals.put("parentNode", _parentnode);
 BA.debugLineNum = 542;BA.debugLine="If parentNode.IsInitialized = True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 543;BA.debugLine="If parentNode.Children.Size > 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_parentnode.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 544;BA.debugLine="For i = 0 To parentNode.Children.Size - 1";
Debug.ShouldStop(-2147483648);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_parentnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 545;BA.debugLine="Dim thisItem As TreeItem";
Debug.ShouldStop(1);
_thisitem = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("thisItem", _thisitem);
 BA.debugLineNum = 546;BA.debugLine="thisItem = parentNode.children.get(i)";
Debug.ShouldStop(2);
_thisitem.setObject(_parentnode.runMethod(false,"getChildren").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 547;BA.debugLine="If thisItem.Text <> thisNode.Text Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",_thisitem.runMethod(true,"getText"),_thisnode.runMethod(true,"getText"))) { 
 BA.debugLineNum = 548;BA.debugLine="listGlobal.Add(thisItem)";
Debug.ShouldStop(8);
__ref.getField(false,"_listglobal").runVoidMethod ("Add",(Object)((_thisitem.getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 };
 };
 };
 BA.debugLineNum = 555;BA.debugLine="Return listGlobal";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_listglobal");
 BA.debugLineNum = 556;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _make_parent_add(RemoteObject __ref,RemoteObject _grandparentnode,RemoteObject _newnode) throws Exception{
try {
		Debug.PushSubsStack("make_parent_add (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,459);
if (RapidSub.canDelegate("make_parent_add")) return __ref.runUserSub(false, "treeviewmanager","make_parent_add", __ref, _grandparentnode, _newnode);
Debug.locals.put("grandParentNode", _grandparentnode);
Debug.locals.put("newNode", _newnode);
 BA.debugLineNum = 459;BA.debugLine="Private Sub make_parent_add(grandParentNode As Tre";
Debug.ShouldStop(1024);
 BA.debugLineNum = 460;BA.debugLine="If grandParentNode <> Null Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("N",_grandparentnode)) { 
 BA.debugLineNum = 461;BA.debugLine="grandParentNode.Children.Add(newNode)";
Debug.ShouldStop(4096);
_grandparentnode.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_newnode.getObject())));
 };
 BA.debugLineNum = 463;BA.debugLine="End Sub";
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
public static RemoteObject  _make_parent_insert(RemoteObject __ref,RemoteObject _args,RemoteObject _atindex) throws Exception{
try {
		Debug.PushSubsStack("make_parent_insert (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,466);
if (RapidSub.canDelegate("make_parent_insert")) return __ref.runUserSub(false, "treeviewmanager","make_parent_insert", __ref, _args, _atindex);
RemoteObject _grandparentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _newnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("args", _args);
Debug.locals.put("atIndex", _atindex);
 BA.debugLineNum = 466;BA.debugLine="Private Sub make_parent_insert(args() As TreeItem,";
Debug.ShouldStop(131072);
 BA.debugLineNum = 467;BA.debugLine="Dim grandparentNode As TreeItem = args(0)";
Debug.ShouldStop(262144);
_grandparentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_grandparentnode = _args.getArrayElement(false,BA.numberCast(int.class, 0));Debug.locals.put("grandparentNode", _grandparentnode);Debug.locals.put("grandparentNode", _grandparentnode);
 BA.debugLineNum = 468;BA.debugLine="If grandparentNode.IsInitialized = True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_grandparentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 469;BA.debugLine="Dim newNode As TreeItem = args(1)";
Debug.ShouldStop(1048576);
_newnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_newnode = _args.getArrayElement(false,BA.numberCast(int.class, 1));Debug.locals.put("newNode", _newnode);Debug.locals.put("newNode", _newnode);
 BA.debugLineNum = 470;BA.debugLine="If newNode.IsInitialized = True Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_newnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 471;BA.debugLine="grandparentNode.Children.InsertAt(atIndex, newN";
Debug.ShouldStop(4194304);
_grandparentnode.runMethod(false,"getChildren").runVoidMethod ("InsertAt",(Object)(_atindex),(Object)((_newnode.getObject())));
 };
 };
 BA.debugLineNum = 474;BA.debugLine="End Sub";
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
public static RemoteObject  _makeparent(RemoteObject __ref,RemoteObject _objnodeselected) throws Exception{
try {
		Debug.PushSubsStack("MakeParent (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,423);
if (RapidSub.canDelegate("makeparent")) return __ref.runUserSub(false, "treeviewmanager","makeparent", __ref, _objnodeselected);
RemoteObject _parentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _grandparentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _intindexofparent = RemoteObject.createImmutable(0);
RemoteObject _intoriginaltreeitemindex = RemoteObject.createImmutable(0);
RemoteObject _tempnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _args = null;
RemoteObject _intnewindex = RemoteObject.createImmutable(0);
Debug.locals.put("objNodeSelected", _objnodeselected);
 BA.debugLineNum = 423;BA.debugLine="Public Sub MakeParent(objNodeSelected As TreeItem)";
Debug.ShouldStop(64);
 BA.debugLineNum = 425;BA.debugLine="pickup_and_drop_clear";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.treeviewmanager.class, "_pickup_and_drop_clear");
 BA.debugLineNum = 426;BA.debugLine="If objNodeSelected <> Null Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("N",_objnodeselected)) { 
 BA.debugLineNum = 427;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 428;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
Debug.ShouldStop(2048);
_parentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_parentnode = _objnodeselected.runMethod(false,"getParent");Debug.locals.put("parentNode", _parentnode);Debug.locals.put("parentNode", _parentnode);
 BA.debugLineNum = 429;BA.debugLine="If parentNode.IsInitialized = True Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 430;BA.debugLine="Dim grandparentNode As TreeItem = parentNode.P";
Debug.ShouldStop(8192);
_grandparentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_grandparentnode = _parentnode.runMethod(false,"getParent");Debug.locals.put("grandparentNode", _grandparentnode);Debug.locals.put("grandparentNode", _grandparentnode);
 BA.debugLineNum = 431;BA.debugLine="If grandparentNode.IsInitialized = True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_grandparentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 433;BA.debugLine="If unique_name(grandparentNode, objNodeSelect";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.treeviewmanager.class, "_unique_name",(Object)(_grandparentnode),(Object)(_objnodeselected.runMethod(true,"getText"))),treeviewmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 434;BA.debugLine="Dim intIndexOfParent As Int = grandparentNod";
Debug.ShouldStop(131072);
_intindexofparent = _grandparentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_parentnode.getObject())));Debug.locals.put("intIndexOfParent", _intindexofparent);Debug.locals.put("intIndexOfParent", _intindexofparent);
 BA.debugLineNum = 435;BA.debugLine="Dim intOriginalTreeItemIndex As Int = parent";
Debug.ShouldStop(262144);
_intoriginaltreeitemindex = _parentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_objnodeselected.getObject())));Debug.locals.put("intOriginalTreeItemIndex", _intoriginaltreeitemindex);Debug.locals.put("intOriginalTreeItemIndex", _intoriginaltreeitemindex);
 BA.debugLineNum = 436;BA.debugLine="If intIndexOfParent = grandparentNode.Childr";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_intindexofparent,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_grandparentnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 437;BA.debugLine="Dim tempNode As TreeItem";
Debug.ShouldStop(1048576);
_tempnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tempNode", _tempnode);
 BA.debugLineNum = 438;BA.debugLine="tempNode = objNodeSelected";
Debug.ShouldStop(2097152);
_tempnode = _objnodeselected;Debug.locals.put("tempNode", _tempnode);
 BA.debugLineNum = 439;BA.debugLine="parentNode.Children.RemoveAt(intOriginalTre";
Debug.ShouldStop(4194304);
_parentnode.runMethod(false,"getChildren").runVoidMethod ("RemoveAt",(Object)(_intoriginaltreeitemindex));
 BA.debugLineNum = 440;BA.debugLine="CallSubDelayed3(Me, \"make_parent_add\", gran";
Debug.ShouldStop(8388608);
treeviewmanager.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("make_parent_add")),(Object)((_grandparentnode)),(Object)((_tempnode)));
 }else {
 BA.debugLineNum = 442;BA.debugLine="Dim tempNode As TreeItem";
Debug.ShouldStop(33554432);
_tempnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tempNode", _tempnode);
 BA.debugLineNum = 443;BA.debugLine="tempNode = objNodeSelected";
Debug.ShouldStop(67108864);
_tempnode = _objnodeselected;Debug.locals.put("tempNode", _tempnode);
 BA.debugLineNum = 444;BA.debugLine="Dim args(3) As TreeItem";
Debug.ShouldStop(134217728);
_args = RemoteObject.createNewArray ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper", new int[] {3}, new Object[]{});Debug.locals.put("args", _args);
 BA.debugLineNum = 445;BA.debugLine="args(0) = grandparentNode";
Debug.ShouldStop(268435456);
_args.setArrayElement (_grandparentnode,BA.numberCast(int.class, 0));
 BA.debugLineNum = 446;BA.debugLine="args(1) = tempNode";
Debug.ShouldStop(536870912);
_args.setArrayElement (_tempnode,BA.numberCast(int.class, 1));
 BA.debugLineNum = 447;BA.debugLine="Dim intNewIndex As Int = (grandparentNode.C";
Debug.ShouldStop(1073741824);
_intnewindex = (RemoteObject.solve(new RemoteObject[] {_grandparentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_parentnode.getObject()))),RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("intNewIndex", _intnewindex);Debug.locals.put("intNewIndex", _intnewindex);
 BA.debugLineNum = 448;BA.debugLine="parentNode.Children.RemoveAt(intOriginalTre";
Debug.ShouldStop(-2147483648);
_parentnode.runMethod(false,"getChildren").runVoidMethod ("RemoveAt",(Object)(_intoriginaltreeitemindex));
 BA.debugLineNum = 449;BA.debugLine="CallSubDelayed3(Me, \"make_parent_insert\", a";
Debug.ShouldStop(1);
treeviewmanager.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("make_parent_insert")),(Object)((_args)),(Object)((_intnewindex)));
 };
 };
 };
 };
 };
 };
 BA.debugLineNum = 456;BA.debugLine="End Sub";
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
public static RemoteObject  _movedown(RemoteObject __ref,RemoteObject _objnodeselected) throws Exception{
try {
		Debug.PushSubsStack("MoveDown (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("movedown")) return __ref.runUserSub(false, "treeviewmanager","movedown", __ref, _objnodeselected);
RemoteObject _parentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _intoriginalindex = RemoteObject.createImmutable(0);
Debug.locals.put("objNodeSelected", _objnodeselected);
 BA.debugLineNum = 165;BA.debugLine="Public Sub MoveDown(objNodeSelected As TreeItem) A";
Debug.ShouldStop(16);
 BA.debugLineNum = 167;BA.debugLine="pickup_and_drop_clear";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.treeviewmanager.class, "_pickup_and_drop_clear");
 BA.debugLineNum = 168;BA.debugLine="If objNodeSelected <> Null Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("N",_objnodeselected)) { 
 BA.debugLineNum = 169;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 170;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
Debug.ShouldStop(512);
_parentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_parentnode = _objnodeselected.runMethod(false,"getParent");Debug.locals.put("parentNode", _parentnode);Debug.locals.put("parentNode", _parentnode);
 BA.debugLineNum = 171;BA.debugLine="If parentNode.IsInitialized = True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 172;BA.debugLine="If parentNode.Children.IndexOf(objNodeSelected";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("<",_parentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_objnodeselected.getObject()))),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {_parentnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 173;BA.debugLine="Dim intOriginalIndex As Int = parentNode.Chil";
Debug.ShouldStop(4096);
_intoriginalindex = _parentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_objnodeselected.getObject())));Debug.locals.put("intOriginalIndex", _intoriginalindex);Debug.locals.put("intOriginalIndex", _intoriginalindex);
 BA.debugLineNum = 174;BA.debugLine="parentNode.Children.RemoveAt(intOriginalIndex";
Debug.ShouldStop(8192);
_parentnode.runMethod(false,"getChildren").runVoidMethod ("RemoveAt",(Object)(_intoriginalindex));
 BA.debugLineNum = 175;BA.debugLine="parentNode.Children.InsertAt((intOriginalInde";
Debug.ShouldStop(16384);
_parentnode.runMethod(false,"getChildren").runVoidMethod ("InsertAt",(Object)((RemoteObject.solve(new RemoteObject[] {_intoriginalindex,RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)((_objnodeselected.getObject())));
 BA.debugLineNum = 176;BA.debugLine="Return parentNode.Children.Get(intOriginalInd";
Debug.ShouldStop(32768);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), _parentnode.runMethod(false,"getChildren").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_intoriginalindex,RemoteObject.createImmutable(1)}, "+",1, 1))));
 };
 };
 };
 };
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _moveup(RemoteObject __ref,RemoteObject _objnodeselected) throws Exception{
try {
		Debug.PushSubsStack("MoveUp (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("moveup")) return __ref.runUserSub(false, "treeviewmanager","moveup", __ref, _objnodeselected);
RemoteObject _parentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _intoriginalindex = RemoteObject.createImmutable(0);
Debug.locals.put("objNodeSelected", _objnodeselected);
 BA.debugLineNum = 145;BA.debugLine="Public Sub MoveUp(objNodeSelected As TreeItem) As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 147;BA.debugLine="pickup_and_drop_clear";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.treeviewmanager.class, "_pickup_and_drop_clear");
 BA.debugLineNum = 148;BA.debugLine="If objNodeSelected <> Null Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("N",_objnodeselected)) { 
 BA.debugLineNum = 149;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 150;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
Debug.ShouldStop(2097152);
_parentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_parentnode = _objnodeselected.runMethod(false,"getParent");Debug.locals.put("parentNode", _parentnode);Debug.locals.put("parentNode", _parentnode);
 BA.debugLineNum = 151;BA.debugLine="If parentNode.IsInitialized = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 152;BA.debugLine="If parentNode.Children.IndexOf(objNodeSelected";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_parentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_objnodeselected.getObject()))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 153;BA.debugLine="Dim intOriginalIndex As Int = parentNode.Chil";
Debug.ShouldStop(16777216);
_intoriginalindex = _parentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_objnodeselected.getObject())));Debug.locals.put("intOriginalIndex", _intoriginalindex);Debug.locals.put("intOriginalIndex", _intoriginalindex);
 BA.debugLineNum = 154;BA.debugLine="parentNode.Children.RemoveAt(intOriginalIndex";
Debug.ShouldStop(33554432);
_parentnode.runMethod(false,"getChildren").runVoidMethod ("RemoveAt",(Object)(_intoriginalindex));
 BA.debugLineNum = 155;BA.debugLine="parentNode.Children.InsertAt((intOriginalInde";
Debug.ShouldStop(67108864);
_parentnode.runMethod(false,"getChildren").runVoidMethod ("InsertAt",(Object)((RemoteObject.solve(new RemoteObject[] {_intoriginalindex,RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)((_objnodeselected.getObject())));
 BA.debugLineNum = 156;BA.debugLine="Return parentNode.Children.Get(intOriginalInd";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), _parentnode.runMethod(false,"getChildren").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_intoriginalindex,RemoteObject.createImmutable(1)}, "-",1, 1))));
 };
 };
 };
 };
 BA.debugLineNum = 161;BA.debugLine="Return Null";
Debug.ShouldStop(1);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper"), treeviewmanager.__c.getField(false,"Null"));
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parentname(RemoteObject __ref,RemoteObject _objtreeview,RemoteObject _childnode) throws Exception{
try {
		Debug.PushSubsStack("ParentName (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,638);
if (RapidSub.canDelegate("parentname")) return __ref.runUserSub(false, "treeviewmanager","parentname", __ref, _objtreeview, _childnode);
RemoteObject _parentitem = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("objTreeView", _objtreeview);
Debug.locals.put("childNode", _childnode);
 BA.debugLineNum = 638;BA.debugLine="Public Sub ParentName(objTreeView As TreeView, chi";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 639;BA.debugLine="If objTreeView <> Null And childNode <> Null Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("N",_objtreeview) && RemoteObject.solveBoolean("N",_childnode)) { 
 BA.debugLineNum = 640;BA.debugLine="If objTreeView.IsInitialized = True Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_objtreeview.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 641;BA.debugLine="If childNode.IsInitialized = True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_childnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 642;BA.debugLine="If childNode.Parent <> Null Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("N",_childnode.runMethod(false,"getParent"))) { 
 BA.debugLineNum = 643;BA.debugLine="Dim parentItem As TreeItem = childNode.Parent";
Debug.ShouldStop(4);
_parentitem = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_parentitem = _childnode.runMethod(false,"getParent");Debug.locals.put("parentItem", _parentitem);Debug.locals.put("parentItem", _parentitem);
 BA.debugLineNum = 644;BA.debugLine="Return parentItem.Text";
Debug.ShouldStop(8);
if (true) return _parentitem.runMethod(true,"getText");
 };
 };
 };
 };
 BA.debugLineNum = 649;BA.debugLine="End Sub";
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
public static RemoteObject  _pickup(RemoteObject __ref,RemoteObject _objpickupnodeselected) throws Exception{
try {
		Debug.PushSubsStack("Pickup (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,325);
if (RapidSub.canDelegate("pickup")) return __ref.runUserSub(false, "treeviewmanager","pickup", __ref, _objpickupnodeselected);
RemoteObject _templist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("objPickupNodeSelected", _objpickupnodeselected);
 BA.debugLineNum = 325;BA.debugLine="Sub Pickup(objPickupNodeSelected As TreeItem)";
Debug.ShouldStop(16);
 BA.debugLineNum = 326;BA.debugLine="If objPickupNodeSelected <> Null Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("N",_objpickupnodeselected)) { 
 BA.debugLineNum = 327;BA.debugLine="If objPickupNodeSelected.IsInitialized = True Th";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_objpickupnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 328;BA.debugLine="pickup_and_drop_clear";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.treeviewmanager.class, "_pickup_and_drop_clear");
 BA.debugLineNum = 329;BA.debugLine="mapPickup.Put(\"Text\", objPickupNodeSelected.Tex";
Debug.ShouldStop(256);
__ref.getField(false,"_mappickup").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Text"))),(Object)((_objpickupnodeselected.runMethod(true,"getText"))));
 BA.debugLineNum = 330;BA.debugLine="mapPickup.Put(\"ParentNode\", objPickupNodeSelect";
Debug.ShouldStop(512);
__ref.getField(false,"_mappickup").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ParentNode"))),(Object)((_objpickupnodeselected.runMethod(false,"getParent").getObject())));
 BA.debugLineNum = 331;BA.debugLine="mapPickup.Put(\"IndexOf\", objPickupNodeSelected.";
Debug.ShouldStop(1024);
__ref.getField(false,"_mappickup").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IndexOf"))),(Object)((_objpickupnodeselected.runMethod(false,"getParent").runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_objpickupnodeselected.getObject()))))));
 BA.debugLineNum = 332;BA.debugLine="If objPickupNodeSelected.Children.Size > 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_objpickupnodeselected.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 333;BA.debugLine="Dim templist As List";
Debug.ShouldStop(4096);
_templist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("templist", _templist);
 BA.debugLineNum = 334;BA.debugLine="templist.Initialize";
Debug.ShouldStop(8192);
_templist.runVoidMethod ("Initialize");
 BA.debugLineNum = 335;BA.debugLine="templist.AddAll(objPickupNodeSelected.children";
Debug.ShouldStop(16384);
_templist.runVoidMethod ("AddAll",(Object)(_objpickupnodeselected.runMethod(false,"getChildren")));
 BA.debugLineNum = 336;BA.debugLine="mapPickup.Put(\"Children\", templist)";
Debug.ShouldStop(32768);
__ref.getField(false,"_mappickup").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Children"))),(Object)((_templist.getObject())));
 };
 };
 };
 BA.debugLineNum = 340;BA.debugLine="End Sub";
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
public static RemoteObject  _pickup_and_drop_clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pickup_and_drop_clear (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,415);
if (RapidSub.canDelegate("pickup_and_drop_clear")) return __ref.runUserSub(false, "treeviewmanager","pickup_and_drop_clear", __ref);
 BA.debugLineNum = 415;BA.debugLine="Private Sub pickup_and_drop_clear";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 416;BA.debugLine="mapPickup.Clear";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mappickup").runVoidMethod ("Clear");
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _recurse_json_for_tree(RemoteObject __ref,RemoteObject _topnode,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("recurse_json_for_tree (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,761);
if (RapidSub.canDelegate("recurse_json_for_tree")) return __ref.runUserSub(false, "treeviewmanager","recurse_json_for_tree", __ref, _topnode, _children);
RemoteObject _colchildren = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _strtext = RemoteObject.createImmutable("");
RemoteObject _ti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("topNode", _topnode);
Debug.locals.put("children", _children);
 BA.debugLineNum = 761;BA.debugLine="Private Sub recurse_json_for_tree(topNode As TreeI";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 762;BA.debugLine="If topNode <> Null Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("N",_topnode)) { 
 BA.debugLineNum = 763;BA.debugLine="If topNode.IsInitialized = True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_topnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 764;BA.debugLine="If children.IsInitialized = True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_children.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 765;BA.debugLine="If children.Size > 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_children.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 766;BA.debugLine="For Each colChildren As Map In children";
Debug.ShouldStop(536870912);
_colchildren = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
final RemoteObject group5 = _children;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get();
for (int index5 = 0;index5 < groupLen5 ;index5++){
_colchildren.setObject(group5.runMethod(false,"Get",index5));
Debug.locals.put("colChildren", _colchildren);
 BA.debugLineNum = 767;BA.debugLine="Dim strText As String = colChildren.Ge";
Debug.ShouldStop(1073741824);
_strtext = BA.ObjectToString(_colchildren.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text")))));Debug.locals.put("strText", _strtext);Debug.locals.put("strText", _strtext);
 BA.debugLineNum = 768;BA.debugLine="Dim ti As TreeItem = AddChild(topNode, strTe";
Debug.ShouldStop(-2147483648);
_ti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_ti = __ref.runClassMethod (b4j.example.treeviewmanager.class, "_addchild",(Object)(_topnode),(Object)(_strtext));Debug.locals.put("ti", _ti);Debug.locals.put("ti", _ti);
 BA.debugLineNum = 769;BA.debugLine="If colChildren.ContainsKey(\"Children\")";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_colchildren.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Children")))),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 770;BA.debugLine="recurse_json_for_tree(ti, colChildren.Get(\"";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.treeviewmanager.class, "_recurse_json_for_tree",(Object)(_ti),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colchildren.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Children"))))));
 };
 }
Debug.locals.put("colChildren", _colchildren);
;
 };
 };
 };
 };
 BA.debugLineNum = 777;BA.debugLine="End Sub";
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
public static RemoteObject  _recurse_tree_for_json(RemoteObject __ref,RemoteObject _thisnode) throws Exception{
try {
		Debug.PushSubsStack("recurse_tree_for_json (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,654);
if (RapidSub.canDelegate("recurse_tree_for_json")) return __ref.runUserSub(false, "treeviewmanager","recurse_tree_for_json", __ref, _thisnode);
RemoteObject _thislist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _newnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _thisnodelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listtemp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i2 = 0;
RemoteObject _thisstring = RemoteObject.createImmutable("");
Debug.locals.put("thisNode", _thisnode);
 BA.debugLineNum = 654;BA.debugLine="Private Sub recurse_tree_for_json(thisNode As Tree";
Debug.ShouldStop(8192);
 BA.debugLineNum = 655;BA.debugLine="Dim thisList As List";
Debug.ShouldStop(16384);
_thislist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("thisList", _thislist);
 BA.debugLineNum = 656;BA.debugLine="thisList.Initialize";
Debug.ShouldStop(32768);
_thislist.runVoidMethod ("Initialize");
 BA.debugLineNum = 657;BA.debugLine="If thisNode <> Null Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("N",_thisnode)) { 
 BA.debugLineNum = 658;BA.debugLine="If thisNode.IsInitialized Then";
Debug.ShouldStop(131072);
if (_thisnode.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 660;BA.debugLine="If thisNode.Children.Size > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_thisnode.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 661;BA.debugLine="For i = 0 To thisNode.Children.Size - 1";
Debug.ShouldStop(1048576);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_thisnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 662;BA.debugLine="Dim newNode As TreeItem = thisNode.Ch";
Debug.ShouldStop(2097152);
_newnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_newnode.setObject(_thisnode.runMethod(false,"getChildren").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("newNode", _newnode);
 BA.debugLineNum = 663;BA.debugLine="If newNode.IsInitialized = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_newnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 665;BA.debugLine="Dim thisNodeList As List = recurse_tree_for_j";
Debug.ShouldStop(16777216);
_thisnodelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_thisnodelist = __ref.runClassMethod (b4j.example.treeviewmanager.class, "_recurse_tree_for_json",(Object)(_newnode));Debug.locals.put("thisNodeList", _thisnodelist);Debug.locals.put("thisNodeList", _thisnodelist);
 BA.debugLineNum = 666;BA.debugLine="If thisNodeList <> Null Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("N",_thisnodelist)) { 
 BA.debugLineNum = 667;BA.debugLine="If thisNodeList.IsInitialized = True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_thisnodelist.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 668;BA.debugLine="Dim listTemp As List";
Debug.ShouldStop(134217728);
_listtemp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listTemp", _listtemp);
 BA.debugLineNum = 669;BA.debugLine="listTemp.Initialize";
Debug.ShouldStop(268435456);
_listtemp.runVoidMethod ("Initialize");
 BA.debugLineNum = 670;BA.debugLine="For i2 = 0 To thisNodeList.Size - 1";
Debug.ShouldStop(536870912);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_thisnodelist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i2 = 0 ; (step14 > 0 && _i2 <= limit14) || (step14 < 0 && _i2 >= limit14); _i2 = ((int)(0 + _i2 + step14)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 672;BA.debugLine="Dim thisstring As String = thisNodeList.Ge";
Debug.ShouldStop(-2147483648);
_thisstring = BA.ObjectToString(_thisnodelist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))));Debug.locals.put("thisstring", _thisstring);Debug.locals.put("thisstring", _thisstring);
 BA.debugLineNum = 673;BA.debugLine="If thisstring.IndexOf($\"{ \"Text\" :\"$) = -1";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_thisstring.runMethod(true,"indexOf",(Object)((RemoteObject.createImmutable("{ \"Text\" :")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 674;BA.debugLine="thisstring = $\"{ \"Text\" : \"${thisNodeList";
Debug.ShouldStop(2);
_thisstring = (RemoteObject.concat(RemoteObject.createImmutable("{ \"Text\" : \""),treeviewmanager.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_thisnodelist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))),RemoteObject.createImmutable("\"}")));Debug.locals.put("thisstring", _thisstring);
 BA.debugLineNum = 675;BA.debugLine="If i2 < (thisNodeList.Size - 1) Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i2),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {_thisnodelist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 676;BA.debugLine="If thisstring.CharAt(thisstring.Length -";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("!",_thisstring.runMethod(true,"charAt",(Object)(RemoteObject.solve(new RemoteObject[] {_thisstring.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))),BA.ObjectToChar(","))) { 
 BA.debugLineNum = 677;BA.debugLine="thisstring = thisstring & \",\"";
Debug.ShouldStop(16);
_thisstring = RemoteObject.concat(_thisstring,RemoteObject.createImmutable(","));Debug.locals.put("thisstring", _thisstring);
 };
 };
 };
 BA.debugLineNum = 681;BA.debugLine="thisstring = thisstring.Replace(\",,\", \",\")";
Debug.ShouldStop(256);
_thisstring = _thisstring.runMethod(true,"replace",(Object)(BA.ObjectToString(",,")),(Object)(RemoteObject.createImmutable(",")));Debug.locals.put("thisstring", _thisstring);
 BA.debugLineNum = 682;BA.debugLine="listTemp.Add(thisstring)";
Debug.ShouldStop(512);
_listtemp.runVoidMethod ("Add",(Object)((_thisstring)));
 }
}Debug.locals.put("i2", _i2);
;
 BA.debugLineNum = 684;BA.debugLine="If listTemp.Size > 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_listtemp.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 685;BA.debugLine="Dim thisstring As String = $\"{ \"Text\" : \"$";
Debug.ShouldStop(4096);
_thisstring = (RemoteObject.concat(RemoteObject.createImmutable("{ \"Text\" : \""),treeviewmanager.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newnode.runMethod(true,"getText")))),RemoteObject.createImmutable("\", \"Children\": "),treeviewmanager.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listtemp.getObject()))),RemoteObject.createImmutable(" }")));Debug.locals.put("thisstring", _thisstring);Debug.locals.put("thisstring", _thisstring);
 BA.debugLineNum = 686;BA.debugLine="If i < (thisNode.Children.Size - 1) Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {_thisnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 687;BA.debugLine="If thisstring.CharAt(thisstring.Length -";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_thisstring.runMethod(true,"charAt",(Object)(RemoteObject.solve(new RemoteObject[] {_thisstring.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))),BA.ObjectToChar(","))) { 
 BA.debugLineNum = 688;BA.debugLine="thisstring = thisstring & \",\"";
Debug.ShouldStop(32768);
_thisstring = RemoteObject.concat(_thisstring,RemoteObject.createImmutable(","));Debug.locals.put("thisstring", _thisstring);
 };
 };
 BA.debugLineNum = 691;BA.debugLine="thisstring = thisstring.Replace(\",,\", \",\")";
Debug.ShouldStop(262144);
_thisstring = _thisstring.runMethod(true,"replace",(Object)(BA.ObjectToString(",,")),(Object)(RemoteObject.createImmutable(",")));Debug.locals.put("thisstring", _thisstring);
 BA.debugLineNum = 692;BA.debugLine="thisList.Add(thisstring)";
Debug.ShouldStop(524288);
_thislist.runVoidMethod ("Add",(Object)((_thisstring)));
 }else {
 BA.debugLineNum = 694;BA.debugLine="Dim thisstring As String = $\"{ \"Text\" : \"$";
Debug.ShouldStop(2097152);
_thisstring = (RemoteObject.concat(RemoteObject.createImmutable("{ \"Text\" : \""),treeviewmanager.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newnode.runMethod(true,"getText")))),RemoteObject.createImmutable("\" }")));Debug.locals.put("thisstring", _thisstring);Debug.locals.put("thisstring", _thisstring);
 BA.debugLineNum = 695;BA.debugLine="If i < (thisNode.Children.Size - 1) Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {_thisnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 696;BA.debugLine="If thisstring.CharAt(thisstring.Length -";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("!",_thisstring.runMethod(true,"charAt",(Object)(RemoteObject.solve(new RemoteObject[] {_thisstring.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))),BA.ObjectToChar(","))) { 
 BA.debugLineNum = 697;BA.debugLine="thisstring = thisstring & \",\"";
Debug.ShouldStop(16777216);
_thisstring = RemoteObject.concat(_thisstring,RemoteObject.createImmutable(","));Debug.locals.put("thisstring", _thisstring);
 };
 };
 BA.debugLineNum = 700;BA.debugLine="thisstring = thisstring.Replace(\",,\", \",\")";
Debug.ShouldStop(134217728);
_thisstring = _thisstring.runMethod(true,"replace",(Object)(BA.ObjectToString(",,")),(Object)(RemoteObject.createImmutable(",")));Debug.locals.put("thisstring", _thisstring);
 BA.debugLineNum = 701;BA.debugLine="thisList.Add(thisstring)";
Debug.ShouldStop(268435456);
_thislist.runVoidMethod ("Add",(Object)((_thisstring)));
 };
 };
 }else {
 BA.debugLineNum = 705;BA.debugLine="thisList.Add(newNode.Text)";
Debug.ShouldStop(1);
_thislist.runVoidMethod ("Add",(Object)((_newnode.runMethod(true,"getText"))));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 };
 };
 };
 BA.debugLineNum = 712;BA.debugLine="If thisList.Size > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_thislist.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 713;BA.debugLine="Return thisList";
Debug.ShouldStop(256);
if (true) return _thislist;
 };
 BA.debugLineNum = 715;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _recurse_tree_for_xml(RemoteObject __ref,RemoteObject _thisnode) throws Exception{
try {
		Debug.PushSubsStack("recurse_tree_for_xml (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,812);
if (RapidSub.canDelegate("recurse_tree_for_xml")) return __ref.runUserSub(false, "treeviewmanager","recurse_tree_for_xml", __ref, _thisnode);
RemoteObject _thislist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _newnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _thisnodelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listtemp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _matchchildtopic = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
RemoteObject _matchtext = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
int _i2 = 0;
RemoteObject _thisstring = RemoteObject.createImmutable("");
Debug.locals.put("thisNode", _thisnode);
 BA.debugLineNum = 812;BA.debugLine="Private Sub recurse_tree_for_xml(thisNode As TreeI";
Debug.ShouldStop(2048);
 BA.debugLineNum = 813;BA.debugLine="Dim thisList As List";
Debug.ShouldStop(4096);
_thislist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("thisList", _thislist);
 BA.debugLineNum = 814;BA.debugLine="thisList.Initialize";
Debug.ShouldStop(8192);
_thislist.runVoidMethod ("Initialize");
 BA.debugLineNum = 815;BA.debugLine="If thisNode <> Null Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("N",_thisnode)) { 
 BA.debugLineNum = 816;BA.debugLine="If thisNode.IsInitialized Then";
Debug.ShouldStop(32768);
if (_thisnode.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 818;BA.debugLine="If thisNode.Children.Size > 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_thisnode.runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 819;BA.debugLine="For i = 0 To thisNode.Children.Size - 1";
Debug.ShouldStop(262144);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_thisnode.runMethod(false,"getChildren").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 820;BA.debugLine="Dim newNode As TreeItem = thisNode.Ch";
Debug.ShouldStop(524288);
_newnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_newnode.setObject(_thisnode.runMethod(false,"getChildren").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("newNode", _newnode);
 BA.debugLineNum = 821;BA.debugLine="If newNode.IsInitialized = True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_newnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 823;BA.debugLine="Dim thisNodeList As List = recurse_tree_for_x";
Debug.ShouldStop(4194304);
_thisnodelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_thisnodelist = __ref.runClassMethod (b4j.example.treeviewmanager.class, "_recurse_tree_for_xml",(Object)(_newnode));Debug.locals.put("thisNodeList", _thisnodelist);Debug.locals.put("thisNodeList", _thisnodelist);
 BA.debugLineNum = 824;BA.debugLine="If thisNodeList <> Null Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("N",_thisnodelist)) { 
 BA.debugLineNum = 825;BA.debugLine="If thisNodeList.IsInitialized = True Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_thisnodelist.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 826;BA.debugLine="Dim listTemp As List";
Debug.ShouldStop(33554432);
_listtemp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listTemp", _listtemp);
 BA.debugLineNum = 827;BA.debugLine="listTemp.Initialize";
Debug.ShouldStop(67108864);
_listtemp.runVoidMethod ("Initialize");
 BA.debugLineNum = 828;BA.debugLine="Dim matchChildTopic As Matcher";
Debug.ShouldStop(134217728);
_matchchildtopic = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");Debug.locals.put("matchChildTopic", _matchchildtopic);
 BA.debugLineNum = 829;BA.debugLine="Dim matchText As Matcher";
Debug.ShouldStop(268435456);
_matchtext = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");Debug.locals.put("matchText", _matchtext);
 BA.debugLineNum = 830;BA.debugLine="For i2 = 0 To thisNodeList.Size - 1";
Debug.ShouldStop(536870912);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_thisnodelist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i2 = 0 ; (step16 > 0 && _i2 <= limit16) || (step16 < 0 && _i2 >= limit16); _i2 = ((int)(0 + _i2 + step16)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 832;BA.debugLine="Dim thisstring As String";
Debug.ShouldStop(-2147483648);
_thisstring = RemoteObject.createImmutable("");Debug.locals.put("thisstring", _thisstring);
 BA.debugLineNum = 833;BA.debugLine="matchChildTopic = Regex.Matcher(\"^\\s*<Chil";
Debug.ShouldStop(1);
_matchchildtopic = treeviewmanager.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^\\s*<ChildTopic>")),(Object)(BA.ObjectToString(_thisnodelist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))));Debug.locals.put("matchChildTopic", _matchchildtopic);
 BA.debugLineNum = 834;BA.debugLine="matchText = Regex.Matcher(\"^\\s*<Text>\", th";
Debug.ShouldStop(2);
_matchtext = treeviewmanager.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^\\s*<Text>")),(Object)(BA.ObjectToString(_thisnodelist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))));Debug.locals.put("matchText", _matchtext);
 BA.debugLineNum = 835;BA.debugLine="If matchChildTopic.Find = True Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_matchchildtopic.runMethod(true,"Find"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 836;BA.debugLine="thisstring = thisNodeList.Get(i2)";
Debug.ShouldStop(8);
_thisstring = BA.ObjectToString(_thisnodelist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))));Debug.locals.put("thisstring", _thisstring);
 }else 
{ BA.debugLineNum = 837;BA.debugLine="Else If matchText.Find = True Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_matchtext.runMethod(true,"Find"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 838;BA.debugLine="thisstring = $\"<ChildTopic>\"$ & CRLF & th";
Debug.ShouldStop(32);
_thisstring = RemoteObject.concat((RemoteObject.createImmutable("<ChildTopic>")),treeviewmanager.__c.getField(true,"CRLF"),_thisnodelist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))),treeviewmanager.__c.getField(true,"CRLF"),(RemoteObject.createImmutable("</ChildTopic>")));Debug.locals.put("thisstring", _thisstring);
 }else {
 BA.debugLineNum = 840;BA.debugLine="thisstring = $\"<ChildTopic>\"$ & CRLF & $\"";
Debug.ShouldStop(128);
_thisstring = RemoteObject.concat((RemoteObject.createImmutable("<ChildTopic>")),treeviewmanager.__c.getField(true,"CRLF"),(RemoteObject.concat(RemoteObject.createImmutable("<Text>"),treeviewmanager.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_thisnodelist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))),RemoteObject.createImmutable("</Text>"))),treeviewmanager.__c.getField(true,"CRLF"),(RemoteObject.createImmutable("</ChildTopic>")));Debug.locals.put("thisstring", _thisstring);
 }};
 BA.debugLineNum = 842;BA.debugLine="listTemp.Add(thisstring)";
Debug.ShouldStop(512);
_listtemp.runVoidMethod ("Add",(Object)((_thisstring)));
 }
}Debug.locals.put("i2", _i2);
;
 BA.debugLineNum = 844;BA.debugLine="If listTemp.Size > 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_listtemp.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 845;BA.debugLine="Dim thisstring As String";
Debug.ShouldStop(4096);
_thisstring = RemoteObject.createImmutable("");Debug.locals.put("thisstring", _thisstring);
 BA.debugLineNum = 846;BA.debugLine="If Generation(newNode) = 1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(_newnode)),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 847;BA.debugLine="thisstring = $\"<Topic>\"$ & CRLF & $\"<Text";
Debug.ShouldStop(16384);
_thisstring = RemoteObject.concat((RemoteObject.createImmutable("<Topic>")),treeviewmanager.__c.getField(true,"CRLF"),(RemoteObject.createImmutable("<Text>")),_newnode.runMethod(true,"getText"),(RemoteObject.createImmutable("</Text>")),treeviewmanager.__c.getField(true,"CRLF"),(RemoteObject.createImmutable("<Children>")));Debug.locals.put("thisstring", _thisstring);
 }else {
 BA.debugLineNum = 849;BA.debugLine="thisstring = $\"<ChildTopic>\"$ & CRLF &";
Debug.ShouldStop(65536);
_thisstring = RemoteObject.concat((RemoteObject.createImmutable("<ChildTopic>")),treeviewmanager.__c.getField(true,"CRLF"),(RemoteObject.createImmutable("<Text>")),_newnode.runMethod(true,"getText"),(RemoteObject.createImmutable("</Text>")),treeviewmanager.__c.getField(true,"CRLF"),(RemoteObject.createImmutable("<Children>")));Debug.locals.put("thisstring", _thisstring);
 };
 BA.debugLineNum = 851;BA.debugLine="For i2 = 0 To listTemp.Size - 1";
Debug.ShouldStop(262144);
{
final int step36 = 1;
final int limit36 = RemoteObject.solve(new RemoteObject[] {_listtemp.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i2 = 0 ; (step36 > 0 && _i2 <= limit36) || (step36 < 0 && _i2 >= limit36); _i2 = ((int)(0 + _i2 + step36)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 852;BA.debugLine="thisstring = thisstring & CRLF & listTemp";
Debug.ShouldStop(524288);
_thisstring = RemoteObject.concat(_thisstring,treeviewmanager.__c.getField(true,"CRLF"),_listtemp.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))));Debug.locals.put("thisstring", _thisstring);
 }
}Debug.locals.put("i2", _i2);
;
 BA.debugLineNum = 855;BA.debugLine="If Generation(newNode) = 1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(_newnode)),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 856;BA.debugLine="thisstring = thisstring & CRLF & $\"</Chil";
Debug.ShouldStop(8388608);
_thisstring = RemoteObject.concat(_thisstring,treeviewmanager.__c.getField(true,"CRLF"),(RemoteObject.createImmutable("</Children>")),treeviewmanager.__c.getField(true,"CRLF"),(RemoteObject.createImmutable("</Topic>")));Debug.locals.put("thisstring", _thisstring);
 }else {
 BA.debugLineNum = 858;BA.debugLine="thisstring = thisstring & CRLF & $\"</Chil";
Debug.ShouldStop(33554432);
_thisstring = RemoteObject.concat(_thisstring,treeviewmanager.__c.getField(true,"CRLF"),(RemoteObject.createImmutable("</Children></ChildTopic>")));Debug.locals.put("thisstring", _thisstring);
 };
 BA.debugLineNum = 861;BA.debugLine="thisList.Add(thisstring)";
Debug.ShouldStop(268435456);
_thislist.runVoidMethod ("Add",(Object)((_thisstring)));
 }else {
 BA.debugLineNum = 863;BA.debugLine="Dim thisstring As String";
Debug.ShouldStop(1073741824);
_thisstring = RemoteObject.createImmutable("");Debug.locals.put("thisstring", _thisstring);
 BA.debugLineNum = 864;BA.debugLine="If Generation(newNode) = 1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(_newnode)),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 865;BA.debugLine="thisstring = $\"<Text>\"$ & newNode.Text &";
Debug.ShouldStop(1);
_thisstring = RemoteObject.concat((RemoteObject.createImmutable("<Text>")),_newnode.runMethod(true,"getText"),(RemoteObject.createImmutable("</Text>")),treeviewmanager.__c.getField(true,"CRLF"));Debug.locals.put("thisstring", _thisstring);
 }else {
 BA.debugLineNum = 867;BA.debugLine="thisstring = $\"<ChildTopic>\"$ & CRLF &";
Debug.ShouldStop(4);
_thisstring = RemoteObject.concat((RemoteObject.createImmutable("<ChildTopic>")),treeviewmanager.__c.getField(true,"CRLF"),(RemoteObject.createImmutable("<Text>")),_newnode.runMethod(true,"getText"),(RemoteObject.createImmutable("</Text>")),treeviewmanager.__c.getField(true,"CRLF"),(RemoteObject.createImmutable("</ChildTopic>")));Debug.locals.put("thisstring", _thisstring);
 };
 BA.debugLineNum = 869;BA.debugLine="thisList.Add(thisstring)";
Debug.ShouldStop(16);
_thislist.runVoidMethod ("Add",(Object)((_thisstring)));
 };
 };
 }else {
 BA.debugLineNum = 873;BA.debugLine="thisList.Add(newNode.Text)";
Debug.ShouldStop(256);
_thislist.runVoidMethod ("Add",(Object)((_newnode.runMethod(true,"getText"))));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 };
 };
 };
 BA.debugLineNum = 880;BA.debugLine="If thisList.Size > 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_thislist.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 881;BA.debugLine="Return thisList";
Debug.ShouldStop(65536);
if (true) return _thislist;
 };
 BA.debugLineNum = 883;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _remove(RemoteObject __ref,RemoteObject _objnodeselected) throws Exception{
try {
		Debug.PushSubsStack("Remove (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("remove")) return __ref.runUserSub(false, "treeviewmanager","remove", __ref, _objnodeselected);
RemoteObject _parentnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("objNodeSelected", _objnodeselected);
 BA.debugLineNum = 184;BA.debugLine="Public Sub Remove(objNodeSelected As TreeItem) As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 186;BA.debugLine="pickup_and_drop_clear";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.treeviewmanager.class, "_pickup_and_drop_clear");
 BA.debugLineNum = 187;BA.debugLine="If objNodeSelected <> Null Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("N",_objnodeselected)) { 
 BA.debugLineNum = 188;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 189;BA.debugLine="Dim parentNode As TreeItem = objNodeSelected.Pa";
Debug.ShouldStop(268435456);
_parentnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
_parentnode = _objnodeselected.runMethod(false,"getParent");Debug.locals.put("parentNode", _parentnode);Debug.locals.put("parentNode", _parentnode);
 BA.debugLineNum = 190;BA.debugLine="If parentNode.IsInitialized = True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 191;BA.debugLine="parentNode.Children.RemoveAt(parentNode.Childr";
Debug.ShouldStop(1073741824);
_parentnode.runMethod(false,"getChildren").runVoidMethod ("RemoveAt",(Object)(_parentnode.runMethod(false,"getChildren").runMethod(true,"IndexOf",(Object)((_objnodeselected.getObject())))));
 BA.debugLineNum = 192;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return treeviewmanager.__c.getField(true,"True");
 };
 };
 };
 BA.debugLineNum = 196;BA.debugLine="Return False";
Debug.ShouldStop(8);
if (true) return treeviewmanager.__c.getField(true,"False");
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rename(RemoteObject __ref,RemoteObject _objnodeselected,RemoteObject _strnewname) throws Exception{
try {
		Debug.PushSubsStack("Rename (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("rename")) return __ref.runUserSub(false, "treeviewmanager","rename", __ref, _objnodeselected, _strnewname);
Debug.locals.put("objNodeSelected", _objnodeselected);
Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 117;BA.debugLine="Public Sub Rename(objNodeSelected As TreeItem, str";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 119;BA.debugLine="pickup_and_drop_clear";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.treeviewmanager.class, "_pickup_and_drop_clear");
 BA.debugLineNum = 120;BA.debugLine="If objNodeSelected <> Null Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("N",_objnodeselected)) { 
 BA.debugLineNum = 121;BA.debugLine="If objNodeSelected.IsInitialized = True Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_objnodeselected.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 122;BA.debugLine="If strNewName <> \"\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("!",_strnewname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 124;BA.debugLine="If unique_name2(objNodeSelected.Parent, objNod";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.treeviewmanager.class, "_unique_name2",(Object)(_objnodeselected.runMethod(false,"getParent")),(Object)(_objnodeselected),(Object)(_strnewname)),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 125;BA.debugLine="If strNewName.EqualsIgnoreCase(Null) = False";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_strnewname.runMethod(true,"equalsIgnoreCase",(Object)(BA.ObjectToString(treeviewmanager.__c.getField(false,"Null")))),treeviewmanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 127;BA.debugLine="strNewName = strNewName.Replace(\"{\", \"\")";
Debug.ShouldStop(1073741824);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("{")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 128;BA.debugLine="strNewName = strNewName.Replace(\"}\", \"\")";
Debug.ShouldStop(-2147483648);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("}")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 129;BA.debugLine="strNewName = strNewName.Replace(\"[\", \"\")";
Debug.ShouldStop(1);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 130;BA.debugLine="strNewName = strNewName.Replace(\"]\", \"\")";
Debug.ShouldStop(2);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 131;BA.debugLine="strNewName = strNewName.Replace(\",\", \" \")";
Debug.ShouldStop(4);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 132;BA.debugLine="strNewName = strNewName.Replace(\":\", \" \")";
Debug.ShouldStop(8);
_strnewname = _strnewname.runMethod(true,"replace",(Object)(BA.ObjectToString(":")),(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 133;BA.debugLine="strNewName = strNewName.Replace($\"\"\"$, \"\")";
Debug.ShouldStop(16);
_strnewname = _strnewname.runMethod(true,"replace",(Object)((RemoteObject.createImmutable("\""))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewName", _strnewname);
 BA.debugLineNum = 134;BA.debugLine="objNodeSelected.Text = strNewName";
Debug.ShouldStop(32);
_objnodeselected.runMethod(true,"setText",_strnewname);
 BA.debugLineNum = 135;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) return treeviewmanager.__c.getField(true,"True");
 };
 };
 };
 };
 };
 BA.debugLineNum = 141;BA.debugLine="Return False";
Debug.ShouldStop(4096);
if (true) return treeviewmanager.__c.getField(true,"False");
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tojson(RemoteObject __ref,RemoteObject _objtreeview) throws Exception{
try {
		Debug.PushSubsStack("ToJSON (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,721);
if (RapidSub.canDelegate("tojson")) return __ref.runUserSub(false, "treeviewmanager","tojson", __ref, _objtreeview);
RemoteObject _listjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _templist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i2 = 0;
RemoteObject _strthis = RemoteObject.createImmutable("");
RemoteObject _strthis2 = RemoteObject.createImmutable("");
RemoteObject _jsonoutput = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("objTreeView", _objtreeview);
 BA.debugLineNum = 721;BA.debugLine="Public Sub ToJSON(objTreeView As TreeView) As Stri";
Debug.ShouldStop(65536);
 BA.debugLineNum = 722;BA.debugLine="Dim listJSON As List";
Debug.ShouldStop(131072);
_listjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listJSON", _listjson);
 BA.debugLineNum = 723;BA.debugLine="listJSON.Initialize";
Debug.ShouldStop(262144);
_listjson.runVoidMethod ("Initialize");
 BA.debugLineNum = 724;BA.debugLine="If objTreeView <> Null Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("N",_objtreeview)) { 
 BA.debugLineNum = 725;BA.debugLine="If objTreeView.IsInitialized = True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_objtreeview.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 726;BA.debugLine="If objTreeView.Root.Children.Size > 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_objtreeview.runMethod(false,"getRoot").runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 728;BA.debugLine="Dim tempList As List = recurse_tree_for_json(o";
Debug.ShouldStop(8388608);
_templist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_templist = __ref.runClassMethod (b4j.example.treeviewmanager.class, "_recurse_tree_for_json",(Object)(_objtreeview.runMethod(false,"getRoot")));Debug.locals.put("tempList", _templist);Debug.locals.put("tempList", _templist);
 BA.debugLineNum = 729;BA.debugLine="If tempList <> Null Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("N",_templist)) { 
 BA.debugLineNum = 730;BA.debugLine="If tempList.IsInitialized = True Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_templist.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 731;BA.debugLine="For i2 = 0 To tempList.Size - 1";
Debug.ShouldStop(67108864);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_templist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i2 = 0 ; (step9 > 0 && _i2 <= limit9) || (step9 < 0 && _i2 >= limit9); _i2 = ((int)(0 + _i2 + step9)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 732;BA.debugLine="Dim strThis As String = tempList.Get(i2)";
Debug.ShouldStop(134217728);
_strthis = BA.ObjectToString(_templist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))));Debug.locals.put("strThis", _strthis);Debug.locals.put("strThis", _strthis);
 BA.debugLineNum = 733;BA.debugLine="If strThis.CharAt(0) = \"{\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_strthis.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))),BA.ObjectToChar("{"))) { 
 BA.debugLineNum = 734;BA.debugLine="listJSON.Add(tempList.Get(i2))";
Debug.ShouldStop(536870912);
_listjson.runVoidMethod ("Add",(Object)(_templist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2)))));
 }else {
 BA.debugLineNum = 736;BA.debugLine="Dim strThis2 As String = $\"{ \"Text\" : \"${t";
Debug.ShouldStop(-2147483648);
_strthis2 = (RemoteObject.concat(RemoteObject.createImmutable("{ \"Text\" : \""),treeviewmanager.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_templist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))))),RemoteObject.createImmutable("\" }")));Debug.locals.put("strThis2", _strthis2);Debug.locals.put("strThis2", _strthis2);
 BA.debugLineNum = 737;BA.debugLine="If i2 < (tempList.Size - 1) Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i2),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {_templist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 738;BA.debugLine="If strThis2.CharAt(strThis2.Length - 1) <";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_strthis2.runMethod(true,"charAt",(Object)(RemoteObject.solve(new RemoteObject[] {_strthis2.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))),BA.ObjectToChar(","))) { 
 BA.debugLineNum = 739;BA.debugLine="strThis2 = strThis2 & \",\"";
Debug.ShouldStop(4);
_strthis2 = RemoteObject.concat(_strthis2,RemoteObject.createImmutable(","));Debug.locals.put("strThis2", _strthis2);
 };
 };
 BA.debugLineNum = 742;BA.debugLine="strThis2 = strThis2.Replace(\",,\", \",\")";
Debug.ShouldStop(32);
_strthis2 = _strthis2.runMethod(true,"replace",(Object)(BA.ObjectToString(",,")),(Object)(RemoteObject.createImmutable(",")));Debug.locals.put("strThis2", _strthis2);
 BA.debugLineNum = 743;BA.debugLine="listJSON.Add(strThis2)";
Debug.ShouldStop(64);
_listjson.runVoidMethod ("Add",(Object)((_strthis2)));
 };
 }
}Debug.locals.put("i2", _i2);
;
 };
 };
 };
 };
 };
 BA.debugLineNum = 751;BA.debugLine="Dim jsonOutput As String";
Debug.ShouldStop(16384);
_jsonoutput = RemoteObject.createImmutable("");Debug.locals.put("jsonOutput", _jsonoutput);
 BA.debugLineNum = 752;BA.debugLine="jsonOutput = $\"{\"TreeView\": [\"$";
Debug.ShouldStop(32768);
_jsonoutput = (RemoteObject.createImmutable("{\"TreeView\": ["));Debug.locals.put("jsonOutput", _jsonoutput);
 BA.debugLineNum = 753;BA.debugLine="For i = 0 To listJSON.Size - 1";
Debug.ShouldStop(65536);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {_listjson.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31); _i = ((int)(0 + _i + step31)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 754;BA.debugLine="jsonOutput = jsonOutput & listJSON.Get(i)";
Debug.ShouldStop(131072);
_jsonoutput = RemoteObject.concat(_jsonoutput,_listjson.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("jsonOutput", _jsonoutput);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 756;BA.debugLine="jsonOutput = jsonOutput & $\"]}\"$";
Debug.ShouldStop(524288);
_jsonoutput = RemoteObject.concat(_jsonoutput,(RemoteObject.createImmutable("]}")));Debug.locals.put("jsonOutput", _jsonoutput);
 BA.debugLineNum = 757;BA.debugLine="Return jsonOutput";
Debug.ShouldStop(1048576);
if (true) return _jsonoutput;
 BA.debugLineNum = 758;BA.debugLine="End Sub";
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
public static RemoteObject  _toxml(RemoteObject __ref,RemoteObject _objtreeview) throws Exception{
try {
		Debug.PushSubsStack("ToXML (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,885);
if (RapidSub.canDelegate("toxml")) return __ref.runUserSub(false, "treeviewmanager","toxml", __ref, _objtreeview);
RemoteObject _listxml = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _templist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i2 = 0;
RemoteObject _strthis = RemoteObject.createImmutable("");
RemoteObject _strthis2 = RemoteObject.createImmutable("");
RemoteObject _xmloutput = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("objTreeView", _objtreeview);
 BA.debugLineNum = 885;BA.debugLine="Public Sub ToXML(objTreeView As TreeView) As Strin";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 886;BA.debugLine="Dim listXML As List";
Debug.ShouldStop(2097152);
_listxml = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listXML", _listxml);
 BA.debugLineNum = 887;BA.debugLine="listXML.Initialize";
Debug.ShouldStop(4194304);
_listxml.runVoidMethod ("Initialize");
 BA.debugLineNum = 888;BA.debugLine="If objTreeView <> Null Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("N",_objtreeview)) { 
 BA.debugLineNum = 889;BA.debugLine="If objTreeView.IsInitialized = True Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_objtreeview.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 890;BA.debugLine="If objTreeView.Root.Children.Size > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_objtreeview.runMethod(false,"getRoot").runMethod(false,"getChildren").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 892;BA.debugLine="Dim tempList As List = recurse_tree_for_xml(ob";
Debug.ShouldStop(134217728);
_templist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_templist = __ref.runClassMethod (b4j.example.treeviewmanager.class, "_recurse_tree_for_xml",(Object)(_objtreeview.runMethod(false,"getRoot")));Debug.locals.put("tempList", _templist);Debug.locals.put("tempList", _templist);
 BA.debugLineNum = 893;BA.debugLine="If tempList <> Null Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("N",_templist)) { 
 BA.debugLineNum = 894;BA.debugLine="If tempList.IsInitialized = True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_templist.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 895;BA.debugLine="For i2 = 0 To tempList.Size - 1";
Debug.ShouldStop(1073741824);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_templist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i2 = 0 ; (step9 > 0 && _i2 <= limit9) || (step9 < 0 && _i2 >= limit9); _i2 = ((int)(0 + _i2 + step9)) ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 896;BA.debugLine="Dim strThis As String = tempList.Get(i2)";
Debug.ShouldStop(-2147483648);
_strthis = BA.ObjectToString(_templist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))));Debug.locals.put("strThis", _strthis);Debug.locals.put("strThis", _strthis);
 BA.debugLineNum = 897;BA.debugLine="If strThis.CharAt(0) = \"{\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_strthis.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))),BA.ObjectToChar("{"))) { 
 BA.debugLineNum = 898;BA.debugLine="listXML.Add(tempList.Get(i2))";
Debug.ShouldStop(2);
_listxml.runVoidMethod ("Add",(Object)(_templist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2)))));
 }else {
 BA.debugLineNum = 901;BA.debugLine="Dim strThis2 As String = tempList.Get(i2)";
Debug.ShouldStop(16);
_strthis2 = BA.ObjectToString(_templist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i2))));Debug.locals.put("strThis2", _strthis2);Debug.locals.put("strThis2", _strthis2);
 BA.debugLineNum = 902;BA.debugLine="listXML.Add(strThis2)";
Debug.ShouldStop(32);
_listxml.runVoidMethod ("Add",(Object)((_strthis2)));
 };
 }
}Debug.locals.put("i2", _i2);
;
 };
 };
 };
 };
 };
 BA.debugLineNum = 910;BA.debugLine="Dim xmlOutput As String";
Debug.ShouldStop(8192);
_xmloutput = RemoteObject.createImmutable("");Debug.locals.put("xmlOutput", _xmloutput);
 BA.debugLineNum = 911;BA.debugLine="xmlOutput = $\"<?xml version=\"1.0\" encoding=\"UTF-8";
Debug.ShouldStop(16384);
_xmloutput = RemoteObject.concat((RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")),treeviewmanager.__c.getField(true,"CRLF"),(RemoteObject.createImmutable("<root>")),treeviewmanager.__c.getField(true,"CRLF"));Debug.locals.put("xmlOutput", _xmloutput);
 BA.debugLineNum = 912;BA.debugLine="For i = 0 To listXML.Size - 1";
Debug.ShouldStop(32768);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {_listxml.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25); _i = ((int)(0 + _i + step25)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 913;BA.debugLine="xmlOutput = xmlOutput & listXML.Get(i) & CRLF";
Debug.ShouldStop(65536);
_xmloutput = RemoteObject.concat(_xmloutput,_listxml.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),treeviewmanager.__c.getField(true,"CRLF"));Debug.locals.put("xmlOutput", _xmloutput);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 915;BA.debugLine="xmlOutput = xmlOutput & $\"</root>\"$ & CRLF";
Debug.ShouldStop(262144);
_xmloutput = RemoteObject.concat(_xmloutput,(RemoteObject.createImmutable("</root>")),treeviewmanager.__c.getField(true,"CRLF"));Debug.locals.put("xmlOutput", _xmloutput);
 BA.debugLineNum = 917;BA.debugLine="Return xmlOutput";
Debug.ShouldStop(1048576);
if (true) return _xmloutput;
 BA.debugLineNum = 918;BA.debugLine="End Sub";
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
public static RemoteObject  _unique_name(RemoteObject __ref,RemoteObject _parentnode,RemoteObject _strname) throws Exception{
try {
		Debug.PushSubsStack("unique_name (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,924);
if (RapidSub.canDelegate("unique_name")) return __ref.runUserSub(false, "treeviewmanager","unique_name", __ref, _parentnode, _strname);
RemoteObject _childnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("parentNode", _parentnode);
Debug.locals.put("strName", _strname);
 BA.debugLineNum = 924;BA.debugLine="Private Sub unique_name(parentNode As TreeItem, st";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 925;BA.debugLine="If parentNode <> Null Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("N",_parentnode)) { 
 BA.debugLineNum = 926;BA.debugLine="If parentNode.IsInitialized = True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 927;BA.debugLine="If strName <> \"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",_strname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 928;BA.debugLine="For Each childNode As TreeItem In parentNode.C";
Debug.ShouldStop(-2147483648);
_childnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
final RemoteObject group4 = _parentnode.runMethod(false,"getChildren");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get();
for (int index4 = 0;index4 < groupLen4 ;index4++){
_childnode.setObject(group4.runMethod(false,"Get",index4));
Debug.locals.put("childNode", _childnode);
 BA.debugLineNum = 929;BA.debugLine="If childNode.Text = strName Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_childnode.runMethod(true,"getText"),_strname)) { 
 BA.debugLineNum = 930;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) return treeviewmanager.__c.getField(true,"True");
 };
 }
Debug.locals.put("childNode", _childnode);
;
 };
 };
 };
 BA.debugLineNum = 936;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) return treeviewmanager.__c.getField(true,"False");
 BA.debugLineNum = 937;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unique_name2(RemoteObject __ref,RemoteObject _parentnode,RemoteObject _comparenode,RemoteObject _strname) throws Exception{
try {
		Debug.PushSubsStack("unique_name2 (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,940);
if (RapidSub.canDelegate("unique_name2")) return __ref.runUserSub(false, "treeviewmanager","unique_name2", __ref, _parentnode, _comparenode, _strname);
RemoteObject _childnode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
Debug.locals.put("parentNode", _parentnode);
Debug.locals.put("compareNode", _comparenode);
Debug.locals.put("strName", _strname);
 BA.debugLineNum = 940;BA.debugLine="Private Sub unique_name2(parentNode As TreeItem, c";
Debug.ShouldStop(2048);
 BA.debugLineNum = 941;BA.debugLine="If parentNode <> Null And compareNode <> Null The";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("N",_parentnode) && RemoteObject.solveBoolean("N",_comparenode)) { 
 BA.debugLineNum = 942;BA.debugLine="If parentNode.IsInitialized = True And compareNo";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_parentnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_comparenode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 943;BA.debugLine="If strName <> \"\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_strname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 944;BA.debugLine="For Each childNode As TreeItem In parentNode.C";
Debug.ShouldStop(32768);
_childnode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
final RemoteObject group4 = _parentnode.runMethod(false,"getChildren");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get();
for (int index4 = 0;index4 < groupLen4 ;index4++){
_childnode.setObject(group4.runMethod(false,"Get",index4));
Debug.locals.put("childNode", _childnode);
 BA.debugLineNum = 945;BA.debugLine="If childNode.Text = strName And childNode <>";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_childnode.runMethod(true,"getText"),_strname) && RemoteObject.solveBoolean("!",_childnode,_comparenode)) { 
 BA.debugLineNum = 946;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) return treeviewmanager.__c.getField(true,"True");
 };
 }
Debug.locals.put("childNode", _childnode);
;
 };
 };
 };
 BA.debugLineNum = 952;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) return treeviewmanager.__c.getField(true,"False");
 BA.debugLineNum = 953;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _uniqunodeidentifier(RemoteObject __ref,RemoteObject _thisnode) throws Exception{
try {
		Debug.PushSubsStack("UniquNodeIdentifier (treeviewmanager) ","treeviewmanager",1,__ref.getField(false, "ba"),__ref,614);
if (RapidSub.canDelegate("uniqunodeidentifier")) return __ref.runUserSub(false, "treeviewmanager","uniqunodeidentifier", __ref, _thisnode);
RemoteObject _strreturn = RemoteObject.createImmutable("");
RemoteObject _listantecedents = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _strthisnodename = RemoteObject.createImmutable("");
RemoteObject _strnewthisnodename = RemoteObject.createImmutable("");
Debug.locals.put("thisNode", _thisnode);
 BA.debugLineNum = 614;BA.debugLine="Public Sub UniquNodeIdentifier(thisNode As TreeIte";
Debug.ShouldStop(32);
 BA.debugLineNum = 615;BA.debugLine="Dim strReturn As String = \"\"";
Debug.ShouldStop(64);
_strreturn = BA.ObjectToString("");Debug.locals.put("strReturn", _strreturn);Debug.locals.put("strReturn", _strreturn);
 BA.debugLineNum = 616;BA.debugLine="If thisNode <> Null Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("N",_thisnode)) { 
 BA.debugLineNum = 617;BA.debugLine="If thisNode.IsInitialized = True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_thisnode.runMethod(true,"IsInitialized"),treeviewmanager.__c.getField(true,"True"))) { 
 BA.debugLineNum = 618;BA.debugLine="Dim listAntecedents As List";
Debug.ShouldStop(512);
_listantecedents = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listAntecedents", _listantecedents);
 BA.debugLineNum = 619;BA.debugLine="listAntecedents.Initialize";
Debug.ShouldStop(1024);
_listantecedents.runVoidMethod ("Initialize");
 BA.debugLineNum = 620;BA.debugLine="listAntecedents = ListAntecedentNames(thisNode)";
Debug.ShouldStop(2048);
_listantecedents = __ref.runClassMethod (b4j.example.treeviewmanager.class, "_listantecedentnames",(Object)(_thisnode));Debug.locals.put("listAntecedents", _listantecedents);
 BA.debugLineNum = 621;BA.debugLine="If listAntecedents.Size > 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_listantecedents.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 622;BA.debugLine="For i = 0 To listAntecedents.Size - 1";
Debug.ShouldStop(8192);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_listantecedents.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8); _i = ((int)(0 + _i + step8)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 623;BA.debugLine="If strReturn <> \"\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_strreturn,BA.ObjectToString(""))) { 
 BA.debugLineNum = 624;BA.debugLine="strReturn = strReturn & \"->\"";
Debug.ShouldStop(32768);
_strreturn = RemoteObject.concat(_strreturn,RemoteObject.createImmutable("->"));Debug.locals.put("strReturn", _strreturn);
 };
 BA.debugLineNum = 626;BA.debugLine="Dim strThisNodeName As String = listAnteceden";
Debug.ShouldStop(131072);
_strthisnodename = BA.ObjectToString(_listantecedents.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("strThisNodeName", _strthisnodename);Debug.locals.put("strThisNodeName", _strthisnodename);
 BA.debugLineNum = 627;BA.debugLine="Dim strNewThisNodeName As String = strThisNod";
Debug.ShouldStop(262144);
_strnewthisnodename = _strthisnodename.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("_")));Debug.locals.put("strNewThisNodeName", _strnewthisnodename);Debug.locals.put("strNewThisNodeName", _strnewthisnodename);
 BA.debugLineNum = 628;BA.debugLine="strReturn = strReturn & strNewThisNodeName";
Debug.ShouldStop(524288);
_strreturn = RemoteObject.concat(_strreturn,_strnewthisnodename);Debug.locals.put("strReturn", _strreturn);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 630;BA.debugLine="strReturn = strReturn & \"|\" & Generation(thisN";
Debug.ShouldStop(2097152);
_strreturn = RemoteObject.concat(_strreturn,RemoteObject.createImmutable("|"),__ref.runClassMethod (b4j.example.treeviewmanager.class, "_generation",(Object)(_thisnode)));Debug.locals.put("strReturn", _strreturn);
 };
 };
 };
 BA.debugLineNum = 634;BA.debugLine="Return strReturn";
Debug.ShouldStop(33554432);
if (true) return _strreturn;
 BA.debugLineNum = 635;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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