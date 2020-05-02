package com.uatx.inventarios.service;

import com.uatx.inventarios.dto.AltaInventarioDTO;
import com.uatx.inventarios.dto.BajaInventarioDTO;

public interface InventarioService {

    void storeAltaInventario(AltaInventarioDTO altaInventarioDTO);

    void storeBajaInventario(BajaInventarioDTO bajaInventarioDTO);

    void findAltasByProducto(Long productoId);

    void findBajasByProducto(Long productoId);

}
