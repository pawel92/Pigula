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
public class Cenakupna extends org.jooq.impl.TableImpl<model.dbo.tables.records.CenakupnaRecord> {

	private static final long serialVersionUID = 649725626;

	/**
	 * The singleton instance of <code>dbo.cenaKupna</code>
	 */
	public static final model.dbo.tables.Cenakupna CENAKUPNA = new model.dbo.tables.Cenakupna();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<model.dbo.tables.records.CenakupnaRecord> getRecordType() {
		return model.dbo.tables.records.CenakupnaRecord.class;
	}

	/**
	 * The column <code>dbo.cenaKupna.id</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.CenakupnaRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.cenaKupna.idDostarcza</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.CenakupnaRecord, java.lang.Integer> IDDOSTARCZA = createField("idDostarcza", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.cenaKupna.cenaBrutto</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.CenakupnaRecord, java.lang.Double> CENABRUTTO = createField("cenaBrutto", org.jooq.impl.SQLDataType.FLOAT, this);

	/**
	 * The column <code>dbo.cenaKupna.dataZmiany</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.CenakupnaRecord, java.sql.Timestamp> DATAZMIANY = createField("dataZmiany", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>dbo.cenaKupna</code> table reference
	 */
	public Cenakupna() {
		super("cenaKupna", model.dbo.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.cenaKupna</code> table reference
	 */
	public Cenakupna(java.lang.String alias) {
		super(alias, model.dbo.Dbo.DBO, model.dbo.tables.Cenakupna.CENAKUPNA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<model.dbo.tables.records.CenakupnaRecord, java.lang.Integer> getIdentity() {
		return model.dbo.Keys.IDENTITY_CENAKUPNA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<model.dbo.tables.records.CenakupnaRecord> getPrimaryKey() {
		return model.dbo.Keys.PK__CENAKUPN__3213E83FA9059CE0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<model.dbo.tables.records.CenakupnaRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<model.dbo.tables.records.CenakupnaRecord>>asList(model.dbo.Keys.PK__CENAKUPN__3213E83FA9059CE0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<model.dbo.tables.records.CenakupnaRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<model.dbo.tables.records.CenakupnaRecord, ?>>asList(model.dbo.Keys.FK__CENAKUPNA__IDDOS__37A5467C);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public model.dbo.tables.Cenakupna as(java.lang.String alias) {
		return new model.dbo.tables.Cenakupna(alias);
	}
}