/**
 * This class is generated by jOOQ
 */
package model.dbo.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Wyrob extends org.jooq.impl.TableImpl<model.dbo.tables.records.WyrobRecord> {

	private static final long serialVersionUID = -1866660594;

	/**
	 * The singleton instance of <code>dbo.wyrob</code>
	 */
	public static final model.dbo.tables.Wyrob WYROB = new model.dbo.tables.Wyrob();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<model.dbo.tables.records.WyrobRecord> getRecordType() {
		return model.dbo.tables.records.WyrobRecord.class;
	}

	/**
	 * The column <code>dbo.wyrob.id</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.WyrobRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.wyrob.nazwa</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.WyrobRecord, java.lang.String> NAZWA = createField("nazwa", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dbo.wyrob.iloscDostepnych</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.WyrobRecord, java.lang.Integer> ILOSCDOSTEPNYCH = createField("iloscDostepnych", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.wyrob.producentId</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.WyrobRecord, java.lang.Integer> PRODUCENTID = createField("producentId", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.wyrob.rodzajWyrobuId</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.WyrobRecord, java.lang.Integer> RODZAJWYROBUID = createField("rodzajWyrobuId", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>dbo.wyrob</code> table reference
	 */
	public Wyrob() {
		super("wyrob", model.dbo.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.wyrob</code> table reference
	 */
	public Wyrob(java.lang.String alias) {
		super(alias, model.dbo.Dbo.DBO, model.dbo.tables.Wyrob.WYROB);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<model.dbo.tables.records.WyrobRecord, java.lang.Integer> getIdentity() {
		return model.dbo.Keys.IDENTITY_WYROB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<model.dbo.tables.records.WyrobRecord> getPrimaryKey() {
		return model.dbo.Keys.PK__WYROB__3213E83F59DCAF92;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<model.dbo.tables.records.WyrobRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<model.dbo.tables.records.WyrobRecord>>asList(model.dbo.Keys.PK__WYROB__3213E83F59DCAF92);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<model.dbo.tables.records.WyrobRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<model.dbo.tables.records.WyrobRecord, ?>>asList(model.dbo.Keys.FK__WYROB__PRODUCENT__15502E78, model.dbo.Keys.FK__WYROB__RODZAJWYR__164452B1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public model.dbo.tables.Wyrob as(java.lang.String alias) {
		return new model.dbo.tables.Wyrob(alias);
	}
}
