# TreeViewBuilder

This is a test project to learn how to manipulate the TreeView and TreeItem objects in B4J (B4X.Com)

As I go through B4J and learn more, sometimes I have to slow down and focus on something. I have  project I want to
complete, but I needed an in-depth understanding of the TreeView/TreeItem objects to do it. This small project was
born. It shows a bunch of ways to manipulate tree items and how to associate data with a tree item.

AddRoot
Adds a top level item to the TreeView.


AddSibling
Adds a  node at the same level as the selected node, forcing a unique name amongst its siblings.


AddChild
Adds a child node to the selected node, forcing a unique name amongst its siblings.


MakeParent
Takes a child node and moves it up to the level of it's parent, turning it into a sibling of it's parent.
Forces a unique name amongst its new siblings.


Generation
An integer that represents the nodes position within the family hierarchy. 


UniquNodeIdentifier
Generates a text string that uniquely identifies the node. This can be used as a map key or in a database to
store data associated with the node. This unique ID persits instances.


Rename
Renames a node with new text, forcing a unique name amongst its siblings.


Remove
Removes a node along with all its children.


MoveUp / MoveDown
Move a node visually, move up decreases the index of the node, move down  increasesit.


Pickup / Drop
Since dragging and dropping isn't practically possible, the Pickup and Drop will allow you to move a node to
any position in it's own family hierarchy or in any other family hierarchy.


HasChildren/HasSiblings/IsFirstChild/IsLastChild
Several boolean tests for a node.


IsSibling / IsChild
Test two nodes to see if the above relationship exists


ListChildrenNames / ListChildrenNodes
ListSiblingNames / ListSiblingNodes
ListAntecedentNames / ListAntecedentNodes
Return a list of the selected nodes chilren, siblings, or nodes higher up the hierarchy.


ToJSON / BuildTreeFromJSON
You can export the tree to JSON or import it and build it from a JSON string.

