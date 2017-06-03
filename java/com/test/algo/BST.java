package com.test.algo;

public class BST <E extends Comparable<E>>{
	private E data;
	private BST<E> leftBST;
	private BST<E> rightBST;

	
	public void add(E data) {
		if (this.data == null) {
			this.data = data;

		} else {
			if (this.data.compareTo(data)>0) {
				if (this.leftBST == null) {
					this.leftBST = new BST<E>();
					this.leftBST.add(data);
				} else {
					this.leftBST.add(data);
				}
			} else {
				if (this.rightBST == null) {
					this.rightBST = new BST<E>();
					this.rightBST.add(data);
				} else {
					this.rightBST.add(data);
				}
			}
		}
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public BST<E> getLeftBST() {
		return leftBST;
	}

	public BST<E> getRightBST() {
		return rightBST;
	}
public static void main(String[] args) {
	BST<Integer> bst=new BST<Integer>();
	bst.add(15);
	bst.add(9);
	bst.add(31);
	bst.add(4);
	bst.add(10);
	bst.add(21);
	bst.add(42);
	bst.add(2);bst.add(5);
	bst.add(43);
	bst.add(19);
	System.out.println(bst);
	
	
	
	
	
}
}
