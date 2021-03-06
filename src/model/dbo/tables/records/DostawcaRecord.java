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
public class DostawcaRecord extends org.jooq.impl.UpdatableRecordImpl<model.dbo.tables.records.DostawcaRecord> implements org.jooq.Record9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -200806087;

	/**
	 * Setter for <code>dbo.dostawca.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dbo.dostawca.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>dbo.dostawca.nazwa</code>. 
	 */
	public void setNazwa(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dbo.dostawca.nazwa</code>. 
	 */
	public java.lang.String getNazwa() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dbo.dostawca.ulica</code>. 
	 */
	public void setUlica(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dbo.dostawca.ulica</code>. 
	 */
	public java.lang.String getUlica() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dbo.dostawca.miejscowosc</code>. 
	 */
	public void setMiejscowosc(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dbo.dostawca.miejscowosc</code>. 
	 */
	public java.lang.String getMiejscowosc() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>dbo.dostawca.kodPocztowy</code>. 
	 */
	public void setKodpocztowy(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dbo.dostawca.kodPocztowy</code>. 
	 */
	public java.lang.String getKodpocztowy() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>dbo.dostawca.telefon</code>. 
	 */
	public void setTelefon(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dbo.dostawca.telefon</code>. 
	 */
	public java.lang.String getTelefon() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>dbo.dostawca.www</code>. 
	 */
	public void setWww(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dbo.dostawca.www</code>. 
	 */
	public java.lang.String getWww() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>dbo.dostawca.nip</code>. 
	 */
	public void setNip(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dbo.dostawca.nip</code>. 
	 */
	public java.lang.String getNip() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>dbo.dostawca.osobaKontaktowa</code>. 
	 */
	public void setOsobakontaktowa(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dbo.dostawca.osobaKontaktowa</code>. 
	 */
	public java.lang.String getOsobakontaktowa() {
		return (java.lang.String) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return model.dbo.tables.Dostawca.DOSTAWCA.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return model.dbo.tables.Dostawca.DOSTAWCA.NAZWA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return model.dbo.tables.Dostawca.DOSTAWCA.ULICA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return model.dbo.tables.Dostawca.DOSTAWCA.MIEJSCOWOSC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return model.dbo.tables.Dostawca.DOSTAWCA.KODPOCZTOWY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return model.dbo.tables.Dostawca.DOSTAWCA.TELEFON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return model.dbo.tables.Dostawca.DOSTAWCA.WWW;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return model.dbo.tables.Dostawca.DOSTAWCA.NIP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return model.dbo.tables.Dostawca.DOSTAWCA.OSOBAKONTAKTOWA;
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
		return getTelefon();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getWww();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getNip();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getOsobakontaktowa();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DostawcaRecord
	 */
	public DostawcaRecord() {
		super(model.dbo.tables.Dostawca.DOSTAWCA);
	}
}
