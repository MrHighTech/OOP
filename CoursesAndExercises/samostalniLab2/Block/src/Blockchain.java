import java.util.Arrays;

class Blockchain {
    Block[] blocks;
    int size;

    public Blockchain(int max) {
        size = 0;
        blocks = new Block[max];

    }

    public int add(Block newBlock) {
        this.blocks[size] = newBlock;
        if (size == 0) {
            newBlock.setPrevHash(new byte[] { 0 });
        } else {
            newBlock.setPrevHash(blocks[size - 1].hash(blocks[size - 1].getPrevHash()));
        }
        size++;
        return size;
    }

    public Block get(int index) {
        return blocks[index];
    }

    public boolean isAltered(int blockIndex, byte[] expectedHash) {
        byte[] prevHash = new byte[] { 0 };
        for (int i = 0; i <= blockIndex; i++) {
            prevHash = blocks[i].hash(prevHash);
        }
        return !Arrays.equals(prevHash, expectedHash);
    }
}