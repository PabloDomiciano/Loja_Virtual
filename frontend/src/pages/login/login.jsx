import React, { useState } from "react";
import { Button } from 'primereact/button';
import { InputText } from 'primereact/inputtext';
import { Password } from 'primereact/password';
import { useNavigate } from "react-router-dom";

const Login = () => {
    const [value, setValue] = useState('');

    const navigate = useNavigate();

    const chamarHome = () => {
        navigate('/home');
    }

    return (
        <>
            <div>
                <div className="flex-auto">
                    <label htmlFor="email" className="font-bold mb-2">
                        Email:
                    </label><br></br>
                    <InputText id="email" keyfilter="email" className="w-full" />
                </div>
                <div className="card flex justify-content-center">
                    <label htmlFor="senha" className="font-bold mb-2">
                        Senha:
                    </label><br></br>
                    <Password value={value} onChange={(e) => setValue(e.target.value)} feedback={false} />
                </div>
                <div className="card flex justify-content-center">
                    <Button label="Entrar" icon="pi pi-check" onClick={chamarHome} />
                </div>
            </div>
        </>
    )
}
export default Login; 