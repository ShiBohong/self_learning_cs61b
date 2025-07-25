/** An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within. */
public class SLList<template> {
	private class IntNode {
		public template item;
		public IntNode next;

		public IntNode(template f, IntNode r){
			item=f;
			next=r;
		}
	}//不让用户破坏这个数据结构，用户不能使用IntNode

	private IntNode sentinal ;//哨兵节点，它的next为第一个节点，防止空链表导致addLast失效，且可以保证代码简洁，因为避免考虑特殊情况链表为空
	private int size;//不让外部用户直接使用size，只能通过SL类的内部函数访问操作

	//create one-item list
	public SLList(template x){
		sentinal=new IntNode(null,null);
		sentinal.next=new IntNode(x,null);
		size=1;
	}

	//create empty list
	public SLList(){
		sentinal=new IntNode(null,null);
		size=0;
	}

	//在开头加一个元素
	public void addFirst(template x){
		sentinal.next=new IntNode(x,sentinal.next);
		size+=1;
	}

	//在末尾加一个元素
	public void addLast(template x){
		size+=1;
		IntNode p=sentinal;

		while(p.next!=null){
			p=p.next;
		}

		p.next=new IntNode(x,null);
	}

	//写两个size()目的: 向用户隐藏IntNode类
	public int size(){
		return size;
	}

	//return the size of the list, starting at IntNode p.
	 /*private int size(IntNode p){
		if(p.next==null){
			return 1;
		}
		return 1+size(p.next);
	 }*/

	public template getFirst(){
		return sentinal.next.item;
	}

	public static void main(String[] args){
		SLList<String> L=new SLList<>();
		L.addLast("What");
		L.addLast("the");
		L.addLast("dog");
		L.addLast("doin");
		System.out.println(L.getFirst());
	}
}