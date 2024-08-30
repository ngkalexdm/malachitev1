package com.malachitebe.services;



import java.util.Calendar;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.malachitebe.entities.adherent;
import com.malachitebe.entities.arriere_avance;
import com.malachitebe.interfaces.iarriere_avance;
import com.malachitebe.interfaces.icotisation_emise;
import com.malachitebe.interfaces.icotisation_percue;
import com.malachitebe.interfaces.iexercice;
import com.malachitebe.models.cotisationModel;
import com.malachitebe.models.exercicesModel;
import com.malachitebe.repositories.adherentRepository;
import com.malachitebe.repositories.arriere_avanceRepository;
@Service
public class arriere_avanceService  implements iarriere_avance{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	adherentRepository adherentRepository;
	@Autowired
	arriere_avanceRepository arriere_avanceRepository;
	@Autowired
	icotisation_emise icotisation_emise;
	@Autowired
	iexercice iexercice;
	@Autowired
	icotisation_percue icotisation_percue;
	@Override
	public cotisationModel GetHistoriqueCotisationarriereavance(Long IdAdherent, Integer annee) {
	try {
		String query="select a.id_adherent,a.id_exercice,sum(a.mois_1) as mois_1,sum(a.mois_2) as mois_2,sum(a.mois_3) as mois_3, "
				+ "sum(a.mois_4) as mois_4,sum(a.mois_5) as mois_5, sum(a.mois_6) as mois_6,sum(a.mois_7) as mois_7, "
				+ "sum(a.mois_8) as mois_8,sum(a.mois_9) as mois_9,sum(a.mois_10) as mois_10,sum(a.mois_11) as mois_11, "
				+ "sum(a.mois_12) as mois_12 "
				+ "from Tab_arriere_avance a "
				+ "inner join Tab_exercice e on  e.id=a.id_exercice "
				+ "where a.id_adherent="+IdAdherent+" and e.annees="+annee
				+" group by  a.id_adherent,a.id_exercice ";
		cotisationModel collection=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(cotisationModel.class));
		collection.setIntitule_cotisation("Arrieré Avancé");
		
		return collection;
	   }catch(Exception e) {
           return null;
       }
	}

	@Override
	public Double _MontantArrieres(Integer Query, Long IdAdherent, Integer Mois, Integer Exercise) {
		  Double montant = 0.0;
		  try {
		  Calendar calendar = Calendar.getInstance();
		  Optional<adherent> adherent = adherentRepository.findById(IdAdherent);
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
          LocalDateTime dateTime = LocalDateTime.parse(adherent.get().getDate_creation().toString(),formatter);
          int year = dateTime.getYear();
          int m = dateTime.getMonthValue();
          Integer annee = adherent == null ? calendar.get(Calendar.YEAR) : year;
          Integer mois = adherent == null ? (calendar.get(Calendar.MONTH)+1):m;
          if (annee == Exercise)
          {
              Integer _mois = Mois - mois == 0 ? 0 :Mois > mois ? Mois - mois : Mois;
              if(Mois >= mois)
              {
            	  montant = -(icotisation_emise.MontantCotisationemise(IdAdherent) * (Double.parseDouble(_mois.toString()) + 1));
              }                
          }
          else
          {
        	  montant = -(icotisation_emise.MontantCotisationemise(IdAdherent) * Double.parseDouble(Mois.toString()));
          }

          if (Query == 1)
          {
        	  montant = montant + icotisation_percue.MontantPercus(IdAdherent, Mois, Exercise);
          }
          else
          {
        	  montant = montant + icotisation_percue.MontantPercus(IdAdherent, Mois - 1, Exercise);
          }
		  }catch( Exception e) {
			  
		  }
		  return montant;
	}

	@Override
	public Double MontantArrieres(Integer Query, Long IdAdherent, Integer Mois) {
		Double Montant = 0.0;
		 Calendar calendar = Calendar.getInstance();
		Integer _Mois = Mois == null ? (calendar.get(Calendar.MONTH)+1) : Mois; 
		  exercicesModel exer =iexercice.ExerciceEnCours();
          int Annee = exer != null ? exer.getAnnees() : 0;
		  Optional<adherent> adherent = adherentRepository.findById(IdAdherent);
		  SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
		  String formattedDate = outputFormat.format(adherent.get().getDate_creation());
          LocalDate date = LocalDate.parse(formattedDate);          
          int year = date.getYear();
          int m = date.getMonthValue();
          Integer annee = adherent == null ? calendar.get(Calendar.YEAR) : year;
          Integer mois = adherent == null ? calendar.get(Calendar.MONTH):m;

          if (annee == Annee)
          {
        	  
              Integer _mois = _Mois - mois == 0 ? 0 : _Mois > mois ? _Mois - mois :_Mois;
              Montant = -(icotisation_emise.MontantCotisationemise(IdAdherent) * (_mois + 1));
              System.out.println("hello "+Montant);
          }
          else
          {
              Montant = -(icotisation_emise.MontantCotisationemise(IdAdherent) * _Mois);
              System.out.println("salut "+Montant);
          }
          
          if (Query == 1)
          {
              Montant = Montant + icotisation_percue.MontantPercus(IdAdherent, _Mois, Annee);
              System.out.println("how "+Montant);
          }
          else
          {
              Montant = Montant + icotisation_percue.MontantPercus(IdAdherent, _Mois - 1, Annee);
              System.out.println("you "+Montant);
          }
		 

          return Montant;
	}

	@Override
	public Boolean ArriereAvance(Boolean delete, Long IdAdherent, Integer Exercise, Integer Mois, Double _Montant) {
		Boolean rep=false;
		Double MontantPercue = 0.0;
		String query="SELECT a.id,a.id_adherent,a.id_exercice,a.mois_1,a.mois_2,a.mois_3,a.mois_4 "
				+ ",a.mois_5,a.mois_6,a.mois_7,a.mois_8,a.mois_9,a.mois_10,a.mois_11,a.mois_12,a.date_creation "
				+ "  FROM Tab_arriere_avance a "
				+ "  where a.id_adherent="+IdAdherent+" and a.id_exercice="+Exercise;
		arriere_avance collection=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(arriere_avance.class));
		   if (collection != null)
           {
               switch (Mois)
               {
                   case 1:

                	   
                       MontantPercue = _Montant;
                       Double MontantMois_1 = delete == true ? MontantPercue - collection.getMois_1() : collection.getMois_1() == null ? 0
                           :collection.getMois_1() > 0 ? collection.getMois_1() - collection.getMois_1() :MontantPercue + collection.getMois_1();
                           collection.setMois_1(MontantMois_1);
                       break;
                   case 2:

                       MontantPercue = _Montant;
                       Double MontantMois_2 = delete == true ? MontantPercue - collection.getMois_2(): collection.getMois_2() == null ? 0
                           : collection.getMois_2() > 0 ?MontantPercue - collection.getMois_2() : MontantPercue + collection.getMois_2();
                           collection.setMois_2(MontantMois_2);
                       break;
                   case 3:

                       MontantPercue = _Montant;
                      Double MontantMois_3 = delete == true ?MontantPercue - collection.getMois_3() : collection.getMois_3() == null ? 0
                           : collection.getMois_3() > 0 ? MontantPercue - collection.getMois_3(): MontantPercue + collection.getMois_3();
                           collection.setMois_3(MontantMois_3);
                       break;
                   case 4:

                       MontantPercue = _Montant;
                       Double MontantMois_4 = delete == true ? MontantPercue - collection.getMois_4() : collection.getMois_4() == null ? 0
                           : collection.getMois_4() > 0 ? MontantPercue - collection.getMois_4() : MontantPercue + collection.getMois_4();
                           collection.setMois_4(MontantMois_4);
                       break;
                   case 5:

                       MontantPercue = _Montant;
                       Double MontantMois_5 = delete == true ? MontantPercue - collection.getMois_5() : collection.getMois_5() == null ? 0
                               : collection.getMois_5() > 0 ? MontantPercue - collection.getMois_5() : MontantPercue + collection.getMois_5();
                               collection.setMois_5(MontantMois_5);

                       break;
                   case 6:

                       MontantPercue = _Montant;
                       Double MontantMois_6 = delete == true ? MontantPercue - collection.getMois_6() : collection.getMois_6() == null ? 0
                               : collection.getMois_6() > 0 ? MontantPercue - collection.getMois_6() : MontantPercue + collection.getMois_6();
                               collection.setMois_6(MontantMois_6);

                       break;
                   case 7:

                       MontantPercue = _Montant;
                       Double MontantMois_7 = delete == true ? MontantPercue - collection.getMois_7() : collection.getMois_7() == null ? 0
                               : collection.getMois_7() > 0 ? MontantPercue - collection.getMois_4() : MontantPercue + collection.getMois_7();
                               collection.setMois_7(MontantMois_7);

                       break;
                   case 8:

                       MontantPercue = _Montant;
                       Double MontantMois_8 = delete == true ? MontantPercue - collection.getMois_8() : collection.getMois_8() == null ? 0
                               : collection.getMois_8() > 0 ? MontantPercue - collection.getMois_8() : MontantPercue + collection.getMois_8();
                               collection.setMois_8(MontantMois_8);

                       break;
                   case 9:

                       MontantPercue = _Montant;
                       Double MontantMois_9 = delete == true ? MontantPercue - collection.getMois_9() : collection.getMois_9() == null ? 0
                               : collection.getMois_9() > 0 ? MontantPercue - collection.getMois_9() : MontantPercue + collection.getMois_9();
                               collection.setMois_9(MontantMois_9);

                       break;
                   case 10:

                       MontantPercue = _Montant;
                       Double MontantMois_10 = delete == true ? MontantPercue - collection.getMois_10() : collection.getMois_10() == null ? 0
                               : collection.getMois_10() > 0 ? MontantPercue - collection.getMois_10() : MontantPercue + collection.getMois_10();
                               collection.setMois_10(MontantMois_10);

                       break;
                   case 11:

                       MontantPercue = _Montant;
                       Double MontantMois_11 = delete == true ? MontantPercue - collection.getMois_11() : collection.getMois_11() == null ? 0
                               : collection.getMois_11() > 0 ? MontantPercue - collection.getMois_11() : MontantPercue + collection.getMois_11();
                               collection.setMois_11(MontantMois_11);

                       break;
                   case 12:

                       MontantPercue = _Montant;
                       Double MontantMois_12 = delete == true ? MontantPercue - collection.getMois_12() : collection.getMois_12() == null ? 0
                               : collection.getMois_12() > 0 ? MontantPercue - collection.getMois_12() : MontantPercue + collection.getMois_12();
                               collection.setMois_12(MontantMois_12);;

                       break;

               }
               if(arriere_avanceRepository.save(collection)!=null){
            	   rep=true;
               }

           }
		return rep;
	}

}
