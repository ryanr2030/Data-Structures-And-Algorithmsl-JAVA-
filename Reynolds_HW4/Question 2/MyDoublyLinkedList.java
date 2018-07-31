import java.util.ListIterator;

public class MyDoublyLinkedList<E> extends MyLinkedList<E> implements MyList<E> {
     public static void main(String[] args)
   {
       MyDoublyLinkedList<Integer> dblList = new MyDoublyLinkedList<Integer>();
       dblList.add(1);
       dblList.add(2);
       dblList.add(3);
       dblList.add(4);
  
       ListIterator dblIter = dblList.iterator();
       dblIter.next();

       System.out.print(dblIter.previous());
      
   }
  
  private Node<E> head, tail;
  private int size = 0; // Number of elements in the list
 
  /** Create an empty list */
  public MyDoublyLinkedList() {
  }

  /** Create a list from an array of objects */
  public MyDoublyLinkedList(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]); 
  }

  /** Return the head element in the list */
  public E getFirst() {
    if (size == 0) {
      return null;
    }
    else {
      return head.element;
    }
  }

  /** Return the last element in the list */
  public E getLast() {
    if (size == 0) {
      return null;
    }
    else {
      return tail.element;
    }
  }

  /** Add an element to the beginning of the list */
  public void addFirst(E e) {
    Node<E> newNode = new Node<>(e); // Create a new node
    newNode.next = head; // link the new node with the head
    head = newNode; // head points to the new node
    size++; // Increase list size

    if (tail == null) // the new node is the only node in list
      tail = head;
    else{
      head.next.previous=head;
    }
  }

  /** Add an element to the end of the list */
  public void addLast(E e) {
    Node<E> newNode = new Node<>(e); // Create a new for element e
    Node<E> tmp = tail;
    if (tail == null) {
      head = tail = newNode; // The new node is the only node in list
    }
    else {
      tail.previous=tmp;
      tail.next = newNode; // Link the new with the last node
      tail = newNode; // tail now points to the last node
    }

    size++; // Increase size
  }

  @Override /** Add a new element at the specified index 
   * in this list. The index of the head element is 0 */
  public void add(int index, E e) {
    if (index == 0) {
      addFirst(e);
    }
    else if (index >= size) {
      addLast(e);
    }
    else {
      Node<E> current = head;
      for (int i = 1; i < index; i++) {
        current = current.next;
      }
      Node<E> temp = current.next;
      current.next = new Node<>(e);
      (current.next).previous=current;
      (current.next).next = temp;
      
      
      size++;
    }
  }

  /** Remove the head node and
   *  return the object that is contained in the removed node. */
  public E removeFirst() {
    if (size == 0) {
      return null;
    }
    else {
      E temp = head.element;
      head = head.next;
      size--;
      if (head == null) {
        tail = null;
      }
      return temp;
    }
  }

  /** Remove the last node and
   * return the object that is contained in the removed node. */
  public E removeLast() {
    if (size == 0) {
      return null;
    }
    else if (size == 1) {
      E temp = head.element;
      head = tail = null;
      size = 0;
      return temp;
    }
    else {
      Node<E> current = head;

      for (int i = 0; i < size - 2; i++) {
        current = current.next;
      }

      E temp = tail.element;
      tail = current;
      tail.next = null;
      size--;
      return temp;
    }
  }

  @Override /** Remove the element at the specified position in this 
   *  list. Return the element that was removed from the list. */
  public E remove(int index) {   
    if (index < 0 || index >= size) {
      return null;
    }
    else if (index == 0) {
      return removeFirst();
    }
    else if (index == size - 1) {
      return removeLast();
    }
    else {
      Node<E> previous = head;

      for (int i = 1; i < index; i++) {
        previous = previous.next;
      }

      Node<E> current = previous.next;
      previous.next = current.next;
      current.next.previous=previous;
      size--;
      return current.element;
    }
  }

  @Override /** Override toString() to return elements in the list */
  public String toString() {
    StringBuilder result = new StringBuilder("[");

    Node<E> current = head;
    for (int i = 0; i < size; i++) {
      result.append(current.element);
      current = current.next;
      if (current != null) {
        result.append(", "); // Separate two elements with a comma
      }
      else {
        result.append("]"); // Insert the closing ] in the string
      }
    }

    return result.toString();
  }

  @Override /** Clear the list */
  public void clear() {
    size = 0;
    head = tail = null;
  }

  @Override /** Return true if this list contains the element e */
  public boolean contains(Object e) {
    Node<E> current=head;
    while(current!=null){
      if(e.equals(current.element)){
         return true;
      }
      current=current.next;
    }
    return false;
  }

  @Override /** Return the element at the specified index */
  public E get(int index) {
    Node<E> current=head;
    if(index>size-1)
      return null;
    for(int i=0;i<index;i++){
      current=current.next;
    }
    return current.element;
   
  }

  @Override /** Return the index of the head matching element in 
   *  this list. Return -1 if no match. */
  public int indexOf(Object e) {
    Node<E> current=head;
    int index=0;
    while(current!=null){
      if(current.element.equals(e)){
         return index;
      }
      current=current.next;
      index++;
    }
    return index;
  }

  @Override /** Return the index of the last matching element in 
   *  this list. Return -1 if no match. */
  public int lastIndexOf(E e) {
   Node<E> current=tail;
   int index=size-1;
   while(current!=null && (e.equals(current.element))){
      current=current.previous;
      index--;
   }
   if(current==null){
      return -1;
   }
   
    return index;
  }

  @Override /** Replace the element at the specified position 
   *  in this list with the specified element. */
  public E set(int index, E e) {
    if(index>size-1 || index<0){
      return null;
    }
    Node<E> current=head;
    while(index>0){
      current=current.next;
      index--;
    }
    E temp=current.element;
    current.element=e;
    return temp;
  }

  @Override /** Override iterator() defined in Iterable */
  public java.util.ListIterator<E> iterator() {
    return new MyDoublyLinkedListIterator();
  }
  
  private class MyDoublyLinkedListIterator 
     implements java.util.ListIterator<E> {
    private Node<E> current = head; 
    private Node<E> lastAccessed=null;
    // Current index 
    int index=0;
    public MyDoublyLinkedListIterator(){
      current=head;
    }
    
    public MyDoublyLinkedListIterator(int index){
      if(index<0||index>size){
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
          + size);
      }
      else{
         for(int i=0; i<=index; i++){
            current=current.next;
         }
     }   
      
    }
    
    @Override
    public void add(E e){
      Node<E> temp1=current.previous;
      Node<E> temp2=new Node<>(e);
      Node<E> temp3=current;
      temp1.next=temp2;
      temp2.next=temp3;
      temp3.previous=temp2;
      temp2.previous=temp1;
      index++;
    }
    
    @Override
    public boolean hasNext() {
      return index<size;
    }
    
    public boolean hasPrevious(){
     return index>0;
    }
    public E previous(){
      current=current.previous;
      index--;
      lastAccessed=current;
      return current.element;
    }
    public int previousIndex(){
      return index-1;
    }
    
    @Override
    public E next() {
      lastAccessed=current;
      E e = current.element;
      current = current.next;
      index++;
      return e;
    }
    public int nextIndex(){
      return index;
    }

    @Override
    public void remove() {
      if(current != null) {
       StudentNode<Integer> tmp = current;
       current = current.next;
       size--;
         if(tmp.next != null)
            tmp.next.previous = tmp.previous;
         if(tmp.previous != null)
            tmp.previous.next = tmp.next;
      }
     }
    
    @Override
    public void set(E e)
    {
      current.element=e;
    }
  }
  
  private static class Node<E> {
    E element;
    Node<E> next;
    Node<E> previous;

    public Node(E element) {
      this.element = element;
    }
  }
  
  @Override /** Return the number of elements in this list */
  public int size() {
    return size;
  }
}