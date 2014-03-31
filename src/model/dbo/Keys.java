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

	public static final org.jooq.UniqueKey<model.dbo.tables.records.CenakupnaRecord> PK__CENAKUPN__3213E83FA9059CE0 = UniqueKeys0.PK__CENAKUPN__3213E83FA9059CE0;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.CenasprzedazyRecord> PK__CENASPRZ__3213E83FCFFD6491 = UniqueKeys0.PK__CENASPRZ__3213E83FCFFD6491;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.DostarczaRecord> PK__DOSTARCZ__3213E83FB4E786CA = UniqueKeys0.PK__DOSTARCZ__3213E83FB4E786CA;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.DostawcaRecord> PK__DOSTAWCA__3213E83F69866EF5 = UniqueKeys0.PK__DOSTAWCA__3213E83F69866EF5;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.ElementkupionyRecord> PK__ELEMENTK__3213E83FFAC949A3 = UniqueKeys0.PK__ELEMENTK__3213E83FFAC949A3;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.ElementsprzedanyRecord> PK__ELEMENTS__3213E83FBB53804D = UniqueKeys0.PK__ELEMENTS__3213E83FBB53804D;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.JestskladnikiemRecord> PK__JESTSKLA__3213E83F0091D14C = UniqueKeys0.PK__JESTSKLA__3213E83F0091D14C;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.KlientRecord> PK__KLIENT__3213E83F1C5E93FD = UniqueKeys0.PK__KLIENT__3213E83F1C5E93FD;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.KupnoRecord> PK__KUPNO__3213E83F206308A4 = UniqueKeys0.PK__KUPNO__3213E83F206308A4;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.PracownikRecord> PK__PRACOWNI__DC3B1BB9F13EAA93 = UniqueKeys0.PK__PRACOWNI__DC3B1BB9F13EAA93;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.ProducentRecord> PK__PRODUCEN__3213E83F0FE70958 = UniqueKeys0.PK__PRODUCEN__3213E83F0FE70958;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.ReklamacjaRecord> PK__REKLAMAC__3213E83FC71591E6 = UniqueKeys0.PK__REKLAMAC__3213E83FC71591E6;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.RodzajwyrobuRecord> PK__RODZAJWY__3213E83FDC99F044 = UniqueKeys0.PK__RODZAJWY__3213E83FDC99F044;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.SkladnikRecord> PK__SKLADNIK__3213E83F4932C990 = UniqueKeys0.PK__SKLADNIK__3213E83F4932C990;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.SkladnikRecord> UQ__SKLADNIK__F072DFBE5E526851 = UniqueKeys0.UQ__SKLADNIK__F072DFBE5E526851;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.SprzedazRecord> PK__SPRZEDAZ__3213E83F30FD67B8 = UniqueKeys0.PK__SPRZEDAZ__3213E83F30FD67B8;
	public static final org.jooq.UniqueKey<model.dbo.tables.records.WyrobRecord> PK__WYROB__3213E83F795B67EE = UniqueKeys0.PK__WYROB__3213E83F795B67EE;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<model.dbo.tables.records.CenakupnaRecord, model.dbo.tables.records.DostarczaRecord> FK__CENAKUPNA__IDDOS__37A5467C = ForeignKeys0.FK__CENAKUPNA__IDDOS__37A5467C;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.CenasprzedazyRecord, model.dbo.tables.records.WyrobRecord> FK__CENASPRZE__IDWYR__1273C1CD = ForeignKeys0.FK__CENASPRZE__IDWYR__1273C1CD;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.DostarczaRecord, model.dbo.tables.records.DostawcaRecord> FK__DOSTARCZA__IDDOS__32E0915F = ForeignKeys0.FK__DOSTARCZA__IDDOS__32E0915F;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.DostarczaRecord, model.dbo.tables.records.WyrobRecord> FK__DOSTARCZA__IDWYR__33D4B598 = ForeignKeys0.FK__DOSTARCZA__IDWYR__33D4B598;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementkupionyRecord, model.dbo.tables.records.KupnoRecord> FK__ELEMENTKU__IDKUP__412EB0B6 = ForeignKeys0.FK__ELEMENTKU__IDKUP__412EB0B6;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementkupionyRecord, model.dbo.tables.records.WyrobRecord> FK__ELEMENTKU__IDWYR__4222D4EF = ForeignKeys0.FK__ELEMENTKU__IDWYR__4222D4EF;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementsprzedanyRecord, model.dbo.tables.records.SprzedazRecord> FK__ELEMENTSP__IDSPR__2A4B4B5E = ForeignKeys0.FK__ELEMENTSP__IDSPR__2A4B4B5E;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementsprzedanyRecord, model.dbo.tables.records.WyrobRecord> FK__ELEMENTSP__IDWYR__2B3F6F97 = ForeignKeys0.FK__ELEMENTSP__IDWYR__2B3F6F97;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.JestskladnikiemRecord, model.dbo.tables.records.WyrobRecord> FK__JESTSKLAD__IDWYR__20C1E124 = ForeignKeys0.FK__JESTSKLAD__IDWYR__20C1E124;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.JestskladnikiemRecord, model.dbo.tables.records.SkladnikRecord> FK__JESTSKLAD__IDSKL__21B6055D = ForeignKeys0.FK__JESTSKLAD__IDSKL__21B6055D;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.KupnoRecord, model.dbo.tables.records.DostawcaRecord> FK__KUPNO__IDDOSTAWC__3B75D760 = ForeignKeys0.FK__KUPNO__IDDOSTAWC__3B75D760;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.KupnoRecord, model.dbo.tables.records.PracownikRecord> FK__KUPNO__IDPRACOWN__3C69FB99 = ForeignKeys0.FK__KUPNO__IDPRACOWN__3C69FB99;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.ReklamacjaRecord, model.dbo.tables.records.SprzedazRecord> FK__REKLAMACJ__IDSPR__44FF419A = ForeignKeys0.FK__REKLAMACJ__IDSPR__44FF419A;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.SprzedazRecord, model.dbo.tables.records.KlientRecord> FK__SPRZEDAZ__IDKLIE__24927208 = ForeignKeys0.FK__SPRZEDAZ__IDKLIE__24927208;
	public static final org.jooq.ForeignKey<model.dbo.tables.records.SprzedazRecord, model.dbo.tables.records.PracownikRecord> FK__SPRZEDAZ__IDPRAC__25869641 = ForeignKeys0.FK__SPRZEDAZ__IDPRAC__25869641;

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
		public static final org.jooq.UniqueKey<model.dbo.tables.records.CenakupnaRecord> PK__CENAKUPN__3213E83FA9059CE0 = createUniqueKey(model.dbo.tables.Cenakupna.CENAKUPNA, model.dbo.tables.Cenakupna.CENAKUPNA.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.CenasprzedazyRecord> PK__CENASPRZ__3213E83FCFFD6491 = createUniqueKey(model.dbo.tables.Cenasprzedazy.CENASPRZEDAZY, model.dbo.tables.Cenasprzedazy.CENASPRZEDAZY.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.DostarczaRecord> PK__DOSTARCZ__3213E83FB4E786CA = createUniqueKey(model.dbo.tables.Dostarcza.DOSTARCZA, model.dbo.tables.Dostarcza.DOSTARCZA.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.DostawcaRecord> PK__DOSTAWCA__3213E83F69866EF5 = createUniqueKey(model.dbo.tables.Dostawca.DOSTAWCA, model.dbo.tables.Dostawca.DOSTAWCA.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.ElementkupionyRecord> PK__ELEMENTK__3213E83FFAC949A3 = createUniqueKey(model.dbo.tables.Elementkupiony.ELEMENTKUPIONY, model.dbo.tables.Elementkupiony.ELEMENTKUPIONY.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.ElementsprzedanyRecord> PK__ELEMENTS__3213E83FBB53804D = createUniqueKey(model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY, model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.JestskladnikiemRecord> PK__JESTSKLA__3213E83F0091D14C = createUniqueKey(model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM, model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.KlientRecord> PK__KLIENT__3213E83F1C5E93FD = createUniqueKey(model.dbo.tables.Klient.KLIENT, model.dbo.tables.Klient.KLIENT.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.KupnoRecord> PK__KUPNO__3213E83F206308A4 = createUniqueKey(model.dbo.tables.Kupno.KUPNO, model.dbo.tables.Kupno.KUPNO.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.PracownikRecord> PK__PRACOWNI__DC3B1BB9F13EAA93 = createUniqueKey(model.dbo.tables.Pracownik.PRACOWNIK, model.dbo.tables.Pracownik.PRACOWNIK.PESEL);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.ProducentRecord> PK__PRODUCEN__3213E83F0FE70958 = createUniqueKey(model.dbo.tables.Producent.PRODUCENT, model.dbo.tables.Producent.PRODUCENT.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.ReklamacjaRecord> PK__REKLAMAC__3213E83FC71591E6 = createUniqueKey(model.dbo.tables.Reklamacja.REKLAMACJA, model.dbo.tables.Reklamacja.REKLAMACJA.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.RodzajwyrobuRecord> PK__RODZAJWY__3213E83FDC99F044 = createUniqueKey(model.dbo.tables.Rodzajwyrobu.RODZAJWYROBU, model.dbo.tables.Rodzajwyrobu.RODZAJWYROBU.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.SkladnikRecord> PK__SKLADNIK__3213E83F4932C990 = createUniqueKey(model.dbo.tables.Skladnik.SKLADNIK, model.dbo.tables.Skladnik.SKLADNIK.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.SkladnikRecord> UQ__SKLADNIK__F072DFBE5E526851 = createUniqueKey(model.dbo.tables.Skladnik.SKLADNIK, model.dbo.tables.Skladnik.SKLADNIK.NAZWA);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.SprzedazRecord> PK__SPRZEDAZ__3213E83F30FD67B8 = createUniqueKey(model.dbo.tables.Sprzedaz.SPRZEDAZ, model.dbo.tables.Sprzedaz.SPRZEDAZ.ID);
		public static final org.jooq.UniqueKey<model.dbo.tables.records.WyrobRecord> PK__WYROB__3213E83F795B67EE = createUniqueKey(model.dbo.tables.Wyrob.WYROB, model.dbo.tables.Wyrob.WYROB.ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<model.dbo.tables.records.CenakupnaRecord, model.dbo.tables.records.DostarczaRecord> FK__CENAKUPNA__IDDOS__37A5467C = createForeignKey(model.dbo.Keys.PK__DOSTARCZ__3213E83FB4E786CA, model.dbo.tables.Cenakupna.CENAKUPNA, model.dbo.tables.Cenakupna.CENAKUPNA.IDDOSTARCZA);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.CenasprzedazyRecord, model.dbo.tables.records.WyrobRecord> FK__CENASPRZE__IDWYR__1273C1CD = createForeignKey(model.dbo.Keys.PK__WYROB__3213E83F795B67EE, model.dbo.tables.Cenasprzedazy.CENASPRZEDAZY, model.dbo.tables.Cenasprzedazy.CENASPRZEDAZY.IDWYROBU);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.DostarczaRecord, model.dbo.tables.records.DostawcaRecord> FK__DOSTARCZA__IDDOS__32E0915F = createForeignKey(model.dbo.Keys.PK__DOSTAWCA__3213E83F69866EF5, model.dbo.tables.Dostarcza.DOSTARCZA, model.dbo.tables.Dostarcza.DOSTARCZA.IDDOSTAWCY);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.DostarczaRecord, model.dbo.tables.records.WyrobRecord> FK__DOSTARCZA__IDWYR__33D4B598 = createForeignKey(model.dbo.Keys.PK__WYROB__3213E83F795B67EE, model.dbo.tables.Dostarcza.DOSTARCZA, model.dbo.tables.Dostarcza.DOSTARCZA.IDWYROBU);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementkupionyRecord, model.dbo.tables.records.KupnoRecord> FK__ELEMENTKU__IDKUP__412EB0B6 = createForeignKey(model.dbo.Keys.PK__KUPNO__3213E83F206308A4, model.dbo.tables.Elementkupiony.ELEMENTKUPIONY, model.dbo.tables.Elementkupiony.ELEMENTKUPIONY.IDKUPNA);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementkupionyRecord, model.dbo.tables.records.WyrobRecord> FK__ELEMENTKU__IDWYR__4222D4EF = createForeignKey(model.dbo.Keys.PK__WYROB__3213E83F795B67EE, model.dbo.tables.Elementkupiony.ELEMENTKUPIONY, model.dbo.tables.Elementkupiony.ELEMENTKUPIONY.IDWYROBU);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementsprzedanyRecord, model.dbo.tables.records.SprzedazRecord> FK__ELEMENTSP__IDSPR__2A4B4B5E = createForeignKey(model.dbo.Keys.PK__SPRZEDAZ__3213E83F30FD67B8, model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY, model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY.IDSPRZEDAZY);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.ElementsprzedanyRecord, model.dbo.tables.records.WyrobRecord> FK__ELEMENTSP__IDWYR__2B3F6F97 = createForeignKey(model.dbo.Keys.PK__WYROB__3213E83F795B67EE, model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY, model.dbo.tables.Elementsprzedany.ELEMENTSPRZEDANY.IDWYROBU);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.JestskladnikiemRecord, model.dbo.tables.records.WyrobRecord> FK__JESTSKLAD__IDWYR__20C1E124 = createForeignKey(model.dbo.Keys.PK__WYROB__3213E83F795B67EE, model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM, model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM.IDWYROBU);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.JestskladnikiemRecord, model.dbo.tables.records.SkladnikRecord> FK__JESTSKLAD__IDSKL__21B6055D = createForeignKey(model.dbo.Keys.PK__SKLADNIK__3213E83F4932C990, model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM, model.dbo.tables.Jestskladnikiem.JESTSKLADNIKIEM.IDSKLADNIKA);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.KupnoRecord, model.dbo.tables.records.DostawcaRecord> FK__KUPNO__IDDOSTAWC__3B75D760 = createForeignKey(model.dbo.Keys.PK__DOSTAWCA__3213E83F69866EF5, model.dbo.tables.Kupno.KUPNO, model.dbo.tables.Kupno.KUPNO.IDDOSTAWCY);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.KupnoRecord, model.dbo.tables.records.PracownikRecord> FK__KUPNO__IDPRACOWN__3C69FB99 = createForeignKey(model.dbo.Keys.PK__PRACOWNI__DC3B1BB9F13EAA93, model.dbo.tables.Kupno.KUPNO, model.dbo.tables.Kupno.KUPNO.IDPRACOWNIKA);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.ReklamacjaRecord, model.dbo.tables.records.SprzedazRecord> FK__REKLAMACJ__IDSPR__44FF419A = createForeignKey(model.dbo.Keys.PK__SPRZEDAZ__3213E83F30FD67B8, model.dbo.tables.Reklamacja.REKLAMACJA, model.dbo.tables.Reklamacja.REKLAMACJA.IDSPRZEDAZY);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.SprzedazRecord, model.dbo.tables.records.KlientRecord> FK__SPRZEDAZ__IDKLIE__24927208 = createForeignKey(model.dbo.Keys.PK__KLIENT__3213E83F1C5E93FD, model.dbo.tables.Sprzedaz.SPRZEDAZ, model.dbo.tables.Sprzedaz.SPRZEDAZ.IDKLIENTA);
		public static final org.jooq.ForeignKey<model.dbo.tables.records.SprzedazRecord, model.dbo.tables.records.PracownikRecord> FK__SPRZEDAZ__IDPRAC__25869641 = createForeignKey(model.dbo.Keys.PK__PRACOWNI__DC3B1BB9F13EAA93, model.dbo.tables.Sprzedaz.SPRZEDAZ, model.dbo.tables.Sprzedaz.SPRZEDAZ.IDPRACOWNIKA);
	}
}
