package DataStructure.BloomFilter;

import java.util.BitSet;

public class BloomFilter {
    private static final int DEFAULT_SIZE = 2 << 24;

    private static final int[] SEEDS = {3, 13, 46, 71, 91, 134};

    private BitSet bits = new BitSet(DEFAULT_SIZE);

    private SimpleHash[] simpleHashes = new SimpleHash[SEEDS.length];

    public BloomFilter() {
        for (int i = 0; i < SEEDS.length; i++) {
            simpleHashes[i] = new SimpleHash(DEFAULT_SIZE, SEEDS[i]);
        }
    }

    public void add(Object value) {
        for (SimpleHash simpleHash : simpleHashes) {
            bits.set(simpleHash.hash(value), true);
        }
    }

    public boolean contains(Object value) {
        boolean res = true;
        for (SimpleHash simpleHash : simpleHashes) {
            res = res && bits.get(simpleHash.hash(value));
        }
        return res;
    }



    public static class SimpleHash{
        private int cap;
        private int seed;

        public SimpleHash(int cap, int seed) {
            this.cap = cap;
            this.seed = seed;
        }

        public int hash(Object value) {
            int h;
            if (value == null) {
                return 0;
            } else {
                return Math.abs(seed * (cap - 1) & ((h = value.hashCode()) ^ (h >>> 16)));
            }
        }
    }
}
