import Healthcheck from '../healthcheck/Healthcheck';
import './Main.css';

function Main() {
    return (        
        <div className='main-container'>            
            <Healthcheck serviceUrl="backend:8080/health" serviceName="Backend" />
            <Healthcheck serviceUrl="redis:6379/health" serviceName="Redis" />
            <Healthcheck serviceUrl="mongo:27017/health" serviceName="Mongo" />            
        </div>
    );
}

export default Main;