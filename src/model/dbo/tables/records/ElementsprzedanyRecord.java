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
public class ElementsprzedanyRecord extends org.jooq.impl.UpdatableRecordImpl<model.dbo.tables.records.ElementsprzedanyRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Double> {

	private static final long serialVersionUID = -1161832357;

	/**
	 * Setter for <code>dbo.elementSprzedany.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dbo.elementSprzedany.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>dbo.elementSprzedany.idSprzedazy</code>. 
	 */
	public void setIdsprzedazy(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dbo.elementSprzedany.idSprzedazy</code>. 
	 */
	public java.lang.Integer getIdsprzedazy() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>dbo.elementSprzedany.idWyrobu</code>. 
	 */
	public void setIdwyrobu(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dbo.elementSprzedany.idWyrobu</code>. 
	 */
	public java.lang.Integer getIdwyrobu() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>dbo.elementSprzedany.ilosc</code>. 
	 */
	public void setIlosc(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dbo.elementSprzedany.ilosc</code>. 
	 */
	public java.lang.Integer getIlosc() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>dbo.elementSprzedany.cenaBrutto</code>. 
	 */
	public void setCenabrutto(java.lang.Double value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dbo.elementSprzedany.cenaBrutto</code>. 
	 */
	public java.lang.Double getCenabrutto() {
		return (java.lang.Double) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Double> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Double> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY.IDSPRZEDAZY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY.IDWYROBU;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY.ILOSC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field5() {
		return model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY.CENABRUTTO;
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
	public java.lang.Integer value2() {
		return getIdsprzedazy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getIdwyrobu();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getIlosc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value5() {
		return getCenabrutto();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ElementsprzedanyRecord
	 */
	public ElementsprzedanyRecord() {
		super(model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY);
	}
}
