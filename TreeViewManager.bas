Type=Class
Version=4.2
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@

Sub Class_Globals
	Private fx As JFX
	Public FamilyErrorNode As Int
	Private listGlobal As List
	Private mapPickup As Map
	Private TreeViewObject As TreeView
End Sub

'Initializes the object.
Public Sub Initialize(objTreeView As TreeView)
	If objTreeView <> Null Then
		If objTreeView.IsInitialized = True Then
			TreeViewObject = objTreeView
			FamilyErrorNode = -1
			listGlobal.Initialize
			mapPickup.Initialize
		End If
	End If
End Sub

'Adds a sibling node to an EXISTING SELECTED node (If the tree doees not have any nodes, use AddRoot).
'Will not add the name unless it is unique amongst it's siblings.
'See Main.TreeView1_MouseReleased for the method to capture a TreeItem from a mouse click
'Ex:
'tvm.AddSibling(SelectedNode, strNewName)
Public Sub AddSibling(objNodeSelected As TreeItem, strNewName As String) As TreeItem
	'If we did pick something up, we are doing something different now, so clear it.
	pickup_and_drop_clear
	If objNodeSelected <> Null Then
		If objNodeSelected.IsInitialized = True Then
			If strNewName <> "" Then
				If unique_name(objNodeSelected.Parent, strNewName) = True Then
					'Restricted charactes that might cause a problem with JSON export
					strNewName = strNewName.Replace("{", "")
					strNewName = strNewName.Replace("}", "")
					strNewName = strNewName.Replace("[", "")
					strNewName = strNewName.Replace("]", "")
					strNewName = strNewName.Replace(",", " ")
					strNewName = strNewName.Replace(":", " ")
					strNewName = strNewName.Replace($"""$, "")
					If strNewName.EqualsIgnoreCase(Null) = False Then
						Dim parentNode As TreeItem = objNodeSelected.Parent
						If parentNode.IsInitialized = True Then
							Dim newNode As TreeItem
							newNode.Initialize("ti", strNewName)
							If parentNode.Children.IndexOf(objNodeSelected) = parentNode.Children.Size - 1 Then
								parentNode.Children.Add(newNode)
							Else
								parentNode.Children.InsertAt((parentNode.Children.IndexOf(objNodeSelected) + 1), newNode)
							End If
						End If
					End If
				End If
			End If
		End If
	End If
End Sub

'If there are no items in the tree, use this to load your top level items.
'This can also be called for the user clicking on the tree, but not a node.
'Will not add the name unless it is unique amongst it's siblings.
'Ex:
'tvm.AddRoot(TreeView1, "Item Name")
Public Sub AddRoot(strNewName As String) As TreeItem
	'If we did pick something up, we are doing something different now, so clear it.
	pickup_and_drop_clear
	If TreeViewObject <> Null Then
		If TreeViewObject.IsInitialized = True Then
			If strNewName <> "" Then 
				'Make sure that a name is unique amongst it's siblings, so that we can generate a UniqueID
				If unique_name(TreeViewObject.Root, strNewName) = True Then
					If strNewName.EqualsIgnoreCase(Null) = False Then
						'Restricted charactes that might cause a problem with JSON export
						strNewName = strNewName.Replace("{", "")
						strNewName = strNewName.Replace("}", "")
						strNewName = strNewName.Replace("[", "")
						strNewName = strNewName.Replace("]", "")
						strNewName = strNewName.Replace(",", " ")
						strNewName = strNewName.Replace(":", " ")
						strNewName = strNewName.Replace($"""$, "")
						Dim newNode As TreeItem
						newNode.Initialize("ti",strNewName)
						TreeViewObject.root.Children.Add(newNode)
						Return newNode
					End If
				End If
			End If
		End If
	End If
End Sub

'Will add a CHILD to the selected node. Will not add the name unless it is unique amongst it's siblings.
Public Sub AddChild(objNodeSelected As TreeItem, strNewName As String) As TreeItem
	'If we did pick something up, we are doing something different now, so clear it.
	pickup_and_drop_clear
	If objNodeSelected <> Null Then
		If objNodeSelected.IsInitialized = True Then
			If strNewName <> "" Then 
				'Make sure that a name is unique amongst it's siblings, so that we can generate a UniqueID
				If unique_name(objNodeSelected, strNewName) = True Then
					If strNewName.EqualsIgnoreCase(Null) = False Then
						'Restricted charactes that might cause a problem with JSON export
						strNewName = strNewName.Replace("{", "")
						strNewName = strNewName.Replace("}", "")
						strNewName = strNewName.Replace("[", "")
						strNewName = strNewName.Replace("]", "")
						strNewName = strNewName.Replace(",", " ")
						strNewName = strNewName.Replace(":", " ")
						strNewName = strNewName.Replace($"""$, "")
						Dim newNode As TreeItem
						newNode.Initialize("ti", strNewName)
						objNodeSelected.Children.Add(newNode)
						Return newNode
					End If
				End If
			End If
		End If
	End If	
End Sub

'Will rename the .text of the selected node. Will not add the name unless it is unique amongst it's siblings.
Public Sub Rename(objNodeSelected As TreeItem, strNewName As String) As Boolean
	'If we did pick something up, we are doing something different now, so clear it.
	pickup_and_drop_clear
	If objNodeSelected <> Null Then
		If objNodeSelected.IsInitialized = True Then
			If strNewName <> "" Then 
				'Make sure that a name is unique amongst it's siblings, so that we can generate a UniqueID
				If unique_name2(objNodeSelected.Parent, objNodeSelected, strNewName) = True Then
					If strNewName.EqualsIgnoreCase(Null) = False Then
						'Restricted charactes that might cause a problem with JSON export
						strNewName = strNewName.Replace("{", "")
						strNewName = strNewName.Replace("}", "")
						strNewName = strNewName.Replace("[", "")
						strNewName = strNewName.Replace("]", "")
						strNewName = strNewName.Replace(",", " ")
						strNewName = strNewName.Replace(":", " ")
						strNewName = strNewName.Replace($"""$, "")
						objNodeSelected.Text = strNewName
						Return True
					End If
				End If
			End If
		End If
	End If
	Return False
End Sub

'Move the selected node visually up one position (to a lower index) amongst its SIBLINGS.
Public Sub MoveUp(objNodeSelected As TreeItem) As TreeItem
	'If we did pick something up, we are doing something different now, so clear it.
	pickup_and_drop_clear
	If objNodeSelected <> Null Then
		If objNodeSelected.IsInitialized = True Then
			Dim parentNode As TreeItem = objNodeSelected.Parent
			If parentNode.IsInitialized = True Then
				If parentNode.Children.IndexOf(objNodeSelected) > 0 Then
					Dim intOriginalIndex As Int = parentNode.Children.IndexOf(objNodeSelected)
					parentNode.Children.RemoveAt(intOriginalIndex)
					parentNode.Children.InsertAt((intOriginalIndex - 1), objNodeSelected)
					Return parentNode.Children.Get(intOriginalIndex - 1)
				End If
			End If
		End If
	End If
	Return Null
End Sub

'Move the selected node visually down one position (to a higher index) amongst its SIBLINGS.
Public Sub MoveDown(objNodeSelected As TreeItem) As TreeItem
	'If we did pick something up, we are doing something different now, so clear it.
	pickup_and_drop_clear
	If objNodeSelected <> Null Then
		If objNodeSelected.IsInitialized = True Then
			Dim parentNode As TreeItem = objNodeSelected.Parent
			If parentNode.IsInitialized = True Then
				If parentNode.Children.IndexOf(objNodeSelected) < (parentNode.Children.Size - 1) Then
					Dim intOriginalIndex As Int = parentNode.Children.IndexOf(objNodeSelected)
					parentNode.Children.RemoveAt(intOriginalIndex)
					parentNode.Children.InsertAt((intOriginalIndex + 1), objNodeSelected)
					Return parentNode.Children.Get(intOriginalIndex + 1)
				End If
			End If
		End If
	End If
End Sub

'Permanently removes the node and all of its children
Public Sub Remove(objNodeSelected As TreeItem) As Boolean
	'If we did pick something up, we are doing something different now, so clear it.
	pickup_and_drop_clear
	If objNodeSelected <> Null Then
		If objNodeSelected.IsInitialized = True Then
			Dim parentNode As TreeItem = objNodeSelected.Parent
			If parentNode.IsInitialized = True Then
				parentNode.Children.RemoveAt(parentNode.Children.IndexOf(objNodeSelected))
				Return True
			End If
		End If
	End If
	Return False
End Sub

'Boolean test for the selected node.
Sub HasChildren(objNodeSelected As TreeItem) As Boolean
	If objNodeSelected <> Null Then
		If objNodeSelected.IsInitialized = True Then
			If objNodeSelected.Children.Size > 0 Then
				Return True
			Else
				Return False
			End If
		End If
	End If
End Sub

'Boolean test for the selected node.
Sub HasSiblings(objNodeSelected As TreeItem) As Boolean
	If objNodeSelected <> Null Then
		If objNodeSelected.IsInitialized = True Then
			Dim parentNode As TreeItem = objNodeSelected.Parent
			If parentNode.IsInitialized = True Then
				If parentNode.Children.Size > 1 Then
					Return True
				Else
					Return False
				End If
			End If
		End If
	End If
End Sub

'Boolean test for the selected nodes. Order of objects does not matter.
Sub IsSibling(objNode1 As TreeItem, objNode2 As TreeItem) As Boolean
	If objNode1 <> Null And objNode2 <> Null Then
		If objNode1.IsInitialized = True And objNode2.IsInitialized = True Then
			Dim parentNode As TreeItem = objNode1.Parent
			If parentNode.Children.Size > 0 Then
				For i = 0 To parentNode.Children.Size - 1
					If parentNode.Children.Get(i) = objNode2 Then
						Return True
					End If
				Next
			End If
		End If
	End If
	Return False
End Sub

'Boolean test for the selected nodes. Order of objects does not matter.
Sub IsChild(objNode1 As TreeItem, objNode2 As TreeItem) As Boolean
	If objNode1 <> Null And objNode2 <> Null Then
		If objNode1.IsInitialized = True And objNode2.IsInitialized = True Then
			If objNode1.Parent = objNode2 Or objNode2.Parent = objNode1 Then
				Return True
			End If
		End If
	End If
	Return False
End Sub

'Boolean test for the selected node. Tests amongs the selected nodes siblings.
Sub IsFirstChild(objNodeSelected As TreeItem) As Boolean
	If objNodeSelected <> Null Then
		If objNodeSelected.IsInitialized = True Then
			Dim parentNode As TreeItem = objNodeSelected.Parent
			If parentNode.IsInitialized = True Then
				If parentNode.Children.IndexOf(objNodeSelected) = 0 Then
					Return True
				End If
			End If
			Return False
		End If
	End If
End Sub

'Boolean test for the selected node. Tests amongs the selected nodes siblings.
Sub IsLastChild(objNodeSelected As TreeItem) As Boolean
	If objNodeSelected <> Null Then
		If objNodeSelected.IsInitialized = True Then
			Dim parentNode As TreeItem = objNodeSelected.Parent
			If parentNode.IsInitialized = True Then
				If parentNode.Children.IndexOf(objNodeSelected) = (parentNode.Children.Size - 1) Then
					Return True
				End If
			End If
			Return False
		End If
	End If
End Sub

'Boolean test for the selected node.
Sub IsRoot(objNodeSelected As TreeItem) As Boolean
	If objNodeSelected <> Null Then
		If objNodeSelected.IsInitialized = True Then
			If objNodeSelected.Parent.IsInitialized = True Then
				Return objNodeSelected.Parent.Root
			End If
		End If
	End If
End Sub

'Boolean test for whether a node has been picked up, using tvm.Pickup
Sub IsPickup As Boolean
	If mapPickup.ContainsKey("Text") = True Then
		If mapPickup.Get("Text") <> "" Then
			Return True
		End If
	End If
	Return False
End Sub

'Returns an integer indicating it's position in the family hierarchy.
'Root item is 1, child is 2, grandchild is 3, etc.
Sub Generation(objNodeSelected As TreeItem) As Int
	If objNodeSelected <> Null Then
		If objNodeSelected.IsInitialized = True Then
			Dim intGenerationCounter As Int = 1
			Dim testNode As TreeItem = objNodeSelected
			Do While testNode.Parent.Root = False
				testNode = testNode.Parent
				intGenerationCounter = intGenerationCounter + 1
			Loop
			Return intGenerationCounter
		End If
	End If
End Sub

'Marks a node to be moved with the paired method Drop.
Sub Pickup(objPickupNodeSelected As TreeItem)
	If objPickupNodeSelected <> Null Then
		If objPickupNodeSelected.IsInitialized = True Then
			pickup_and_drop_clear
			mapPickup.Put("Text", objPickupNodeSelected.Text)
			mapPickup.Put("ParentNode", objPickupNodeSelected.Parent)
			mapPickup.Put("IndexOf", objPickupNodeSelected.Parent.Children.IndexOf(objPickupNodeSelected))
			If objPickupNodeSelected.Children.Size > 0 Then
				Dim templist As List
				templist.Initialize
				templist.AddAll(objPickupNodeSelected.children)
				mapPickup.Put("Children", templist)
			End If
		End If
	End If
End Sub

'Moves the node picked up to the sibling position after the target where drop
Sub Drop(objDropAtNodeSelected As TreeItem)
	If objDropAtNodeSelected <> Null Then
		If objDropAtNodeSelected.IsInitialized = True Then
			If mapPickup.ContainsKey("Text") = True And mapPickup.ContainsKey("IndexOf") = True And mapPickup.ContainsKey("Children") = True Then
				Dim pickupParentNode As TreeItem = mapPickup.Get("ParentNode")
				Dim dropParentNode As TreeItem = objDropAtNodeSelected.Parent
				Dim intDropIndex As Int = dropParentNode.Children.IndexOf(objDropAtNodeSelected)
				If intDropIndex = dropParentNode.Children.Size - 1 Then
					pickupParentNode.Children.RemoveAt(mapPickup.Get("IndexOf"))
					CallSubDelayed2(Me, "drop_add", dropParentNode)
				Else
					pickupParentNode.Children.RemoveAt(mapPickup.Get("IndexOf"))
					CallSubDelayed3(Me, "drop_insert", dropParentNode, (dropParentNode.Children.IndexOf(objDropAtNodeSelected) + 1))
				End If
			End If
		End If
	End If
End Sub

'Internal class method, cannot be called directly.
Private Sub drop_insert(parentNode As TreeItem, intIndex As Int)
	If parentNode <> Null Then
		If mapPickup.ContainsKey("Text") = True And mapPickup.ContainsKey("IndexOf") = True And mapPickup.ContainsKey("Children") = True Then
			If parentNode.IsInitialized = True And mapPickup.Get("Text") <> "" Then
				'Make sure that a name is unique amongst it's siblings, so that we can generate a UniqueID
				If unique_name(parentNode, mapPickup.Get("Text")) = True Then
					Dim newNode As TreeItem
					newNode.Initialize("ti", mapPickup.Get("Text"))
					parentNode.Children.InsertAt(intIndex, newNode)
					Dim listTemp As List = mapPickup.Get("Children")
					If listTemp.IsInitialized = True Then
						If listTemp.Size > 0 Then
							For Each child As TreeItem In listTemp
							    newNode.Children.Add(child)
							Next
						End If
					End If
					'Finished dropping, so clear the holder.
					pickup_and_drop_clear
				End If
			End If
		End If
	End If
End Sub

'Internal class method, cannot be called directly
Private Sub drop_add(parentNode As TreeItem)
	If parentNode <> Null Then
		If mapPickup.ContainsKey("Text") = True Then
			If parentNode.IsInitialized = True And mapPickup.Get("Text") <> "" Then
				'Make sure that a name is unique amongst it's siblings, so that we can generate a UniqueID
				If unique_name(parentNode, mapPickup.Get("Text")) = True Then
					Dim newNode As TreeItem
					newNode.Initialize("ti", mapPickup.Get("Text"))
					Dim listTemp As List = mapPickup.Get("Children")
					If listTemp.IsInitialized = True Then
						If listTemp.Size > 0 Then
							For Each child As TreeItem In listTemp
							    newNode.Children.Add(child)
							Next
						End If
					End If
					parentNode.Children.Add(newNode)
					'Finished dropping, so clear the holder.
					pickup_and_drop_clear
				End If
			End If
		End If
	End If
End Sub

'Internal class method, cannot be called directly
Private Sub pickup_and_drop_clear
	mapPickup.Clear
End Sub


'Where MoveUp() and MoveDown() change the nodes position in the parent's list of
'children, the MakeParent() procedure will make the selected node a sibling of
'it's parent. The new sibling will take it's children with it.
Public Sub MakeParent(objNodeSelected As TreeItem)
	'If we did pick something up, we are doing something different now, so clear it.
	pickup_and_drop_clear
	If objNodeSelected <> Null Then
		If objNodeSelected.IsInitialized = True Then
			Dim parentNode As TreeItem = objNodeSelected.Parent
			If parentNode.IsInitialized = True Then
				Dim grandparentNode As TreeItem = parentNode.Parent
				If grandparentNode.IsInitialized = True Then
					'Make sure that a name is unique amongst it's siblings, so that we can generate a UniqueID
					If unique_name(grandparentNode, objNodeSelected.Text) = True Then
						Dim intIndexOfParent As Int = grandparentNode.Children.IndexOf(parentNode)
						Dim intOriginalTreeItemIndex As Int = parentNode.Children.IndexOf(objNodeSelected)
						If intIndexOfParent = grandparentNode.Children.Size - 1 Then
							Dim tempNode As TreeItem
							tempNode = objNodeSelected
							parentNode.Children.RemoveAt(intOriginalTreeItemIndex)
							CallSubDelayed3(Me, "make_parent_add", grandparentNode, tempNode)
						Else
							Dim tempNode As TreeItem
							tempNode = objNodeSelected
							Dim args(3) As TreeItem
							args(0) = grandparentNode
							args(1) = tempNode
							Dim intNewIndex As Int = (grandparentNode.Children.IndexOf(parentNode) + 1)
							parentNode.Children.RemoveAt(intOriginalTreeItemIndex)
							CallSubDelayed3(Me, "make_parent_insert", args, intNewIndex)
						End If
					End If
				End If
			End If
		End If
	End If
End Sub

'Internal method, cannot be called directly
Private Sub make_parent_add(grandParentNode As TreeItem, newNode As TreeItem)
	If grandParentNode <> Null Then
		grandParentNode.Children.Add(newNode)
	End If
End Sub

'Internal method, cannot be called directly
Private Sub make_parent_insert(args() As TreeItem, atIndex As Int)
	Dim grandparentNode As TreeItem = args(0)
	If grandparentNode.IsInitialized = True Then
		Dim newNode As TreeItem = args(1)
		If newNode.IsInitialized = True Then
			grandparentNode.Children.InsertAt(atIndex, newNode)
		End If
	End If
End Sub

'Returns a List object containg the names of the nodes children,
'one level only. Grandchildren, etc., are not included.
Public Sub ListChildrenNames(thisNode As TreeItem) As List
	listGlobal.Clear
	If thisNode <> Null Then
		If thisNode.IsInitialized = True Then
			If thisNode.Children.Size > 0 Then
				For i = 0 To thisNode.Children.Size - 1
					Dim thisItem As TreeItem
					thisItem = thisNode.children.get(i)
					listGlobal.Add(thisItem.Text)
				Next
			End If
		End If
	End If
	Return listGlobal
End Sub

'Returns a List object containg the nodes of the children,
'one level only. Grandchildren, etc., are not included.
Public Sub ListChildrenNodes(thisNode As TreeItem) As List
	listGlobal.Clear
	If thisNode <> Null Then
		If thisNode.IsInitialized = True Then
			If thisNode.Children.Size > 0 Then
				For i = 0 To thisNode.Children.Size - 1
					Dim thisItem As TreeItem
					thisItem = thisNode.children.get(i)
					listGlobal.Add(thisItem)
				Next
			End If
		End If
	End If
	Return listGlobal
End Sub

'Returns a List object containg the names of the nodes siblings.
'Grandchildren, etc., are not included.
Public Sub ListSiblingNames(thisNode As TreeItem) As List
	listGlobal.Clear
	If thisNode <> Null Then
		If thisNode.IsInitialized = True Then
			Dim parentNode As TreeItem = thisNode.Parent
			If parentNode.IsInitialized = True Then
				If parentNode.Children.Size > 0 Then
					For i = 0 To parentNode.Children.Size - 1
						Dim thisItem As TreeItem
						thisItem = parentNode.children.get(i)
						If thisItem.Text <> thisNode.Text Then
							listGlobal.Add(thisItem.Text)
						End If
					Next
				End If
			End If
		End If
	End If
	Return listGlobal
End Sub

'Returns a List object containg the nodes of the siblings.
'Grandchildren, etc., are not included.
Public Sub ListSiblingNodes(thisNode As TreeItem) As List
	listGlobal.Clear
	If thisNode <> Null Then
		If thisNode.IsInitialized = True Then
			Dim parentNode As TreeItem = thisNode.Parent
			If parentNode.IsInitialized = True Then
				If parentNode.Children.Size > 0 Then
					For i = 0 To parentNode.Children.Size - 1
						Dim thisItem As TreeItem
						thisItem = parentNode.children.get(i)
						If thisItem.Text <> thisNode.Text Then
							listGlobal.Add(thisItem)
						End If
					Next
				End If
			End If
		End If
	End If
	Return listGlobal
End Sub

'Returns a List containing the node text in the hierarchy of the node, from the
'root element down to and including the selected node.
Public Sub ListAntecedentNames(thisNode As TreeItem) As List
	listGlobal.Clear
	If thisNode <> Null Then
		If thisNode.IsInitialized = True Then
			Dim testNode As TreeItem
			testNode = thisNode
			Do Until testNode.Root = True
				listGlobal.Add(testNode.Text)
				testNode = testNode.Parent
			Loop
			If listGlobal.Size > 0 Then
				Dim listTemp As List
				listTemp.Initialize
				listTemp.AddAll(listGlobal)
				listGlobal.Clear
				For i = listTemp.Size - 1 To 0 Step -1
					listGlobal.Add(listTemp.Get(i))
				Next
			End If
		End If
	End If
	Return listGlobal
End Sub

'Returns a List containing the nodes in the hierarchy of the selected node, from the
'root element down to and including the selected node.
Public Sub ListAntecedentNodes(thisNode As TreeItem) As List
	listGlobal.Clear
	If thisNode <> Null Then
		If thisNode.IsInitialized = True Then
			Dim testNode As TreeItem
			testNode = thisNode
			Do Until testNode.Root = True
				listGlobal.Add(testNode)
				testNode = testNode.Parent
			Loop
			If listGlobal.Size > 0 Then
				Dim listTemp As List
				listTemp.Initialize
				listTemp.AddAll(listGlobal)
				listGlobal.Clear
				For i = listTemp.Size - 1 To 0 Step -1
					listGlobal.Add(listTemp.Get(i))
				Next
			End If
		End If
	End If
	Return listGlobal
End Sub

'Uses the nodes antecedent list, plus it's position in the hierarcy
'to create a unique string that will identify this node. It is possible
'because the add/rename/move nodes forces uniquenames. This uniqueID
'can be used as a key to store the data in a Map, KVS, database, etc.
Public Sub UniquNodeIdentifier(thisNode As TreeItem) As String
	Dim strReturn As String = ""
	If thisNode <> Null Then
		If thisNode.IsInitialized = True Then
			Dim listAntecedents As List
			listAntecedents.Initialize
			listAntecedents = ListAntecedentNames(thisNode)
			If listAntecedents.Size > 0 Then
				For i = 0 To listAntecedents.Size - 1
					If strReturn <> "" Then
						strReturn = strReturn & "->"
					End If
					Dim strThisNodeName As String = listAntecedents.Get(i)
					Dim strNewThisNodeName As String = strThisNodeName.Replace(" ", "_")
					strReturn = strReturn & strNewThisNodeName
				Next
				strReturn = strReturn & "|" & Generation(thisNode)
			End If
		End If
	End If
	Return strReturn
End Sub

'Returns the name of the parent of the sected node.
Public Sub ParentName(childNode As TreeItem) As String
	If childNode <> Null Then
		If childNode.IsInitialized = True Then
			If childNode.Parent <> Null Then
				Dim parentItem As TreeItem = childNode.Parent
				Return parentItem.Text
			End If
		End If
	End If
End Sub

#Region JSON

'Inernal sub used for building the JSON string to be exported.
Private Sub recurse_tree_for_json(thisNode As TreeItem) As List
	Dim thisList As List
	thisList.Initialize
	If thisNode <> Null Then
		If thisNode.IsInitialized Then
		  	'Log("    recursing: " & thisNode.Text)
	        If thisNode.Children.Size > 0 Then
	          For i = 0 To thisNode.Children.Size - 1
	            Dim newNode As TreeItem = thisNode.Children.Get(i)
				If newNode.IsInitialized = True Then
					'Log("        recurse on child " & newNode.Text & " of the parent " & thisNode.Text)
					Dim thisNodeList As List = recurse_tree_for_json(newNode)
					If thisNodeList <> Null Then
						If thisNodeList.IsInitialized = True Then
							Dim listTemp As List
							listTemp.Initialize
							For i2 = 0 To thisNodeList.Size - 1
								'Dim thisstring As String = $"{ "Text" : "${thisNodeList.Get(i2)}"}"$
								Dim thisstring As String = thisNodeList.Get(i2)
								If thisstring.IndexOf($"{ "Text" :"$) = -1 Then
									thisstring = $"{ "Text" : "${thisNodeList.Get(i2)}"}"$
									If i2 < (thisNodeList.Size - 1) Then
										If thisstring.CharAt(thisstring.Length - 1) <> "," Then
											thisstring = thisstring & ","
										End If
									End If
								End If
								thisstring = thisstring.Replace(",,", ",")
								listTemp.Add(thisstring)
							Next
							If listTemp.Size > 0 Then
								Dim thisstring As String = $"{ "Text" : "${newNode.Text}", "Children": ${listTemp} }"$
								If i < (thisNode.Children.Size - 1) Then
									If thisstring.CharAt(thisstring.Length - 1) <> "," Then
										thisstring = thisstring & ","
									End If
								End If
								thisstring = thisstring.Replace(",,", ",")
								thisList.Add(thisstring)
							Else
								Dim thisstring As String = $"{ "Text" : "${newNode.Text}" }"$
								If i < (thisNode.Children.Size - 1) Then
									If thisstring.CharAt(thisstring.Length - 1) <> "," Then
										thisstring = thisstring & ","
									End If
								End If
								thisstring = thisstring.Replace(",,", ",")
								thisList.Add(thisstring)
							End If
						End If
					Else
						thisList.Add(newNode.Text)
					End If
				End If
	          Next
	        End If
		End If
	End If
	If thisList.Size > 0 Then
		Return thisList
	End If
End Sub

'Returns a string containing a JSON representation of the TreeView. It only
'returns the node names, not any data that is stored with it. However, by
'using the saved JSON string to rebuild the tree, the data will still be
'referenced as the rebuilt tree will still generate the same uniqueIDs
Public Sub ToJSON() As String
	Dim listJSON As List
	listJSON.Initialize
	If TreeViewObject.Root.Children.Size > 0 Then
		'Loop through each root item
		Dim tempList As List = recurse_tree_for_json(TreeViewObject.Root)
		If tempList <> Null Then
			If tempList.IsInitialized = True Then
				For i2 = 0 To tempList.Size - 1
					Dim strThis As String = tempList.Get(i2)
					If strThis.CharAt(0) = "{" Then
						listJSON.Add(tempList.Get(i2))
					Else
						Dim strThis2 As String = $"{ "Text" : "${tempList.Get(i2)}" }"$
						If i2 < (tempList.Size - 1) Then
							If strThis2.CharAt(strThis2.Length - 1) <> "," Then
								strThis2 = strThis2 & ","
							End If
						End If
						strThis2 = strThis2.Replace(",,", ",")
						listJSON.Add(strThis2)
					End If
				Next
			End If
		End If
	End If
	Dim jsonOutput As String
	jsonOutput = $"{"TreeView": ["$
	For i = 0 To listJSON.Size - 1
		jsonOutput = jsonOutput & listJSON.Get(i)
	Next
	jsonOutput = jsonOutput & $"]}"$
	Return jsonOutput
End Sub

'Private method for building the TreeView from a JSON string.
Private Sub recurse_json_for_tree(topNode As TreeItem, children As List)
	If topNode <> Null Then
	    If topNode.IsInitialized = True Then
		    If children.IsInitialized = True Then
				If children.Size > 0 Then
				    For Each colChildren As Map In children 
				        Dim strText As String = colChildren.Get("Text") 
						Dim ti As TreeItem = AddChild(topNode, strText)
				        If colChildren.ContainsKey("Children") = True Then
							recurse_json_for_tree(ti, colChildren.Get("Children"))
						End If
					Next
				End If
			End If
		End If
	End If
End Sub

'Takes a JSON string and rebuilds the treeview.
Public Sub BuildTreeFromJSON(strJSON As String)
    If TreeViewObject.Root.Children.IsInitialized = True Then
	    TreeViewObject.Root.Children.Clear
	End If
    If strJSON <> "" Then
		Dim parser As JSONParser 
		parser.Initialize(strJSON) 
		Dim root As Map = parser.NextObject 
		Dim tvList As List = root.Get("TreeView") 
		For Each colTreeView As Map In tvList 
			Dim strText As String = colTreeView.Get("Text") 
			Dim topNode As TreeItem = AddRoot(strText)
			If topNode.IsInitialized = True Then
				If colTreeView.ContainsKey("Children") = True Then
					recurse_json_for_tree(topNode, colTreeView.Get("Children"))
				End If
			End If
		Next
	End If
End Sub 

#End Region

#Region XML

'XML is something I'm looking at. The example program can export XML that validates, though isn't pretty.
'For now, there is no import of the XML. I haven't figured out how to do it in a setting where the import
'XML can have an unknown number of children.
Private Sub recurse_tree_for_xml(thisNode As TreeItem) As List
	Dim thisList As List
	thisList.Initialize
	If thisNode <> Null Then
		If thisNode.IsInitialized Then
		  	'Log("    recursing: " & thisNode.Text)
	        If thisNode.Children.Size > 0 Then
	          For i = 0 To thisNode.Children.Size - 1
	            Dim newNode As TreeItem = thisNode.Children.Get(i)
				If newNode.IsInitialized = True Then
					'Log("        recurse on child " & newNode.Text & " of the parent " & thisNode.Text)
					Dim thisNodeList As List = recurse_tree_for_xml(newNode)
					If thisNodeList <> Null Then
						If thisNodeList.IsInitialized = True Then
							Dim listTemp As List
							listTemp.Initialize
							Dim matchChildTopic As Matcher
							Dim matchText As Matcher
							For i2 = 0 To thisNodeList.Size - 1
								'Dim strTest As String = thisNodeList.Get(i2)
								Dim thisstring As String
								matchChildTopic = Regex.Matcher("^\s*<ChildTopic>", thisNodeList.Get(i2))
								matchText = Regex.Matcher("^\s*<Text>", thisNodeList.Get(i2))
								If matchChildTopic.Find = True Then
									thisstring = thisNodeList.Get(i2)
								Else If matchText.Find = True Then
									thisstring = $"<ChildTopic>"$ & CRLF & thisNodeList.Get(i2) & CRLF & $"</ChildTopic>"$
								Else
									thisstring = $"<ChildTopic>"$ & CRLF & $"<Text>${thisNodeList.Get(i2)}</Text>"$ & CRLF & $"</ChildTopic>"$
								End If
								listTemp.Add(thisstring)
							Next
							If listTemp.Size > 0 Then
								Dim thisstring As String
								If Generation(newNode) = 1 Then
									thisstring = $"<Topic>"$ & CRLF & $"<Text>"$ & newNode.Text & $"</Text>"$ & CRLF & $"<Children>"$
								Else
								    thisstring = $"<ChildTopic>"$ & CRLF & $"<Text>"$ & newNode.Text & $"</Text>"$ & CRLF & $"<Children>"$
								End If
								For i2 = 0 To listTemp.Size - 1
									thisstring = thisstring & CRLF & listTemp.Get(i2)
								Next
								
								If Generation(newNode) = 1 Then
									thisstring = thisstring & CRLF & $"</Children>"$ & CRLF & $"</Topic>"$
								Else
									thisstring = thisstring & CRLF & $"</Children></ChildTopic>"$
								End If
								
								thisList.Add(thisstring)
							Else
								Dim thisstring As String
								If Generation(newNode) = 1 Then
									thisstring = $"<Text>"$ & newNode.Text & $"</Text>"$ & CRLF
								Else
								    thisstring = $"<ChildTopic>"$ & CRLF & $"<Text>"$ & newNode.Text & $"</Text>"$ & CRLF & $"</ChildTopic>"$
								End If
								thisList.Add(thisstring)
							End If
						End If
					Else
						thisList.Add(newNode.Text)
					End If
				End If
	          Next
	        End If
		End If
	End If
	If thisList.Size > 0 Then
		Return thisList
	End If
End Sub

Public Sub ToXML As String
	Dim listXML As List
	listXML.Initialize
	If TreeViewObject.Root.Children.Size > 0 Then
		'Loop through each root item
		Dim tempList As List = recurse_tree_for_xml(TreeViewObject.Root)
		If tempList <> Null Then
			If tempList.IsInitialized = True Then
				For i2 = 0 To tempList.Size - 1
					Dim strThis As String = tempList.Get(i2)
					If strThis.CharAt(0) = "{" Then
						listXML.Add(tempList.Get(i2))
					Else
						'Dim strThis2 As String = $"<RootParent>"$ & CRLF & $"    <Text>${tempList.Get(i2)}</Text>"$ & CRLF & $"</RootParent>"$
						Dim strThis2 As String = tempList.Get(i2)
						listXML.Add(strThis2)
					End If
				Next
			End If
		End If
	End If
	Dim xmlOutput As String
	xmlOutput = $"<?xml version="1.0" encoding="UTF-8"?>"$ & CRLF & $"<root>"$ & CRLF
	For i = 0 To listXML.Size - 1
		xmlOutput = xmlOutput & listXML.Get(i) & CRLF
	Next
	xmlOutput = xmlOutput & $"</root>"$ & CRLF
	'It's not pretty, but it is valid.
	Return xmlOutput
End Sub

#End Region

'Checks that a name does not exist amongst siblings, where a node is being inserted/added.
Private Sub unique_name(parentNode As TreeItem, strName As String) As Boolean
	Dim boolTest As Boolean = True
	If parentNode <> Null Then
		If parentNode.IsInitialized = True Then
			If strName <> "" Then
				For Each childNode As TreeItem In parentNode.Children
					If childNode.Text = strName Then
						boolTest = False
					End If
				Next
			End If
		End If
	End If
	Return boolTest
End Sub

'Checks an existing node being renamed does not have a sibling with that name
Private Sub unique_name2(parentNode As TreeItem, compareNode As TreeItem, strName As String) As Boolean
	Dim boolTest As Boolean = True
	If parentNode <> Null And compareNode <> Null Then
		If parentNode.IsInitialized = True And compareNode.IsInitialized = True Then
			If strName <> "" Then
				For Each childNode As TreeItem In parentNode.Children
					If childNode.Text = strName And childNode <> compareNode Then
						boolTest = False
					End If
				Next
			End If
		End If
	End If
	Return boolTest
End Sub
