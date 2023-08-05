package holajade.AgenteEjemplo1;
import Comunicacion.EnviarMSJ;
import Model.Estudiante;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import java.util.LinkedList;
/**
 *
 * @author ZAMBOY
 */
public class Agente1 extends Agent {
    @Override
    protected void setup(){
        addBehaviour(new Comportamiento());
    }
    @Override
    protected void takeDown(){
        
    }
    class Comportamiento extends Behaviour{
        boolean terminarComportamiento = false;
        @Override
        public void action() {
            System.out.println(getName());
            terminarComportamiento = false;
            //blockingReceive(5000);
            //Estudiante e1 = new Estudiante("Anthony", "Vargas", "1111", "AI y ML");
            Estudiante[] listaEstudiantes = new Estudiante[5];
            listaEstudiantes[0] = new Estudiante("Anthony", "Vargas", "1111", "AI y ML");
            listaEstudiantes[1] = new Estudiante("Jaime", "Cano", "1112", "AI y ML");
            listaEstudiantes[2] = new Estudiante("Galo", "Rojas", "1113", "AI y ML");
            listaEstudiantes[3] = new Estudiante("Renata", "Nieto", "1114", "AI y ML");
            listaEstudiantes[4] = new Estudiante("Tyler", "Durden", "1115", "AI y ML");
            EnviarMSJ.enviarMSJ(ACLMessage.REQUEST, "AG2", 
                    getAgent(), "CODAG1-AG2", 
                    "Hola agente, soy "+getLocalName(), false, listaEstudiantes);
            ACLMessage acl = blockingReceive();
            System.out.println(acl);
            //terminarComportamiento = true;
        }
        @Override
        public boolean done() {
            return terminarComportamiento;
        }
    }
}