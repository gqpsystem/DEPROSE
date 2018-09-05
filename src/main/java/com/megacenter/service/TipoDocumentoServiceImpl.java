package com.megacenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megacenter.model.TipoDocumeto;
import com.megacenter.repository.ITipoDocumentoRepository;

@Service
public class TipoDocumentoServiceImpl implements ITipoDocumentoService {

	@Autowired
	private ITipoDocumentoRepository dao;

	@Override
	public void registar(TipoDocumeto tipoDocumeto) {
		dao.save(tipoDocumeto);

	}

	@Override
	public void modificar(TipoDocumeto tipoDocumeto) {
		dao.save(tipoDocumeto);

	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);

	}

	@Override
	public List<TipoDocumeto> listar() {
		return dao.findAll();
	}

	@Override
	public TipoDocumeto listarId(Integer id) {
		return dao.findOne(id);
	}

}
