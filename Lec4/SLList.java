 /** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
public class SLList {
	 private class IntNode {
		 public int item;
		 public IntNode next;

		 public IntNode(int f, IntNode r){
			 item=f;
			 next=r;
		 }
	 }
	 //哨兵节点，它的next为第一个节点，防止空链表导致addLast失效
	private IntNode sentinal ;//不让用户破坏这个数据结构，用户不能使用IntNode
	private int size;

	//create one-item list
	public SLList(int x){
		sentinal=new IntNode(0,null);
		sentinal.next=new IntNode(x,null);
		size=1;
	}

	//create empty list
	 public SLList(){
		sentinal=new IntNode(0,null);
		size=0;
	 }

	 //在开头加一个元素
	 public void addFirst(int x){
		sentinal.next=new IntNode(x,sentinal.next);
		size+=1;
	 }

	 //在末尾加一个元素
	public void addLast(int x){
		size+=1;
		IntNode p=sentinal;

		while(p.next!=null){
			p=p.next;
		}

		p.next=new IntNode(x,null);
	}

	//写两个size()目的: 向用户隐藏IntNode类
	public int size(){
		return size;//first为private，不能被这个类的public的函数调用，要用private的函数
	}

	//return the size of the list, starting at IntNode p.
	 /*private int size(IntNode p){
		if(p.next==null){
			return 1;
		}
		return 1+size(p.next);
	 }*/

	public int getFirst(){
		return sentinal.next.item;
	}

	public static void main(String[] args){
		SLList L=new SLList();
		L.addLast(10);
	}
}