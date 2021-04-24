package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 22:55
 */
public class MyAggregate implements Aggregate {
    private String[] name = {"clothes", "shoes", "makeup", "bags"};
    @Override
    public Iterator createIterator() {
        return new MyIterator();
    }
    private class MyIterator implements  Iterator {
        private int currentIndex;

        @Override
        public void forward() {
            currentIndex = name.length;
            for (int i = currentIndex; i > 0; i--) {
                System.out.println(name[i]);
                currentIndex--;
            }
        }

        @Override
        public void backword() {
            currentIndex = 0;
            for (int i = currentIndex; i < name.length; i++) {
                System.out.println(name[i]);
                currentIndex++;
            }
        }

        @Override
        public boolean hasNext() {
            return currentIndex == name.length;
        }

        @Override
        public Object currentItem() {
            return name[currentIndex];
        }
    }
}
