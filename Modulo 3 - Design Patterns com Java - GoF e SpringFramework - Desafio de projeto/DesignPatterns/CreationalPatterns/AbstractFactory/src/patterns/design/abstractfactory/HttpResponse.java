package patterns.design.abstractfactory;

public class HttpResponse implements Response{
        @Override
        public void handleResponse(String message) {
            System.out.println("Http Response: " + message);
        }
    }

