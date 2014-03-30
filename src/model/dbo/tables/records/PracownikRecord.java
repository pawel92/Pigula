/**
 * This class is generated by jOOQ
 */
package model.dbo.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PracownikRecord extends org.jooq.impl.UpdatableRecordImpl<model.dbo.tables.records.PracownikRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1806828397;

	/**
	 * Setter for <code>dbo.pracownik.pesel</code>. 
	 */
	public void setPesel(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dbo.pracownik.pesel</code>. 
	 */
	public java.lang.String getPesel() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>dbo.pracownik.imie</code>. 
	 */
	public void setImie(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dbo.pracownik.imie</code>. 
	 */
	public java.lang.String getImie() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dbo.pracownik.nazwisko</code>. 
	 */
	public void setNazwisko(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dbo.pracownik.nazwisko</code>. 
	 */
	public java.lang.String getNazwisko() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dbo.pracownik.haslo</code>. 
	 */
	public void setHaslo(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dbo.pracownik.haslo</code>. 
	 */
	public java.lang.String getHaslo() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return model.dbo.tables.Pracownik.PRACOWNIK.PESEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return model.dbo.tables.Pracownik.PRACOWNIK.IMIE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return model.dbo.tables.Pracownik.PRACOWNIK.NAZWISKO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return model.dbo.tables.Pracownik.PRACOWNIK.HASLO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getPesel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getImie();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getNazwisko();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getHaslo();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PracownikRecord
	 */
	public PracownikRecord() {
		super(model.dbo.tables.Pracownik.PRACOWNIK);
	}
}
