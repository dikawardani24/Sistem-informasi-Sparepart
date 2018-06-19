/*
 * Copyright (c) 2018 dika.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    dika - initial API and implementation and/or initial documentation
 */
package com.reckitBekinser.service;

import com.dika.database.DatabaseServiceImpl;
import com.reckitBekinser.model.DetailPermintaanSparepart;
import com.reckitBekinser.model.PermintaanSparepart;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 *
 * @author dika
 */
public class DetailPermintaanSparepartServiceImpl extends DatabaseServiceImpl<Integer, DetailPermintaanSparepart>
        implements DetailPermintaanSparepartService {

    @NotNull
    @Override
    protected Class<DetailPermintaanSparepart> getEntityKClass() {
        return DetailPermintaanSparepart.class;
    }

    @Override
    public List<DetailPermintaanSparepart> findsBy(PermintaanSparepart permintaanSparepart) {
        return findsByNamedQuery("DetailPermintaanSparepart.findByPermintaan", parameters -> {
            parameters.put("idPermintaan", permintaanSparepart.getId());
            return parameters;
        });
    }
}
