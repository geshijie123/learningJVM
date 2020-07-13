package com.LRU;

import java.util.HashMap;

public class LruCache {
    public int count;
    public int cacheSize;

    class LinkedNood{
        public Object key;
        public Object value;
        public LinkedNood pre;
        public LinkedNood next;
    }

    private LinkedNood first;
    private LinkedNood last;
    private HashMap<Object,LinkedNood> data;

    public LruCache(Integer cacheSize){
        this.cacheSize=cacheSize;
        first=new LinkedNood();
        first.pre=null;

        last=new LinkedNood();
        last.next=null;

        first.next=last;
        last.pre=first;

        data=new HashMap<>();
        count=0;

    }

    public LinkedNood get(Object key){
        LinkedNood linkedNood = data.get(key);
        removeOldPosition(linkedNood);
        insertAfterFirst(linkedNood);
        return linkedNood;
    }
    public void remove(Object key){
        LinkedNood linkedNood = data.get(key);
        if(linkedNood!=null){
            removeOldPosition(linkedNood);
            count--;
        }
    }
    public void put(Object key,Object value){
        LinkedNood linkedNood = data.get(key);
        if(linkedNood!=null){
            linkedNood.key=key;
            linkedNood.value=value;
            data.put(key,linkedNood);
            removeOldPosition(linkedNood);
            insertAfterFirst(linkedNood);
        }else {
            count++;
            if(count>cacheSize){
                deleteBeferLastOne();
            }
            linkedNood=new LinkedNood();
            linkedNood.key=key;
            linkedNood.value=value;

            LinkedNood oldSecond=first.next;

            oldSecond.pre=linkedNood;
            linkedNood.next=oldSecond;
            linkedNood.pre=first;
            first.next=linkedNood;

            data.put(key,linkedNood);

        }

    }

    private void deleteBeferLastOne() {
        LinkedNood beferLastOne=last.pre;
        removeOldPosition(beferLastOne);
        count--;
    }

    private void insertAfterFirst(LinkedNood linkedNood) {
        LinkedNood oldSecond=first.next;

        oldSecond.pre=linkedNood;
        linkedNood.next=oldSecond;
        linkedNood.pre=first;
        first.next=linkedNood;
    }

    private void removeOldPosition(LinkedNood linkedNood) {
        LinkedNood pre=linkedNood.pre;
        LinkedNood next=linkedNood.next;
        pre.next=next;
        next.pre=pre;
    }
}
