(ns almanac.core-test
  (:require [clojure.test :refer :all]
            [almanac.core :refer :all])
  (:import (java.io FileInputStream FileOutputStream)))

(deftest test-html-to-pdf
  (let [in (FileInputStream. "test-resources/itempage.html")
        out (FileOutputStream. "test-resources/practice.pdf")]
    (-html-to-pdf in out)))