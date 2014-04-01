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
public class Sprzedaz extends org.jooq.impl.TableImpl<model.dbo.tables.records.SprzedazRecord> {

	private static final long serialVersionUID = 1877161856;

	/**
	 * The singleton instance of <code>dbo.sprzedaz</code>
	 */
	public static final model.dbo.tables.Sprzedaz SPRZEDAZ = new model.dbo.tables.Sprzedaz();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<model.dbo.tables.records.SprzedazRecord> getRecordType() {
		return model.dbo.tables.records.SprzedazRecord.class;
	}

	/**
	 * The column <code>dbo.sprzedaz.id</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.SprzedazRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.sprzedaz.idKlienta</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.SprzedazRecord, java.lang.Integer> IDKLIENTA = createField("idKlienta", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.sprzedaz.idPracownika</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.SprzedazRecord, java.lang.String> IDPRACOWNIKA = createField("idPracownika", org.jooq.impl.SQLDataType.VARCHAR.length(12), this);

	/**
	 * The column <code>dbo.sprzedaz.dataWprowadzenia</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.SprzedazRecord, java.sql.Timestamp> DATAWPROWADZENIA = createField("dataWprowadzenia", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dbo.sprzedaz.dataZakonczenia</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.SprzedazRecord, java.sql.Timestamp> DATAZAKONCZENIA = createField("dataZakonczenia", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dbo.sprzedaz.status</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.SprzedazRecord, java.lang.Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>dbo.sprzedaz</code> table reference
	 */
	public Sprzedaz() {
		super("sprzedaz", model.dbo.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.sprzedaz</code> table reference
	 */
	public Sprzedaz(java.lang.String alias) {
		super(alias, model.dbo.Dbo.DBO, model.dbo.tables.Sprzedaz.SPRZEDAZ);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<model.dbo.tables.records.SprzedazRecord, java.lang.Integer> getIdentity() {
		return model.dbo.Keys.IDENTITY_SPRZEDAZ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<model.dbo.tables.records.SprzedazRecord> getPrimaryKey() {
		return model.dbo.Keys.PK__SPRZEDAZ__3213E83FB25010C3;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<model.dbo.tables.records.SprzedazRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<model.dbo.tables.records.SprzedazRecord>>asList(model.dbo.Keys.PK__SPRZEDAZ__3213E83FB25010C3);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<model.dbo.tables.records.SprzedazRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<model.dbo.tables.records.SprzedazRecord, ?>>asList(model.dbo.Keys.FK__SPRZEDAZ__IDKLIE__286302EC, model.dbo.Keys.FK__SPRZEDAZ__IDPRAC__29572725);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public model.dbo.tables.Sprzedaz as(java.lang.String alias) {
		return new model.dbo.tables.Sprzedaz(alias);
	}
}
