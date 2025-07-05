package lec7_lists4;

/** Array based list.
 *  @author Josh Hug
 */

//         0 1  2 3 4 5 6 7
// items: [6 9 -1 2 0 0 0 0 ...]
// size: 5

/* Invariants:
 addLast: The next item we want to add, will go into position size
 getLast: The item we want to return is in position size - 1
 size: The number of items in the list should be size.
*/

public class AList {
    private int[] items;
    private int size;

    //initializing
    public AList(){
        items=new int[100];
        size=0;
    }

    //resize this array,a little slow ,分别写好处是测试时可以分开测试，而不是在一大段中找问题
    private void resize(int capacity){
        int[] a=new int[capacity];
        System.arraycopy(items,0,a,0,size);
        items=a;
    }

    public void addlast(int x){
        if(size== items.length){
            resize(siz e*2);
        }
        items[size]=x;
        size+=1;
    }

    public int getLast(){
        return items[size-1];
    }

    public int get(int i){
        return items[i];
    }

    public int size(){
        return size;
    }

    public int removeLast(){
        int x=items[size-1];
        size-=1;
        return x;
    }

    //数组扩容


} 