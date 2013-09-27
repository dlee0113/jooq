/**
 * This class is generated by jOOQ
 */
package test.generated.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SquirrelGetErrorOffset extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = 1601230995;

	/**
	 * The parameter <code>TEST.SQUIRREL_GET_ERROR_OFFSET.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>TEST.SQUIRREL_GET_ERROR_OFFSET.QUERY</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> QUERY = createParameter("QUERY", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public SquirrelGetErrorOffset() {
		super("SQUIRREL_GET_ERROR_OFFSET", test.generated.Test.TEST, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(QUERY);
	}

	/**
	 * Set the <code>QUERY</code> parameter IN value to the routine
	 */
	public void setQuery(java.lang.String value) {
		setValue(test.generated.routines.SquirrelGetErrorOffset.QUERY, value);
	}

	/**
	 * Set the <code>QUERY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setQuery(org.jooq.Field<java.lang.String> field) {
		setField(QUERY, field);
	}
}