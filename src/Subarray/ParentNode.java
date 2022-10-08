package Subarray;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Subarray.TreeNode.Node;

class ParentModel<T> implements Iterable<ParentModel<T>>
{
	public T data;
	public ParentModel<T> parent;
	public List<ParentModel<T>> children;

	private List<ParentModel<T>> elementsIndex;

	ParentModel(T data)
	{
		this.data=data;
		this.children=new LinkedList<ParentModel<T>>();
		this.elementsIndex = new LinkedList<ParentModel<T>>();
		this.elementsIndex.add(this);
	}

	public boolean isRoot() {
		return parent == null;
	}

	public ParentModel<T> addChild(T child)
	{
		ParentModel<T> childNode =  new ParentModel<T>(child);
		childNode.parent =this;
		this.children.add(childNode);
		this.registerChildForSearch(childNode);
		return childNode;

	} 

	//	public int getLevel() {
	//		if (isRoot())
	//			return 0;
	//		else
	//			return parent.getLevel() + 1;
	//	}

	private void registerChildForSearch(ParentModel<T> node)
	{
		elementsIndex.add(node);
		if (parent != null)
			parent.registerChildForSearch(node);
	}

	public ParentModel<T> findTreeNode(Comparable<T> comparaingValue )
	{
		for (ParentModel<T> element : elementsIndex)
		{
			T elData = element.data;

//			
			//else 
			{
				for(int i = 0;i<elementsIndex.size();i++)
				{
					if((comparaingValue.compareTo(elData)!=0))
					{

						System.out.println("\t"+elData);
						break;
					}
					else if (comparaingValue.compareTo(elData)==0)
					{
						System.out.println(" "+elData);
						break;
					}System.out.println("\t");
				}
			}
		}
		return null;
	}	
	@Override
	public String toString()
	{
		return data != null ? data.toString() : "[data null]";
	}

	@Override
	public Iterator<ParentModel<T>> iterator() {
		return null;
	}
}
class SampleValue {

	public static ParentModel<String> rootDirectory()
	{
		ParentModel<String> root = new ParentModel<String>("1");
		{
			ParentModel<String> child1 = root.addChild("2");
			ParentModel<String> child2 = root.addChild("3");
			ParentModel<String> child3 = root.addChild("4");
			{
				ParentModel<String> child4 = child3.addChild("8");
				ParentModel<String> child5 = child3.addChild("5");
				{
					ParentModel<String> child6 = child5.addChild("6");
					ParentModel<String> child7= child5.addChild("7");
				}
			}
		}return root;
	}
} 
public class ParentNode 
{
	public static void main(String[] args)
	{
		Comparable<String> comparValue = new Comparable<String>()
		{
			public int compareTo(String value )
			{
				if (value == null)
				{
					return 1;
				}
				else {
					boolean nodeOk = value.contains("1");
					return nodeOk ? 0 : 1;
				}
			}
		};



		ParentModel<String> treeroot = SampleValue.rootDirectory();
		ParentModel<String> search = treeroot.findTreeNode(comparValue);
		System.out.println("Search Value   : " +search);


	} 

}
