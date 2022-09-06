package sec04.exam03_button_events;


public class Button {
    //interface type field
    OnClickListener listener;

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    interface OnClickListener {
        //abstract
        void onClick();
    }

    
}