(ns Data.Function.Uncurried._foreign)

(defn mkFn0 [fun]
  (fn [& _]
    (fun {})))

(defn mkFn2 [fun]
  (fn [a b]
    ((fun a) b)))

(defn mkFn3 [fun]
  (fn [a b c]
    (((fun a) b) c)))

(defn mkFn4 [fun]
  (fn [a b c d]
    ((((fun a) b) c) d)))

(defn mkFn5 [fun]
  (fn [a b c d e]
    (((((fun a) b) c) d) e)))

(defn mkFn6 [fun]
  (fn [a b c d e f]
    ((((((fun a) b) c) d) e) f)))

(defn mkFn7 [fun]
  (fn [a b c d e f g]
    (((((((fun a) b) c) d) e) f) g)))

(defn mkFn8 [fun]
  (fn [a b c d e f g h]
    ((((((((fun a) b) c) d) e) f) g) h)))

(defn mkFn9 [fun]
  (fn [a b c d e f g h i]
    (((((((((fun a) b) c) d) e) f) g) h) i)))

(defn mkFn10 [fun]
  (fn [a b c d e f g h i j]
    ((((((((((fun a) b) c) d) e) f) g) h) i) j)))

(defn runFn0 [fun]
  (fn [& _]
    (fun nil)))

(defn runFn2 [fun]
  (fn [a]
    (fn [b]
      (fun a b))))

(defn runFn3 [fun]
  (fn [a]
    (fn [b]
      (fn [c]
        (fun a b c)))))

(defn runFn4 [fun]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fun a b c d))))))

(defn runFn5 [fun]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fn [e]
            (fun a b c d e)))))))

(defn runFn6 [fun]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fn [e]
            (fn [f]
              (fun a b c d e f))))))))

(defn runFn7 [fun]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fn [e]
            (fn [f]
              (fn [g]
                (fun a b c d e f g)))))))))

(defn runFn8 [fun]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fn [e]
            (fn [f]
              (fn [g]
                (fn [h]
                  (fun a b c d e f g h))))))))))

(defn runFn9 [fun]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fn [e]
            (fn [f]
              (fn [g]
                (fn [h]
                  (fn [i]
                    (fun a b c d e f g h i)))))))))))

(defn runFn10 [fun]
  (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (fn [e]
            (fn [f]
              (fn [g]
                (fn [h]
                  (fn [i]
                    (fn [j]
                      (fun a b c d e f g h i j))))))))))))
