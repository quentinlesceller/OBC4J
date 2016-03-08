package obc4j;

import java.net.URL;

import objects.json.JSONObject;
import protos.Openchain.Block;
import protos.Openchain.BlockchainInfo;
import protos.Openchain.PeersMessage;
import protos.Openchain.Transaction;

/**
 * The Interface IOpenBLockchain.
 * 
 * @author Quentin Le Sceller
 */
public interface ISecureOpenBlockchain {

    /**
     * Gets the block.
     *
     * @param blockNumber
     *            the block number
     * @return the block
     */
    Block getBlock(int blockNumber);

    /**
     * Gets the blockchain info.
     *
     * @return the blockchain info
     */
    BlockchainInfo getBlockchainInfo();

    /**
     * Deploy.
     */
    JSONObject deploy(String type,String path, String function, String[] args);

    /**
     * Invoke.
     */
    JSONObject invoke(String type, String chaincodeIDName, String function,String[] args) ;

    /**
     * Query.
     */
    JSONObject query(String type,String name,String function,String[] args);

    /**
     * Gets the peers.
     *
     * @return the peers
     */
    PeersMessage getPeers();

    /**
     * registerUser *.
     *
     * @param enrollID
     *            the enroll id
     * @param enrollSecret
     *            the enroll secret
     * @return true, if successful
     */
    boolean registerUser(String enrollID, String enrollSecret);

    /**
     * Delete user.
     *
     * @param enrollID
     *            the enroll id
     * @return true, if successful
     */
    boolean deleteUser(String enrollID);

    /**
     * Gets the registered.
     *
     * @param enrollID
     *            the enroll id
     * @return the registered
     */
    boolean getRegistered(String enrollID);

    /**
     * Gets the enrollment certificate.
     *
     * @param enrollID
     *            the enroll id
     * @return the enrollment certificate
     */
    URL getEnrollmentCertificate(String enrollID);

    /**
     * Gets the transaction.
     *
     * @param uuid
     *            the uuid
     * @return the transaction
     */
    Transaction getTransaction(String uuid);

    /**
     * Disable json not found alert.
     */
    void disableJSONNotFoundAlert();

}
