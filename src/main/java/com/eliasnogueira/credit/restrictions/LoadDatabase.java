/*
 * MIT License
 *
 * Copyright (c) 2020 Elias Nogueira
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.eliasnogueira.credit.restrictions;

import com.eliasnogueira.credit.restrictions.entity.Restriction;
import com.eliasnogueira.credit.restrictions.entity.Type;
import com.eliasnogueira.credit.restrictions.repository.RestrictionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(RestrictionRepository restrictionRepository) {
        return args -> dataToInsert()
                .forEach((cpf, restriction) -> restrictionRepository.save(new Restriction(cpf, restriction)));
    }

    private HashMap<String, String> dataToInsert() {
        HashMap<String, String> data = new HashMap<>();

        data.put("97093236014", Type.JUDICIAL_ISSUE.get());
        data.put("60094146012", Type.CREDIT_CARD.get());
        data.put("84809766080", Type.BANKING.get());
        data.put("62648716050", Type.CREDIT_SCORE.get());
        data.put("26276298085", Type.CREDIT_SCORE.get());
        data.put("01317496094", Type.CREDIT_CARD.get());
        data.put("55856777050", Type.BANKING.get());
        data.put("19626829001", Type.JUDICIAL_ISSUE.get());
        data.put("24094592008", Type.BANKING.get());
        data.put("58063164083", Type.BANKING.get());

        return data;
    }
}
