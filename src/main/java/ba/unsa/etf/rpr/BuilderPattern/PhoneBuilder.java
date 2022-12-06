package ba.unsa.etf.rpr.BuilderPattern;

public class PhoneBuilder {
        private final String operativniSistem;
        private String procesor;
        private Double displaySize;
        private Integer baterija;
        private Integer megapiksel;

        public PhoneBuilder(String os) {
            this.operativniSistem = os;
        }

        //Build
        public Phone build() {
            return new Phone(operativniSistem, procesor, displaySize, baterija, megapiksel);
    }
        public PhoneBuilder setProcesor(String pr) {
            this.procesor = pr;
            return this;
        }
        public PhoneBuilder setDisplaySize(Double size) {
            this.displaySize = size;
            return this;
        }
        public PhoneBuilder setBaterija(Integer b) {
            this.baterija = b;
            return this;
        }
        public PhoneBuilder setMegapiksel(Integer MP) {
            this.megapiksel = MP;
            return this;
        }
}
