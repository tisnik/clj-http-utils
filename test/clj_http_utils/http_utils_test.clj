;
;  (C) Copyright 2018, 2020  Pavel Tisnovsky
;
;  All rights reserved. This program and the accompanying materials
;  are made available under the terms of the Eclipse Public License v1.0
;  which accompanies this distribution, and is available at
;  http://www.eclipse.org/legal/epl-v10.html
;
;  Contributors:
;      Pavel Tisnovsky
;

(ns clj-http-utils.http-utils-test
  (:require [clojure.test :refer :all]
            [clj-http-utils.http-utils :refer :all]))

;
; Common functions used by tests.
;

(defn callable?
  "Test if given function-name is bound to the real function."
  [function-name]
  (clojure.test/function? function-name))

;
; Tests for function existence
;

(deftest test-return-file-existence
  "Check that the clj-http-utils.http-utils/return-file definition exists."
  (testing "if the clj-http-utils.http-utils/return-file definition exists."
           (is (callable? 'clj-http-utils.http-utils/return-file))))


(deftest test-cache-control-headers-existence
  "Check that the clj-http-utils.http-utils/cache-control-headers definition exists."
  (testing
    "if the clj-http-utils.http-utils/cache-control-headers definition exists."
    (is (callable? 'clj-http-utils.http-utils/cache-control-headers))))


(deftest test-png-response-existence
  "Check that the clj-http-utils.http-utils/png-response definition exists."
  (testing "if the clj-http-utils.http-utils/png-response definition exists."
           (is (callable? 'clj-http-utils.http-utils/png-response))))


(deftest test-gif-response-existence
  "Check that the clj-http-utils.http-utils/gif-response definition exists."
  (testing "if the clj-http-utils.http-utils/gif-response definition exists."
           (is (callable? 'clj-http-utils.http-utils/gif-response))))
