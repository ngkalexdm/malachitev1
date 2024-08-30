package com.malachitebe.interfaces;

import org.springframework.data.domain.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import com.malachitebe.models.adherentModel;
import com.malachitebe.models.form_adherentModel;

public interface ibeneficiaires {
   Boolean AddBeneficiaire(form_adherentModel model);
   Page<adherentModel> BeneficiaireAdherent(String Search, Pageable pageable);
   Page<adherentModel> GetBeneficiaire(String Search, Pageable pageable);
   List<adherentModel> GetPacAdherent(Long idadherent);
   /* IPagedList<Tab_Beneficiaires> PagerBeneficiaireAdherent(int? page, string Search = null);
    IPagedList<Tab_Beneficiaires> PagerBeneficiaire(int query, int? page);
    int NbrsBeneficiaire();
    IPagedList<Tab_Beneficiaires> PagerBeneficiaire(int? page);*/
   
    adherentModel DetailBeneficiaire(Long Id_Beneficiaire);
}
