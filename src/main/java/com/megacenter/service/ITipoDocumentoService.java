package com.megacenter.service;

import java.util.List;

import com.megacenter.model.TipoDocumeto;

public interface ITipoDocumentoService {

	void registar(TipoDocumeto tipoDocumeto);

	void modificar(TipoDocumeto tipoDocumeto);

	void eliminar(Integer id);

	List<TipoDocumeto> listar();

	TipoDocumeto listarId(Integer id);

}
