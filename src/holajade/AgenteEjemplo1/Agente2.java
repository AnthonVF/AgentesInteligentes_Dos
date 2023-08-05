package holajade.AgenteEjemplo1;
import Comunicacion.EnviarMSJ;
import Model.Estudiante;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ZAMBOY
 */
public class Agente2 extends Agent {
    @Override
    protected void setup(){
        addBehaviour(new Comportamiento());
    }
    @Override
    protected void takeDown(){
        
    }
    class Comportamiento extends CyclicBehaviour{
        @Override
        public void action() {
            System.out.println(getName());
            ACLMessage acl = blockingReceive();
            System.out.println(acl);
            //Estudiante e1;
            try {
                Estudiante[] listaEstudiante = (Estudiante[]) acl.getContentObject();
                for(int i=0; i<listaEstudiante.length; i++){
                    System.out.println(listaEstudiante[i]);
                }
//            try {
//                e1 = (Estudiante) acl.getContentObject();
//                System.out.println(e1);
//            } catch (UnreadableException ex) {
//                Logger.getLogger(Agente2.class.getName()).log(Level.SEVERE, null, ex);
//            }
EnviarMSJ.enviarMSJ(ACLMessage.REQUEST, "AG1",
        getAgent(), "CODAG2-AG1",
        "Hola agente, soy "+getLocalName(), true, null);
            } catch (UnreadableException ex) {
                Logger.getLogger(Agente2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}