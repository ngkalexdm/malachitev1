package com.malachitebe.interfaces;

public interface ilignes_facture {
	 Boolean SaveLigneFacture(Long _NFacture, Integer Id_Prestataire, Integer Id_Acte);
     Boolean DeleteLigneFacture(Integer idligne);
}
