package com.uatx.inventarios.service.impl;

import com.uatx.inventarios.dto.AltaInventarioDTO;
import com.uatx.inventarios.dto.BajaInventarioDTO;
import com.uatx.inventarios.repository.AltaInventarioRepository;
import com.uatx.inventarios.repository.BajaInventarioRepository;
import com.uatx.inventarios.service.InventarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventarioServiceImpl implements InventarioService {

    @Autowired
    private AltaInventarioRepository altaInventarioRepository;

    @Autowired
    private BajaInventarioRepository bajaInventarioRepository;

    /**
     * Objeto para copiar valores de las propiedades de un objeto a otro
     */
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void storeAltaInventario(AltaInventarioDTO altaInventarioDTO){

    }
    @Override
    public void storeBajaInventario(BajaInventarioDTO bajaInventarioDTO){

    }
    @Override
    public void findAltasByProducto(Long productoId){

    }
    public void findBajasByProducto(Long productoId){

    }


}
