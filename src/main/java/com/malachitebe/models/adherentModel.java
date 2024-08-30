package com.malachitebe.models;

import java.util.Date;
import java.util.List;
import com.malachitebe.entities.prestataires;
import com.malachitebe.entities.facture_prestataire;

public class adherentModel {

    private Long id_adherent ;
    private Long identite ;
    private Long id_pac ;
    private List<Long> tableau_id_adherent ;
    private Integer id_zone ;
    private Integer id_garantie ;
    private String noms ;
    private String nom ;
    private String prenom ;
    private String sexe ;
    private String id_quartier ;
    private String adresse ;
    private Date naissance ;
    private String lieu_naissance ;
    private String profession ;
    private String localisation ;
    private String telephone_fixe ;
    private String telephone_portable ;
    private String entree ;
    private Integer situation_actuelle ;
    private Boolean en_stage ;
    private Boolean suspendu ;
    private Boolean radier ;
    private Double salaire=0.0  ;
    private String photo ;
    private String autre_code ;
    private String code_mutuelle ;
    private String categorie ;
    private String responsable ;
    private String contact ;
    private Integer arriere_initial ;
    private Integer avance_initial ;
    private String date_annulation_suspension ;
    private String date_radiation ;
    private String motif_suspension ;
    private String type_suspension ;
    private Integer indice ;
    private Integer indice_suspension ;
    private Integer indice_radiation ;
    private String code_parent;
    private Boolean Parent ;
    private Boolean is_pac ;
    private String nom_zone ;
    private String nom_garentie ;
    private Double droit_adhesion =0.0 ;
    private Double cotisation_mensuel=0.0  ;
    private Date date_creation=new Date() ;
    private Date date_creation_bene ;
    private String situation_compte ;
    private String equivalent_mois ;
    private String icon ;
    private String situation_adherent ;
    private String motif ;
    private Double montant_emise=0.0  ;
    private Double montant_percue =0.0 ;
    private Double montant_arriere=0.0 ;
    private Double montant_avance =0.0 ;
    private Double montant_total=0.0  ;
    private Date date_entree ;
    private String type_cotisation ;
    private Integer observation ;
    private Integer delai_retard ;
    private Integer delai_reprise ;
    private List<prestataires> prestataires ; // Prestataires
    private List<garantie_couvertureModel> services ; // Services (Prestations)
    private List<facture_prestataire> facture_prestataires ; // Prestation consomés
    private List<adherentModel> pac ; // Personne à charge
    private List<mouvementModel> mouvement ; // 
    private List<cotisationModel> historique_cotisation ; // Cotisation
    //private IPagedList<AdherentModel> PagerAdherent ; // Adhérent
    private Long id_beneficiaire ;
    private Integer Id_exercice ;
    private Integer anne ;
    private String email ;
    private Integer id_categorie ;
    private Integer id_entreprise ;
    private Integer id_commune ;
    private String commune;
    private Integer id_province;
    private String province;
    private Integer id_ville;
    private String ville;
    private Integer id_pays;
    private String pays;
    private Integer effectif;
    
	public Long getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(Long id_adherent) {
		this.id_adherent = id_adherent;
	}
	public Long getIdentite() {
		return identite;
	}
	public void setIdentite(Long identite) {
		this.identite = identite;
	}
	public Long getId_pac() {
		return id_pac;
	}
	public void setId_pac(Long id_pac) {
		this.id_pac = id_pac;
	}
	public List<Long> getTableau_id_adherent() {
		return tableau_id_adherent;
	}
	public void setTableau_id_adherent(List<Long> tableau_id_adherent) {
		this.tableau_id_adherent = tableau_id_adherent;
	}
	public Integer getId_zone() {
		return id_zone;
	}
	public void setId_zone(Integer id_zone) {
		this.id_zone = id_zone;
	}
	public Integer getId_garantie() {
		return id_garantie;
	}
	public void setId_garantie(Integer id_garantie) {
		this.id_garantie = id_garantie;
	}
	public String getNoms() {
		return noms;
	}
	public void setNoms(String noms) {
		this.noms = noms;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getId_quartier() {
		return id_quartier;
	}
	public void setId_quartier(String id_quartier) {
		this.id_quartier = id_quartier;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Date getNaissance() {
		return naissance;
	}
	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}
	public String getLieu_naissance() {
		return lieu_naissance;
	}
	public void setLieu_naissance(String lieu_naissance) {
		this.lieu_naissance = lieu_naissance;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public String getTelephone_fixe() {
		return telephone_fixe;
	}
	public void setTelephone_fixe(String telephone_fixe) {
		this.telephone_fixe = telephone_fixe;
	}
	public String getTelephone_portable() {
		return telephone_portable;
	}
	public void setTelephone_portable(String telephone_portable) {
		this.telephone_portable = telephone_portable;
	}
	public String getEntree() {
		return entree;
	}
	public void setEntree(String entree) {
		this.entree = entree;
	}
	public Integer getSituation_actuelle() {
		return situation_actuelle;
	}
	public void setSituation_actuelle(Integer situation_actuelle) {
		this.situation_actuelle = situation_actuelle;
	}
	public Boolean getEn_stage() {
		return en_stage;
	}
	public void setEn_stage(Boolean en_stage) {
		this.en_stage = en_stage;
	}
	public Boolean getSuspendu() {
		return suspendu;
	}
	public void setSuspendu(Boolean suspendu) {
		this.suspendu = suspendu;
	}
	public Boolean getRadier() {
		return radier;
	}
	public void setRadier(Boolean radier) {
		this.radier = radier;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getAutre_code() {
		return autre_code;
	}
	public void setAutre_code(String autre_code) {
		this.autre_code = autre_code;
	}
	public String getCode_mutuelle() {
		return code_mutuelle;
	}
	public void setCode_mutuelle(String code_mutuelle) {
		this.code_mutuelle = code_mutuelle;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Integer getArriere_initial() {
		return arriere_initial;
	}
	public void setArriere_initial(Integer arriere_initial) {
		this.arriere_initial = arriere_initial;
	}
	public Integer getAvance_initial() {
		return avance_initial;
	}
	public void setAvance_initial(Integer avance_initial) {
		this.avance_initial = avance_initial;
	}
	public String getDate_annulation_suspension() {
		return date_annulation_suspension;
	}
	public void setDate_annulation_suspension(String date_annulation_suspension) {
		this.date_annulation_suspension = date_annulation_suspension;
	}
	public String getDate_radiation() {
		return date_radiation;
	}
	public void setDate_radiation(String date_radiation) {
		this.date_radiation = date_radiation;
	}
	public String getMotif_suspension() {
		return motif_suspension;
	}
	public void setMotif_suspension(String motif_suspension) {
		this.motif_suspension = motif_suspension;
	}
	public String getType_suspension() {
		return type_suspension;
	}
	public void setType_suspension(String type_suspension) {
		this.type_suspension = type_suspension;
	}
	public Integer getIndice() {
		return indice;
	}
	public void setIndice(Integer indice) {
		this.indice = indice;
	}
	public Integer getIndice_suspension() {
		return indice_suspension;
	}
	public void setIndice_suspension(Integer indice_suspension) {
		this.indice_suspension = indice_suspension;
	}
	public Integer getIndice_radiation() {
		return indice_radiation;
	}
	public void setIndice_radiation(Integer indice_radiation) {
		this.indice_radiation = indice_radiation;
	}
	public String getCode_parent() {
		return code_parent;
	}
	public void setCode_parent(String code_parent) {
		this.code_parent = code_parent;
	}
	public Boolean getParent() {
		return Parent;
	}
	public void setParent(Boolean parent) {
		Parent = parent;
	}
	public Boolean getIs_pac() {
		return is_pac;
	}
	public void setIs_pac(Boolean is_pac) {
		this.is_pac = is_pac;
	}
	public String getNom_zone() {
		return nom_zone;
	}
	public void setNom_zone(String nom_zone) {
		this.nom_zone = nom_zone;
	}
	public String getNom_garentie() {
		return nom_garentie;
	}
	public void setNom_garentie(String nom_garentie) {
		this.nom_garentie = nom_garentie;
	}
	
	public Double getDroit_adhesion() {
		return droit_adhesion;
	}
	public void setDroit_adhesion(Double droit_adhesion) {
		this.droit_adhesion = droit_adhesion;
	}
	public Double getCotisation_mensuel() {
		return cotisation_mensuel;
	}
	public void setCotisation_mensuel(Double cotisation_mensuel) {
		this.cotisation_mensuel = cotisation_mensuel;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public Date getDate_creation_bene() {
		return date_creation_bene;
	}
	public void setDate_creation_bene(Date date_creation_bene) {
		this.date_creation_bene = date_creation_bene;
	}
	public String getSituation_compte() {
		return situation_compte;
	}
	public void setSituation_compte(String situation_compte) {
		this.situation_compte = situation_compte;
	}
	public String getEquivalent_mois() {
		return equivalent_mois;
	}
	public void setEquivalent_mois(String equivalent_mois) {
		this.equivalent_mois = equivalent_mois;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getSituation_adherent() {
		return situation_adherent;
	}
	public void setSituation_adherent(String situation_adherent) {
		this.situation_adherent = situation_adherent;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public Double getMontant_emise() {
		return montant_emise;
	}
	public void setMontant_emise(Double montant_emise) {
		this.montant_emise = montant_emise;
	}
	public Double getMontant_percue() {
		return montant_percue;
	}
	public void setMontant_percue(Double montant_percue) {
		this.montant_percue = montant_percue;
	}
	public Double getMontant_arriere() {
		return montant_arriere;
	}
	public void setMontant_arriere(Double montant_arriere) {
		this.montant_arriere = montant_arriere;
	}
	public Double getMontant_avance() {
		return montant_avance;
	}
	public void setMontant_avance(Double montant_avance) {
		this.montant_avance = montant_avance;
	}
	public Double getMontant_total() {
		return montant_total;
	}
	public void setMontant_total(Double montant_total) {
		this.montant_total = montant_total;
	}
	public Date getDate_entree() {
		return date_entree;
	}
	public void setDate_entree(Date date_entree) {
		this.date_entree = date_entree;
	}
	public String getType_cotisation() {
		return type_cotisation;
	}
	public void setType_cotisation(String type_cotisation) {
		this.type_cotisation = type_cotisation;
	}
	public Integer getObservation() {
		return observation;
	}
	public void setObservation(Integer observation) {
		this.observation = observation;
	}
	public Integer getDelai_retard() {
		return delai_retard;
	}
	public void setDelai_retard(Integer delai_retard) {
		this.delai_retard = delai_retard;
	}
	public Integer getDelai_reprise() {
		return delai_reprise;
	}
	public void setDelai_reprise(Integer delai_reprise) {
		this.delai_reprise = delai_reprise;
	}
	public List<prestataires> getPrestataires() {
		return prestataires;
	}
	public void setPrestataires(List<prestataires> prestataires) {
		this.prestataires = prestataires;
	}
	public List<garantie_couvertureModel> getServices() {
		return services;
	}
	public void setServices(List<garantie_couvertureModel> services) {
		this.services = services;
	}
	public List<facture_prestataire> getFacture_prestataires() {
		return facture_prestataires;
	}
	public void setFacture_prestataires(List<facture_prestataire> facture_prestataires) {
		this.facture_prestataires = facture_prestataires;
	}
	public List<adherentModel> getPac() {
		return pac;
	}
	public void setPac(List<adherentModel> pac) {
		this.pac = pac;
	}
	public List<mouvementModel> getMouvement() {
		return mouvement;
	}
	public void setMouvement(List<mouvementModel> mouvement) {
		this.mouvement = mouvement;
	}
	public List<cotisationModel> getHistorique_cotisation() {
		return historique_cotisation;
	}
	public void setHistorique_cotisation(List<cotisationModel> historique_cotisation) {
		this.historique_cotisation = historique_cotisation;
	}
	public Long getId_beneficiaire() {
		return id_beneficiaire;
	}
	public void setId_beneficiaire(Long id_beneficiaire) {
		this.id_beneficiaire = id_beneficiaire;
	}
	public Integer getId_exercice() {
		return Id_exercice;
	}
	public void setId_exercice(Integer id_exercice) {
		Id_exercice = id_exercice;
	}
	public Integer getAnne() {
		return anne;
	}
	public void setAnne(Integer anne) {
		this.anne = anne;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(Integer id_categorie) {
		this.id_categorie = id_categorie;
	}
	
	public Integer getId_entreprise() {
		return id_entreprise;
	}
	public void setId_entreprise(Integer id_entreprise) {
		this.id_entreprise = id_entreprise;
	}
	public Integer getId_commune() {
		return id_commune;
	}
	public void setId_commune(Integer id_commune) {
		this.id_commune = id_commune;
	}
	
	public String getCommune() {
		return commune;
	}
	public void setCommune(String commune) {
		this.commune = commune;
	}
	public Integer getId_ville() {
		return id_ville;
	}
	public void setId_ville(Integer id_ville) {
		this.id_ville = id_ville;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Integer getId_pays() {
		return id_pays;
	}
	public void setId_pays(Integer id_pays) {
		this.id_pays = id_pays;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	public Integer getEffectif() {
		return effectif;
	}
	public void setEffectif(Integer effectif) {
		this.effectif = effectif;
	}
	
public Integer getId_province() {
		return id_province;
	}
	public void setId_province(Integer id_province) {
		this.id_province = id_province;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

public adherentModel(Long id_adherent, Long identite, Long id_pac, List<Long> tableau_id_adherent, Integer id_zone,
			Integer id_garantie, String noms, String nom, String prenom, String sexe, String id_quartier,
			String adresse, Date naissance, String lieu_naissance, String profession, String localisation,
			String telephone_fixe, String telephone_portable, String entree, Integer situation_actuelle,
			Boolean en_stage, Boolean suspendu, Boolean radier, Double salaire, String photo, String autre_code,
			String code_mutuelle, String categorie, String responsable, String contact, Integer arriere_initial,
			Integer avance_initial, String date_annulation_suspension, String date_radiation, String motif_suspension,
			String type_suspension, Integer indice, Integer indice_suspension, Integer indice_radiation,
			String code_parent, Boolean parent, Boolean is_pac, String nom_zone, String nom_garentie,
			Double droit_adhesion, Double cotisation_mensuel, Date date_creation, Date date_creation_bene,
			String situation_compte, String equivalent_mois, String icon, String situation_adherent, String motif,
			Double montant_emise, Double montant_percue, Double montant_arriere, Double montant_avance,
			Double montant_total, Date date_entree, String type_cotisation, Integer observation, Integer delai_retard,
			Integer delai_reprise, List<com.malachitebe.entities.prestataires> prestataires,
			List<garantie_couvertureModel> services, List<facture_prestataire> facture_prestataires,
			List<adherentModel> pac, List<mouvementModel> mouvement, List<cotisationModel> historique_cotisation,
			Long id_beneficiaire, Integer id_exercice, Integer anne, String email, Integer id_categorie,
			Integer id_entreprise, Integer id_commune, String commune, Integer id_province, String province,
			Integer id_ville, String ville, Integer id_pays, String pays, Integer effectif) {
		super();
		this.id_adherent = id_adherent;
		this.identite = identite;
		this.id_pac = id_pac;
		this.tableau_id_adherent = tableau_id_adherent;
		this.id_zone = id_zone;
		this.id_garantie = id_garantie;
		this.noms = noms;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.id_quartier = id_quartier;
		this.adresse = adresse;
		this.naissance = naissance;
		this.lieu_naissance = lieu_naissance;
		this.profession = profession;
		this.localisation = localisation;
		this.telephone_fixe = telephone_fixe;
		this.telephone_portable = telephone_portable;
		this.entree = entree;
		this.situation_actuelle = situation_actuelle;
		this.en_stage = en_stage;
		this.suspendu = suspendu;
		this.radier = radier;
		this.salaire = salaire;
		this.photo = photo;
		this.autre_code = autre_code;
		this.code_mutuelle = code_mutuelle;
		this.categorie = categorie;
		this.responsable = responsable;
		this.contact = contact;
		this.arriere_initial = arriere_initial;
		this.avance_initial = avance_initial;
		this.date_annulation_suspension = date_annulation_suspension;
		this.date_radiation = date_radiation;
		this.motif_suspension = motif_suspension;
		this.type_suspension = type_suspension;
		this.indice = indice;
		this.indice_suspension = indice_suspension;
		this.indice_radiation = indice_radiation;
		this.code_parent = code_parent;
		Parent = parent;
		this.is_pac = is_pac;
		this.nom_zone = nom_zone;
		this.nom_garentie = nom_garentie;
		this.droit_adhesion = droit_adhesion;
		this.cotisation_mensuel = cotisation_mensuel;
		this.date_creation = date_creation;
		this.date_creation_bene = date_creation_bene;
		this.situation_compte = situation_compte;
		this.equivalent_mois = equivalent_mois;
		this.icon = icon;
		this.situation_adherent = situation_adherent;
		this.motif = motif;
		this.montant_emise = montant_emise;
		this.montant_percue = montant_percue;
		this.montant_arriere = montant_arriere;
		this.montant_avance = montant_avance;
		this.montant_total = montant_total;
		this.date_entree = date_entree;
		this.type_cotisation = type_cotisation;
		this.observation = observation;
		this.delai_retard = delai_retard;
		this.delai_reprise = delai_reprise;
		this.prestataires = prestataires;
		this.services = services;
		this.facture_prestataires = facture_prestataires;
		this.pac = pac;
		this.mouvement = mouvement;
		this.historique_cotisation = historique_cotisation;
		this.id_beneficiaire = id_beneficiaire;
		Id_exercice = id_exercice;
		this.anne = anne;
		this.email = email;
		this.id_categorie = id_categorie;
		this.id_entreprise = id_entreprise;
		this.id_commune = id_commune;
		this.commune = commune;
		this.id_province = id_province;
		this.province = province;
		this.id_ville = id_ville;
		this.ville = ville;
		this.id_pays = id_pays;
		this.pays = pays;
		this.effectif = effectif;
	}
@Override
	public String toString() {
		return "adherentModel [id_adherent=" + id_adherent + ", identite=" + identite + ", id_pac=" + id_pac
				+ ", tableau_id_adherent=" + tableau_id_adherent + ", id_zone=" + id_zone + ", id_garantie="
				+ id_garantie + ", noms=" + noms + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe
				+ ", id_quartier=" + id_quartier + ", adresse=" + adresse + ", naissance=" + naissance
				+ ", lieu_naissance=" + lieu_naissance + ", profession=" + profession + ", localisation=" + localisation
				+ ", telephone_fixe=" + telephone_fixe + ", telephone_portable=" + telephone_portable + ", entree="
				+ entree + ", situation_actuelle=" + situation_actuelle + ", en_stage=" + en_stage + ", suspendu="
				+ suspendu + ", radier=" + radier + ", salaire=" + salaire + ", photo=" + photo + ", autre_code="
				+ autre_code + ", code_mutuelle=" + code_mutuelle + ", categorie=" + categorie + ", responsable="
				+ responsable + ", contact=" + contact + ", arriere_initial=" + arriere_initial + ", avance_initial="
				+ avance_initial + ", date_annulation_suspension=" + date_annulation_suspension + ", date_radiation="
				+ date_radiation + ", motif_suspension=" + motif_suspension + ", type_suspension=" + type_suspension
				+ ", indice=" + indice + ", indice_suspension=" + indice_suspension + ", indice_radiation="
				+ indice_radiation + ", code_parent=" + code_parent + ", Parent=" + Parent + ", is_pac=" + is_pac
				+ ", nom_zone=" + nom_zone + ", nom_garentie=" + nom_garentie + ", droit_adhesion=" + droit_adhesion
				+ ", cotisation_mensuel=" + cotisation_mensuel + ", date_creation=" + date_creation
				+ ", date_creation_bene=" + date_creation_bene + ", situation_compte=" + situation_compte
				+ ", equivalent_mois=" + equivalent_mois + ", icon=" + icon + ", situation_adherent="
				+ situation_adherent + ", motif=" + motif + ", montant_emise=" + montant_emise + ", montant_percue="
				+ montant_percue + ", montant_arriere=" + montant_arriere + ", montant_avance=" + montant_avance
				+ ", montant_total=" + montant_total + ", date_entree=" + date_entree + ", type_cotisation="
				+ type_cotisation + ", observation=" + observation + ", delai_retard=" + delai_retard
				+ ", delai_reprise=" + delai_reprise + ", prestataires=" + prestataires + ", services=" + services
				+ ", facture_prestataires=" + facture_prestataires + ", pac=" + pac + ", mouvement=" + mouvement
				+ ", historique_cotisation=" + historique_cotisation + ", id_beneficiaire=" + id_beneficiaire
				+ ", Id_exercice=" + Id_exercice + ", anne=" + anne + ", email=" + email + ", id_categorie="
				+ id_categorie + ", id_entreprise=" + id_entreprise + ", id_commune=" + id_commune + ", commune="
				+ commune + ", id_ville=" + id_ville + ", ville=" + ville + ", id_pays=" + id_pays + ", pays=" + pays
				+ "]";
	}
	public adherentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
    
}

