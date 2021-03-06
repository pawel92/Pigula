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
public class Producent extends org.jooq.impl.TableImpl<model.dbo.tables.records.ProducentRecord> {

	private static final long serialVersionUID = -1898505980;

	/**
	 * The singleton instance of <code>dbo.producent</code>
	 */
	public static final model.dbo.tables.Producent PRODUCENT = new model.dbo.tables.Producent();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<model.dbo.tables.records.ProducentRecord> getRecordType() {
		return model.dbo.tables.records.ProducentRecord.class;
	}

	/**
	 * The column <code>dbo.producent.id</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ProducentRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.producent.nazwa</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ProducentRecord, java.lang.String> NAZWA = createField("nazwa", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dbo.producent.ulica</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ProducentRecord, java.lang.String> ULICA = createField("ulica", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dbo.producent.miejscowosc</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ProducentRecord, java.lang.String> MIEJSCOWOSC = createField("miejscowosc", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dbo.producent.kodPocztowy</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ProducentRecord, java.lang.String> KODPOCZTOWY = createField("kodPocztowy", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>dbo.producent.kraj</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ProducentRecord, java.lang.String> KRAJ = createField("kraj", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dbo.producent.telefon</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ProducentRecord, java.lang.String> TELEFON = createField("telefon", org.jooq.impl.SQLDataType.VARCHAR.length(30), this);

	/**
	 * The column <code>dbo.producent.www</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ProducentRecord, java.lang.String> WWW = createField("www", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dbo.producent.nip</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ProducentRecord, java.lang.String> NIP = createField("nip", org.jooq.impl.SQLDataType.VARCHAR.length(20), this);

	/**
	 * The column <code>dbo.producent.osobaKontaktowa</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.ProducentRecord, java.lang.String> OSOBAKONTAKTOWA = createField("osobaKontaktowa", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>dbo.producent</code> table reference
	 */
	public Producent() {
		super("producent", model.dbo.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.producent</code> table reference
	 */
	public Producent(java.lang.String alias) {
		super(alias, model.dbo.Dbo.DBO, model.dbo.tables.Producent.PRODUCENT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<model.dbo.tables.records.ProducentRecord, java.lang.Integer> getIdentity() {
		return model.dbo.Keys.IDENTITY_PRODUCENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<model.dbo.tables.records.ProducentRecord> getPrimaryKey() {
		return model.dbo.Keys.PK__PRODUCEN__3213E83F0DEE9B0F;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<model.dbo.tables.records.ProducentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<model.dbo.tables.records.ProducentRecord>>asList(model.dbo.Keys.PK__PRODUCEN__3213E83F0DEE9B0F);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public model.dbo.tables.Producent as(java.lang.String alias) {
		return new model.dbo.tables.Producent(alias);
	}
}
