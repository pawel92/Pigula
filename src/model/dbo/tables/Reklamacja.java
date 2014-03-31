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
public class Reklamacja extends org.jooq.impl.TableImpl<model.dbo.tables.records.ReklamacjaRecord> {

	private static final long serialVersionUID = -77905663;

	/**
	 * The singleton instance of <code>dbo.reklamacja</code>
	 */
	public static final model.dbo.tables.Reklamacja REKLAMACJA = new model.dbo.tables.Reklamacja();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<model.dbo.tables.records.ReklamacjaRecord> getRecordType() {
		return model.dbo.tables.records.ReklamacjaRecord.class;
	}

	/**
	 * The column <code>dbo.reklamacja.id</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ReklamacjaRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.reklamacja.idSprzedazy</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ReklamacjaRecord, java.lang.Integer> IDSPRZEDAZY = createField("idSprzedazy", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.reklamacja.opis</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ReklamacjaRecord, java.lang.String> OPIS = createField("opis", org.jooq.impl.SQLDataType.NCLOB.length(1073741823), this);

	/**
	 * The column <code>dbo.reklamacja.zgloszono</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ReklamacjaRecord, java.sql.Timestamp> ZGLOSZONO = createField("zgloszono", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dbo.reklamacja.rozpatrzono</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ReklamacjaRecord, java.sql.Timestamp> ROZPATRZONO = createField("rozpatrzono", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dbo.reklamacja.status</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ReklamacjaRecord, java.lang.Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>dbo.reklamacja</code> table reference
	 */
	public Reklamacja() {
		super("reklamacja", model.dbo.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.reklamacja</code> table reference
	 */
	public Reklamacja(java.lang.String alias) {
		super(alias, model.dbo.Dbo.DBO, model.dbo.tables.Reklamacja.REKLAMACJA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<model.dbo.tables.records.ReklamacjaRecord, java.lang.Integer> getIdentity() {
		return model.dbo.Keys.IDENTITY_REKLAMACJA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<model.dbo.tables.records.ReklamacjaRecord> getPrimaryKey() {
		return model.dbo.Keys.PK__REKLAMAC__3213E83FC71591E6;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<model.dbo.tables.records.ReklamacjaRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<model.dbo.tables.records.ReklamacjaRecord>>asList(model.dbo.Keys.PK__REKLAMAC__3213E83FC71591E6);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<model.dbo.tables.records.ReklamacjaRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<model.dbo.tables.records.ReklamacjaRecord, ?>>asList(model.dbo.Keys.FK__REKLAMACJ__IDSPR__44FF419A);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public model.dbo.tables.Reklamacja as(java.lang.String alias) {
		return new model.dbo.tables.Reklamacja(alias);
	}
}
