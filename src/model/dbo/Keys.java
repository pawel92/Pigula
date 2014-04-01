/**
 * This class is generated by jOOQ
 */
package model.dbo;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>dbo</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<model.dbo.tables.records.CenakupnaRecord, java.lang.Integer> IDENTITY_CENAKUPNA = Identities0.IDENTITY_CENAKUPNA;
	public static final org.jooq.Identity<model.dbo.tables.records.CenasprzedazyRecord, java.lang.Integer> IDENTITY_CENASPRZEDAZY = Identities0.IDENTITY_CENASPRZEDAZY;
	public static final org.jooq.Identity<model.dbo.tables.records.DostarczaRecord, java.lang.Integer> IDENTITY_DOSTARCZA = Identities0.IDENTITY_DOSTARCZA;
	public static final org.jooq.Identity<model.dbo.tables.records.DostawcaRecord, java.lang.Integer> IDENTITY_DOSTAWCA = Identities0.IDENTITY_DOSTAWCA;
	public static final org.jooq.Identity<model.dbo.tables.records.ElementkupionyRecord, java.lang.Integer> IDENTITY_ELEMENTKUPIONY = Identities0.IDENTITY_ELEMENTKUPIONY;
	public static final org.jooq.Identity<model.dbo.tables.records.ElementsprzedanyRecord, java.lang.Integer> IDENTITY_ELEMENTSPRZEDANY = Identities0.IDENTITY_ELEMENTSPRZEDANY;
	public static final org.jooq.Identity<model.dbo.tables.records.JestskladnikiemRecord, java.lang.Integer> IDENTITY_JESTSKLADNIKIEM = Identities0.IDENTITY_JESTSKLADNIKIEM;
	public static final org.jooq.Identity<model.dbo.tables.records.KlientRecord, java.lang.Integer> IDENTITY_KLIENT = Identities0.IDENTITY_KLIENT;
	public static final org.jooq.Identity<model.dbo.tables.records.KupnoRecord, java.lang.Integer> IDENTITY_KUPNO = Identities0.IDENTITY_KUPNO;
	public static final org.jooq.Identity<model.dbo.tables.records.ProducentRecord, java.lang.Integer> IDENTITY_PRODUCENT = Identities0.IDENTITY_PRODUCENT;
	public static final org.jooq.Identity<model.dbo.tables.records.ReklamacjaRecord, java.lang.Integer> IDENTITY_REKLAMACJA = Identities0.IDENTITY_REKLAMACJA;
	public static final org.jooq.Identity<model.dbo.tables.records.RodzajwyrobuRecord, java.lang.Integer> IDENTITY_RODZAJWYROBU = Identities0.IDENTITY_RODZAJWYROBU;
	public static final org.jooq.Identity<model.dbo.tables.records.SkladnikRecord, java.lang.Integer> IDENTITY_SKLADNIK = Identities0.IDENTITY_SKLADNIK;
	public static final org.jooq.Identity<model.dbo.tables.records.SprzedazRecord, java.lang.Integer> IDENTITY_SPRZEDAZ = Identities0.IDENTITY_SPRZEDAZ;
	public static final org.jooq.Identity<model.dbo.tables.records.WyrobRecord, java.lang.Integer> IDENTITY_WYROB = Identities0.IDENTITY_WYROB;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<model.dbo.tables.records.CenakupnaRecord> PK__CENAKUPN__3213E83FB22AE271 = UniqueKeys0.PK__CENAKUPN__3213E83FB22AE271;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.CenasprzedazyRecord> PK__CENASPRZ__3213E83FE1A3ED43 = UniqueKeys0.PK__CENASPRZ__3213E83FE1A3ED43;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.DostarczaRecord> PK__DOSTARCZ__3213E83F2A28BA83 = UniqueKeys0.PK__DOSTARCZ__3213E83F2A28BA83;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.DostawcaRecord> PK__DOSTAWCA__3213E83F21948DDA = UniqueKeys0.PK__DOSTAWCA__3213E83F21948DDA;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.ElementkupionyRecord> PK__ELEMENTK__3213E83F750530B6 = UniqueKeys0.PK__ELEMENTK__3213E83F750530B6;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.ElementsprzedanyRecord> PK__ELEMENTS__3213E83FD16344FB = UniqueKeys0.PK__ELEMENTS__3213E83FD16344FB;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.JestskladnikiemRecord> PK__JESTSKLA__3213E83FFF4BEA9A = UniqueKeys0.PK__JESTSKLA__3213E83FFF4BEA9A;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.KlientRecord> PK__KLIENT__3213E83FF1C478B6 = UniqueKeys0.PK__KLIENT__3213E83FF1C478B6;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.KupnoRecord> PK__KUPNO__3213E83F7A417598 = UniqueKeys0.PK__KUPNO__3213E83F7A417598;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.PracownikRecord> PK__PRACOWNI__DC3B1BB9358549C1 = UniqueKeys0.PK__PRACOWNI__DC3B1BB9358549C1;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.ProducentRecord> PK__PRODUCEN__3213E83F0DEE9B0F = UniqueKeys0.PK__PRODUCEN__3213E83F0DEE9B0F;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.ReklamacjaRecord> PK__REKLAMAC__3213E83F79E6DE52 = UniqueKeys0.PK__REKLAMAC__3213E83F79E6DE52;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.RodzajwyrobuRecord> PK__RODZAJWY__3213E83F0637179D = UniqueKeys0.PK__RODZAJWY__3213E83F0637179D;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.SkladnikRecord> PK__SKLADNIK__3213E83F07622D28 = UniqueKeys0.PK__SKLADNIK__3213E83F07622D28;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.SkladnikRecord> UQ__SKLADNIK__F072DFBEC6CFAEFA = UniqueKeys0.UQ__SKLADNIK__F072DFBEC6CFAEFA;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.SprzedazRecord> PK__SPRZEDAZ__3213E83FB25010C3 = UniqueKeys0.PK__SPRZEDAZ__3213E83FB25010C3;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.WyrobRecord> PK__WYROB__3213E83F59DCAF92 = UniqueKeys0.PK__WYROB__3213E83F59DCAF92;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<model.dbo.tables.records.CenakupnaRecord, model.dbo.tables.records.DostarczaRecord> FK__CENAKUPNA__IDDOS__3B75D760 = ForeignKeys0.FK__CENAKUPNA__IDDOS__3B75D760;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.CenasprzedazyRecord, model.dbo.tables.records.WyrobRecord> FK__CENASPRZE__IDWYR__1920BF5C = ForeignKeys0.FK__CENASPRZE__IDWYR__1920BF5C;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.DostarczaRecord, model.dbo.tables.records.DostawcaRecord> FK__DOSTARCZA__IDDOS__36B12243 = ForeignKeys0.FK__DOSTARCZA__IDDOS__36B12243;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.DostarczaRecord, model.dbo.tables.records.WyrobRecord> FK__DOSTARCZA__IDWYR__37A5467C = ForeignKeys0.FK__DOSTARCZA__IDWYR__37A5467C;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementkupionyRecord, model.dbo.tables.records.KupnoRecord> FK__ELEMENTKU__IDKUP__44FF419A = ForeignKeys0.FK__ELEMENTKU__IDKUP__44FF419A;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementkupionyRecord, model.dbo.tables.records.WyrobRecord> FK__ELEMENTKU__IDWYR__45F365D3 = ForeignKeys0.FK__ELEMENTKU__IDWYR__45F365D3;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementsprzedanyRecord, model.dbo.tables.records.SprzedazRecord> FK__ELEMENTSP__IDSPR__2E1BDC42 = ForeignKeys0.FK__ELEMENTSP__IDSPR__2E1BDC42;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementsprzedanyRecord, model.dbo.tables.records.WyrobRecord> FK__ELEMENTSP__IDWYR__2F10007B = ForeignKeys0.FK__ELEMENTSP__IDWYR__2F10007B;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.JestskladnikiemRecord, model.dbo.tables.records.WyrobRecord> FK__JESTSKLAD__IDWYR__24927208 = ForeignKeys0.FK__JESTSKLAD__IDWYR__24927208;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.JestskladnikiemRecord, model.dbo.tables.records.SkladnikRecord> FK__JESTSKLAD__IDSKL__25869641 = ForeignKeys0.FK__JESTSKLAD__IDSKL__25869641;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.KupnoRecord, model.dbo.tables.records.DostawcaRecord> FK__KUPNO__IDDOSTAWC__3F466844 = ForeignKeys0.FK__KUPNO__IDDOSTAWC__3F466844;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.KupnoRecord, model.dbo.tables.records.PracownikRecord> FK__KUPNO__IDPRACOWN__403A8C7D = ForeignKeys0.FK__KUPNO__IDPRACOWN__403A8C7D;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.ReklamacjaRecord, model.dbo.tables.records.SprzedazRecord> FK__REKLAMACJ__IDSPR__4AB81AF0 = ForeignKeys0.FK__REKLAMACJ__IDSPR__4AB81AF0;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.SprzedazRecord, model.dbo.tables.records.KlientRecord> FK__SPRZEDAZ__IDKLIE__286302EC = ForeignKeys0.FK__SPRZEDAZ__IDKLIE__286302EC;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.SprzedazRecord, model.dbo.tables.records.PracownikRecord> FK__SPRZEDAZ__IDPRAC__29572725 = ForeignKeys0.FK__SPRZEDAZ__IDPRAC__29572725;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.WyrobRecord, model.dbo.tables.records.ProducentRecord> FK__WYROB__PRODUCENT__15502E78 = ForeignKeys0.FK__WYROB__PRODUCENT__15502E78;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.WyrobRecord, model.dbo.tables.records.RodzajwyrobuRecord> FK__WYROB__RODZAJWYR__164452B1 = ForeignKeys0.FK__WYROB__RODZAJWYR__164452B1;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<model.dbo.tables.records.CenakupnaRecord, java.lang.Integer> IDENTITY_CENAKUPNA = createIdentity(model.dbo.tables.Cenakupna.CENAKUPNA, model.dbo.tables.Cenakupna.CENAKUPNA.ID);
		public static org.jooq.Identity<model.dbo.tables.records.CenasprzedazyRecord, java.lang.Integer> IDENTITY_CENASPRZEDAZY = createIdentity(model.dbo.tables.Cenasprzedazy.CENASPRZEDAZY, model.dbo.tables.Cenasprzedazy.CENASPRZEDAZY.ID);
		public static org.jooq.Identity<model.dbo.tables.records.DostarczaRecord, java.lang.Integer> IDENTITY_DOSTARCZA = createIdentity(model.dbo.tables.Dostarcza.DOSTARCZA, model.dbo.tables.Dostarcza.DOSTARCZA.ID);
		public static org.jooq.Identity<model.dbo.tables.records.DostawcaRecord, java.lang.Integer> IDENTITY_DOSTAWCA = createIdentity(model.dbo.tables.Dostawca.DOSTAWCA, model.dbo.tables.Dostawca.DOSTAWCA.ID);
		public static org.jooq.Identity<model.dbo.tables.records.ElementkupionyRecord, java.lang.Integer> IDENTITY_ELEMENTKUPIONY = createIdentity(model.dbo.tables.Elementkupiony.ELEMENTKUPIONY, model.dbo.tables.Elementkupiony.ELEMENTKUPIONY.ID);
		public static org.jooq.Identity<model.dbo.tables.records.ElementsprzedanyRecord, java.lang.Integer> IDENTITY_ELEMENTSPRZEDANY = createIdentity(model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY, model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY.ID);
		public static org.jooq.Identity<model.dbo.tables.records.JestskladnikiemRecord, java.lang.Integer> IDENTITY_JESTSKLADNIKIEM = createIdentity(model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM, model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM.ID);
		public static org.jooq.Identity<model.dbo.tables.records.KlientRecord, java.lang.Integer> IDENTITY_KLIENT = createIdentity(model.dbo.tables.Klient.KLIENT, model.dbo.tables.Klient.KLIENT.ID);
		public static org.jooq.Identity<model.dbo.tables.records.KupnoRecord, java.lang.Integer> IDENTITY_KUPNO = createIdentity(model.dbo.tables.Kupno.KUPNO, model.dbo.tables.Kupno.KUPNO.ID);
		public static org.jooq.Identity<model.dbo.tables.records.ProducentRecord, java.lang.Integer> IDENTITY_PRODUCENT = createIdentity(model.dbo.tables.Producent.PRODUCENT, model.dbo.tables.Producent.PRODUCENT.ID);
		public static org.jooq.Identity<model.dbo.tables.records.ReklamacjaRecord, java.lang.Integer> IDENTITY_REKLAMACJA = createIdentity(model.dbo.tables.Reklamacja.REKLAMACJA, model.dbo.tables.Reklamacja.REKLAMACJA.ID);
		public static org.jooq.Identity<model.dbo.tables.records.RodzajwyrobuRecord, java.lang.Integer> IDENTITY_RODZAJWYROBU = createIdentity(model.dbo.tables.Rodzajwyrobu.RODZAJWYROBU, model.dbo.tables.Rodzajwyrobu.RODZAJWYROBU.ID);
		public static org.jooq.Identity<model.dbo.tables.records.SkladnikRecord, java.lang.Integer> IDENTITY_SKLADNIK = createIdentity(model.dbo.tables.Skladnik.SKLADNIK, model.dbo.tables.Skladnik.SKLADNIK.ID);
		public static org.jooq.Identity<model.dbo.tables.records.SprzedazRecord, java.lang.Integer> IDENTITY_SPRZEDAZ = createIdentity(model.dbo.tables.Sprzedaz.SPRZEDAZ, model.dbo.tables.Sprzedaz.SPRZEDAZ.ID);
		public static org.jooq.Identity<model.dbo.tables.records.WyrobRecord, java.lang.Integer> IDENTITY_WYROB = createIdentity(model.dbo.tables.Wyrob.WYROB, model.dbo.tables.Wyrob.WYROB.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<model.dbo.tables.records.CenakupnaRecord> PK__CENAKUPN__3213E83FB22AE271 = createUniqueKey(model.dbo.tables.Cenakupna.CENAKUPNA, model.dbo.tables.Cenakupna.CENAKUPNA.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.CenasprzedazyRecord> PK__CENASPRZ__3213E83FE1A3ED43 = createUniqueKey(model.dbo.tables.Cenasprzedazy.CENASPRZEDAZY, model.dbo.tables.Cenasprzedazy.CENASPRZEDAZY.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.DostarczaRecord> PK__DOSTARCZ__3213E83F2A28BA83 = createUniqueKey(model.dbo.tables.Dostarcza.DOSTARCZA, model.dbo.tables.Dostarcza.DOSTARCZA.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.DostawcaRecord> PK__DOSTAWCA__3213E83F21948DDA = createUniqueKey(model.dbo.tables.Dostawca.DOSTAWCA, model.dbo.tables.Dostawca.DOSTAWCA.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.ElementkupionyRecord> PK__ELEMENTK__3213E83F750530B6 = createUniqueKey(model.dbo.tables.Elementkupiony.ELEMENTKUPIONY, model.dbo.tables.Elementkupiony.ELEMENTKUPIONY.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.ElementsprzedanyRecord> PK__ELEMENTS__3213E83FD16344FB = createUniqueKey(model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY, model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.JestskladnikiemRecord> PK__JESTSKLA__3213E83FFF4BEA9A = createUniqueKey(model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM, model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.KlientRecord> PK__KLIENT__3213E83FF1C478B6 = createUniqueKey(model.dbo.tables.Klient.KLIENT, model.dbo.tables.Klient.KLIENT.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.KupnoRecord> PK__KUPNO__3213E83F7A417598 = createUniqueKey(model.dbo.tables.Kupno.KUPNO, model.dbo.tables.Kupno.KUPNO.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.PracownikRecord> PK__PRACOWNI__DC3B1BB9358549C1 = createUniqueKey(model.dbo.tables.Pracownik.PRACOWNIK, model.dbo.tables.Pracownik.PRACOWNIK.PESEL);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.ProducentRecord> PK__PRODUCEN__3213E83F0DEE9B0F = createUniqueKey(model.dbo.tables.Producent.PRODUCENT, model.dbo.tables.Producent.PRODUCENT.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.ReklamacjaRecord> PK__REKLAMAC__3213E83F79E6DE52 = createUniqueKey(model.dbo.tables.Reklamacja.REKLAMACJA, model.dbo.tables.Reklamacja.REKLAMACJA.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.RodzajwyrobuRecord> PK__RODZAJWY__3213E83F0637179D = createUniqueKey(model.dbo.tables.Rodzajwyrobu.RODZAJWYROBU, model.dbo.tables.Rodzajwyrobu.RODZAJWYROBU.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.SkladnikRecord> PK__SKLADNIK__3213E83F07622D28 = createUniqueKey(model.dbo.tables.Skladnik.SKLADNIK, model.dbo.tables.Skladnik.SKLADNIK.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.SkladnikRecord> UQ__SKLADNIK__F072DFBEC6CFAEFA = createUniqueKey(model.dbo.tables.Skladnik.SKLADNIK, model.dbo.tables.Skladnik.SKLADNIK.NAZWA);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.SprzedazRecord> PK__SPRZEDAZ__3213E83FB25010C3 = createUniqueKey(model.dbo.tables.Sprzedaz.SPRZEDAZ, model.dbo.tables.Sprzedaz.SPRZEDAZ.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.WyrobRecord> PK__WYROB__3213E83F59DCAF92 = createUniqueKey(model.dbo.tables.Wyrob.WYROB, model.dbo.tables.Wyrob.WYROB.ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<model.dbo.tables.records.CenakupnaRecord, model.dbo.tables.records.DostarczaRecord> FK__CENAKUPNA__IDDOS__3B75D760 = createForeignKey(model.dbo.Keys.PK__DOSTARCZ__3213E83F2A28BA83, model.dbo.tables.Cenakupna.CENAKUPNA, model.dbo.tables.Cenakupna.CENAKUPNA.IDDOSTARCZA);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.CenasprzedazyRecord, model.dbo.tables.records.WyrobRecord> FK__CENASPRZE__IDWYR__1920BF5C = createForeignKey(model.dbo.Keys.PK__WYROB__3213E83F59DCAF92, model.dbo.tables.Cenasprzedazy.CENASPRZEDAZY, model.dbo.tables.Cenasprzedazy.CENASPRZEDAZY.IDWYROBU);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.DostarczaRecord, model.dbo.tables.records.DostawcaRecord> FK__DOSTARCZA__IDDOS__36B12243 = createForeignKey(model.dbo.Keys.PK__DOSTAWCA__3213E83F21948DDA, model.dbo.tables.Dostarcza.DOSTARCZA, model.dbo.tables.Dostarcza.DOSTARCZA.IDDOSTAWCY);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.DostarczaRecord, model.dbo.tables.records.WyrobRecord> FK__DOSTARCZA__IDWYR__37A5467C = createForeignKey(model.dbo.Keys.PK__WYROB__3213E83F59DCAF92, model.dbo.tables.Dostarcza.DOSTARCZA, model.dbo.tables.Dostarcza.DOSTARCZA.IDWYROBU);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementkupionyRecord, model.dbo.tables.records.KupnoRecord> FK__ELEMENTKU__IDKUP__44FF419A = createForeignKey(model.dbo.Keys.PK__KUPNO__3213E83F7A417598, model.dbo.tables.Elementkupiony.ELEMENTKUPIONY, model.dbo.tables.Elementkupiony.ELEMENTKUPIONY.IDKUPNA);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementkupionyRecord, model.dbo.tables.records.WyrobRecord> FK__ELEMENTKU__IDWYR__45F365D3 = createForeignKey(model.dbo.Keys.PK__WYROB__3213E83F59DCAF92, model.dbo.tables.Elementkupiony.ELEMENTKUPIONY, model.dbo.tables.Elementkupiony.ELEMENTKUPIONY.IDWYROBU);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementsprzedanyRecord, model.dbo.tables.records.SprzedazRecord> FK__ELEMENTSP__IDSPR__2E1BDC42 = createForeignKey(model.dbo.Keys.PK__SPRZEDAZ__3213E83FB25010C3, model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY, model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY.IDSPRZEDAZY);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementsprzedanyRecord, model.dbo.tables.records.WyrobRecord> FK__ELEMENTSP__IDWYR__2F10007B = createForeignKey(model.dbo.Keys.PK__WYROB__3213E83F59DCAF92, model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY, model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY.IDWYROBU);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.JestskladnikiemRecord, model.dbo.tables.records.WyrobRecord> FK__JESTSKLAD__IDWYR__24927208 = createForeignKey(model.dbo.Keys.PK__WYROB__3213E83F59DCAF92, model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM, model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM.IDWYROBU);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.JestskladnikiemRecord, model.dbo.tables.records.SkladnikRecord> FK__JESTSKLAD__IDSKL__25869641 = createForeignKey(model.dbo.Keys.PK__SKLADNIK__3213E83F07622D28, model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM, model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM.IDSKLADNIKA);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.KupnoRecord, model.dbo.tables.records.DostawcaRecord> FK__KUPNO__IDDOSTAWC__3F466844 = createForeignKey(model.dbo.Keys.PK__DOSTAWCA__3213E83F21948DDA, model.dbo.tables.Kupno.KUPNO, model.dbo.tables.Kupno.KUPNO.IDDOSTAWCY);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.KupnoRecord, model.dbo.tables.records.PracownikRecord> FK__KUPNO__IDPRACOWN__403A8C7D = createForeignKey(model.dbo.Keys.PK__PRACOWNI__DC3B1BB9358549C1, model.dbo.tables.Kupno.KUPNO, model.dbo.tables.Kupno.KUPNO.IDPRACOWNIKA);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.ReklamacjaRecord, model.dbo.tables.records.SprzedazRecord> FK__REKLAMACJ__IDSPR__4AB81AF0 = createForeignKey(model.dbo.Keys.PK__SPRZEDAZ__3213E83FB25010C3, model.dbo.tables.Reklamacja.REKLAMACJA, model.dbo.tables.Reklamacja.REKLAMACJA.IDSPRZEDAZY);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.SprzedazRecord, model.dbo.tables.records.KlientRecord> FK__SPRZEDAZ__IDKLIE__286302EC = createForeignKey(model.dbo.Keys.PK__KLIENT__3213E83FF1C478B6, model.dbo.tables.Sprzedaz.SPRZEDAZ, model.dbo.tables.Sprzedaz.SPRZEDAZ.IDKLIENTA);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.SprzedazRecord, model.dbo.tables.records.PracownikRecord> FK__SPRZEDAZ__IDPRAC__29572725 = createForeignKey(model.dbo.Keys.PK__PRACOWNI__DC3B1BB9358549C1, model.dbo.tables.Sprzedaz.SPRZEDAZ, model.dbo.tables.Sprzedaz.SPRZEDAZ.IDPRACOWNIKA);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.WyrobRecord, model.dbo.tables.records.ProducentRecord> FK__WYROB__PRODUCENT__15502E78 = createForeignKey(model.dbo.Keys.PK__PRODUCEN__3213E83F0DEE9B0F, model.dbo.tables.Wyrob.WYROB, model.dbo.tables.Wyrob.WYROB.PRODUCENTID);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.WyrobRecord, model.dbo.tables.records.RodzajwyrobuRecord> FK__WYROB__RODZAJWYR__164452B1 = createForeignKey(model.dbo.Keys.PK__RODZAJWY__3213E83F0637179D, model.dbo.tables.Wyrob.WYROB, model.dbo.tables.Wyrob.WYROB.RODZAJWYROBUID);
	}
}
