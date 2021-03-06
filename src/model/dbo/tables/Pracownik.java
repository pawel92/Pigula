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
public class Pracownik extends org.jooq.impl.TableImpl<model.dbo.tables.records.PracownikRecord> {

	private static final long serialVersionUID = 1475614443;

	/**
	 * The singleton instance of <code>dbo.pracownik</code>
	 */
	public static final model.dbo.tables.Pracownik PRACOWNIK = new model.dbo.tables.Pracownik();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<model.dbo.tables.records.PracownikRecord> getRecordType() {
		return model.dbo.tables.records.PracownikRecord.class;
	}

	/**
	 * The column <code>dbo.pracownik.pesel</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.PracownikRecord, java.lang.String> PESEL = createField("pesel", org.jooq.impl.SQLDataType.VARCHAR.length(12), this);

	/**
	 * The column <code>dbo.pracownik.imie</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.PracownikRecord, java.lang.String> IMIE = createField("imie", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dbo.pracownik.nazwisko</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.PracownikRecord, java.lang.String> NAZWISKO = createField("nazwisko", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dbo.pracownik.haslo</code>. 
	 */
	public final org.jooq.TableField<model.dbo.tables.records.PracownikRecord, java.lang.String> HASLO = createField("haslo", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>dbo.pracownik</code> table reference
	 */
	public Pracownik() {
		super("pracownik", model.dbo.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.pracownik</code> table reference
	 */
	public Pracownik(java.lang.String alias) {
		super(alias, model.dbo.Dbo.DBO, model.dbo.tables.Pracownik.PRACOWNIK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<model.dbo.tables.records.PracownikRecord> getPrimaryKey() {
		return model.dbo.Keys.PK__PRACOWNI__DC3B1BB9358549C1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<model.dbo.tables.records.PracownikRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<model.dbo.tables.records.PracownikRecord>>asList(model.dbo.Keys.PK__PRACOWNI__DC3B1BB9358549C1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public model.dbo.tables.Pracownik as(java.lang.String alias) {
		return new model.dbo.tables.Pracownik(alias);
	}
}
