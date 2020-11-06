/** this is to declare that we can campare with others.
 *
 * @param <T>
 */
public interface COMparable<T> {
    /**  if smaller then return negative
     * otherwise return positive
     */
    public double compareTo(T t);

}
