public interface Hasher {
    public byte[] hash(byte[] prevHash, String[] transactions);
}