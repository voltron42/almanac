(ns almanac.core
  (:import (java.io OutputStream InputStream)
           (com.itextpdf.text.pdf PdfWriter)
           (com.itextpdf.text Document)
           (com.itextpdf.tool.xml XMLWorkerHelper)))

(defn -html-to-pdf [^InputStream in-stream ^OutputStream out-stream]
  (let [doc (Document.)
        writer (PdfWriter/getInstance doc out-stream)]
    (.open doc)
    (-> (XMLWorkerHelper/getInstance)
        (.parseXHtml writer doc in-stream))
    (.close doc)))