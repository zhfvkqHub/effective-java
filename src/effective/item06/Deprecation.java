package effective.item06;

public class Deprecation {
    /**
     * @deprecated in favor of
     * {@link #Deprecation(String)}
     */
    @Deprecated
    public Deprecation(){}
    private String name;

    public Deprecation(String neme){
        this.name = neme;
    }
}
