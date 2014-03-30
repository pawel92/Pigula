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
public class Kupno extends org.jooq.impl.TableImpl<model.dbo.tables.records.KupnoRecord> {

	private static final long serialVersionUID = 1737785583;

	/**
	 * The singleton instance of <code>dbo.kupno</code>
	 */
	public static final model.dbo.tables.Kupno KUPNO = new model.dbo.tables.Kupno();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<model.dbo.tables.records.KupnoRecord> getRecordType() {
		return model.dbo.tables.records.KupnoRecord.class;
	}

	/**
	 * The column <code>dbo.kupno.id</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.KupnoRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.kupno.idDostawcy</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.KupnoRecord, java.lang.Integer> IDDOSTAWCY = createField("idDostawcy", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.kupno.idPracownika</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.KupnoRecord, java.lang.String> IDPRACOWNIKA = createField("idPracownika", org.jooq.impl.SQLDataType.VARCHAR.length(12), this);

	/**
	 * The column <code>dbo.kupno.dataWprowadzenia</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.KupnoRecord, java.sql.Timestamp> DATAWPROWADZENIA = createField("dataWprowadzenia", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dbo.kupno.dataZakonczenia</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.KupnoRecord, java.sql.Timestamp> DATAZAKONCZENIA = createField("dataZakonczenia", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dbo.kupno.status</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.KupnoRecord, java.lang.Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>dbo.kupno</code> table reference
	 */
	public Kupno() {
		super("kupno", model.dbo.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.kupno</code> table reference
	 */
	public Kupno(java.lang.String alias) {
		super(alias, model.dbo.Dbo.DBO, model.dbo.tables.Kupno.KUPNO);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<model.dbo.tables.records.KupnoRecord, java.lang.Integer> getIdentity() {
		return model.dbo.Keys.IDENTITY_KUPNO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<model.dbo.tables.records.KupnoRecord> getPrimaryKey() {
		return model.dbo.Keys.PK__KUPNO__3213E83FDBF8E355;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<model.dbo.tables.records.KupnoRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<model.dbo.tables.records.KupnoRecord>>asList(model.dbo.Keys.PK__KUPNO__3213E83FDBF8E355);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<model.dbo.tables.records.KupnoRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<model.dbo.tables.records.KupnoRecord, ?>>asList(model.dbo.Keys.FK__KUPNO__IDDOSTAWC__36B12243, model.dbo.Keys.FK__KUPNO__IDPRACOWN__37A5467C);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public model.dbo.tables.Kupno as(java.lang.String alias) {
		return new model.dbo.tables.Kupno(alias);
	}
}