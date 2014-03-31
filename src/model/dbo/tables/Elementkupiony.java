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
public class Elementkupiony extends org.jooq.impl.TableImpl<model.dbo.tables.records.ElementkupionyRecord> {

	private static final long serialVersionUID = 1766937346;

	/**
	 * The singleton instance of <code>dbo.elementKupiony</code>
	 */
	public static final model.dbo.tables.Elementkupiony ELEMENTKUPIONY = new model.dbo.tables.Elementkupiony();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<model.dbo.tables.records.ElementkupionyRecord> getRecordType() {
		return model.dbo.tables.records.ElementkupionyRecord.class;
	}

	/**
	 * The column <code>dbo.elementKupiony.id</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ElementkupionyRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.elementKupiony.idKupna</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ElementkupionyRecord, java.lang.Integer> IDKUPNA = createField("idKupna", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.elementKupiony.idWyrobu</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ElementkupionyRecord, java.lang.Integer> IDWYROBU = createField("idWyrobu", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.elementKupiony.ilosc</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ElementkupionyRecord, java.lang.Integer> ILOSC = createField("ilosc", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>dbo.elementKupiony</code> table reference
	 */
	public Elementkupiony() {
		super("elementKupiony", model.dbo.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.elementKupiony</code> table reference
	 */
	public Elementkupiony(java.lang.String alias) {
		super(alias, model.dbo.Dbo.DBO, model.dbo.tables.Elementkupiony.ELEMENTKUPIONY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<model.dbo.tables.records.ElementkupionyRecord, java.lang.Integer> getIdentity() {
		return model.dbo.Keys.IDENTITY_ELEMENTKUPIONY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<model.dbo.tables.records.ElementkupionyRecord> getPrimaryKey() {
		return model.dbo.Keys.PK__ELEMENTK__3213E83FFAC949A3;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<model.dbo.tables.records.ElementkupionyRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<model.dbo.tables.records.ElementkupionyRecord>>asList(model.dbo.Keys.PK__ELEMENTK__3213E83FFAC949A3);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<model.dbo.tables.records.ElementkupionyRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<model.dbo.tables.records.ElementkupionyRecord, ?>>asList(model.dbo.Keys.FK__ELEMENTKU__IDKUP__412EB0B6, model.dbo.Keys.FK__ELEMENTKU__IDWYR__4222D4EF);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public model.dbo.tables.Elementkupiony as(java.lang.String alias) {
		return new model.dbo.tables.Elementkupiony(alias);
	}
}
