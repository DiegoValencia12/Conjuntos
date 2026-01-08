public class Par<A, B>{
    private final A PRIMERO;
    private final B SEGUNDO;

    public Par(A primero, B segundo){
        this.PRIMERO = primero;
        this.SEGUNDO = segundo;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();//String en vez de StringBuilder?
        sb.append("{ ").append(PRIMERO).append(", ").append(SEGUNDO).append(" }");
        return sb.toString();
    }
}
