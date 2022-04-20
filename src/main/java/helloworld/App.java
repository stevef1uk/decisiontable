/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package helloworld;

import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.LoanUnit;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<LoanUnit, String>, RuleUnitData {

    @Override
    public String handleRequest(LoanUnit input, Context context) {
        /*
         * try {
         * KieServices ks = KieServices.Factory.get();
         * KieContainer kContainer = ks.getKieClasspathContainer();
         * KieSession kSession = kContainer.newKieSession("first-ksession-rule");
         * List<LoanApplication> approvedApplications = new ArrayList<>();
         * kSession.setGlobal("approvedApplications", approvedApplications);
         * input.setMaxAmount(5000);
         * kSession.setGlobal("maxAmount", input.getMaxAmount());
         *
         * DataStore<LoanApplication> apps = input.getLoanApplications();
         * apps.forEach(kSession::insert);
         *
         * kSession.fireAllRules();
         * System.out.println("I have fired the rules");
         * //input.getLoanApplications().forEach(applicant -> System.out.println(applicant.getName());
         * } catch (Throwable t) {
         * t.printStackTrace();
         * }
         */
        //DataStore<LoanApplication> apps = input.getLoanApplications();
        //apps.forEach(app -> System.out.println(app.getApplicant().getName()));
        return "Hello ";
    }
}
