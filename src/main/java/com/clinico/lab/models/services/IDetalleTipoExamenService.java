package com.clinico.lab.models.services;

import java.util.List;
import java.util.Optional;

import com.clinico.lab.models.entities.DetalleTipoExamen;

public interface IDetalleTipoExamenService {

		public List<DetalleTipoExamen> findAll();
			
			public DetalleTipoExamen save(DetalleTipoExamen detalleTipoExamen);
			
			public Optional <DetalleTipoExamen> findById(Long id);
			
			public void delete(Long id);
}
