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
public class Cenasprzedazy extends org.jooq.impl.TableImpl<model.dbo.tables.records.CenasprzedazyRecord> {

	private static final long serialVersionUID = -1391786260;

	/**
	 * The singleton instance of <code>dbo.cenaSprzedazy</code>
	 */
	public static final model.dbo.tables.Cenasprzedazy CENASPRZEDAZY = new model.dbo.tables.Cenasprzedazy();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<model.dbo.tables.records.CenasprzedazyRecord> getRecordType() {
		return model.dbo.tables.records.CenasprzedazyRecord.class;
	}

	/**
	 * The column <code>dbo.cenaSprzedazy.id</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.CenasprzedazyRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.cenaSprzedazy.idWyrobu</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.CenasprzedazyRecord, java.lang.Integer> IDWYROBU = createField("idWyrobu", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.cenaSprzedazy.cenaBrutto</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.CenasprzedazyRecord, java.lang.Double> CENABRUTTO = createField("cenaBrutto", org.jooq.impl.SQLDataType.FLOAT, this);

	/**
	 * The column <code>dbo.cenaSprzedazy.dataZmiany</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.CenasprzedazyRecord, java.sql.Timestamp> DATAZMIANY = createField("dataZmiany", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>dbo.cenaSprzedazy</code> table reference
	 */
	public Cenasprzedazy() {
		super("cenaSprzedazy", model.dbo.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.cenaSprzedazy</code> table reference
	 */
	public Cenasprzedazy(java.lang.String alias) {
		super(alias, model.dbo.Dbo.DBO, model.dbo.tables.Cenasprzedazy.CENASPRZEDAZY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<model.dbo.tables.records.CenasprzedazyRecord, java.lang.Integer> getIdentity() {
		return model.dbo.Keys.IDENTITY_CENASPRZEDAZY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<model.dbo.tables.records.CenasprzedazyRecord> getPrimaryKey() {
		return model.dbo.Keys.PK__CENASPRZ__3213E83FE1A3ED43;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<model.dbo.tables.records.CenasprzedazyRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<model.dbo.tables.records.CenasprzedazyRecord>>asList(model.dbo.Keys.PK__CENASPRZ__3213E83FE1A3ED43);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<model.dbo.tables.records.CenasprzedazyRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<model.dbo.tables.records.CenasprzedazyRecord, ?>>asList(model.dbo.Keys.FK__CENASPRZE__IDWYR__1920BF5C);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public model.dbo.tables.Cenasprzedazy as(java.lang.String alias) {
		return new model.dbo.tables.Cenasprzedazy(alias);
	}
}
