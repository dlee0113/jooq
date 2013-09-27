/**
 * This class is generated by jOOQ
 */
package test.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Posts extends org.jooq.impl.TableImpl<test.generated.tables.records.PostsRecord> {

	private static final long serialVersionUID = -431252641;

	/**
	 * The singleton instance of <code>TEST.POSTS</code>
	 */
	public static final test.generated.tables.Posts POSTS = new test.generated.tables.Posts();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.tables.records.PostsRecord> getRecordType() {
		return test.generated.tables.records.PostsRecord.class;
	}

	/**
	 * The column <code>TEST.POSTS.ID</code>. 
	 */
	public final org.jooq.TableField<test.generated.tables.records.PostsRecord, java.math.BigDecimal> ID = createField("ID", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>TEST.POSTS.BODY</code>. 
	 */
	public final org.jooq.TableField<test.generated.tables.records.PostsRecord, java.lang.String> BODY = createField("BODY", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>TEST.POSTS.POST_TIMESTAMP</code>. 
	 */
	public final org.jooq.TableField<test.generated.tables.records.PostsRecord, java.sql.Timestamp> POST_TIMESTAMP = createField("POST_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>TEST.POSTS.TITLE</code>. 
	 */
	public final org.jooq.TableField<test.generated.tables.records.PostsRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>TEST.POSTS</code> table reference
	 */
	public Posts() {
		super("POSTS", test.generated.Test.TEST);
	}

	/**
	 * Create an aliased <code>TEST.POSTS</code> table reference
	 */
	public Posts(java.lang.String alias) {
		super(alias, test.generated.Test.TEST, test.generated.tables.Posts.POSTS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<test.generated.tables.records.PostsRecord> getPrimaryKey() {
		return test.generated.Keys.PK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<test.generated.tables.records.PostsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<test.generated.tables.records.PostsRecord>>asList(test.generated.Keys.PK_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public test.generated.tables.Posts as(java.lang.String alias) {
		return new test.generated.tables.Posts(alias);
	}
}