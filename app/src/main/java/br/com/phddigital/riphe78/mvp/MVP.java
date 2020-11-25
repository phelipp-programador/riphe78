package br.com.phddigital.riphe78.mvp;

public interface MVP {
    interface Model{}
    interface Presenter{
        void viewDestroy();
    }
}
