package sec03.exam1_nestedinterface;

public class Button {
    //interface type field
    OnClickListener listener; 

    //setter method
    void SetOnClickListner(OnClickListener listener) {
        this.listener = listener; //recieve and use an object 
    }

    //call method of implemented object 
    void touch() {
        listener.onClick();
    }



    //declare interface
    interface OnClickListener {
        //abstract method
        void onClick();
    }
}
