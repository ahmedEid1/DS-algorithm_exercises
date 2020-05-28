public void delete(int key) {
  Link previous = null;
  Link current = first;

  while(current != null && key != current.iData) {
  previous = current;
  current = current.next;
  }

  if(previous==null)
    first = first.next;
  else
    previous.next = current.next;
}
