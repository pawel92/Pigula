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
public class ProducentRecord extends org.jooq.impl.UpdatableRecordImpl<model.dbo.tables.records.ProducentRecord> implements org.jooq.Record10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 884087934;

	/**
	 * Setter for <code>dbo.producent.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dbo.producent.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>dbo.producent.nazwa</code>. 
	 */
	public void setNazwa(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dbo.producent.nazwa</code>. 
	 */
	public java.lang.String getNazwa() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dbo.producent.ulica</code>. 
	 */
	public void setUlica(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dbo.producent.ulica</code>. 
	 */
	public java.lang.String getUlica() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dbo.producent.miejscowosc</code>. 
	 */
	public void setMiejscowosc(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dbo.producent.miejscowosc</code>. 
	 */
	public java.lang.String getMiejscowosc() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>dbo.producent.kodPocztowy</code>. 
	 */
	public void setKodpocztowy(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dbo.producent.kodPocztowy</code>. 
	 */
	public java.lang.String getKodpocztowy() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>dbo.producent.kraj</code>. 
	 */
	public void setKraj(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dbo.producent.kraj</code>. 
	 */
	public java.lang.String getKraj() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>dbo.producent.telefon</code>. 
	 */
	public void setTelefon(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dbo.producent.telefon</code>. 
	 */
	public java.lang.String getTelefon() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>dbo.producent.www</code>. 
	 */
	public void setWww(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dbo.producent.www</code>. 
	 */
	public java.lang.String getWww() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>dbo.producent.nip</code>. 
	 */
	public void setNip(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dbo.producent.nip</code>. 
	 */
	public java.lang.String getNip() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>dbo.producent.osobaKontaktowa</code>. 
	 */
	public void setOsobakontaktowa(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dbo.producent.osobaKontaktowa</code>. 
	 */
	public java.lang.String getOsobakontaktowa() {
		return (java.lang.String) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return model.dbo.tables.Producent.PRODUCENT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return model.dbo.tables.Producent.PRODUCENT.NAZWA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return model.dbo.tables.Producent.PRODUCENT.ULICA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return model.dbo.tables.Producent.PRODUCENT.MIEJSCOWOSC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return model.dbo.tables.Producent.PRODUCENT.KODPOCZTOWY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return model.dbo.tables.Producent.PRODUCENT.KRAJ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return model.dbo.tables.Producent.PRODUCENT.TELEFON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return model.dbo.tables.Producent.PRODUCENT.WWW;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return model.dbo.tables.Producent.PRODUCENT.NIP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return model.dbo.tables.Producent.PRODUCENT.OSOBAKONTAKTOWA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getNazwa();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUlica();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getMiejscowosc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getKodpocztowy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getKraj();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getTelefon();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getWww();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getNip();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getOsobakontaktowa();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProducentRecord
	 */
	public ProducentRecord() {
		super(model.dbo.tables.Producent.PRODUCENT);
	}
}
