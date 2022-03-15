import React, { useState, useEffect } from 'react';
import './Main.css';

function Main() {    
    const [isBackendOnline, setBackendOnline] = useState(false);

    const healthcheck = async () => {
        const healthcheckResult = await fetch("http://localhost:8082/health")
        .then(resp => resp.ok)
        .catch(() => false);

        setBackendOnline(healthcheckResult);
    }

    useEffect(() => {        
        let checkBackendInterval = setInterval(() => {
            healthcheck()
        }, 15000);

        return () => clearInterval(checkBackendInterval);
    }, [isBackendOnline]);

    return (
        <div className={`main-container ${isBackendOnline ? 'online' : 'offline'}`}>
            {getMessage(isBackendOnline)}
        </div>
    );

    function getMessage(isBackendOnline) {
        if (isBackendOnline) {
            return <div className='message'>Backend is online!</div>;
        } else {
            return <div className='message'>Backend is offline!</div>;
        }
    }
}

function healtcheckCall() {
    return fetch("http://localhost:8082/health")
        .then(resp => {
            if (resp.ok) {
                return true;
            } else {
                return false;
            }
        }).catch((error) => false);
}

export default Main;